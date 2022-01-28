import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getErrors();
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder6 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int7 = codeBuilder6.getLength();
        int int8 = codeBuilder6.getLength();
        int int9 = codeBuilder6.getLength();
        int int10 = codeBuilder6.getLength();
        int int11 = codeBuilder6.getLength();
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder6, (int) (short) 1, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        java.lang.String str6 = compiler0.getSourceLine("", (int) (short) 0);
        java.lang.String str7 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile9 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler0.compile(jSSourceFile8, jSSourceFileArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        int int8 = compiler0.getErrorCount();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        com.google.javascript.rhino.Node node11 = compiler0.getRoot();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        java.lang.String str10 = compiler0.getSourceLine("", (int) (short) 0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = compiler0.getTypeRegistry();
        java.lang.Class<?> wildcardClass12 = jSTypeRegistry11.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(jSTypeRegistry11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str1 = codeBuilder0.toString();
        java.lang.String str2 = codeBuilder0.toString();
        java.lang.String str3 = codeBuilder0.toString();
        int int4 = codeBuilder0.getLength();
        int int5 = codeBuilder0.getLength();
        int int6 = codeBuilder0.getLength();
        java.lang.String str7 = codeBuilder0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler0.getState();
        boolean boolean10 = compiler0.acceptEcmaScript5();
        boolean boolean11 = compiler0.isIdeMode();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError jSError11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel12 = compiler0.getErrorLevel(jSError11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getErrors();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        java.lang.String str9 = compiler5.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler5.getMessages();
        boolean boolean11 = compiler5.hasErrors();
        boolean boolean12 = compiler5.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler5.getState();
        compiler0.setState(intermediateState13);
        int int15 = compiler0.getErrorCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        java.lang.String str7 = compiler0.toSource();
        boolean boolean8 = compiler0.hasErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler12.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(errorManager13);
        compiler0.setErrorManager(errorManager13);
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(errorManager13);
        com.google.javascript.rhino.Node node18 = compiler17.getRoot();
        com.google.javascript.rhino.Node node19 = compiler17.getRoot();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray20 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList21 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList21, jSSourceFileArray20);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray23 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList24 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList24, jSSourceFileArray23);
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler17.init((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList21, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList24, compilerOptions26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(jSSourceFileArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        int int8 = compiler0.getErrorCount();
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
        boolean boolean10 = compiler0.isIdeMode();
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        compiler0.setErrorManager(errorManager7);
        int int10 = compiler0.getWarningCount();
        boolean boolean11 = compiler0.hasErrors();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = compiler0.toSource(jSModule13);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        boolean boolean4 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intermediateState5);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile2 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile3 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile3 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result6 = compiler0.compile(jSSourceFile2, jSSourceFileArray4, compilerOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope1);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        java.lang.String str10 = compiler6.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler6.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention12 = compiler6.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler6.getState();
        int int14 = compiler6.getWarningCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler6.getState();
        compiler3.setState(intermediateState15);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile17 = null;
        com.google.javascript.jscomp.JSModule jSModule18 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray19 = new com.google.javascript.jscomp.JSModule[] { jSModule18 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result21 = compiler3.compile(jSSourceFile17, jSModuleArray19, compilerOptions20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intermediateState11);
        org.junit.Assert.assertNotNull(codingConvention12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(jSModuleArray19);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        int int10 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getMessages();
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = compiler0.toSource(jSModule12);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray11);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList5 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList5, jSSourceFileArray4);
        com.google.javascript.jscomp.JSModule[] jSModuleArray7 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList8 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList8, jSModuleArray7);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList5, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList8, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSModuleArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler2.getState();
        compiler1.setState(intermediateState4);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler6.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler6.tracker = performanceTracker9;
        int int11 = compiler6.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler6.getMessages();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler13.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler13.getState();
        compiler6.setState(intermediateState15);
        int int17 = compiler6.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler18.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(errorManager19);
        compiler6.setErrorManager(errorManager19);
        compiler1.setErrorManager(errorManager19);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile23 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray24 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile23 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray25 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray24, jSModuleArray25, compilerOptions26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray12);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertNotNull(jSSourceFileArray24);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getWarningCount();
        java.lang.String str6 = compiler0.getSourceLine("hi!", (int) (byte) 0);
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getWarnings();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler11.getState();
        compiler10.setState(intermediateState13);
        compiler0.setState(intermediateState13);
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler0.getCodingConvention();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNotNull(codingConvention16);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Result result7 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler0.tracker;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result13 = compiler0.compile(jSSourceFile10, jSSourceFileArray11, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(result7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertNull(performanceTracker9);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler2.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(errorManager4);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager4);
        int int7 = compiler6.getWarningCount();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler6.initOptions(compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(errorManager8);
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(errorManager8);
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(errorManager8);
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler11.getSourceMap();
        com.google.javascript.rhino.Node node13 = compiler11.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray14 = compiler11.getErrors();
        java.lang.String str15 = compiler11.getAstDotGraph();
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler11.getErrors();
        int int17 = compiler11.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler18.getState();
        compiler18.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker21 = null;
        compiler18.tracker = performanceTracker21;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler23.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler(errorManager24);
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(errorManager24);
        compiler18.setErrorManager(errorManager24);
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler(errorManager24);
        compiler11.setErrorManager(errorManager24);
        compiler0.setErrorManager(errorManager24);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray31 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule32 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray33 = new com.google.javascript.jscomp.JSModule[] { jSModule32 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result35 = compiler0.compile(jSSourceFileArray31, jSModuleArray33, compilerOptions34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(jSErrorArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(jSSourceFileArray31);
        org.junit.Assert.assertNotNull(jSModuleArray33);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getWarnings();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler8.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(errorManager9);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler10.getState();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler10.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager12);
        compiler0.setErrorManager(errorManager12);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(errorManager12);
        int int16 = compiler15.getWarningCount();
        com.google.javascript.jscomp.JSModule jSModule17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = compiler15.toSource(jSModule17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(intermediateState11);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler0.getErrorManager();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertNotNull(errorManager9);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager5);
        compiler6.reportCodeChange();
        compiler6.reportCodeChange();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(errorManager5);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError jSError9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel10 = compiler0.getErrorLevel(jSError9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intermediateState8);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertNotNull(intermediateState8);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Region region9 = compiler0.getSourceRegion("hi!", (int) (short) 0);
        boolean boolean10 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList12 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList12, jSSourceFileArray11);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList15 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList15, jSSourceFileArray14);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result18 = compiler0.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList12, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList15, compilerOptions17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        int int3 = compiler0.getErrorCount();
        boolean boolean4 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList6 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, jSSourceFileArray5);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, jSSourceFileArray8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList8 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList8, jSSourceFileArray7);
        com.google.javascript.jscomp.JSModule[] jSModuleArray10 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList11 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList11, jSModuleArray10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList8, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList11, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSModuleArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler8.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(errorManager9);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler10.getState();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler10.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager12);
        compiler0.setErrorManager(errorManager12);
        java.lang.String str17 = compiler0.getSourceLine("hi!", (int) (short) -1);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(intermediateState11);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
        boolean boolean6 = compiler0.hasErrors();
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler0.getSourceMap();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile10 };
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray13 = new com.google.javascript.jscomp.JSModule[] { jSModule12 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result15 = compiler0.compile(jSSourceFileArray11, jSModuleArray13, compilerOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertNull(sourceMap9);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSModuleArray13);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        java.lang.String str6 = compiler0.getAstDotGraph();
        java.lang.String str7 = compiler0.getAstDotGraph();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        boolean boolean9 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSErrorArray10);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("hi!", (int) (byte) 0);
        boolean boolean7 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, jSSourceFileArray8);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList12 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList12, jSSourceFileArray11);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList12, compilerOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(region6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler3.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler3.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler6.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler6.tracker = performanceTracker9;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler6.tracker = performanceTracker11;
        com.google.javascript.jscomp.Scope scope13 = compiler6.getTopScope();
        compiler6.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = null;
        compiler6.tracker = performanceTracker15;
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler6.getErrorManager();
        compiler3.setErrorManager(errorManager17);
        compiler0.setErrorManager(errorManager17);
        com.google.javascript.rhino.Node node20 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState21 = compiler0.getState();
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(intermediateState21);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler0.compile(jSSourceFile6, jSSourceFile7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(sourceMap4);
        org.junit.Assert.assertNotNull(errorManager5);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Region region10 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList12 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList12, jSSourceFileArray11);
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList15 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList15, jSModuleArray14);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result18 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList12, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList15, compilerOptions17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSModuleArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        compiler0.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = compiler0.isIdeMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        java.lang.String str6 = compiler0.getAstDotGraph();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler7.getState();
        compiler0.setState(intermediateState9);
        int int11 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler12.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager13);
        compiler0.setErrorManager(errorManager13);
        boolean boolean16 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Scope scope17 = compiler0.getTopScope();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(scope17);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler10.getErrorManager();
        java.lang.String str14 = compiler10.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler10.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler10.getState();
        compiler0.setState(intermediateState17);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler0.tracker = performanceTracker19;
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler0.getWarnings();
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler0.getSourceMap();
        compiler0.reportCodeChange();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertNotNull(intermediateState17);
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertNull(sourceMap22);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        java.lang.String str10 = compiler0.getSourceLine("", 0);
        com.google.javascript.jscomp.CodingConvention codingConvention11 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList13 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList13, jSSourceFileArray12);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList16 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList16, jSSourceFileArray15);
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result19 = compiler0.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList13, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList16, compilerOptions18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(codingConvention11);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getErrors();
        boolean boolean10 = compiler0.isIdeMode();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        java.lang.String str7 = compiler0.toSource();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        compiler0.disableThreads();
        java.lang.Class<?> wildcardClass9 = compiler0.getClass();
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.JSError jSError7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region9 = compiler0.getSourceRegion("hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler4.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler4.tracker = performanceTracker7;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler4.tracker = performanceTracker9;
        com.google.javascript.jscomp.Scope scope11 = compiler4.getTopScope();
        compiler4.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler4.tracker = performanceTracker13;
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler4.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager17);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(errorManager17);
        compiler4.setErrorManager(errorManager17);
        compiler0.setErrorManager(errorManager17);
        boolean boolean22 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.JSModule jSModule23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray24 = compiler0.toSourceArray(jSModule23);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager5);
        compiler0.setErrorManager(errorManager5);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList10 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, jSSourceFileArray9);
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList13 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList13, jSModuleArray12);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result16 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList13, compilerOptions15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(codingConvention3);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        boolean boolean5 = compiler0.isIdeMode();
        java.lang.String str6 = compiler0.toSource();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler0.compile(jSSourceFile7, jSSourceFileArray8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.reportCodeChange();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler5.getState();
        compiler4.setState(intermediateState7);
        compiler0.setState(intermediateState7);
        com.google.javascript.jscomp.Scope scope10 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler11.getErrors();
        int int14 = compiler11.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler15.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler15.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker18 = null;
        compiler15.tracker = performanceTracker18;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = null;
        compiler15.tracker = performanceTracker20;
        com.google.javascript.jscomp.Scope scope22 = compiler15.getTopScope();
        compiler15.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker24 = null;
        compiler15.tracker = performanceTracker24;
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler15.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler27.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler(errorManager28);
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(errorManager28);
        compiler15.setErrorManager(errorManager28);
        compiler11.setErrorManager(errorManager28);
        compiler0.setErrorManager(errorManager28);
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertNull(sourceMap26);
        org.junit.Assert.assertNotNull(errorManager28);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler12.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray14 = compiler12.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = null;
        compiler12.tracker = performanceTracker15;
        boolean boolean17 = compiler12.acceptConstKeyword();
        boolean boolean18 = compiler12.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = compiler12.tracker;
        compiler12.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState21 = compiler12.getState();
        compiler0.setState(intermediateState21);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(jSErrorArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(performanceTracker19);
        org.junit.Assert.assertNotNull(intermediateState21);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler0.getSourceMap();
        compiler0.disableThreads();
        boolean boolean13 = compiler0.isIdeMode();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile14 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result17 = compiler0.compile(jSSourceFile14, jSSourceFileArray15, compilerOptions16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        int int8 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler0.getState();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intermediateState9);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        compiler0.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(performanceTracker5);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        boolean boolean8 = compiler0.isTypeCheckingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler7.getState();
        compiler0.setState(intermediateState9);
        java.lang.String str11 = compiler0.toSource();
        com.google.javascript.jscomp.Result result12 = compiler0.getResult();
        compiler0.reportCodeChange();
        int int14 = compiler0.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(result12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        int int2 = codeBuilder0.getLength();
        int int3 = codeBuilder0.getLength();
        int int4 = codeBuilder0.getLength();
        int int5 = codeBuilder0.getLength();
        int int6 = codeBuilder0.getLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(result9);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        com.google.javascript.jscomp.Result result9 = compiler8.getResult();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler10.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler10.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler10.tracker = performanceTracker13;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = null;
        compiler10.tracker = performanceTracker15;
        com.google.javascript.jscomp.Scope scope17 = compiler10.getTopScope();
        compiler10.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler10.tracker = performanceTracker19;
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler10.getErrorManager();
        compiler8.setErrorManager(errorManager21);
        compiler0.setErrorManager(errorManager21);
        com.google.javascript.jscomp.JSError[] jSErrorArray24 = compiler0.getErrors();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile25 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile25 };
        com.google.javascript.jscomp.JSSourceFile jSSourceFile27 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray28 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile27 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result30 = compiler0.compile(jSSourceFileArray26, jSSourceFileArray28, compilerOptions29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(jSErrorArray12);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNotNull(jSErrorArray24);
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
        org.junit.Assert.assertNotNull(jSSourceFileArray28);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.disableThreads();
        boolean boolean9 = compiler0.isIdeMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError jSError11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel12 = compiler0.getErrorLevel(jSError11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSErrorArray10);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler2.getWarnings();
        com.google.javascript.jscomp.Scope scope5 = compiler2.getTopScope();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile6 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler2.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSModuleArray8);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler10.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler10.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler10.tracker = performanceTracker13;
        boolean boolean15 = compiler10.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler10.getState();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler10.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager17);
        compiler0.setErrorManager(errorManager17);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(jSErrorArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intermediateState16);
        org.junit.Assert.assertNotNull(errorManager17);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        compiler0.disableThreads();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        boolean boolean8 = compiler0.acceptConstKeyword();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler2.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(errorManager4);
        compiler5.disableThreads();
        java.lang.Class<?> wildcardClass7 = compiler5.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result8 = compiler0.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention11 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList13 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList13, jSSourceFileArray12);
        com.google.javascript.jscomp.JSModule[] jSModuleArray15 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList16 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList16, jSModuleArray15);
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList13, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList16, compilerOptions18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNotNull(codingConvention11);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSModuleArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        int int6 = compiler0.getWarningCount();
        compiler0.reportCodeChange();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(sourceMap4);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler4.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler4.tracker = performanceTracker7;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler4.tracker = performanceTracker9;
        com.google.javascript.jscomp.Scope scope11 = compiler4.getTopScope();
        compiler4.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler4.tracker = performanceTracker13;
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler4.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager17);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(errorManager17);
        compiler4.setErrorManager(errorManager17);
        compiler0.setErrorManager(errorManager17);
        java.lang.String str22 = compiler0.toSource();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray23 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList24 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList24, jSSourceFileArray23);
        java.util.List<com.google.javascript.jscomp.JSModule> jSModuleList26 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result28 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList24, jSModuleList26, compilerOptions27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        int int10 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Scope scope11 = compiler0.getTopScope();
        boolean boolean12 = compiler0.acceptEcmaScript5();
        java.lang.String str13 = compiler0.toSource();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager6);
        compiler0.setErrorManager(errorManager6);
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(errorManager6);
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler10.getErrorManager();
        boolean boolean12 = compiler10.acceptConstKeyword();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler10.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            compiler10.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(sourceMap13);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        int int3 = compiler0.getErrorCount();
        boolean boolean4 = compiler0.acceptConstKeyword();
        java.lang.String str5 = compiler0.getAstDotGraph();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        int int10 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Scope scope11 = compiler0.getTopScope();
        java.lang.String str12 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile14 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile14 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result17 = compiler0.compile(jSSourceFileArray13, jSSourceFileArray15, compilerOptions16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getWarningCount();
        java.lang.String str6 = compiler0.getSourceLine("hi!", (int) (byte) 0);
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = compiler0.toSource(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        java.lang.String str4 = compiler0.toSource();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = compiler0.parse(jSSourceFile5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler4.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler4.tracker = performanceTracker7;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler4.tracker = performanceTracker9;
        com.google.javascript.jscomp.Scope scope11 = compiler4.getTopScope();
        compiler4.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler4.tracker = performanceTracker13;
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler4.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager17);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(errorManager17);
        compiler4.setErrorManager(errorManager17);
        compiler0.setErrorManager(errorManager17);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker22 = compiler0.tracker;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput24 = compiler0.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNull(performanceTracker22);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        int int6 = compiler0.getErrorCount();
        java.lang.String str7 = compiler0.getAstDotGraph();
        java.lang.String str8 = compiler0.toSource();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler10.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler12.getState();
        compiler0.setState(intermediateState13);
        int int15 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler0.getErrors();
        compiler0.disableThreads();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray16);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler0.tracker;
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getWarnings();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler11.getErrors();
        int int14 = compiler11.getWarningCount();
        java.lang.String str17 = compiler11.getSourceLine("hi!", (int) (byte) 0);
        com.google.javascript.jscomp.JSError[] jSErrorArray18 = compiler11.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray19 = compiler11.getWarnings();
        java.io.PrintStream printStream20 = null;
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(printStream20);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager23 = compiler22.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState24 = compiler22.getState();
        compiler21.setState(intermediateState24);
        compiler11.setState(intermediateState24);
        compiler0.setState(intermediateState24);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(jSErrorArray18);
        org.junit.Assert.assertNotNull(jSErrorArray19);
        org.junit.Assert.assertNotNull(errorManager23);
        org.junit.Assert.assertNotNull(intermediateState24);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager5);
        compiler0.setErrorManager(errorManager5);
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(codingConvention3);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptConstKeyword();
        int int6 = compiler0.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        int int3 = compiler2.getWarningCount();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler2.getErrorManager();
        com.google.javascript.jscomp.JSError jSError5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler2.report(jSError5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(errorManager4);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        java.lang.String str6 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler6.getState();
        compiler6.reportCodeChange();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler11.getState();
        compiler10.setState(intermediateState13);
        compiler6.setState(intermediateState13);
        compiler0.setState(intermediateState13);
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler0.getSourceMap();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray18 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList19 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList19, jSSourceFileArray18);
        com.google.javascript.jscomp.JSModule[] jSModuleArray21 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList22 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList22, jSModuleArray21);
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList19, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList22, compilerOptions24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(jSSourceFileArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSModuleArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        java.lang.String str10 = compiler0.getSourceLine("", (int) (short) 0);
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager12);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler13.getState();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler13.getErrorManager();
        compiler0.setErrorManager(errorManager15);
        java.lang.String str17 = compiler0.toSource();
        java.lang.String str18 = compiler0.getAstDotGraph();
        java.lang.String str19 = compiler0.getAstDotGraph();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(intermediateState14);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        java.lang.String str7 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler0.tracker = performanceTracker8;
        boolean boolean10 = compiler0.hasErrors();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        com.google.javascript.jscomp.Scope scope11 = compiler0.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler0.getSourceMap();
        int int13 = compiler0.getErrorCount();
        boolean boolean14 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler0.tracker;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(performanceTracker15);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getWarnings();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler8.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(errorManager9);
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(errorManager9);
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler11.getMessages();
        com.google.javascript.jscomp.Scope scope13 = compiler11.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler11.getTopScope();
        com.google.javascript.jscomp.JSError[] jSErrorArray15 = compiler11.getMessages();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        java.lang.String str20 = compiler16.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState21 = compiler16.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention22 = compiler16.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState23 = compiler16.getState();
        int int24 = compiler16.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState26 = compiler25.getState();
        compiler25.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker28 = null;
        compiler25.tracker = performanceTracker28;
        com.google.javascript.jscomp.SourceMap sourceMap30 = compiler25.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState32 = compiler31.getState();
        compiler31.reportCodeChange();
        java.io.PrintStream printStream34 = null;
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler(printStream34);
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager37 = compiler36.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState38 = compiler36.getState();
        compiler35.setState(intermediateState38);
        compiler31.setState(intermediateState38);
        compiler25.setState(intermediateState38);
        compiler16.setState(intermediateState38);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState43 = compiler16.getState();
        compiler11.setState(intermediateState43);
        compiler0.setState(intermediateState43);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(jSErrorArray12);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(jSErrorArray15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(intermediateState21);
        org.junit.Assert.assertNotNull(codingConvention22);
        org.junit.Assert.assertNotNull(intermediateState23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intermediateState26);
        org.junit.Assert.assertNull(sourceMap30);
        org.junit.Assert.assertNotNull(intermediateState32);
        org.junit.Assert.assertNotNull(errorManager37);
        org.junit.Assert.assertNotNull(intermediateState38);
        org.junit.Assert.assertNotNull(intermediateState43);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager5);
        compiler6.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler6.tracker = performanceTracker8;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(errorManager5);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("hi!", (int) (byte) 0);
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler0.tracker;
        boolean boolean9 = compiler0.isIdeMode();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(region6);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler7.getState();
        compiler0.setState(intermediateState9);
        int int11 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler12.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager13);
        compiler0.setErrorManager(errorManager13);
        boolean boolean16 = compiler0.isTypeCheckingEnabled();
        int int17 = compiler0.getWarningCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = compiler0.getSourceLine("", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        java.lang.Class<?> wildcardClass9 = compiler0.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder11 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int12 = codeBuilder11.getLength();
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder11, 0, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler9.getState();
        compiler9.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler9.tracker = performanceTracker12;
        com.google.javascript.jscomp.SourceMap sourceMap14 = compiler9.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler15.getState();
        compiler15.reportCodeChange();
        java.io.PrintStream printStream18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(printStream18);
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler20.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState22 = compiler20.getState();
        compiler19.setState(intermediateState22);
        compiler15.setState(intermediateState22);
        compiler9.setState(intermediateState22);
        compiler0.setState(intermediateState22);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState27 = compiler0.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray28 = compiler0.getWarnings();
        boolean boolean29 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSModule jSModule30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = compiler0.toSource(jSModule30);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNull(sourceMap14);
        org.junit.Assert.assertNotNull(intermediateState16);
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNotNull(intermediateState22);
        org.junit.Assert.assertNotNull(intermediateState27);
        org.junit.Assert.assertNotNull(jSErrorArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = compiler0.toSourceArray(jSModule11);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(codingConvention10);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(errorManager7);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler11.getState();
        compiler11.reportCodeChange();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler11.getErrorManager();
        compiler0.setErrorManager(errorManager14);
        com.google.javascript.jscomp.Result result16 = compiler0.getResult();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler0.getErrorManager();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(result16);
        org.junit.Assert.assertNotNull(errorManager17);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
        boolean boolean6 = compiler0.hasErrors();
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler0.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler9.getState();
        compiler9.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler9.tracker = performanceTracker12;
        com.google.javascript.jscomp.SourceMap sourceMap14 = compiler9.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler15.getState();
        compiler15.reportCodeChange();
        java.io.PrintStream printStream18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(printStream18);
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler20.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState22 = compiler20.getState();
        compiler19.setState(intermediateState22);
        compiler15.setState(intermediateState22);
        compiler9.setState(intermediateState22);
        compiler0.setState(intermediateState22);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState27 = compiler0.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray28 = compiler0.getWarnings();
        boolean boolean29 = compiler0.hasErrors();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region32 = compiler0.getSourceRegion("", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNull(sourceMap14);
        org.junit.Assert.assertNotNull(intermediateState16);
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNotNull(intermediateState22);
        org.junit.Assert.assertNotNull(intermediateState27);
        org.junit.Assert.assertNotNull(jSErrorArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        compiler1.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler6.getState();
        compiler6.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler6.tracker = performanceTracker9;
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler6.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler12.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager13);
        com.google.javascript.jscomp.Result result15 = compiler14.getResult();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray18 = compiler16.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler16.tracker = performanceTracker19;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker21 = null;
        compiler16.tracker = performanceTracker21;
        com.google.javascript.jscomp.Scope scope23 = compiler16.getTopScope();
        compiler16.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = null;
        compiler16.tracker = performanceTracker25;
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler16.getErrorManager();
        compiler14.setErrorManager(errorManager27);
        compiler6.setErrorManager(errorManager27);
        compiler1.setErrorManager(errorManager27);
        com.google.javascript.jscomp.ErrorManager errorManager31 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager33 = compiler32.getErrorManager();
        java.lang.String str36 = compiler32.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result37 = compiler32.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray38 = compiler32.getErrors();
        compiler32.disableThreads();
        com.google.javascript.jscomp.Scope scope40 = compiler32.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState41 = compiler32.getState();
        compiler1.setState(intermediateState41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(result15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(jSErrorArray18);
        org.junit.Assert.assertNull(scope23);
        org.junit.Assert.assertNotNull(errorManager27);
        org.junit.Assert.assertNotNull(errorManager31);
        org.junit.Assert.assertNotNull(errorManager33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(result37);
        org.junit.Assert.assertNotNull(jSErrorArray38);
        org.junit.Assert.assertNull(scope40);
        org.junit.Assert.assertNotNull(intermediateState41);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
        com.google.javascript.rhino.Node node10 = compiler0.getRoot();
        int int11 = compiler0.getErrorCount();
        java.lang.String str14 = compiler0.getSourceLine("", 0);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getWarnings();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        boolean boolean8 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList11 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, jSSourceFileArray10);
        com.google.javascript.jscomp.JSModule[] jSModuleArray13 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList14 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList14, jSModuleArray13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result17 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList14, compilerOptions16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSModuleArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Region region9 = compiler0.getSourceRegion("hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(region9);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        boolean boolean8 = compiler0.acceptEcmaScript5();
        int int9 = compiler0.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList6 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, jSSourceFileArray5);
        java.util.List<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList8 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, jSSourceFileList8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        int int8 = compiler0.getWarningCount();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getWarnings();
        boolean boolean11 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile12 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result15 = compiler0.compile(jSSourceFile12, jSSourceFileArray13, compilerOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler0.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(sourceMap11);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        int int3 = compiler2.getWarningCount();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler2.getErrorManager();
        boolean boolean5 = compiler2.hasErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        boolean boolean10 = compiler0.isIdeMode();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule6 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray7 = new com.google.javascript.jscomp.JSModule[] { jSModule6 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler0.compile(jSSourceFileArray5, jSModuleArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertNotNull(jSModuleArray7);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        compiler1.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = compiler1.hasErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNull(performanceTracker5);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        java.lang.String str10 = compiler0.getSourceLine("", (int) (short) 0);
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager12);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler13.getState();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler13.getErrorManager();
        compiler0.setErrorManager(errorManager15);
        java.lang.String str17 = compiler0.toSource();
        boolean boolean18 = compiler0.isIdeMode();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(intermediateState14);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler4.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler4.tracker = performanceTracker7;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler4.tracker = performanceTracker9;
        com.google.javascript.jscomp.Scope scope11 = compiler4.getTopScope();
        compiler4.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler4.tracker = performanceTracker13;
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler4.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager17);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(errorManager17);
        compiler4.setErrorManager(errorManager17);
        compiler0.setErrorManager(errorManager17);
        com.google.javascript.jscomp.CodingConvention codingConvention22 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray23 = compiler0.getMessages();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray24 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(codingConvention22);
        org.junit.Assert.assertNotNull(jSErrorArray23);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.getCodingConvention();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray6 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result8 = compiler0.compile(jSSourceFile5, jSModuleArray6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(codingConvention3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertNotNull(jSModuleArray6);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.reportCodeChange();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler5.getState();
        compiler4.setState(intermediateState7);
        compiler0.setState(intermediateState7);
        java.lang.String str12 = compiler0.getSourceLine("hi!", (int) (byte) -1);
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler13.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(errorManager14);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler15.getState();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler15.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager17);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler18.getState();
        compiler0.setState(intermediateState19);
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(intermediateState16);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(intermediateState19);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        com.google.javascript.jscomp.Scope scope11 = compiler0.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(scope11);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler0.tracker = performanceTracker8;
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler0.getCodingConvention();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(codingConvention10);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        compiler0.setErrorManager(errorManager7);
        int int10 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler11.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker14 = null;
        compiler11.tracker = performanceTracker14;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = null;
        compiler11.tracker = performanceTracker16;
        com.google.javascript.jscomp.Scope scope18 = compiler11.getTopScope();
        compiler11.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = null;
        compiler11.tracker = performanceTracker20;
        com.google.javascript.jscomp.ErrorManager errorManager22 = compiler11.getErrorManager();
        compiler0.setErrorManager(errorManager22);
        com.google.javascript.rhino.Node node24 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler25.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray27 = compiler25.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker28 = null;
        compiler25.tracker = performanceTracker28;
        int int30 = compiler25.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray31 = compiler25.getMessages();
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager33 = compiler32.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState34 = compiler32.getState();
        compiler25.setState(intermediateState34);
        int int36 = compiler25.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager38 = compiler37.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler(errorManager38);
        compiler25.setErrorManager(errorManager38);
        compiler0.setErrorManager(errorManager38);
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler(errorManager38);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNotNull(errorManager22);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(errorManager26);
        org.junit.Assert.assertNotNull(jSErrorArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray31);
        org.junit.Assert.assertNotNull(errorManager33);
        org.junit.Assert.assertNotNull(intermediateState34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(errorManager38);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getMessages();
        java.lang.Class<?> wildcardClass5 = jSErrorArray4.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
        boolean boolean6 = compiler0.hasErrors();
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList11 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, jSSourceFileArray10);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList14 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList14, jSSourceFileArray13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList14, compilerOptions16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler3.getTopScope();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler3.getMessages();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler8.getErrorManager();
        java.lang.String str12 = compiler8.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler8.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler8.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler8.getState();
        int int16 = compiler8.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState18 = compiler17.getState();
        compiler17.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = null;
        compiler17.tracker = performanceTracker20;
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler17.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState24 = compiler23.getState();
        compiler23.reportCodeChange();
        java.io.PrintStream printStream26 = null;
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler(printStream26);
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager29 = compiler28.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState30 = compiler28.getState();
        compiler27.setState(intermediateState30);
        compiler23.setState(intermediateState30);
        compiler17.setState(intermediateState30);
        compiler8.setState(intermediateState30);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState35 = compiler8.getState();
        compiler3.setState(intermediateState35);
        int int37 = compiler3.getWarningCount();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker38 = null;
        compiler3.tracker = performanceTracker38;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intermediateState18);
        org.junit.Assert.assertNull(sourceMap22);
        org.junit.Assert.assertNotNull(intermediateState24);
        org.junit.Assert.assertNotNull(errorManager29);
        org.junit.Assert.assertNotNull(intermediateState30);
        org.junit.Assert.assertNotNull(intermediateState35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        java.util.List<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList5 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList7 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, jSSourceFileArray6);
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler0.compile(jSSourceFileList5, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler7.getState();
        compiler0.setState(intermediateState9);
        int int11 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler12.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager13);
        compiler0.setErrorManager(errorManager13);
        com.google.javascript.jscomp.JSError jSError16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel17 = compiler0.getErrorLevel(jSError16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(errorManager13);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        compiler0.disableThreads();
        java.lang.String str7 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler0.getSourceMap();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError jSError10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(sourceMap8);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler3.getTopScope();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler3.getMessages();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler8.getErrorManager();
        java.lang.String str12 = compiler8.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler8.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler8.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler8.getState();
        int int16 = compiler8.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState18 = compiler17.getState();
        compiler17.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = null;
        compiler17.tracker = performanceTracker20;
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler17.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState24 = compiler23.getState();
        compiler23.reportCodeChange();
        java.io.PrintStream printStream26 = null;
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler(printStream26);
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager29 = compiler28.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState30 = compiler28.getState();
        compiler27.setState(intermediateState30);
        compiler23.setState(intermediateState30);
        compiler17.setState(intermediateState30);
        compiler8.setState(intermediateState30);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState35 = compiler8.getState();
        compiler3.setState(intermediateState35);
        int int37 = compiler3.getWarningCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput39 = compiler3.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intermediateState18);
        org.junit.Assert.assertNull(sourceMap22);
        org.junit.Assert.assertNotNull(intermediateState24);
        org.junit.Assert.assertNotNull(errorManager29);
        org.junit.Assert.assertNotNull(intermediateState30);
        org.junit.Assert.assertNotNull(intermediateState35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = compiler0.parse(jSSourceFile3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState2);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler7.getState();
        compiler0.setState(intermediateState9);
        int int11 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler12.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager13);
        compiler0.setErrorManager(errorManager13);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler16.getState();
        compiler16.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler16.tracker = performanceTracker19;
        com.google.javascript.jscomp.SourceMap sourceMap21 = compiler16.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager23 = compiler22.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(errorManager23);
        com.google.javascript.jscomp.Result result25 = compiler24.getResult();
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler26.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray28 = compiler26.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker29 = null;
        compiler26.tracker = performanceTracker29;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker31 = null;
        compiler26.tracker = performanceTracker31;
        com.google.javascript.jscomp.Scope scope33 = compiler26.getTopScope();
        compiler26.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker35 = null;
        compiler26.tracker = performanceTracker35;
        com.google.javascript.jscomp.ErrorManager errorManager37 = compiler26.getErrorManager();
        compiler24.setErrorManager(errorManager37);
        compiler16.setErrorManager(errorManager37);
        compiler0.setErrorManager(errorManager37);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState41 = compiler0.getState();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(intermediateState17);
        org.junit.Assert.assertNull(sourceMap21);
        org.junit.Assert.assertNotNull(errorManager23);
        org.junit.Assert.assertNotNull(result25);
        org.junit.Assert.assertNotNull(errorManager27);
        org.junit.Assert.assertNotNull(jSErrorArray28);
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertNotNull(errorManager37);
        org.junit.Assert.assertNotNull(intermediateState41);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler2.getState();
        compiler1.setState(intermediateState4);
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = compiler1.toSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler4.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler4.tracker = performanceTracker7;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler4.tracker = performanceTracker9;
        com.google.javascript.jscomp.Scope scope11 = compiler4.getTopScope();
        compiler4.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler4.tracker = performanceTracker13;
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler4.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager17);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(errorManager17);
        compiler4.setErrorManager(errorManager17);
        compiler0.setErrorManager(errorManager17);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(errorManager17);
        com.google.javascript.jscomp.SourceMap sourceMap23 = compiler22.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = compiler22.getSourceLine("hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNull(sourceMap23);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler4.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler4.tracker = performanceTracker7;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler4.tracker = performanceTracker9;
        com.google.javascript.jscomp.Scope scope11 = compiler4.getTopScope();
        compiler4.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler4.tracker = performanceTracker13;
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler4.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager17);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(errorManager17);
        compiler4.setErrorManager(errorManager17);
        compiler0.setErrorManager(errorManager17);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker22 = compiler0.tracker;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = compiler0.getTypeRegistry();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput25 = compiler0.newExternInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNull(performanceTracker22);
        org.junit.Assert.assertNotNull(jSTypeRegistry23);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray9 = new com.google.javascript.jscomp.JSModule[] { jSModule8 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler4.init(jSSourceFileArray7, jSModuleArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler2.getWarnings();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList6 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, jSSourceFileArray5);
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList9, jSModuleArray8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler2.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList9, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler7.getState();
        compiler0.setState(intermediateState9);
        java.lang.String str11 = compiler0.toSource();
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler0.tracker = performanceTracker13;
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(jSErrorArray12);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler0.tracker = performanceTracker8;
        int int10 = compiler0.getWarningCount();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        int int10 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getMessages();
        com.google.javascript.jscomp.JSError jSError12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray11);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        boolean boolean7 = compiler0.hasErrors();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        com.google.javascript.jscomp.Result result9 = compiler8.getResult();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler10.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler10.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler10.tracker = performanceTracker13;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = null;
        compiler10.tracker = performanceTracker15;
        com.google.javascript.jscomp.Scope scope17 = compiler10.getTopScope();
        compiler10.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler10.tracker = performanceTracker19;
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler10.getErrorManager();
        compiler8.setErrorManager(errorManager21);
        compiler0.setErrorManager(errorManager21);
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(errorManager21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = compiler24.isTypeCheckingEnabled();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(jSErrorArray12);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNotNull(errorManager21);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        java.lang.String str8 = compiler0.toSource();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler9.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler9.getErrors();
        int int12 = compiler9.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler9.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler9.getErrorManager();
        compiler0.setErrorManager(errorManager14);
        int int16 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Scope scope17 = compiler0.getTopScope();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(scope17);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler0.getTypeRegistry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler0.getCodingConvention();
        java.lang.String str11 = compiler0.toSource();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler13.getErrorManager();
        java.lang.String str17 = compiler13.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState18 = compiler13.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention19 = compiler13.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState20 = compiler13.getState();
        int int21 = compiler13.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = compiler13.getTypeRegistry();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState23 = compiler13.getState();
        compiler0.setState(intermediateState23);
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intermediateState18);
        org.junit.Assert.assertNotNull(codingConvention19);
        org.junit.Assert.assertNotNull(intermediateState20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry22);
        org.junit.Assert.assertNotNull(intermediateState23);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler10.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler10.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler10.tracker = performanceTracker13;
        boolean boolean15 = compiler10.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler10.getState();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler10.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState18 = compiler10.getState();
        compiler0.setState(intermediateState18);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(jSErrorArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intermediateState16);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(intermediateState18);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler0.getSourceMap();
        compiler0.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(sourceMap11);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        boolean boolean3 = compiler0.isIdeMode();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        java.lang.String str9 = compiler5.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler5.getMessages();
        boolean boolean11 = compiler5.hasErrors();
        boolean boolean12 = compiler5.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler5.getState();
        compiler0.setState(intermediateState13);
        java.lang.Class<?> wildcardClass15 = intermediateState13.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile10 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray9, jSSourceFileArray11, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler0.getTypeRegistry();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result8 = compiler0.compile(jSSourceFile5, jSSourceFile6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler9.getState();
        compiler9.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler9.tracker = performanceTracker12;
        com.google.javascript.jscomp.SourceMap sourceMap14 = compiler9.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler15.getState();
        compiler15.reportCodeChange();
        java.io.PrintStream printStream18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(printStream18);
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler20.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState22 = compiler20.getState();
        compiler19.setState(intermediateState22);
        compiler15.setState(intermediateState22);
        compiler9.setState(intermediateState22);
        compiler0.setState(intermediateState22);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState27 = compiler0.getState();
        com.google.javascript.jscomp.JSError jSError28 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNull(sourceMap14);
        org.junit.Assert.assertNotNull(intermediateState16);
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNotNull(intermediateState22);
        org.junit.Assert.assertNotNull(intermediateState27);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler0.compile(jSSourceFileArray6, jSSourceFileArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.jscomp.JSError jSError5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel6 = compiler0.getErrorLevel(jSError5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(sourceMap4);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        int int7 = compiler0.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        boolean boolean4 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        com.google.javascript.jscomp.Scope scope11 = compiler0.getTopScope();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope11);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        com.google.javascript.jscomp.JSError jSError11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        boolean boolean10 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
        com.google.javascript.rhino.Node node10 = compiler0.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getWarnings();
        compiler0.reportCodeChange();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(jSErrorArray11);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler0.getCodingConvention();
        java.lang.String str11 = compiler0.toSource();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler13.getErrorManager();
        java.lang.String str17 = compiler13.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState18 = compiler13.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention19 = compiler13.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState20 = compiler13.getState();
        int int21 = compiler13.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = compiler13.getTypeRegistry();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState23 = compiler13.getState();
        compiler0.setState(intermediateState23);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = compiler0.tracker;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intermediateState18);
        org.junit.Assert.assertNotNull(codingConvention19);
        org.junit.Assert.assertNotNull(intermediateState20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry22);
        org.junit.Assert.assertNotNull(intermediateState23);
        org.junit.Assert.assertNull(performanceTracker25);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList7 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, jSSourceFileArray6);
        com.google.javascript.jscomp.JSModule[] jSModuleArray9 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList10 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList10, jSModuleArray9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result13 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList10, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSModuleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getWarnings();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder9 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str10 = codeBuilder9.toString();
        java.lang.String str11 = codeBuilder9.toString();
        java.lang.String str12 = codeBuilder9.toString();
        java.lang.String str13 = codeBuilder9.toString();
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder9, (int) (short) 10, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler10.getErrorManager();
        java.lang.String str14 = compiler10.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler10.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler10.getState();
        compiler0.setState(intermediateState17);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler0.tracker = performanceTracker19;
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler0.getWarnings();
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager25 = compiler24.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState26 = compiler24.getState();
        compiler23.setState(intermediateState26);
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager29 = compiler28.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray30 = compiler28.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker31 = null;
        compiler28.tracker = performanceTracker31;
        int int33 = compiler28.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray34 = compiler28.getMessages();
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager36 = compiler35.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState37 = compiler35.getState();
        compiler28.setState(intermediateState37);
        int int39 = compiler28.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager41 = compiler40.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler(errorManager41);
        compiler28.setErrorManager(errorManager41);
        compiler23.setErrorManager(errorManager41);
        compiler0.setErrorManager(errorManager41);
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager47 = compiler46.getErrorManager();
        java.lang.String str50 = compiler46.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState51 = compiler46.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention52 = compiler46.getCodingConvention();
        boolean boolean53 = compiler46.acceptConstKeyword();
        boolean boolean54 = compiler46.hasErrors();
        boolean boolean55 = compiler46.isIdeMode();
        java.io.PrintStream printStream56 = null;
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler(printStream56);
        java.lang.String str58 = compiler57.getAstDotGraph();
        compiler57.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState60 = compiler57.getState();
        compiler46.setState(intermediateState60);
        compiler0.setState(intermediateState60);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertNotNull(intermediateState17);
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertNotNull(errorManager25);
        org.junit.Assert.assertNotNull(intermediateState26);
        org.junit.Assert.assertNotNull(errorManager29);
        org.junit.Assert.assertNotNull(jSErrorArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray34);
        org.junit.Assert.assertNotNull(errorManager36);
        org.junit.Assert.assertNotNull(intermediateState37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(errorManager41);
        org.junit.Assert.assertNotNull(errorManager47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(intermediateState51);
        org.junit.Assert.assertNotNull(codingConvention52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(intermediateState60);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        boolean boolean8 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList12 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList12, jSSourceFileArray11);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList15 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList15, jSSourceFileArray14);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList12, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList15, compilerOptions17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler7.getState();
        compiler0.setState(intermediateState9);
        int int11 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler12.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager13);
        compiler0.setErrorManager(errorManager13);
        boolean boolean16 = compiler0.isTypeCheckingEnabled();
        boolean boolean17 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray18 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile19 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray20 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile19 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray18, jSSourceFileArray20, compilerOptions21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray20);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler7.getState();
        compiler7.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler7.tracker = performanceTracker10;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler12.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(errorManager13);
        compiler7.setErrorManager(errorManager13);
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(errorManager13);
        compiler0.setErrorManager(errorManager13);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertNotNull(errorManager13);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.disableThreads();
        boolean boolean9 = compiler0.isIdeMode();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = compiler0.tracker;
        boolean boolean11 = compiler0.isTypeCheckingEnabled();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(performanceTracker10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler0.getTypeRegistry();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        java.lang.String str8 = compiler0.toSource();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager6);
        compiler0.setErrorManager(errorManager6);
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList12 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList12, jSSourceFileArray11);
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList15 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList15, jSModuleArray14);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList12, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList15, compilerOptions17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSModuleArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        boolean boolean6 = compiler0.hasErrors();
        java.lang.String str7 = compiler0.getAstDotGraph();
        java.lang.Class<?> wildcardClass8 = compiler0.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        com.google.javascript.jscomp.Scope scope11 = compiler0.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler0.getSourceMap();
        com.google.javascript.rhino.Node node13 = compiler0.getRoot();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        com.google.javascript.jscomp.Result result10 = compiler0.getResult();
        java.lang.String str11 = compiler0.toSource();
        java.lang.Class<?> wildcardClass12 = compiler0.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(result10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        boolean boolean9 = compiler0.hasErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        int int2 = codeBuilder0.getLength();
        java.lang.String str3 = codeBuilder0.toString();
        java.lang.String str4 = codeBuilder0.toString();
        java.lang.String str5 = codeBuilder0.toString();
        int int6 = codeBuilder0.getLength();
        java.lang.String str7 = codeBuilder0.toString();
        java.lang.String str8 = codeBuilder0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler4.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler4.tracker = performanceTracker7;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler4.tracker = performanceTracker9;
        com.google.javascript.jscomp.Scope scope11 = compiler4.getTopScope();
        compiler4.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler4.tracker = performanceTracker13;
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler4.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager17);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(errorManager17);
        compiler4.setErrorManager(errorManager17);
        compiler0.setErrorManager(errorManager17);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker22 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState23 = compiler0.getState();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNull(performanceTracker22);
        org.junit.Assert.assertNotNull(intermediateState23);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getErrors();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        java.lang.String str9 = compiler5.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler5.getMessages();
        boolean boolean11 = compiler5.hasErrors();
        boolean boolean12 = compiler5.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler5.getState();
        compiler0.setState(intermediateState13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray15 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intermediateState13);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager6);
        compiler0.setErrorManager(errorManager6);
        java.lang.Class<?> wildcardClass10 = compiler0.getClass();
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler4.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler4.tracker = performanceTracker7;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler4.tracker = performanceTracker9;
        com.google.javascript.jscomp.Scope scope11 = compiler4.getTopScope();
        compiler4.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler4.tracker = performanceTracker13;
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler4.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager17);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(errorManager17);
        compiler4.setErrorManager(errorManager17);
        compiler0.setErrorManager(errorManager17);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker22 = compiler0.tracker;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = compiler0.getTypeRegistry();
        compiler0.reportCodeChange();
        int int25 = compiler0.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNull(performanceTracker22);
        org.junit.Assert.assertNotNull(jSTypeRegistry23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("hi!", (int) (byte) 0);
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(region6);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        boolean boolean8 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        com.google.javascript.jscomp.Region region12 = compiler0.getSourceRegion("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNull(region12);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, jSSourceFileArray8);
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList12 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList12, jSModuleArray11);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList12, compilerOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSModuleArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        boolean boolean9 = compiler0.hasErrors();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler0.getSourceMap();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.hasErrors();
        java.lang.String str7 = compiler0.toSource();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        compiler0.reportCodeChange();
        java.lang.String str9 = compiler0.toSource();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        java.lang.String str10 = compiler0.getSourceLine("", (int) (short) 0);
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager12);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler13.getState();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler13.getErrorManager();
        compiler0.setErrorManager(errorManager15);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = compiler0.tracker;
        com.google.javascript.jscomp.CodingConvention codingConvention18 = compiler0.getCodingConvention();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(intermediateState14);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNull(performanceTracker17);
        org.junit.Assert.assertNotNull(codingConvention18);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        java.lang.String str9 = compiler0.getAstDotGraph();
        java.lang.String str10 = compiler0.toSource();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler0.getErrorManager();
        boolean boolean10 = compiler0.hasErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getErrors();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler10.getErrorManager();
        java.lang.String str14 = compiler10.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result15 = compiler10.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler10.getErrors();
        compiler10.disableThreads();
        com.google.javascript.jscomp.Scope scope18 = compiler10.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler10.getState();
        compiler0.setState(intermediateState19);
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(result15);
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNotNull(intermediateState19);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.rhino.Node node3 = compiler2.getRoot();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = null;
        compiler2.tracker = performanceTracker4;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler6.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler6.tracker = performanceTracker9;
        boolean boolean11 = compiler6.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler6.getState();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler6.getErrorManager();
        compiler2.setErrorManager(errorManager13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = compiler2.hasErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertNotNull(errorManager13);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler6.getState();
        compiler6.reportCodeChange();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler11.getState();
        compiler10.setState(intermediateState13);
        compiler6.setState(intermediateState13);
        compiler0.setState(intermediateState13);
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(intermediateState13);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        java.lang.String str7 = compiler0.getAstDotGraph();
        boolean boolean8 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = compiler0.toSourceArray(jSModule10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.JSError jSError7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getMessages();
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler0.getSourceMap();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertNull(sourceMap11);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        java.lang.String str6 = compiler0.getAstDotGraph();
        java.lang.String str7 = compiler0.getAstDotGraph();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        java.lang.Class<?> wildcardClass9 = compiler0.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = sourceMap6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        compiler0.setErrorManager(errorManager7);
        int int10 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getWarnings();
        int int12 = compiler0.getWarningCount();
        boolean boolean13 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker14 = compiler0.tracker;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(performanceTracker14);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler0.getState();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput11 = compiler0.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(intermediateState9);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = compiler0.tracker;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertNull(performanceTracker10);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        compiler0.disableThreads();
        com.google.javascript.jscomp.PassConfig passConfig5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(performanceTracker3);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        java.lang.String str10 = compiler0.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput12 = compiler0.newExternInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler7.getState();
        compiler0.setState(intermediateState9);
        int int11 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler12.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager13);
        compiler0.setErrorManager(errorManager13);
        int int16 = compiler0.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        int int8 = compiler0.getErrorCount();
        int int9 = compiler0.getErrorCount();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = compiler0.tracker;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(performanceTracker10);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler0.tracker;
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        boolean boolean10 = compiler0.hasErrors();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler11.getState();
        compiler11.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker14 = null;
        compiler11.tracker = performanceTracker14;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager17);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(errorManager17);
        compiler11.setErrorManager(errorManager17);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(errorManager17);
        com.google.javascript.jscomp.ErrorManager errorManager22 = compiler21.getErrorManager();
        compiler0.setErrorManager(errorManager22);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(errorManager22);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.rhino.Node node9 = compiler0.getRoot();
        java.lang.String str10 = compiler0.getAstDotGraph();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler10.getErrorManager();
        java.lang.String str14 = compiler10.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler10.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler10.getState();
        compiler0.setState(intermediateState17);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler0.tracker = performanceTracker19;
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler0.getWarnings();
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager25 = compiler24.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState26 = compiler24.getState();
        compiler23.setState(intermediateState26);
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager29 = compiler28.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray30 = compiler28.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker31 = null;
        compiler28.tracker = performanceTracker31;
        int int33 = compiler28.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray34 = compiler28.getMessages();
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager36 = compiler35.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState37 = compiler35.getState();
        compiler28.setState(intermediateState37);
        int int39 = compiler28.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager41 = compiler40.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler(errorManager41);
        compiler28.setErrorManager(errorManager41);
        compiler23.setErrorManager(errorManager41);
        compiler0.setErrorManager(errorManager41);
        com.google.javascript.jscomp.JSError[] jSErrorArray46 = compiler0.getWarnings();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertNotNull(intermediateState17);
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertNotNull(errorManager25);
        org.junit.Assert.assertNotNull(intermediateState26);
        org.junit.Assert.assertNotNull(errorManager29);
        org.junit.Assert.assertNotNull(jSErrorArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray34);
        org.junit.Assert.assertNotNull(errorManager36);
        org.junit.Assert.assertNotNull(intermediateState37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(errorManager41);
        org.junit.Assert.assertNotNull(jSErrorArray46);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler0.getSourceMap();
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler0.getMessages();
        com.google.javascript.jscomp.JSError jSError13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(jSErrorArray12);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        int int10 = compiler0.getWarningCount();
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler0.getSourceMap();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile12 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile12 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray13, jSModuleArray14, compilerOptions15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertNotNull(jSModuleArray14);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        boolean boolean8 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler0.getSourceMap();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(sourceMap9);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        boolean boolean7 = compiler0.acceptEcmaScript5();
        int int8 = compiler0.getErrorCount();
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler9.getState();
        compiler9.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler9.tracker = performanceTracker12;
        com.google.javascript.jscomp.SourceMap sourceMap14 = compiler9.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler15.getState();
        compiler15.reportCodeChange();
        java.io.PrintStream printStream18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(printStream18);
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler20.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState22 = compiler20.getState();
        compiler19.setState(intermediateState22);
        compiler15.setState(intermediateState22);
        compiler9.setState(intermediateState22);
        compiler0.setState(intermediateState22);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState27 = compiler0.getState();
        boolean boolean28 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray29 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray30 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result32 = compiler0.compile(jSSourceFileArray29, jSSourceFileArray30, compilerOptions31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNull(sourceMap14);
        org.junit.Assert.assertNotNull(intermediateState16);
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNotNull(intermediateState22);
        org.junit.Assert.assertNotNull(intermediateState27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray29);
        org.junit.Assert.assertNotNull(jSSourceFileArray30);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile4 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile4 };
        com.google.javascript.jscomp.JSModule jSModule6 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray7 = new com.google.javascript.jscomp.JSModule[] { jSModule6 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray5, jSModuleArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertNotNull(jSModuleArray7);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        java.lang.String str7 = compiler0.toSource();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        compiler0.disableThreads();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler4.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler4.tracker = performanceTracker7;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler4.tracker = performanceTracker9;
        com.google.javascript.jscomp.Scope scope11 = compiler4.getTopScope();
        compiler4.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler4.tracker = performanceTracker13;
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler4.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager17);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(errorManager17);
        compiler4.setErrorManager(errorManager17);
        compiler0.setErrorManager(errorManager17);
        int int22 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSError jSError23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel24 = compiler0.getErrorLevel(jSError23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray6 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result8 = compiler0.compile(jSSourceFile5, jSModuleArray6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(jSModuleArray6);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        int int8 = compiler0.getErrorCount();
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
        java.lang.String str10 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Result result11 = compiler0.getResult();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(result11);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList7 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, jSSourceFileArray6);
        com.google.javascript.jscomp.JSModule[] jSModuleArray9 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList10 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList10, jSModuleArray9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result13 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList10, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSModuleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        boolean boolean6 = compiler0.hasErrors();
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = compiler0.parse(jSSourceFile8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler10.getErrorManager();
        java.lang.String str14 = compiler10.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler10.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler10.getState();
        compiler0.setState(intermediateState17);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler0.tracker = performanceTracker19;
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler0.getWarnings();
        com.google.javascript.jscomp.ErrorManager errorManager22 = compiler0.getErrorManager();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertNotNull(intermediateState17);
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertNotNull(errorManager22);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        java.lang.String str11 = compiler7.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler7.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler7.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler7.getState();
        int int15 = compiler7.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler16.getState();
        compiler16.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler16.tracker = performanceTracker19;
        com.google.javascript.jscomp.SourceMap sourceMap21 = compiler16.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState23 = compiler22.getState();
        compiler22.reportCodeChange();
        java.io.PrintStream printStream25 = null;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(printStream25);
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler27.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState29 = compiler27.getState();
        compiler26.setState(intermediateState29);
        compiler22.setState(intermediateState29);
        compiler16.setState(intermediateState29);
        compiler7.setState(intermediateState29);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState34 = compiler7.getState();
        compiler0.setState(intermediateState34);
        java.lang.String str36 = compiler0.toSource();
        java.lang.String str37 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile38 = null;
        com.google.javascript.jscomp.JSModule jSModule39 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray40 = new com.google.javascript.jscomp.JSModule[] { jSModule39 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions41 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result42 = compiler0.compile(jSSourceFile38, jSModuleArray40, compilerOptions41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNotNull(intermediateState14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intermediateState17);
        org.junit.Assert.assertNull(sourceMap21);
        org.junit.Assert.assertNotNull(intermediateState23);
        org.junit.Assert.assertNotNull(errorManager28);
        org.junit.Assert.assertNotNull(intermediateState29);
        org.junit.Assert.assertNotNull(intermediateState34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(jSModuleArray40);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("hi!", (int) (byte) 0);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList8 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList8, jSSourceFileArray7);
        com.google.javascript.jscomp.JSModule[] jSModuleArray10 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList11 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList11, jSModuleArray10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList8, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList11, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(region6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSModuleArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNull(scope8);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler4.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler4.tracker = performanceTracker7;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler4.tracker = performanceTracker9;
        com.google.javascript.jscomp.Scope scope11 = compiler4.getTopScope();
        compiler4.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler4.tracker = performanceTracker13;
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler4.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager17);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(errorManager17);
        compiler4.setErrorManager(errorManager17);
        compiler0.setErrorManager(errorManager17);
        com.google.javascript.jscomp.CodingConvention codingConvention22 = compiler0.getCodingConvention();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput24 = compiler0.newExternInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(codingConvention22);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler8.getErrorManager();
        java.lang.String str12 = compiler8.getSourceLine("", (-1));
        compiler8.disableThreads();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler14.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(errorManager15);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler16.getState();
        compiler8.setState(intermediateState17);
        compiler0.setState(intermediateState17);
        com.google.javascript.jscomp.Result result20 = compiler0.getResult();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(intermediateState17);
        org.junit.Assert.assertNotNull(result20);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        java.lang.String str7 = compiler0.getAstDotGraph();
        boolean boolean8 = compiler0.acceptConstKeyword();
        compiler0.disableThreads();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler0.getTypeRegistry();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        int int10 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList12 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList12, jSSourceFileArray11);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList15 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList15, jSSourceFileArray14);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList12, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList15, compilerOptions17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        boolean boolean5 = compiler0.isIdeMode();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList8 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList8, jSSourceFileArray7);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList11 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, jSSourceFileArray10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList8, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        com.google.javascript.jscomp.Result result9 = compiler8.getResult();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler10.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler10.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler10.tracker = performanceTracker13;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = null;
        compiler10.tracker = performanceTracker15;
        com.google.javascript.jscomp.Scope scope17 = compiler10.getTopScope();
        compiler10.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler10.tracker = performanceTracker19;
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler10.getErrorManager();
        compiler8.setErrorManager(errorManager21);
        compiler0.setErrorManager(errorManager21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = compiler0.acceptConstKeyword();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(jSErrorArray12);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNotNull(errorManager21);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        int int5 = compiler0.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(sourceMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        com.google.javascript.rhino.Node node9 = compiler0.getRoot();
        boolean boolean10 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getMessages();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSErrorArray11);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention11 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler0.getWarnings();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler0.getErrorManager();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNotNull(codingConvention11);
        org.junit.Assert.assertNotNull(jSErrorArray12);
        org.junit.Assert.assertNotNull(errorManager13);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        int int8 = compiler0.getWarningCount();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getWarnings();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region13 = compiler0.getSourceRegion("", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray10);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.rhino.Node node3 = compiler2.getRoot();
        compiler2.disableThreads();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList6 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, jSSourceFileArray5);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, jSSourceFileArray8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler2.init((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSError jSError4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel5 = compiler0.getErrorLevel(jSError4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler2.getTypeRegistry();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler2.getCodingConvention();
        compiler2.reportCodeChange();
        int int7 = compiler2.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        compiler4.reportCodeChange();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler4.initOptions(compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(errorManager5);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        boolean boolean7 = compiler0.hasErrors();
        compiler0.reportCodeChange();
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getErrors();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler0.getState();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager12);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertNotNull(intermediateState11);
        org.junit.Assert.assertNotNull(errorManager12);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        boolean boolean7 = compiler0.hasErrors();
        compiler0.reportCodeChange();
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getErrors();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError jSError13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertNotNull(intermediateState11);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler0.getCodingConvention();
        java.lang.String str11 = compiler0.toSource();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        int int6 = compiler0.getWarningCount();
        int int7 = compiler0.getWarningCount();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result13 = compiler0.compile(jSSourceFile10, jSSourceFile11, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] { jSModule7 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler0.compile(jSSourceFileArray6, jSModuleArray8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(performanceTracker4);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertNotNull(jSModuleArray8);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler0.getState();
        boolean boolean10 = compiler0.acceptEcmaScript5();
        compiler0.disableThreads();
        boolean boolean12 = compiler0.isIdeMode();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler4.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler4.tracker = performanceTracker7;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler4.tracker = performanceTracker9;
        com.google.javascript.jscomp.Scope scope11 = compiler4.getTopScope();
        compiler4.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler4.tracker = performanceTracker13;
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler4.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager17);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(errorManager17);
        compiler4.setErrorManager(errorManager17);
        compiler0.setErrorManager(errorManager17);
        int int22 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Scope scope23 = compiler0.getTopScope();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(scope23);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        java.lang.String str6 = compiler0.getAstDotGraph();
        java.lang.String str7 = compiler0.getAstDotGraph();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PassConfig passConfig11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(codingConvention10);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        int int6 = compiler0.getWarningCount();
        int int7 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getWarnings();
        boolean boolean9 = compiler0.acceptEcmaScript5();
        boolean boolean10 = compiler0.isIdeMode();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getErrors();
        com.google.javascript.jscomp.JSError jSError10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel11 = compiler0.getErrorLevel(jSError10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        java.lang.String str8 = compiler0.toSource();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler9.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler9.getErrors();
        int int12 = compiler9.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler9.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler9.getErrorManager();
        compiler0.setErrorManager(errorManager14);
        java.lang.String str18 = compiler0.getSourceLine("", 0);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Region region9 = compiler0.getSourceRegion("hi!", (int) (short) 0);
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = compiler0.toSourceArray(jSModule10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(region9);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        compiler0.setErrorManager(errorManager7);
        int int10 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getWarnings();
        int int12 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray13, jSSourceFileArray14, compilerOptions15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getWarnings();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile9 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray8, jSSourceFileArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        int int3 = compiler2.getWarningCount();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler2.getErrorManager();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler2.tracker;
        java.lang.Class<?> wildcardClass6 = compiler2.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Region region7 = compiler0.getSourceRegion("", 0);
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getWarnings();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(region7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        compiler1.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler6.getState();
        compiler6.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler6.tracker = performanceTracker9;
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler6.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler12.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager13);
        com.google.javascript.jscomp.Result result15 = compiler14.getResult();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray18 = compiler16.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler16.tracker = performanceTracker19;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker21 = null;
        compiler16.tracker = performanceTracker21;
        com.google.javascript.jscomp.Scope scope23 = compiler16.getTopScope();
        compiler16.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = null;
        compiler16.tracker = performanceTracker25;
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler16.getErrorManager();
        compiler14.setErrorManager(errorManager27);
        compiler6.setErrorManager(errorManager27);
        compiler1.setErrorManager(errorManager27);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray31 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList32 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList32, jSSourceFileArray31);
        com.google.javascript.jscomp.JSModule[] jSModuleArray34 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList35 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList35, jSModuleArray34);
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList32, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList35, compilerOptions37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(result15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(jSErrorArray18);
        org.junit.Assert.assertNull(scope23);
        org.junit.Assert.assertNotNull(errorManager27);
        org.junit.Assert.assertNotNull(jSSourceFileArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSModuleArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler2.getState();
        compiler1.setState(intermediateState4);
        compiler1.disableThreads();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(errorManager8);
        compiler1.setErrorManager(errorManager8);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNotNull(errorManager8);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler0.getErrorManager();
        boolean boolean7 = compiler0.isIdeMode();
        boolean boolean8 = compiler0.acceptConstKeyword();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager4);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        boolean boolean7 = compiler0.hasErrors();
        compiler0.reportCodeChange();
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler0.getErrorManager();
        boolean boolean11 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList13 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList13, jSSourceFileArray12);
        com.google.javascript.jscomp.JSModule[] jSModuleArray15 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList16 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList16, jSModuleArray15);
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result19 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList13, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList16, compilerOptions18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSModuleArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler6.getState();
        compiler6.reportCodeChange();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler11.getState();
        compiler10.setState(intermediateState13);
        compiler6.setState(intermediateState13);
        compiler0.setState(intermediateState13);
        compiler0.reportCodeChange();
        java.lang.String str18 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler0.getState();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region22 = compiler0.getSourceRegion("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(intermediateState19);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler7.getState();
        compiler0.setState(intermediateState9);
        int int11 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler12.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager13);
        compiler0.setErrorManager(errorManager13);
        boolean boolean16 = compiler0.isTypeCheckingEnabled();
        boolean boolean17 = compiler0.acceptConstKeyword();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CodingConvention codingConvention19 = compiler0.getCodingConvention();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(codingConvention19);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.getCodingConvention();
        boolean boolean4 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result8 = compiler0.compile(jSSourceFile5, jSSourceFile6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(codingConvention3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler7.getState();
        compiler0.setState(intermediateState9);
        int int11 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler12.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager13);
        compiler0.setErrorManager(errorManager13);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder16 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str17 = codeBuilder16.toString();
        int int18 = codeBuilder16.getLength();
        int int19 = codeBuilder16.getLength();
        int int20 = codeBuilder16.getLength();
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder16, (int) (short) 0, node22);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("hi!", (int) (byte) 0);
        boolean boolean7 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(region6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        int int8 = compiler0.getErrorCount();
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile5 };
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile7 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray6, jSSourceFileArray8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        int int2 = codeBuilder0.getLength();
        java.lang.String str3 = codeBuilder0.toString();
        java.lang.String str4 = codeBuilder0.toString();
        int int5 = codeBuilder0.getLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getErrors();
        int int9 = compiler0.getErrorCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler0.compile(jSSourceFile7, jSModuleArray8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(jSModuleArray8);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        boolean boolean4 = compiler0.hasErrors();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray5 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        boolean boolean7 = compiler0.hasErrors();
        compiler0.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler0.getInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler3.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler3.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler6.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler6.tracker = performanceTracker9;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler6.tracker = performanceTracker11;
        com.google.javascript.jscomp.Scope scope13 = compiler6.getTopScope();
        compiler6.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = null;
        compiler6.tracker = performanceTracker15;
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler6.getErrorManager();
        compiler3.setErrorManager(errorManager17);
        compiler0.setErrorManager(errorManager17);
        com.google.javascript.rhino.Node node20 = compiler0.getRoot();
        com.google.javascript.jscomp.JSError jSError21 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler6.getState();
        compiler6.reportCodeChange();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler11.getState();
        compiler10.setState(intermediateState13);
        compiler6.setState(intermediateState13);
        compiler0.setState(intermediateState13);
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler0.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler0.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler0.getErrorManager();
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertNotNull(errorManager19);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler4.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler4.tracker = performanceTracker7;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler4.tracker = performanceTracker9;
        com.google.javascript.jscomp.Scope scope11 = compiler4.getTopScope();
        compiler4.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler4.tracker = performanceTracker13;
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler4.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager17);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(errorManager17);
        compiler4.setErrorManager(errorManager17);
        compiler0.setErrorManager(errorManager17);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker22 = compiler0.tracker;
        boolean boolean23 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray24 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray25 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray24, jSModuleArray25, compilerOptions26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNull(performanceTracker22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray24);
        org.junit.Assert.assertNotNull(jSModuleArray25);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        java.lang.String str10 = compiler0.getAstDotGraph();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        java.lang.String str7 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] { jSModule10 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result13 = compiler0.compile(jSSourceFile9, jSModuleArray11, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertNotNull(jSModuleArray11);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList7 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, jSSourceFileArray6);
        com.google.javascript.jscomp.JSModule[] jSModuleArray9 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList10 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList10, jSModuleArray9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result13 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList10, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(sourceMap4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSModuleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        int int3 = compiler2.getWarningCount();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler2.getErrorManager();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler2.tracker;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile6 };
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray9 = new com.google.javascript.jscomp.JSModule[] { jSModule8 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler2.compile(jSSourceFileArray7, jSModuleArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
        boolean boolean6 = compiler0.hasErrors();
        int int7 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler8.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler8.getErrors();
        int int11 = compiler8.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler12.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray14 = compiler12.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = null;
        compiler12.tracker = performanceTracker15;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = null;
        compiler12.tracker = performanceTracker17;
        com.google.javascript.jscomp.Scope scope19 = compiler12.getTopScope();
        compiler12.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker21 = null;
        compiler12.tracker = performanceTracker21;
        com.google.javascript.jscomp.SourceMap sourceMap23 = compiler12.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager25 = compiler24.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(errorManager25);
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler(errorManager25);
        compiler12.setErrorManager(errorManager25);
        compiler8.setErrorManager(errorManager25);
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(errorManager25);
        compiler0.setErrorManager(errorManager25);
        com.google.javascript.jscomp.JSError[] jSErrorArray32 = compiler0.getMessages();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(jSErrorArray14);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNull(sourceMap23);
        org.junit.Assert.assertNotNull(errorManager25);
        org.junit.Assert.assertNotNull(jSErrorArray32);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager6);
        compiler0.setErrorManager(errorManager6);
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(errorManager6);
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler10.getSourceMap();
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(sourceMap11);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getErrors();
        boolean boolean10 = compiler0.isIdeMode();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        java.lang.String str11 = compiler7.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler7.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler7.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler7.getState();
        int int15 = compiler7.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler16.getState();
        compiler16.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler16.tracker = performanceTracker19;
        com.google.javascript.jscomp.SourceMap sourceMap21 = compiler16.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState23 = compiler22.getState();
        compiler22.reportCodeChange();
        java.io.PrintStream printStream25 = null;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(printStream25);
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler27.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState29 = compiler27.getState();
        compiler26.setState(intermediateState29);
        compiler22.setState(intermediateState29);
        compiler16.setState(intermediateState29);
        compiler7.setState(intermediateState29);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState34 = compiler7.getState();
        compiler0.setState(intermediateState34);
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager37 = compiler36.getErrorManager();
        java.lang.String str40 = compiler36.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray41 = compiler36.getMessages();
        boolean boolean42 = compiler36.hasErrors();
        com.google.javascript.jscomp.ErrorManager errorManager43 = compiler36.getErrorManager();
        java.lang.String str44 = compiler36.toSource();
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager46 = compiler45.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray47 = compiler45.getErrors();
        int int48 = compiler45.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap49 = compiler45.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager50 = compiler45.getErrorManager();
        compiler36.setErrorManager(errorManager50);
        compiler0.setErrorManager(errorManager50);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNotNull(intermediateState14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intermediateState17);
        org.junit.Assert.assertNull(sourceMap21);
        org.junit.Assert.assertNotNull(intermediateState23);
        org.junit.Assert.assertNotNull(errorManager28);
        org.junit.Assert.assertNotNull(intermediateState29);
        org.junit.Assert.assertNotNull(intermediateState34);
        org.junit.Assert.assertNotNull(errorManager37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(jSErrorArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(errorManager43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(errorManager46);
        org.junit.Assert.assertNotNull(jSErrorArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(sourceMap49);
        org.junit.Assert.assertNotNull(errorManager50);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler0.getErrorManager();
        boolean boolean10 = compiler0.isIdeMode();
        int int11 = compiler0.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
        boolean boolean6 = compiler0.hasErrors();
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getMessages();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(jSErrorArray11);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        java.lang.String str11 = compiler7.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler7.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler7.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler7.getState();
        int int15 = compiler7.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler16.getState();
        compiler16.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler16.tracker = performanceTracker19;
        com.google.javascript.jscomp.SourceMap sourceMap21 = compiler16.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState23 = compiler22.getState();
        compiler22.reportCodeChange();
        java.io.PrintStream printStream25 = null;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(printStream25);
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler27.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState29 = compiler27.getState();
        compiler26.setState(intermediateState29);
        compiler22.setState(intermediateState29);
        compiler16.setState(intermediateState29);
        compiler7.setState(intermediateState29);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState34 = compiler7.getState();
        compiler0.setState(intermediateState34);
        java.lang.String str36 = compiler0.toSource();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager38 = compiler37.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler(errorManager38);
        com.google.javascript.jscomp.ErrorManager errorManager40 = compiler39.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager41 = compiler39.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager43 = compiler42.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray44 = compiler42.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker45 = null;
        compiler42.tracker = performanceTracker45;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker47 = null;
        compiler42.tracker = performanceTracker47;
        com.google.javascript.jscomp.Scope scope49 = compiler42.getTopScope();
        compiler42.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker51 = null;
        compiler42.tracker = performanceTracker51;
        com.google.javascript.jscomp.ErrorManager errorManager53 = compiler42.getErrorManager();
        compiler39.setErrorManager(errorManager53);
        compiler0.setErrorManager(errorManager53);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNotNull(intermediateState14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intermediateState17);
        org.junit.Assert.assertNull(sourceMap21);
        org.junit.Assert.assertNotNull(intermediateState23);
        org.junit.Assert.assertNotNull(errorManager28);
        org.junit.Assert.assertNotNull(intermediateState29);
        org.junit.Assert.assertNotNull(intermediateState34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(errorManager38);
        org.junit.Assert.assertNotNull(errorManager40);
        org.junit.Assert.assertNotNull(errorManager41);
        org.junit.Assert.assertNotNull(errorManager43);
        org.junit.Assert.assertNotNull(jSErrorArray44);
        org.junit.Assert.assertNull(scope49);
        org.junit.Assert.assertNotNull(errorManager53);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler12.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(errorManager13);
        compiler0.setErrorManager(errorManager13);
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(errorManager13);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = compiler17.getTypeRegistry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(errorManager13);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        compiler1.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = compiler1.acceptConstKeyword();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(intermediateState4);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        compiler0.setErrorManager(errorManager7);
        int int10 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getWarnings();
        int int12 = compiler0.getWarningCount();
        boolean boolean13 = compiler0.acceptEcmaScript5();
        boolean boolean14 = compiler0.acceptConstKeyword();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        int int9 = compiler0.getWarningCount();
        boolean boolean10 = compiler0.acceptEcmaScript5();
        int int11 = compiler0.getErrorCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray14 = compiler0.toSourceArray(jSModule13);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry12);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        boolean boolean8 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = compiler0.parse(jSSourceFile10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.rhino.Node node3 = compiler2.getRoot();
        compiler2.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler2.getWarnings();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(jSErrorArray5);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        boolean boolean4 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        int int6 = compiler0.getErrorCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler4.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler4.tracker = performanceTracker7;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler4.tracker = performanceTracker9;
        com.google.javascript.jscomp.Scope scope11 = compiler4.getTopScope();
        compiler4.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler4.tracker = performanceTracker13;
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler4.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager17);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(errorManager17);
        compiler4.setErrorManager(errorManager17);
        compiler0.setErrorManager(errorManager17);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker22 = compiler0.tracker;
        com.google.javascript.jscomp.Scope scope23 = compiler0.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap24 = compiler0.getSourceMap();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNull(performanceTracker22);
        org.junit.Assert.assertNull(scope23);
        org.junit.Assert.assertNull(sourceMap24);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler0.tracker = performanceTracker8;
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = compiler0.toSource(jSModule11);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(codingConvention10);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention11 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = compiler0.tracker;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile13 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile14 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result16 = compiler0.compile(jSSourceFile13, jSSourceFile14, compilerOptions15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNotNull(codingConvention11);
        org.junit.Assert.assertNull(performanceTracker12);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder8 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str9 = codeBuilder8.toString();
        java.lang.String str10 = codeBuilder8.toString();
        java.lang.String str11 = codeBuilder8.toString();
        java.lang.String str12 = codeBuilder8.toString();
        java.lang.String str13 = codeBuilder8.toString();
        int int14 = codeBuilder8.getLength();
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder8, (int) (short) 100, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        java.lang.String str10 = compiler0.getSourceLine("", 0);
        boolean boolean11 = compiler0.acceptConstKeyword();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler3.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler3.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler6.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler6.tracker = performanceTracker9;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler6.tracker = performanceTracker11;
        com.google.javascript.jscomp.Scope scope13 = compiler6.getTopScope();
        compiler6.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = null;
        compiler6.tracker = performanceTracker15;
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler6.getErrorManager();
        compiler3.setErrorManager(errorManager17);
        compiler0.setErrorManager(errorManager17);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = compiler0.tracker;
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNull(performanceTracker20);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        int int10 = compiler0.getWarningCount();
        boolean boolean11 = compiler0.acceptConstKeyword();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray5 = new com.google.javascript.jscomp.JSModule[] { jSModule4 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result7 = compiler0.compile(jSSourceFile3, jSModuleArray5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(jSModuleArray5);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = compiler1.parse(jSSourceFile5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler0.getState();
        boolean boolean10 = compiler0.acceptEcmaScript5();
        compiler0.disableThreads();
        int int12 = compiler0.getErrorCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.rhino.Node node3 = compiler2.getRoot();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = null;
        compiler2.tracker = performanceTracker4;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler6.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler6.tracker = performanceTracker9;
        boolean boolean11 = compiler6.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler6.getState();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler6.getErrorManager();
        compiler2.setErrorManager(errorManager13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(errorManager13);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertNotNull(errorManager13);
    }
}

