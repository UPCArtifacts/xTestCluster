import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler0.compile(jSSourceFile9, jSSourceFile10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        int int9 = compiler0.getWarningCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = compiler0.toSourceArray();
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
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        int int9 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder10 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str11 = codeBuilder10.toString();
        java.lang.String str12 = codeBuilder10.toString();
        java.lang.String str13 = codeBuilder10.toString();
        int int14 = codeBuilder10.getLength();
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder10, (int) (byte) -1, node16);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray9 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler0.compile(jSSourceFile8, jSModuleArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler0.toSourceArray(jSModule7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("hi!", (int) (byte) 0);
        boolean boolean7 = compiler0.acceptEcmaScript5();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(region6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSModuleArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
        boolean boolean36 = compiler0.isIdeMode();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        int int6 = compiler0.getWarningCount();
        int int7 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler0.getTypeRegistry();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region13 = compiler0.getSourceRegion("hi!", (int) (byte) 1);
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
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
        java.lang.Class<?> wildcardClass11 = compiler0.getClass();
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder9 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int10 = codeBuilder9.getLength();
        int int11 = codeBuilder9.getLength();
        int int12 = codeBuilder9.getLength();
        int int13 = codeBuilder9.getLength();
        java.lang.String str14 = codeBuilder9.toString();
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder9, 0, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = compiler0.parse(jSSourceFile7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = compiler0.getErrorCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
            com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler0.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler1.getInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = compiler1.isTypeCheckingEnabled();
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
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler0.getErrorManager();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler0.getSourceMap();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNull(sourceMap12);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler0.tracker = performanceTracker8;
        java.lang.Class<?> wildcardClass10 = compiler0.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
        com.google.javascript.jscomp.PassConfig passConfig17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler3.setPassConfig(passConfig17);
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
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        java.lang.String str6 = compiler3.getAstDotGraph();
        com.google.javascript.jscomp.Result result7 = compiler3.getResult();
        int int8 = compiler3.getErrorCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(result7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler0.getErrorManager();
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        boolean boolean13 = compiler10.isTypeCheckingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = compiler10.getSourceLine("", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region11 = compiler8.getSourceRegion("hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(errorManager7);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        boolean boolean9 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder10 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str11 = codeBuilder10.toString();
        java.lang.String str12 = codeBuilder10.toString();
        int int13 = codeBuilder10.getLength();
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder10, (int) 'a', node15);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray19 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile20 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray21 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile20 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler17.init(jSSourceFileArray19, jSSourceFileArray21, compilerOptions22);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray19);
        org.junit.Assert.assertNotNull(jSSourceFileArray21);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        com.google.javascript.jscomp.JSError jSError17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel18 = compiler3.getErrorLevel(jSError17);
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
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler2.getState();
        compiler1.setState(intermediateState4);
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler1.getTypeRegistry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler4.getErrors();
        java.lang.String str8 = compiler4.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler4.tracker = performanceTracker9;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile12 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile12 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result15 = compiler4.compile(jSSourceFileArray11, jSSourceFileArray13, compilerOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler8.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler8.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler8.tracker = performanceTracker11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler8.tracker = performanceTracker13;
        com.google.javascript.jscomp.Scope scope15 = compiler8.getTopScope();
        compiler8.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = null;
        compiler8.tracker = performanceTracker17;
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler8.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(errorManager19);
        compiler0.setErrorManager(errorManager19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray22 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNotNull(errorManager19);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        int int9 = compiler0.getWarningCount();
        int int10 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile11 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray12, jSSourceFileArray13, compilerOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getWarningCount();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        java.lang.String str9 = compiler5.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler5.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention11 = compiler5.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler5.getState();
        com.google.javascript.jscomp.Result result13 = compiler5.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray14 = compiler5.getErrors();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler15.getErrorManager();
        java.lang.String str19 = compiler15.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result20 = compiler15.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler15.getErrors();
        compiler15.disableThreads();
        com.google.javascript.jscomp.Scope scope23 = compiler15.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState24 = compiler15.getState();
        compiler5.setState(intermediateState24);
        compiler0.setState(intermediateState24);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(sourceMap4);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNotNull(codingConvention11);
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertNotNull(result13);
        org.junit.Assert.assertNotNull(jSErrorArray14);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertNull(scope23);
        org.junit.Assert.assertNotNull(intermediateState24);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler4.getErrors();
        java.lang.String str8 = compiler4.getAstDotGraph();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler4.getErrors();
        int int10 = compiler4.getErrorCount();
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
        compiler4.setErrorManager(errorManager17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = compiler4.hasErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertNotNull(errorManager17);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
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
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertNotNull(jSModuleArray8);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        com.google.javascript.jscomp.Region region14 = compiler0.getSourceRegion("", (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = compiler0.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler0.getState();
        boolean boolean10 = compiler0.acceptEcmaScript5();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = compiler0.isTypeCheckingEnabled();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        int int7 = compiler0.getErrorCount();
        boolean boolean8 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = compiler0.toSource(jSModule9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getMessages();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray4);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        boolean boolean4 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JSError jSError5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel6 = compiler0.getErrorLevel(jSError5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        int int7 = compiler4.getErrorCount();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = compiler4.toSource(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile8 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray10 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray9, jSModuleArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertNotNull(jSModuleArray10);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList8 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList8, jSSourceFileArray7);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList11 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, jSSourceFileArray10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler4.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList8, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder5 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int6 = codeBuilder5.getLength();
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler4.toSource(codeBuilder5, 0, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler3.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler3.setPassConfig(passConfig7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getWarningCount();
        java.lang.String str6 = compiler0.getSourceLine("hi!", (int) (byte) 0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        boolean boolean8 = compiler0.hasErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = compiler0.hasErrors();
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
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(intermediateState14);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler10.tracker = performanceTracker12;
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(errorManager11);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getWarningCount();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.jscomp.JSError jSError5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel6 = compiler0.getErrorLevel(jSError5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(sourceMap4);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
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
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(codingConvention7);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(sourceMap11);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        boolean boolean7 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler0.compile(jSSourceFile8, jSSourceFileArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
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
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        java.lang.Class<?> wildcardClass17 = compiler0.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = compiler0.parse(jSSourceFile13);
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
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler0.getState();
        compiler0.reportCodeChange();
        java.lang.String str11 = compiler0.toSource();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        boolean boolean7 = compiler0.hasErrors();
        compiler0.reportCodeChange();
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSModuleArray11);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler4.getErrors();
        java.lang.String str8 = compiler4.getAstDotGraph();
        com.google.javascript.rhino.Node node9 = compiler4.getRoot();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        com.google.javascript.jscomp.JSModule jSModule18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = compiler0.toSource(jSModule18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(intermediateState13);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        boolean boolean4 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile5 };
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
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        java.lang.String str10 = compiler0.getSourceLine("", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = compiler0.getSourceLine("hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler0.getCodingConvention();
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
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSModuleArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder5 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str6 = codeBuilder5.toString();
        java.lang.String str7 = codeBuilder5.toString();
        java.lang.String str8 = codeBuilder5.toString();
        java.lang.String str9 = codeBuilder5.toString();
        int int10 = codeBuilder5.getLength();
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder5, (int) '#', node12);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler0.compile(jSSourceFile7, jSSourceFile8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.jscomp.JSError jSError5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(sourceMap4);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getErrors();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler0.getInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile10 };
        com.google.javascript.jscomp.JSSourceFile jSSourceFile12 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile12 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result15 = compiler0.compile(jSSourceFileArray11, jSSourceFileArray13, compilerOptions14);
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
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(errorManager11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = compiler12.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(errorManager11);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray14 = compiler0.toSourceArray(jSModule13);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(sourceMap12);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler10.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.JSError[] jSErrorArray14 = compiler13.getMessages();
        com.google.javascript.jscomp.Scope scope15 = compiler13.getTopScope();
        com.google.javascript.jscomp.Scope scope16 = compiler13.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler13.getState();
        compiler0.setState(intermediateState17);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node20 = compiler0.parse(jSSourceFile19);
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
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(jSErrorArray14);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNotNull(intermediateState17);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        java.lang.String str15 = compiler0.getSourceLine("", (int) (short) -1);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        boolean boolean6 = compiler0.hasErrors();
        java.lang.String str7 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler0.compile(jSSourceFile8, jSSourceFileArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
        com.google.javascript.jscomp.Scope scope10 = compiler0.getTopScope();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertNull(scope10);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        int int6 = compiler0.getWarningCount();
        int int7 = compiler0.getWarningCount();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        boolean boolean9 = compiler0.hasErrors();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        java.lang.String str10 = compiler0.getAstDotGraph();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler10.tracker = performanceTracker13;
        // The following exception was thrown during execution in test generation
        try {
            compiler10.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        int int9 = compiler0.getWarningCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region12 = compiler0.getSourceRegion("", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray7, jSModuleArray8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSModuleArray8);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        java.util.List<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList6 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray7 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList8 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList8, jSModuleArray7);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler0.compileModules(jSSourceFileList6, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList8, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNotNull(jSModuleArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        com.google.javascript.jscomp.Region region14 = compiler0.getSourceRegion("", (int) (byte) 0);
        com.google.javascript.jscomp.JSModule jSModule15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = compiler0.toSource(jSModule15);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(region14);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        java.lang.String str8 = compiler0.getAstDotGraph();
        int int9 = compiler0.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray3 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList4 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList4, jSSourceFileArray3);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList7 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, jSSourceFileArray6);
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler0.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList4, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(jSSourceFileArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError jSError5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel6 = compiler0.getErrorLevel(jSError5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(errorManager3);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getMessages();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile9 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result13 = compiler0.compile(jSSourceFileArray10, jSSourceFileArray11, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getWarningCount();
        java.lang.String str6 = compiler0.getSourceLine("hi!", (int) (byte) 0);
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        java.lang.String str11 = compiler7.getSourceLine("", (-1));
        compiler7.disableThreads();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler13.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(errorManager14);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler15.getState();
        compiler7.setState(intermediateState16);
        compiler0.setState(intermediateState16);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(intermediateState16);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList8 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList8, jSSourceFileArray7);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList11 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, jSSourceFileArray10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler0.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList8, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList6 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, jSSourceFileArray5);
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList9, jSModuleArray8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler4.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList9, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.hasErrors();
        java.lang.String str7 = compiler0.toSource();
        java.lang.String str8 = compiler0.getAstDotGraph();
        int int9 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler0.getState();
        boolean boolean11 = compiler0.hasErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.hasErrors();
        java.lang.String str7 = compiler0.toSource();
        java.lang.String str8 = compiler0.getAstDotGraph();
        int int9 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler0.getState();
        java.lang.Class<?> wildcardClass11 = compiler0.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = compiler1.toSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = compiler0.parse(jSSourceFile10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(result9);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = compiler0.parse(jSSourceFile6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile23 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray24 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile23 };
        com.google.javascript.jscomp.JSModule jSModule25 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray26 = new com.google.javascript.jscomp.JSModule[] { jSModule25 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray24, jSModuleArray26, compilerOptions27);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray24);
        org.junit.Assert.assertNotNull(jSModuleArray26);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node18 = compiler0.parse(jSSourceFile17);
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
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        compiler0.disableThreads();
        boolean boolean6 = compiler0.acceptEcmaScript5();
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
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        int int9 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Result result10 = compiler0.getResult();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFile11, jSModuleArray12, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(result10);
        org.junit.Assert.assertNotNull(jSModuleArray12);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = compiler0.toSource(jSModule3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(intermediateState2);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList6 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, jSSourceFileArray5);
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList9, jSModuleArray8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList9, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        int int3 = compiler0.getErrorCount();
        java.lang.Class<?> wildcardClass4 = compiler0.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler8.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler8.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler8.tracker = performanceTracker11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler8.tracker = performanceTracker13;
        com.google.javascript.jscomp.Scope scope15 = compiler8.getTopScope();
        compiler8.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = null;
        compiler8.tracker = performanceTracker17;
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler8.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(errorManager19);
        compiler0.setErrorManager(errorManager19);
        com.google.javascript.jscomp.JSError jSError22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel23 = compiler0.getErrorLevel(jSError22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNotNull(errorManager19);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler0.compile(jSSourceFile9, jSSourceFile10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(performanceTracker5);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSModuleArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.hasErrors();
        java.lang.String str7 = compiler0.toSource();
        java.lang.String str8 = compiler0.getAstDotGraph();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler0.tracker;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(performanceTracker9);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler0.getState();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFile11, jSModuleArray12, compilerOptions13);
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
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(jSModuleArray12);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler10.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.JSError[] jSErrorArray14 = compiler13.getMessages();
        com.google.javascript.jscomp.Scope scope15 = compiler13.getTopScope();
        com.google.javascript.jscomp.Scope scope16 = compiler13.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler13.getState();
        compiler0.setState(intermediateState17);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(jSErrorArray14);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNotNull(intermediateState17);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
        boolean boolean6 = compiler0.hasErrors();
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile10 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result13 = compiler0.compile(jSSourceFile9, jSSourceFileArray11, compilerOptions12);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = compiler0.parse(jSSourceFile3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(intermediateState2);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        com.google.javascript.jscomp.PassConfig passConfig12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig12);
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
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        java.lang.String str6 = compiler0.toSource();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = compiler0.parse(jSSourceFile7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
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
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        boolean boolean6 = compiler0.hasErrors();
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler0.getSourceMap();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        int int18 = compiler17.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        boolean boolean8 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList10 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, jSSourceFileArray9);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList13 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList13, jSSourceFileArray12);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList13, compilerOptions15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        compiler0.setErrorManager(errorManager7);
        int int10 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile11 };
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] { jSModule13 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray12, jSModuleArray14, compilerOptions15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertNotNull(jSModuleArray14);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        com.google.javascript.jscomp.PassConfig passConfig7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler4.setPassConfig(passConfig7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("hi!", (int) (byte) 0);
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = compiler0.parse(jSSourceFile8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(region6);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        boolean boolean9 = compiler0.isIdeMode();
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        boolean boolean21 = compiler0.hasErrors();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        int int6 = compiler0.getWarningCount();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(sourceMap4);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSModuleArray8);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        int int7 = compiler4.getErrorCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler4.getState();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler4.getState();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertNotNull(intermediateState9);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(sourceMap4);
        org.junit.Assert.assertNotNull(errorManager5);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getErrors();
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile6 };
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile8 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler0.compile(jSSourceFileArray7, jSSourceFileArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("hi!", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(region6);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray19 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager18);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        int int9 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Result result10 = compiler0.getResult();
        int int11 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler0.getMessages();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(result10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray12);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        int int3 = compiler2.getWarningCount();
        java.lang.Class<?> wildcardClass4 = compiler2.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Result result3 = compiler2.getResult();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler2.tracker;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result8 = compiler2.compile(jSSourceFile5, jSSourceFileArray6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(result3);
        org.junit.Assert.assertNull(performanceTracker4);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        boolean boolean7 = compiler0.acceptEcmaScript5();
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
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler0.tracker = performanceTracker11;
        java.lang.String str13 = compiler0.getAstDotGraph();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile12 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile13 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile13 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result16 = compiler0.compile(jSSourceFile12, jSSourceFileArray14, compilerOptions15);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler3.getWarnings();
        com.google.javascript.jscomp.JSError jSError7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel8 = compiler3.getErrorLevel(jSError7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getErrors();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray10, jSModuleArray11, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertNotNull(jSModuleArray11);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler2.getState();
        compiler1.setState(intermediateState4);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PassConfig passConfig7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler10.initOptions(compilerOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(sourceMap13);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        com.google.javascript.jscomp.Result result7 = compiler0.getResult();
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(result7);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = null;
        compiler0.tracker = performanceTracker17;
        compiler0.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = compiler0.hasErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(intermediateState13);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray7 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler0.compile(jSSourceFile6, jSModuleArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(jSModuleArray7);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
        int int12 = compiler0.getErrorCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Result result3 = compiler2.getResult();
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
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler4.getErrorManager();
        compiler2.setErrorManager(errorManager15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = compiler2.hasErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(result3);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNotNull(errorManager15);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile8 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler0.compile(jSSourceFileArray9, jSSourceFileArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
        com.google.javascript.rhino.Node node10 = compiler0.getRoot();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile11 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result15 = compiler0.compile(jSSourceFileArray12, jSSourceFileArray13, compilerOptions14);
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
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        compiler0.disableThreads();
        java.lang.String str7 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler0.toSourceArray(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.hasErrors();
        java.lang.String str7 = compiler0.toSource();
        java.lang.String str8 = compiler0.getAstDotGraph();
        boolean boolean9 = compiler0.hasErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray16 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList17 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList17, jSSourceFileArray16);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray19 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList20 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList20, jSSourceFileArray19);
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result23 = compiler0.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList17, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList20, compilerOptions22);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = compiler1.getWarningCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler2.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler2.tracker = performanceTracker5;
        com.google.javascript.rhino.Node node7 = compiler2.getRoot();
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
            compiler2.toSource(codeBuilder8, (int) (short) 1, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile13 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile13 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result16 = compiler0.compile(jSSourceFileArray12, jSSourceFileArray14, compilerOptions15);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        int int9 = compiler0.getErrorCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler3.getWarnings();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(errorManager8);
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler9.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler9.getErrorManager();
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
        com.google.javascript.jscomp.ErrorManager errorManager23 = compiler12.getErrorManager();
        compiler9.setErrorManager(errorManager23);
        compiler3.setErrorManager(errorManager23);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(jSErrorArray14);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNotNull(errorManager23);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        com.google.javascript.jscomp.CodingConvention codingConvention11 = compiler0.getCodingConvention();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(codingConvention11);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        com.google.javascript.rhino.Node node37 = compiler3.getRoot();
        com.google.javascript.jscomp.JSError jSError38 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler3.report(jSError38);
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
        org.junit.Assert.assertNull(node37);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler0.getErrorManager();
        boolean boolean10 = compiler0.isIdeMode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = compiler0.toSourceArray();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result13 = compiler0.compile(jSSourceFileArray10, jSModuleArray11, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSModuleArray11);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        compiler0.disableThreads();
        com.google.javascript.jscomp.PassConfig passConfig6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList7 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, jSSourceFileArray6);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList10 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, jSSourceFileArray9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        java.lang.String str6 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PassConfig passConfig8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(codingConvention7);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(result9);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        java.lang.String str12 = compiler0.getAstDotGraph();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertNotNull(intermediateState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler0.tracker = performanceTracker8;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Result result3 = compiler2.getResult();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler2.tracker;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler2.getState();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder6 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int7 = codeBuilder6.getLength();
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler2.toSource(codeBuilder6, (int) (byte) 10, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(result3);
        org.junit.Assert.assertNull(performanceTracker4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        compiler0.disableThreads();
        boolean boolean8 = compiler0.isIdeMode();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(sourceMap7);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile4 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result7 = compiler3.compile(jSSourceFile4, jSSourceFileArray5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError jSError8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler2.getWarnings();
        com.google.javascript.jscomp.Scope scope5 = compiler2.getTopScope();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile6 };
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile8 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler2.init(jSSourceFileArray7, jSSourceFileArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler4.compile(jSSourceFile6, jSSourceFile7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        com.google.javascript.jscomp.Region region14 = compiler0.getSourceRegion("", (int) (byte) 0);
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
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(region14);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        boolean boolean10 = compiler0.acceptEcmaScript5();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
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
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        java.lang.String str10 = compiler0.getSourceLine("", 0);
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler10.tracker = performanceTracker13;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile15 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray16 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile15 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray17 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler10.init(jSSourceFileArray16, jSSourceFileArray17, compilerOptions18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray16);
        org.junit.Assert.assertNotNull(jSSourceFileArray17);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        int int7 = compiler0.getErrorCount();
        java.lang.String str8 = compiler0.getAstDotGraph();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray29 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule30 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray31 = new com.google.javascript.jscomp.JSModule[] { jSModule30 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result33 = compiler0.compile(jSSourceFileArray29, jSModuleArray31, compilerOptions32);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray29);
        org.junit.Assert.assertNotNull(jSModuleArray31);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = compiler0.getSourceLine("hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler0.tracker = performanceTracker8;
        com.google.javascript.jscomp.PassConfig passConfig10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = compiler0.toSource(jSModule11);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSErrorArray10);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = compiler0.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler0.tracker;
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
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(performanceTracker10);
        org.junit.Assert.assertNull(performanceTracker11);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSModuleArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
        boolean boolean10 = compiler0.isIdeMode();
        compiler0.reportCodeChange();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        compiler0.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler3.compile(jSSourceFile6, jSSourceFile7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile5 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray4, jSSourceFileArray6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
        boolean boolean10 = compiler0.isIdeMode();
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        java.lang.String str10 = compiler0.toSource();
        boolean boolean11 = compiler0.acceptConstKeyword();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler0.tracker = performanceTracker11;
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
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(sourceMap12);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker29 = compiler0.tracker;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray30 = compiler0.toSourceArray();
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
        org.junit.Assert.assertNull(performanceTracker29);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getErrors();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile12 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile13 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result15 = compiler0.compile(jSSourceFile12, jSSourceFile13, compilerOptions14);
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
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        boolean boolean9 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getErrors();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSErrorArray10);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler0.tracker = performanceTracker8;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(errorManager7);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler0.getState();
        com.google.javascript.jscomp.Result result10 = compiler0.getResult();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(result10);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getWarningCount();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        compiler0.reportCodeChange();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(sourceMap4);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        compiler1.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setErrorManager(errorManager7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: the error manager cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        com.google.javascript.jscomp.Region region12 = compiler0.getSourceRegion("hi!", (int) (short) 0);
        com.google.javascript.jscomp.PassConfig passConfig13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(region12);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        int int6 = compiler4.getErrorCount();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile7 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler4.compile(jSSourceFileArray8, jSSourceFileArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler2.getState();
        compiler1.setState(intermediateState4);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNull(performanceTracker7);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] { jSModule7 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler0.compile(jSSourceFile6, jSModuleArray8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSModuleArray8);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        int int3 = compiler0.getErrorCount();
        boolean boolean4 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.isIdeMode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput8 = compiler0.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = compiler0.toSourceArray(jSModule12);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNotNull(codingConvention11);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler3.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler3.getState();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, jSSourceFileArray8);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList12 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList12, jSSourceFileArray11);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler3.init((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList12, compilerOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler0.getErrorManager();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(jSErrorArray12);
        org.junit.Assert.assertNotNull(errorManager13);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        java.lang.String str12 = compiler10.toSource();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile13 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile13 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result17 = compiler10.compile(jSSourceFileArray14, jSSourceFileArray15, compilerOptions16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler6.getState();
        compiler0.setState(intermediateState7);
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str1 = codeBuilder0.toString();
        int int2 = codeBuilder0.getLength();
        java.lang.String str3 = codeBuilder0.toString();
        java.lang.String str4 = codeBuilder0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        java.lang.String str7 = compiler0.toSource();
        com.google.javascript.jscomp.JSError jSError8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] { jSModule10 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result13 = compiler0.compile(jSSourceFileArray9, jSModuleArray11, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(codingConvention3);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertNotNull(jSModuleArray11);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        boolean boolean37 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState39 = compiler38.getState();
        compiler38.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker41 = compiler38.tracker;
        java.lang.String str42 = compiler38.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager44 = compiler43.getErrorManager();
        java.lang.String str47 = compiler43.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker48 = null;
        compiler43.tracker = performanceTracker48;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker50 = compiler43.tracker;
        java.lang.String str53 = compiler43.getSourceLine("", (int) (short) 0);
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager55 = compiler54.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler56 = new com.google.javascript.jscomp.Compiler(errorManager55);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState57 = compiler56.getState();
        com.google.javascript.jscomp.ErrorManager errorManager58 = compiler56.getErrorManager();
        compiler43.setErrorManager(errorManager58);
        compiler38.setErrorManager(errorManager58);
        compiler0.setErrorManager(errorManager58);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(intermediateState39);
        org.junit.Assert.assertNull(performanceTracker41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(errorManager44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(performanceTracker50);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(errorManager55);
        org.junit.Assert.assertNotNull(intermediateState57);
        org.junit.Assert.assertNotNull(errorManager58);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = compiler0.parse(jSSourceFile8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNotNull(codingConvention11);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList7 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, jSSourceFileArray6);
        com.google.javascript.jscomp.JSModule[] jSModuleArray9 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList10 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList10, jSModuleArray9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList10, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSModuleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(errorManager11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler12.getCodingConvention();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(errorManager11);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList6 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, jSSourceFileArray5);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, jSSourceFileArray8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler0.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.hasErrors();
        java.lang.String str7 = compiler0.toSource();
        java.lang.String str8 = compiler0.getAstDotGraph();
        int int9 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler0.getState();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intermediateState10);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = null;
        compiler0.tracker = performanceTracker17;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile19 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile20 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result22 = compiler0.compile(jSSourceFile19, jSSourceFile20, compilerOptions21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(intermediateState13);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        int int6 = compiler4.getErrorCount();
        com.google.javascript.jscomp.PassConfig passConfig7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler4.setPassConfig(passConfig7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        com.google.javascript.jscomp.JSError jSError38 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError38);
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
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(codingConvention8);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, jSSourceFileArray8);
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList12 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList12, jSModuleArray11);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result15 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList12, compilerOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSModuleArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("hi!", (int) (byte) 0);
        boolean boolean7 = compiler0.hasErrors();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler0.tracker;
        boolean boolean10 = compiler0.acceptConstKeyword();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(region6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(performanceTracker9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        com.google.javascript.rhino.Node node29 = compiler0.getRoot();
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
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        boolean boolean13 = compiler10.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler14.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(errorManager15);
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(errorManager15);
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager15);
        com.google.javascript.jscomp.SourceMap sourceMap19 = compiler18.getSourceMap();
        com.google.javascript.rhino.Node node20 = compiler18.getRoot();
        int int21 = compiler18.getErrorCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState22 = compiler18.getState();
        compiler10.setState(intermediateState22);
        int int24 = compiler10.getErrorCount();
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNull(sourceMap19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intermediateState22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile13 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile13 };
        com.google.javascript.jscomp.JSModule jSModule15 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray16 = new com.google.javascript.jscomp.JSModule[] { jSModule15 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result18 = compiler0.compile(jSSourceFileArray14, jSModuleArray16, compilerOptions17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertNotNull(jSModuleArray16);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList11 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, jSSourceFileArray10);
        com.google.javascript.jscomp.JSModule[] jSModuleArray13 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList14 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList14, jSModuleArray13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList14, compilerOptions16);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSModuleArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
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
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler0.tracker;
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        boolean boolean10 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = compiler0.parse(jSSourceFile11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler0.tracker = performanceTracker11;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList14 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList14, jSSourceFileArray13);
        com.google.javascript.jscomp.JSModule[] jSModuleArray16 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList17 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList17, jSModuleArray16);
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result20 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList14, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList17, compilerOptions19);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSModuleArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler0.getErrorManager();
        boolean boolean10 = compiler0.isIdeMode();
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
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        int int2 = codeBuilder0.getLength();
        int int3 = codeBuilder0.getLength();
        int int4 = codeBuilder0.getLength();
        java.lang.String str5 = codeBuilder0.toString();
        java.lang.String str6 = codeBuilder0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = compiler0.getTypeRegistry();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry9);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray2 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList3 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList3, jSSourceFileArray2);
        com.google.javascript.jscomp.JSModule[] jSModuleArray5 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList6 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList6, jSModuleArray5);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList3, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList6, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(jSSourceFileArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSModuleArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput12 = compiler0.newExternInput("hi!");
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
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        java.lang.String str7 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler0.getErrorManager();
        java.lang.String str9 = compiler0.getAstDotGraph();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        compiler0.setErrorManager(errorManager7);
        int int10 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler0.getState();
        boolean boolean12 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler0.getState();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intermediateState11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intermediateState13);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler6.getState();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler6.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(errorManager8);
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(errorManager8);
        compiler0.setErrorManager(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(errorManager8);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
        com.google.javascript.jscomp.JSModule jSModule17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray18 = compiler0.toSourceArray(jSModule17);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        com.google.javascript.jscomp.JSError jSError10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(performanceTracker3);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        boolean boolean11 = compiler0.isIdeMode();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        java.lang.Class<?> wildcardClass3 = intermediateState2.getClass();
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        compiler0.reportCodeChange();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        com.google.javascript.jscomp.CodingConvention codingConvention21 = compiler0.getCodingConvention();
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
        org.junit.Assert.assertNotNull(codingConvention21);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(sourceMap3);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = null;
        compiler0.tracker = performanceTracker17;
        compiler0.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result20 = compiler0.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(intermediateState13);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        boolean boolean15 = compiler0.acceptConstKeyword();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = compiler0.getTypeRegistry();
        boolean boolean17 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile18 = null;
        com.google.javascript.jscomp.JSModule jSModule19 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray20 = new com.google.javascript.jscomp.JSModule[] { jSModule19 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result22 = compiler0.compile(jSSourceFile18, jSModuleArray20, compilerOptions21);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSModuleArray20);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        int int9 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Result result10 = compiler0.getResult();
        int int11 = compiler0.getErrorCount();
        compiler0.reportCodeChange();
        int int13 = compiler0.getErrorCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(result10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler10.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.JSError[] jSErrorArray14 = compiler13.getMessages();
        com.google.javascript.jscomp.Scope scope15 = compiler13.getTopScope();
        com.google.javascript.jscomp.Scope scope16 = compiler13.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler13.getState();
        compiler0.setState(intermediateState17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray19 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
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
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(jSErrorArray14);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNotNull(intermediateState17);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        com.google.javascript.jscomp.JSError jSError12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel13 = compiler0.getErrorLevel(jSError12);
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
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList27 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList27, jSSourceFileArray26);
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result30 = compiler0.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList24, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList27, compilerOptions29);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(codingConvention3);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler10.tracker = performanceTracker13;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler10.tracker;
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(performanceTracker15);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
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
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        compiler0.disableThreads();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray15 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler10.init(jSSourceFileArray14, jSModuleArray15, compilerOptions16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertNotNull(jSModuleArray15);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = compiler0.getTypeRegistry();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNotNull(jSTypeRegistry5);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        int int9 = compiler0.getErrorCount();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler3.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler3.getState();
        compiler3.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler3.compile(jSSourceFile9, jSSourceFile10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getWarningCount();
        java.lang.String str6 = compiler0.getSourceLine("hi!", (int) (byte) 0);
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
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
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = compiler0.toSource(jSModule7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = compiler0.getTypeRegistry();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry5);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str8 = codeBuilder7.toString();
        int int9 = codeBuilder7.getLength();
        int int10 = codeBuilder7.getLength();
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder7, (int) 'a', node12);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        java.lang.Class<?> wildcardClass3 = compiler1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        int int9 = compiler0.getWarningCount();
        int int10 = compiler0.getWarningCount();
        int int11 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = compiler0.toSource(jSModule12);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        boolean boolean7 = compiler0.hasErrors();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile9 };
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] { jSModule11 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray10, jSModuleArray12, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSModuleArray12);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler0.compile(jSSourceFile8, jSSourceFile9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(performanceTracker7);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        compiler0.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = compiler0.parse(jSSourceFile8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result4 = compiler1.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(sourceMap3);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        com.google.javascript.jscomp.JSModule jSModule18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray19 = compiler0.toSourceArray(jSModule18);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(intermediateState14);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
        boolean boolean6 = compiler0.hasErrors();
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler8.getState();
        compiler8.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler8.tracker = performanceTracker11;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler13.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(errorManager14);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(errorManager14);
        compiler8.setErrorManager(errorManager14);
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager14);
        compiler0.setErrorManager(errorManager14);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState20 = compiler0.getState();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(intermediateState20);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        int int9 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Result result10 = compiler0.getResult();
        int int11 = compiler0.getErrorCount();
        compiler0.reportCodeChange();
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(result10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        java.lang.String str24 = compiler0.toSource();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler0.getTypeRegistry();
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSModuleArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler2.getState();
        compiler1.setState(intermediateState4);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        java.lang.String str11 = compiler7.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler7.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler7.getCodingConvention();
        boolean boolean14 = compiler7.acceptConstKeyword();
        boolean boolean15 = compiler7.hasErrors();
        int int16 = compiler7.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope18 = compiler17.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler17.getErrorManager();
        compiler7.setErrorManager(errorManager19);
        compiler1.setErrorManager(errorManager19);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNotNull(errorManager19);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Result result7 = compiler0.getResult();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
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
        org.junit.Assert.assertNotNull(result7);
        org.junit.Assert.assertNotNull(intermediateState8);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        boolean boolean8 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
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
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler4.getErrors();
        java.lang.String str8 = compiler4.getAstDotGraph();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler4.getErrors();
        int int10 = compiler4.getErrorCount();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList12 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList12, jSSourceFileArray11);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList15 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList15, jSSourceFileArray14);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result18 = compiler4.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList12, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList15, compilerOptions17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler9.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler9.getState();
        compiler0.setState(intermediateState11);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNotNull(intermediateState11);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
            compiler0.parse();
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
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler2.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(errorManager4);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager4);
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(errorManager7);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList23 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList23, jSSourceFileArray22);
        com.google.javascript.jscomp.JSModule[] jSModuleArray25 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList26 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList26, jSModuleArray25);
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList23, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList26, compilerOptions28);
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
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertNotNull(intermediateState17);
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSModuleArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = compiler0.parse(jSSourceFile11);
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
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSModuleArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker29 = compiler0.tracker;
        boolean boolean30 = compiler0.acceptEcmaScript5();
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
        org.junit.Assert.assertNull(performanceTracker29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        boolean boolean25 = compiler0.hasErrors();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, jSSourceFileArray8);
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList12 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList12, jSModuleArray11);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result15 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList12, compilerOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSModuleArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        java.lang.String str8 = compiler0.toSource();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler(errorManager31);
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
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
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
        java.lang.String str12 = compiler0.toSource();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray7 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler0.compile(jSSourceFile6, jSModuleArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSModuleArray7);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        int int12 = compiler0.getErrorCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        int int6 = compiler0.getWarningCount();
        int int7 = compiler0.getWarningCount();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PassConfig passConfig9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(codingConvention8);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("hi!", (int) (byte) 0);
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(region6);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile7 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray9 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray8, jSModuleArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention codingConvention18 = compiler0.getCodingConvention();
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
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSError jSError4 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(sourceMap3);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getErrors();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = compiler0.toSource(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        int int8 = compiler0.getErrorCount();
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = compiler0.tracker;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray13 = new com.google.javascript.jscomp.JSModule[] { jSModule12 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result15 = compiler0.compile(jSSourceFile11, jSModuleArray13, compilerOptions14);
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
        org.junit.Assert.assertNull(performanceTracker10);
        org.junit.Assert.assertNotNull(jSModuleArray13);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
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
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler2.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler2.tracker = performanceTracker5;
        com.google.javascript.rhino.Node node7 = compiler2.getRoot();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler2.tracker = performanceTracker8;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray14 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
            boolean boolean24 = compiler0.hasErrors();
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
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler12.initOptions(compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(errorManager11);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = compiler0.isIdeMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray20 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList21 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList21, jSSourceFileArray20);
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList24 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList24, jSModuleArray23);
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList21, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList24, compilerOptions26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(intermediateState17);
        org.junit.Assert.assertNotNull(jSSourceFileArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSModuleArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = compiler0.getTypeRegistry();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(intermediateState11);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(jSTypeRegistry15);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, jSSourceFileArray8);
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList12 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList12, jSModuleArray11);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result15 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList12, compilerOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSModuleArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler0.toSourceArray();
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
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        int int4 = compiler2.getErrorCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(errorManager13);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        int int9 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] { jSModule11 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFile10, jSModuleArray12, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(jSModuleArray12);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        int int9 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope11 = compiler10.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler10.getErrorManager();
        compiler0.setErrorManager(errorManager12);
        com.google.javascript.rhino.Node node14 = compiler0.getRoot();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        java.lang.Class<?> wildcardClass8 = intermediateState7.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.getRoot();
        compiler0.disableThreads();
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile24 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile24 };
        com.google.javascript.jscomp.JSSourceFile jSSourceFile26 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray27 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile26 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray25, jSSourceFileArray27, compilerOptions28);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertNotNull(jSSourceFileArray27);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str1 = codeBuilder0.toString();
        int int2 = codeBuilder0.getLength();
        int int3 = codeBuilder0.getLength();
        java.lang.String str4 = codeBuilder0.toString();
        int int5 = codeBuilder0.getLength();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile7 };
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile9 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler0.compile(jSSourceFileArray8, jSSourceFileArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler0.parse();
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
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        java.lang.String str8 = compiler0.getAstDotGraph();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile8 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler0.compile(jSSourceFile7, jSSourceFileArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray41 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray42 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result44 = compiler0.compile(jSSourceFileArray41, jSSourceFileArray42, compilerOptions43);
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
        org.junit.Assert.assertNotNull(intermediateState17);
        org.junit.Assert.assertNull(sourceMap21);
        org.junit.Assert.assertNotNull(errorManager23);
        org.junit.Assert.assertNotNull(result25);
        org.junit.Assert.assertNotNull(errorManager27);
        org.junit.Assert.assertNotNull(jSErrorArray28);
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertNotNull(errorManager37);
        org.junit.Assert.assertNotNull(jSSourceFileArray41);
        org.junit.Assert.assertNotNull(jSSourceFileArray42);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getWarnings();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray11);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        java.lang.String str10 = compiler0.getSourceLine("", (int) (short) 0);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = compiler0.parse(jSSourceFile11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        compiler0.disableThreads();
        int int6 = compiler0.getErrorCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder13 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int14 = codeBuilder13.getLength();
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder13, (int) (short) 0, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(jSErrorArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
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
            compiler0.optimize();
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
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray9 = new com.google.javascript.jscomp.JSModule[] { jSModule8 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler0.compile(jSSourceFile7, jSModuleArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
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
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
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
        com.google.javascript.rhino.Node node17 = compiler0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler6.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler6.getMessages();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.rhino.Node node3 = compiler2.getRoot();
        compiler2.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler2.tracker;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler2.compile(jSSourceFile6, jSSourceFileArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        boolean boolean7 = compiler0.hasErrors();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder3 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int4 = codeBuilder3.getLength();
        int int5 = codeBuilder3.getLength();
        int int6 = codeBuilder3.getLength();
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder3, 0, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("hi!", (int) (byte) 0);
        boolean boolean7 = compiler0.hasErrors();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler0.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler0.tracker = performanceTracker10;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(region6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(performanceTracker9);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler8.getErrorManager();
        java.lang.String str12 = compiler8.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result13 = compiler8.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray14 = compiler8.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray15 = compiler8.getMessages();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager17);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler18.getState();
        com.google.javascript.jscomp.ErrorManager errorManager20 = compiler18.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(errorManager20);
        compiler8.setErrorManager(errorManager20);
        compiler0.setErrorManager(errorManager20);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(result13);
        org.junit.Assert.assertNotNull(jSErrorArray14);
        org.junit.Assert.assertNotNull(jSErrorArray15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNotNull(errorManager20);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler0.getErrorManager();
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(jSModuleArray8);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList10 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, jSSourceFileArray9);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList13 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList13, jSSourceFileArray12);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList13, compilerOptions15);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        compiler0.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        int int3 = compiler0.getErrorCount();
        boolean boolean4 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = compiler0.parse(jSSourceFile5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        com.google.javascript.rhino.Node node37 = compiler3.getRoot();
        int int38 = compiler3.getWarningCount();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray39 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule40 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray41 = new com.google.javascript.jscomp.JSModule[] { jSModule40 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result43 = compiler3.compile(jSSourceFileArray39, jSModuleArray41, compilerOptions42);
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
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray39);
        org.junit.Assert.assertNotNull(jSModuleArray41);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        int int8 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile9 };
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] { jSModule11 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray10, jSModuleArray12, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSModuleArray12);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getWarnings();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        int int16 = compiler0.getErrorCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray17 = compiler0.toSourceArray();
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
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result16 = compiler0.compile(jSSourceFileArray13, jSSourceFileArray14, compilerOptions15);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("hi!", (int) (byte) 0);
        boolean boolean7 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile10 };
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray13 = new com.google.javascript.jscomp.JSModule[] { jSModule12 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray11, jSModuleArray13, compilerOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(region6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSModuleArray13);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        compiler0.disableThreads();
        java.lang.String str11 = compiler0.getSourceLine("", (int) (short) -1);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getErrors();
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSModule jSModule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = compiler0.toSource(jSModule6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        boolean boolean9 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertNotNull(jSErrorArray11);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.reportCodeChange();
        java.lang.String str9 = compiler0.toSource();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        compiler0.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region11 = compiler0.getSourceRegion("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(performanceTracker7);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler8.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler8.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler8.tracker = performanceTracker11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler8.tracker = performanceTracker13;
        com.google.javascript.jscomp.Scope scope15 = compiler8.getTopScope();
        compiler8.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = null;
        compiler8.tracker = performanceTracker17;
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler8.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(errorManager19);
        compiler0.setErrorManager(errorManager19);
        java.lang.String str22 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler23.getErrorManager();
        java.lang.String str27 = compiler23.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState28 = compiler23.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention29 = compiler23.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState30 = compiler23.getState();
        int int31 = compiler23.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState33 = compiler32.getState();
        compiler32.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker35 = null;
        compiler32.tracker = performanceTracker35;
        com.google.javascript.jscomp.SourceMap sourceMap37 = compiler32.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState39 = compiler38.getState();
        compiler38.reportCodeChange();
        java.io.PrintStream printStream41 = null;
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler(printStream41);
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager44 = compiler43.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState45 = compiler43.getState();
        compiler42.setState(intermediateState45);
        compiler38.setState(intermediateState45);
        compiler32.setState(intermediateState45);
        compiler23.setState(intermediateState45);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState50 = compiler23.getState();
        compiler0.setState(intermediateState50);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(intermediateState28);
        org.junit.Assert.assertNotNull(codingConvention29);
        org.junit.Assert.assertNotNull(intermediateState30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(intermediateState33);
        org.junit.Assert.assertNull(sourceMap37);
        org.junit.Assert.assertNotNull(intermediateState39);
        org.junit.Assert.assertNotNull(errorManager44);
        org.junit.Assert.assertNotNull(intermediateState45);
        org.junit.Assert.assertNotNull(intermediateState50);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.isIdeMode();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSModuleArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile22 = null;
        com.google.javascript.jscomp.JSModule jSModule23 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray24 = new com.google.javascript.jscomp.JSModule[] { jSModule23 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result26 = compiler0.compile(jSSourceFile22, jSModuleArray24, compilerOptions25);
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
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertNotNull(intermediateState17);
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertNotNull(jSModuleArray24);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile14 = null;
        com.google.javascript.jscomp.JSModule jSModule15 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray16 = new com.google.javascript.jscomp.JSModule[] { jSModule15 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result18 = compiler10.compile(jSSourceFile14, jSModuleArray16, compilerOptions17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertNotNull(jSModuleArray16);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        boolean boolean6 = compiler0.hasErrors();
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler0.getSourceMap();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = compiler0.toSourceArray(jSModule10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler0.getState();
        com.google.javascript.jscomp.Result result10 = compiler0.getResult();
        compiler0.reportCodeChange();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(result10);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler2.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler2.tracker = performanceTracker5;
        com.google.javascript.rhino.Node node7 = compiler2.getRoot();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler2.toSourceArray(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList14 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList14, jSSourceFileArray13);
        com.google.javascript.jscomp.JSModule[] jSModuleArray16 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList17 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList17, jSModuleArray16);
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result20 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList14, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList17, compilerOptions19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSModuleArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSModule jSModule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = compiler0.toSourceArray(jSModule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        java.lang.Class<?> wildcardClass7 = codingConvention6.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        int int8 = compiler0.getErrorCount();
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile10 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions13);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSModuleArray12);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        boolean boolean7 = compiler0.hasErrors();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler0.compile(jSSourceFile9, jSSourceFile10, compilerOptions11);
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
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray17 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile18 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray19 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile18 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result21 = compiler15.compile(jSSourceFileArray17, jSSourceFileArray19, compilerOptions20);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray17);
        org.junit.Assert.assertNotNull(jSSourceFileArray19);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getMessages();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(scope10);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        boolean boolean8 = compiler0.isIdeMode();
        int int9 = compiler0.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput8 = compiler0.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler0.tracker = performanceTracker11;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile13 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result16 = compiler0.compile(jSSourceFile13, jSModuleArray14, compilerOptions15);
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
        org.junit.Assert.assertNotNull(jSModuleArray14);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler3.getTopScope();
        java.lang.String str7 = compiler3.getAstDotGraph();
        compiler3.reportCodeChange();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("hi!", (int) (byte) 0);
        boolean boolean7 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] { jSModule11 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray10, jSModuleArray12, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(region6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSModuleArray12);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler17.normalize();
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
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler0.toSourceArray(jSModule7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
        boolean boolean6 = compiler0.hasErrors();
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler10.getErrorManager();
        java.lang.String str14 = compiler10.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler10.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler10.getState();
        int int18 = compiler10.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = compiler10.getTypeRegistry();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState20 = compiler10.getState();
        compiler0.setState(intermediateState20);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertNull(sourceMap9);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertNotNull(intermediateState17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry19);
        org.junit.Assert.assertNotNull(intermediateState20);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler0.parse();
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
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList7 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, jSSourceFileArray6);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList10 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, jSSourceFileArray9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result13 = compiler0.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        boolean boolean15 = compiler0.acceptConstKeyword();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = compiler0.getTypeRegistry();
        int int17 = compiler0.getWarningCount();
        boolean boolean18 = compiler0.isTypeCheckingEnabled();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(intermediateState11);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler0.getErrorManager();
        boolean boolean7 = compiler0.isIdeMode();
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
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(intermediateState13);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler0.getCodingConvention();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(result12);
        org.junit.Assert.assertNotNull(codingConvention13);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        com.google.javascript.jscomp.Region region12 = compiler0.getSourceRegion("hi!", (int) (short) 0);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler0.tracker = performanceTracker13;
        com.google.javascript.jscomp.JSModule jSModule15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray16 = compiler0.toSourceArray(jSModule15);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(region12);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        int int9 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getErrors();
        java.lang.Class<?> wildcardClass11 = compiler0.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        boolean boolean15 = compiler0.acceptConstKeyword();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile17 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray18 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result20 = compiler0.compile(jSSourceFile17, jSModuleArray18, compilerOptions19);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry16);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler3.getWarnings();
        int int7 = compiler3.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray23 = compiler0.getErrors();
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
        org.junit.Assert.assertNotNull(jSErrorArray23);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result15 = compiler0.compile(jSSourceFileArray12, jSSourceFileArray13, compilerOptions14);
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
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.PassConfig passConfig8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler0.tracker;
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getWarnings();
        boolean boolean11 = compiler0.hasErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager5);
        compiler0.setErrorManager(errorManager5);
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(codingConvention3);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSErrorArray10);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        com.google.javascript.jscomp.SourceMap sourceMap21 = compiler0.getSourceMap();
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
        org.junit.Assert.assertNull(sourceMap21);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList11 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, jSSourceFileArray10);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList14 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList14, jSSourceFileArray13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result17 = compiler0.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList14, compilerOptions16);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile28 = null;
        com.google.javascript.jscomp.JSModule jSModule29 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray30 = new com.google.javascript.jscomp.JSModule[] { jSModule29 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result32 = compiler0.compile(jSSourceFile28, jSModuleArray30, compilerOptions31);
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
        org.junit.Assert.assertNotNull(jSModuleArray30);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getWarningCount();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.rhino.Node node5 = compiler0.getRoot();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(sourceMap4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = null;
        compiler0.tracker = performanceTracker17;
        compiler0.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput21 = compiler0.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(intermediateState13);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler4.getErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler4.initOptions(compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.toSource();
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(jSErrorArray5);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        int int7 = compiler0.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        boolean boolean10 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError jSError11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel12 = compiler0.getErrorLevel(jSError11);
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
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSModuleArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
        compiler0.disableThreads();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(result9);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        int int15 = compiler0.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(intermediateState11);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
        boolean boolean6 = compiler0.hasErrors();
        boolean boolean7 = compiler0.isIdeMode();
        java.io.PrintStream printStream8 = null;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream8);
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler10.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler10.getState();
        compiler9.setState(intermediateState12);
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler14.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler14.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = null;
        compiler14.tracker = performanceTracker17;
        int int19 = compiler14.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray20 = compiler14.getMessages();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager22 = compiler21.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState23 = compiler21.getState();
        compiler14.setState(intermediateState23);
        int int25 = compiler14.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler26.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler(errorManager27);
        compiler14.setErrorManager(errorManager27);
        compiler9.setErrorManager(errorManager27);
        compiler0.setErrorManager(errorManager27);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray20);
        org.junit.Assert.assertNotNull(errorManager22);
        org.junit.Assert.assertNotNull(intermediateState23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(errorManager27);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
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
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSModuleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node3 = compiler0.parse(jSSourceFile2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        int int2 = codeBuilder0.getLength();
        int int3 = codeBuilder0.getLength();
        int int4 = codeBuilder0.getLength();
        int int5 = codeBuilder0.getLength();
        java.lang.String str6 = codeBuilder0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler3.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler3.getState();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = compiler3.parse(jSSourceFile8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        compiler0.disableThreads();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler0.tracker;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertNull(performanceTracker8);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        boolean boolean6 = compiler0.hasErrors();
        java.lang.String str7 = compiler0.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        java.lang.Class<?> wildcardClass8 = compiler0.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        boolean boolean8 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler0.getSourceMap();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(sourceMap9);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.hasErrors();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler0.getErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertNotNull(jSErrorArray12);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        int int7 = compiler0.getErrorCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler0.toSourceArray(jSModule7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNull(sourceMap6);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        com.google.javascript.jscomp.SourceMap sourceMap20 = compiler0.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray21 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(intermediateState17);
        org.junit.Assert.assertNull(sourceMap20);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(errorManager7);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        com.google.javascript.rhino.Node node37 = compiler3.getRoot();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile38 = null;
        com.google.javascript.jscomp.JSModule jSModule39 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray40 = new com.google.javascript.jscomp.JSModule[] { jSModule39 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions41 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result42 = compiler3.compile(jSSourceFile38, jSModuleArray40, compilerOptions41);
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
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(jSModuleArray40);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        com.google.javascript.jscomp.Result result7 = compiler0.getResult();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = compiler0.toSource(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(result7);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        int int6 = compiler4.getErrorCount();
        com.google.javascript.jscomp.Region region9 = compiler4.getSourceRegion("", 0);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(region9);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = compiler0.hasErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler2.getTypeRegistry();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = compiler2.getTypeRegistry();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertNotNull(jSTypeRegistry5);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        com.google.javascript.jscomp.PassConfig passConfig13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(sourceMap12);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        boolean boolean16 = compiler0.isIdeMode();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        java.lang.String str12 = compiler0.toSource();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput14 = compiler0.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        int int8 = compiler0.getErrorCount();
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
        java.lang.String str10 = compiler0.getAstDotGraph();
        compiler0.disableThreads();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile9 };
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile11 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray10, jSSourceFileArray12, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        compiler1.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler7.getState();
        compiler7.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = compiler7.tracker;
        java.lang.String str11 = compiler7.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler12.getErrorManager();
        java.lang.String str16 = compiler12.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = null;
        compiler12.tracker = performanceTracker17;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = compiler12.tracker;
        java.lang.String str22 = compiler12.getSourceLine("", (int) (short) 0);
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler23.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler(errorManager24);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState26 = compiler25.getState();
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler25.getErrorManager();
        compiler12.setErrorManager(errorManager27);
        compiler7.setErrorManager(errorManager27);
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState31 = compiler30.getState();
        compiler30.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker33 = null;
        compiler30.tracker = performanceTracker33;
        com.google.javascript.jscomp.SourceMap sourceMap35 = compiler30.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState37 = compiler36.getState();
        compiler36.reportCodeChange();
        java.io.PrintStream printStream39 = null;
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler(printStream39);
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager42 = compiler41.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState43 = compiler41.getState();
        compiler40.setState(intermediateState43);
        compiler36.setState(intermediateState43);
        compiler30.setState(intermediateState43);
        com.google.javascript.jscomp.SourceMap sourceMap47 = compiler30.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager48 = compiler30.getErrorManager();
        compiler7.setErrorManager(errorManager48);
        compiler1.setErrorManager(errorManager48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertNull(performanceTracker10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(performanceTracker19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(intermediateState26);
        org.junit.Assert.assertNotNull(errorManager27);
        org.junit.Assert.assertNotNull(intermediateState31);
        org.junit.Assert.assertNull(sourceMap35);
        org.junit.Assert.assertNotNull(intermediateState37);
        org.junit.Assert.assertNotNull(errorManager42);
        org.junit.Assert.assertNotNull(intermediateState43);
        org.junit.Assert.assertNull(sourceMap47);
        org.junit.Assert.assertNotNull(errorManager48);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler4.getErrors();
        java.lang.String str8 = compiler4.getAstDotGraph();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler4.getErrors();
        int int10 = compiler4.getErrorCount();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler4.compile(jSSourceFileArray11, jSSourceFileArray12, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Result result3 = compiler2.getResult();
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
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler4.getErrorManager();
        compiler2.setErrorManager(errorManager15);
        java.lang.Class<?> wildcardClass17 = errorManager15.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(result3);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        com.google.javascript.jscomp.PassConfig passConfig8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray37 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList38 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList38, jSSourceFileArray37);
        com.google.javascript.jscomp.JSModule[] jSModuleArray40 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList41 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList41, jSModuleArray40);
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler3.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList38, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList41, compilerOptions43);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSModuleArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder6 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str7 = codeBuilder6.toString();
        java.lang.String str8 = codeBuilder6.toString();
        java.lang.String str9 = codeBuilder6.toString();
        java.lang.String str10 = codeBuilder6.toString();
        int int11 = codeBuilder6.getLength();
        int int12 = codeBuilder6.getLength();
        java.lang.String str13 = codeBuilder6.toString();
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder6, (int) (byte) 10, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler20.getErrorManager();
        java.lang.String str24 = compiler20.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState25 = compiler20.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention26 = compiler20.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState27 = compiler20.getState();
        int int28 = compiler20.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState30 = compiler29.getState();
        compiler29.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = null;
        compiler29.tracker = performanceTracker32;
        com.google.javascript.jscomp.SourceMap sourceMap34 = compiler29.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState36 = compiler35.getState();
        compiler35.reportCodeChange();
        java.io.PrintStream printStream38 = null;
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler(printStream38);
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager41 = compiler40.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState42 = compiler40.getState();
        compiler39.setState(intermediateState42);
        compiler35.setState(intermediateState42);
        compiler29.setState(intermediateState42);
        compiler20.setState(intermediateState42);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState47 = compiler20.getState();
        compiler0.setState(intermediateState47);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = compiler0.isIdeMode();
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
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(intermediateState25);
        org.junit.Assert.assertNotNull(codingConvention26);
        org.junit.Assert.assertNotNull(intermediateState27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(intermediateState30);
        org.junit.Assert.assertNull(sourceMap34);
        org.junit.Assert.assertNotNull(intermediateState36);
        org.junit.Assert.assertNotNull(errorManager41);
        org.junit.Assert.assertNotNull(intermediateState42);
        org.junit.Assert.assertNotNull(intermediateState47);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler8.initOptions(compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(errorManager7);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler0.getErrorManager();
        boolean boolean17 = compiler0.acceptEcmaScript5();
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
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler0.getErrorManager();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray9 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler0.compile(jSSourceFileArray8, jSModuleArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.hasErrors();
        java.lang.String str7 = compiler0.toSource();
        boolean boolean8 = compiler0.isTypeCheckingEnabled();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        compiler0.setErrorManager(errorManager7);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList11 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, jSSourceFileArray10);
        com.google.javascript.jscomp.JSModule[] jSModuleArray13 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList14 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList14, jSModuleArray13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList14, compilerOptions16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSModuleArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        boolean boolean9 = compiler0.isIdeMode();
        java.io.PrintStream printStream10 = null;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(printStream10);
        java.lang.String str12 = compiler11.getAstDotGraph();
        compiler11.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler11.getState();
        compiler0.setState(intermediateState14);
        com.google.javascript.jscomp.JSModule jSModule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = compiler0.toSource(jSModule16);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(intermediateState14);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        com.google.javascript.jscomp.Region region14 = compiler0.getSourceRegion("", (int) (byte) 0);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler15.getErrorManager();
        java.lang.String str19 = compiler15.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState20 = compiler15.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention21 = compiler15.getCodingConvention();
        boolean boolean22 = compiler15.isIdeMode();
        java.lang.String str23 = compiler15.getAstDotGraph();
        com.google.javascript.jscomp.JSError[] jSErrorArray24 = compiler15.getWarnings();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler25.getErrorManager();
        java.lang.String str29 = compiler25.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState30 = compiler25.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention31 = compiler25.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState32 = compiler25.getState();
        compiler15.setState(intermediateState32);
        compiler0.setState(intermediateState32);
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
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(intermediateState20);
        org.junit.Assert.assertNotNull(codingConvention21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(jSErrorArray24);
        org.junit.Assert.assertNotNull(errorManager26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(intermediateState30);
        org.junit.Assert.assertNotNull(codingConvention31);
        org.junit.Assert.assertNotNull(intermediateState32);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        int int8 = compiler0.getErrorCount();
        int int9 = compiler0.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler0.tracker = performanceTracker8;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler0.getState();
        com.google.javascript.jscomp.Result result11 = compiler0.getResult();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNotNull(result11);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList26 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList26, jSSourceFileArray25);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray28 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList29 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList29, jSSourceFileArray28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result32 = compiler0.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList26, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList29, compilerOptions31);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getWarnings();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile12 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray13 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result15 = compiler0.compile(jSSourceFile12, jSModuleArray13, compilerOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNotNull(codingConvention11);
        org.junit.Assert.assertNotNull(jSModuleArray13);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        boolean boolean15 = compiler0.acceptConstKeyword();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = compiler0.getTypeRegistry();
        boolean boolean17 = compiler0.hasErrors();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = compiler0.getTypeRegistry();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(intermediateState11);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry18);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        boolean boolean15 = compiler0.acceptConstKeyword();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = compiler0.getTypeRegistry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray17 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry16);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        int int8 = compiler0.getErrorCount();
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertNotNull(jSErrorArray11);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        boolean boolean4 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = compiler0.toSource(jSModule5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        int int6 = compiler0.getWarningCount();
        int int7 = compiler0.getWarningCount();
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        boolean boolean6 = compiler0.hasErrors();
        java.lang.String str7 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile8 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray10 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray9, jSModuleArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertNotNull(jSModuleArray10);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        compiler0.disableThreads();
        java.lang.String str7 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        java.lang.String str6 = compiler0.toSource();
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = compiler0.toSource(jSModule7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result13 = compiler0.compile(jSSourceFileArray10, jSSourceFileArray11, compilerOptions12);
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
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        compiler0.setErrorManager(errorManager7);
        int int10 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler0.getState();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intermediateState11);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getErrors();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler0.tracker = performanceTracker10;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        int int8 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder9 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str10 = codeBuilder9.toString();
        java.lang.String str11 = codeBuilder9.toString();
        java.lang.String str12 = codeBuilder9.toString();
        java.lang.String str13 = codeBuilder9.toString();
        java.lang.String str14 = codeBuilder9.toString();
        int int15 = codeBuilder9.getLength();
        int int16 = codeBuilder9.getLength();
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder9, (int) (byte) 1, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler2.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler2.tracker = performanceTracker5;
        com.google.javascript.rhino.Node node7 = compiler2.getRoot();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler2.compile(jSSourceFile8, jSSourceFileArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray26 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result28 = compiler0.compile(jSSourceFileArray25, jSModuleArray26, compilerOptions27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertNotNull(jSModuleArray26);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        com.google.javascript.rhino.Node node37 = compiler3.getRoot();
        int int38 = compiler3.getErrorCount();
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
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = compiler0.toSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(performanceTracker5);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager3);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(errorManager3);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getMessages();
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile6 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray7, jSModuleArray8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSModuleArray8);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile28 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray29 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile28 };
        com.google.javascript.jscomp.JSModule jSModule30 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray31 = new com.google.javascript.jscomp.JSModule[] { jSModule30 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result33 = compiler0.compile(jSSourceFileArray29, jSModuleArray31, compilerOptions32);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray29);
        org.junit.Assert.assertNotNull(jSModuleArray31);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("hi!", (int) (byte) 0);
        boolean boolean7 = compiler0.hasErrors();
        int int8 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList10 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, jSSourceFileArray9);
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList13 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList13, jSModuleArray12);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList13, compilerOptions15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(region6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler8.getErrorManager();
        java.lang.String str12 = compiler8.getSourceLine("", (-1));
        int int13 = compiler8.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler8.getCodingConvention();
        boolean boolean15 = compiler8.isIdeMode();
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
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler(errorManager27);
        compiler8.setErrorManager(errorManager27);
        compiler0.setErrorManager(errorManager27);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(jSErrorArray18);
        org.junit.Assert.assertNull(scope23);
        org.junit.Assert.assertNotNull(errorManager27);
    }
}

