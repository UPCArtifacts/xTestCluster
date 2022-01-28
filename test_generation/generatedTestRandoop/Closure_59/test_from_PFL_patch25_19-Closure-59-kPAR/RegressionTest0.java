import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.Compiler.MOTION_ITERATIONS_ERROR;
        java.lang.Class<?> wildcardClass1 = diagnosticType0.getClass();
        org.junit.Assert.assertNotNull(diagnosticType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.Class<?> wildcardClass1 = codeBuilder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.Compiler.OPTIMIZE_LOOP_ERROR;
        org.junit.Assert.assertNotNull(diagnosticType0);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.google.javascript.jscomp.ErrorManager errorManager0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(errorManager0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: the error manager cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = compiler0.parse(jSSourceFile1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setErrorManager(errorManager1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: the error manager cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder2 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int3 = codeBuilder2.getLength();
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder2, 0, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        java.lang.Class<?> wildcardClass1 = compiler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray4 = new com.google.javascript.jscomp.JSModule[] { jSModule3 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result6 = compiler0.compile(jSSourceFile2, jSModuleArray4, compilerOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(jSModuleArray4);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        com.google.javascript.jscomp.ErrorManager errorManager2 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setErrorManager(errorManager2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: the error manager cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray1 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray2 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray1, jSModuleArray2, compilerOptions3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSSourceFileArray1);
        org.junit.Assert.assertNotNull(jSModuleArray2);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.JSModule jSModule2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray3 = compiler0.toSourceArray(jSModule2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray2 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList3 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList3, jSSourceFileArray2);
        com.google.javascript.jscomp.JSModule[] jSModuleArray5 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList6 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList6, jSModuleArray5);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler1.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList3, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList6, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSSourceFileArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSModuleArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray1 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule2 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray3 = new com.google.javascript.jscomp.JSModule[] { jSModule2 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result5 = compiler0.compile(jSSourceFileArray1, jSModuleArray3, compilerOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSSourceFileArray1);
        org.junit.Assert.assertNotNull(jSModuleArray3);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile3 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile4 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result6 = compiler0.compile(jSSourceFile3, jSSourceFile4, compilerOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.reportCodeChange();
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
        org.junit.Assert.assertNotNull(jSSourceFileArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler0.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = compiler0.toSource(jSModule3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler1.getCodingConvention();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.util.logging.Level level0 = null;
        com.google.javascript.jscomp.Compiler.setLoggingLevel(level0);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler2.getState();
        compiler1.setState(intermediateState4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = compiler1.acceptEcmaScript5();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile2 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray3 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result5 = compiler0.compile(jSSourceFile2, jSSourceFileArray3, compilerOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(jSSourceFileArray3);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = null;
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
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNotNull(jSModuleArray13);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile3 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result6 = compiler1.compile(jSSourceFile3, jSSourceFileArray4, compilerOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.JSError jSError4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel5 = compiler2.getErrorLevel(jSError4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState3);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
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
        com.google.javascript.jscomp.PassConfig passConfig11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig11);
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
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
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
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setState(intermediateState3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = compiler0.toSourceArray(jSModule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getMessages();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
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
            com.google.javascript.jscomp.Result result9 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList3, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList6, compilerOptions8);
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
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = compiler0.toSourceArray(jSModule3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState2);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = compiler0.toSource(jSModule3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.JSError jSError5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSError jSError4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel5 = compiler0.getErrorLevel(jSError4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray5 = compiler0.toSourceArray(jSModule4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile4 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray5 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result7 = compiler2.compile(jSSourceFile4, jSModuleArray5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSModuleArray5);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.PassConfig passConfig6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile5 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray7 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler0.compile(jSSourceFileArray6, jSModuleArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertNotNull(jSModuleArray7);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile4 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile4 };
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile6 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler2.compile(jSSourceFileArray5, jSSourceFileArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
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
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(jSModuleArray5);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray3 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray5 = new com.google.javascript.jscomp.JSModule[] { jSModule4 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result7 = compiler0.compile(jSSourceFileArray3, jSModuleArray5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(jSSourceFileArray3);
        org.junit.Assert.assertNotNull(jSModuleArray5);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
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
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder3 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int4 = codeBuilder3.getLength();
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder3, (int) (byte) 100, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler2.getState();
        compiler1.setState(intermediateState4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = compiler1.getSourceLine("", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler4.initOptions(compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
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
            compiler0.normalize();
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
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSModule jSModule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = compiler0.toSourceArray(jSModule6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
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
        org.junit.Assert.assertNull(scope1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSModuleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray2 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile3 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile3 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray2, jSSourceFileArray4, compilerOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSSourceFileArray2);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
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
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNotNull(jSModuleArray13);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile3 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray4 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result6 = compiler0.compile(jSSourceFile3, jSModuleArray4, compilerOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(jSModuleArray4);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.JSModule jSModule2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray3 = compiler1.toSourceArray(jSModule2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput8 = compiler0.newExternInput("");
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
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile12 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFile11, jSSourceFile12, compilerOptions13);
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
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = compiler1.acceptEcmaScript5();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
            java.lang.String str12 = compiler0.getSourceLine("hi!", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray3 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray3, jSSourceFileArray4, compilerOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(jSSourceFileArray3);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler0.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray2 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList3 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList3, jSSourceFileArray2);
        java.util.List<com.google.javascript.jscomp.JSModule> jSModuleList5 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result7 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList3, jSModuleList5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSSourceFileArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result8 = compiler0.compile(jSSourceFile5, jSSourceFileArray6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getWarningCount();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = compiler0.getSourceLine("hi!", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig2 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope1);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        compiler1.disableThreads();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder4 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder4, (int) '4', node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result13 = compiler0.compile(jSSourceFileArray10, jSSourceFileArray11, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray5 = compiler2.toSourceArray(jSModule4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(errorManager3);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region5 = compiler1.getSourceRegion("", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        java.lang.Class<?> wildcardClass7 = compiler0.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
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
            com.google.javascript.jscomp.CompilerInput compilerInput12 = compiler0.getInput("hi!");
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
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
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
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = compiler0.toSource(jSModule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
            com.google.javascript.jscomp.Result result8 = compiler0.compile(jSSourceFileArray4, jSSourceFileArray6, compilerOptions7);
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
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler2.getState();
        compiler1.setState(intermediateState4);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(jSErrorArray5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
            compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList14, compilerOptions16);
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
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = compiler0.toSource(jSModule3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = compiler0.parse(jSSourceFile4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(performanceTracker3);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray3 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList4 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList4, jSSourceFileArray3);
        com.google.javascript.jscomp.JSModule[] jSModuleArray6 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList7 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList7, jSModuleArray6);
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList4, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList7, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(jSSourceFileArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSModuleArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = compiler10.hasErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList12 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList12, jSSourceFileArray11);
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList15 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList15, jSModuleArray14);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result18 = compiler10.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList12, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList15, compilerOptions17);
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
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder6 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str7 = codeBuilder6.toString();
        java.lang.String str8 = codeBuilder6.toString();
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler4.toSource(codeBuilder6, (int) (byte) 100, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
            com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler0.getTypeRegistry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler4.setPassConfig(passConfig6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
        com.google.javascript.jscomp.PassConfig passConfig10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile1 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray2 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result4 = compiler0.compile(jSSourceFile1, jSModuleArray2, compilerOptions3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSModuleArray2);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler2.initOptions(compilerOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState3);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler0.toSourceArray(jSModule8);
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
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        boolean boolean8 = compiler0.isIdeMode();
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile3 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile4 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile4 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result7 = compiler1.compile(jSSourceFile3, jSSourceFileArray5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder5 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str6 = codeBuilder5.toString();
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder5, 1, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.util.List<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList2 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray3 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList4 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList4, jSModuleArray3);
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result7 = compiler0.compileModules(jSSourceFileList2, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList4, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSModuleArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
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
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = compiler0.toSource(jSModule4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(performanceTracker3);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray6 = new com.google.javascript.jscomp.JSModule[] { jSModule5 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result8 = compiler2.compile(jSSourceFile4, jSModuleArray6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(jSModuleArray6);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
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
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
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
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.JSError jSError4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel5 = compiler2.getErrorLevel(jSError4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(errorManager3);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = compiler0.toSourceArray(jSModule3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(intermediateState2);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler2.getState();
        compiler1.setState(intermediateState4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = compiler1.isTypeCheckingEnabled();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
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
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = compiler1.getWarningCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertNotNull(jSModuleArray10);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        compiler0.disableThreads();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSModuleArray8);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getErrors();
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
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile4 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result7 = compiler0.compile(jSSourceFile4, jSSourceFile5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(performanceTracker3);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList7 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, jSSourceFileArray6);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList10 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, jSSourceFileArray9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler4.init((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
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
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
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
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
            java.lang.String str10 = compiler0.getSourceLine("", (int) 'a');
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
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = compiler1.toSource(jSModule3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler0.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSModuleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
            compiler0.normalize();
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
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSModuleArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getWarningCount();
        java.lang.String str6 = compiler0.getSourceLine("hi!", (int) (byte) 0);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str8 = codeBuilder7.toString();
        java.lang.String str9 = codeBuilder7.toString();
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder7, (int) '4', node11);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getErrors();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler0.newExternInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler2.getState();
        compiler1.setState(intermediateState4);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] { jSModule7 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler1.compile(jSSourceFile6, jSModuleArray8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNotNull(jSModuleArray8);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        java.lang.String str10 = compiler0.toSource();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSModuleArray12);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = compiler0.toSourceArray(jSModule9);
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
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = compiler0.getSourceLine("", (int) (short) 100);
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
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile4 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result7 = compiler0.compile(jSSourceFile4, jSSourceFileArray5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        compiler1.disableThreads();
        java.lang.Class<?> wildcardClass4 = compiler1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.JSError jSError1 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        com.google.javascript.jscomp.JSError jSError7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel8 = compiler4.getErrorLevel(jSError7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(jSErrorArray5);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        compiler0.disableThreads();
        java.lang.String str7 = compiler0.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region10 = compiler0.getSourceRegion("", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
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
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Result result3 = compiler2.getResult();
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray5 = compiler2.toSourceArray(jSModule4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(result3);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
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
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
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
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder5 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int6 = codeBuilder5.getLength();
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder5, (int) (byte) 100, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result17 = compiler0.getResult();
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
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
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
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
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
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSSourceFileArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSModuleArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.jscomp.JSError jSError6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(region5);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
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
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        java.lang.String str6 = compiler0.getSourceLine("", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        int int7 = compiler4.getErrorCount();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler4.compile(jSSourceFile8, jSSourceFile9, compilerOptions10);
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
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = compiler0.toSource(jSModule5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(result9);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput11 = compiler0.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setState(intermediateState2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler2.getErrorManager();
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
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray7 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler0.compile(jSSourceFileArray6, jSModuleArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        com.google.javascript.jscomp.PassConfig passConfig10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.hasErrors();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSModuleArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSModuleArray8);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = compiler0.parse(jSSourceFile6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(performanceTracker5);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        java.lang.String str8 = compiler0.getAstDotGraph();
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile3 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile3 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result7 = compiler0.compile(jSSourceFileArray4, jSSourceFileArray5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(codingConvention8);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
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
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList6 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, jSSourceFileArray5);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, jSSourceFileArray8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler4.init((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions18);
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
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            compiler4.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
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
        org.junit.Assert.assertNotNull(jSErrorArray6);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.hasErrors();
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = compiler0.toSourceArray(jSModule5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        com.google.javascript.jscomp.Result result7 = compiler0.getResult();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray10 = new com.google.javascript.jscomp.JSModule[] { jSModule9 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler0.compile(jSSourceFile8, jSModuleArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(result7);
        org.junit.Assert.assertNotNull(jSModuleArray10);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        boolean boolean7 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSError jSError8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel9 = compiler0.getErrorLevel(jSError8);
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
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile10 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray11, jSModuleArray12, compilerOptions13);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSModuleArray12);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList5 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList5, jSSourceFileArray4);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList8 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList8, jSSourceFileArray7);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList5, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList8, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput8 = compiler0.getInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler0.getState();
        compiler0.reportCodeChange();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intermediateState9);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile4 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result7 = compiler0.compile(jSSourceFile4, jSSourceFile5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray3);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList5 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList5, jSSourceFileArray4);
        com.google.javascript.jscomp.JSModule[] jSModuleArray7 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList8 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList8, jSModuleArray7);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList5, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList8, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSModuleArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler0.getState();
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intermediateState9);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        boolean boolean7 = compiler0.hasErrors();
        compiler0.reportCodeChange();
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getWarningCount();
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
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(codingConvention8);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("hi!", (int) (byte) 0);
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler0.toSourceArray(jSModule7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(region6);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        boolean boolean8 = compiler0.isIdeMode();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getWarningCount();
        java.lang.String str6 = compiler0.getSourceLine("hi!", (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        int int3 = compiler2.getWarningCount();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler2.getErrorManager();
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = compiler2.toSource(jSModule5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(errorManager4);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNull(sourceMap6);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile3 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile3 };
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
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder5 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder5, (int) (short) 0, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler2.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule6 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray7 = new com.google.javascript.jscomp.JSModule[] { jSModule6 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler2.compile(jSSourceFileArray5, jSModuleArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertNotNull(jSModuleArray7);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = compiler0.toSource(jSModule7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        java.lang.Class<?> wildcardClass3 = compiler0.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
            boolean boolean18 = compiler0.hasErrors();
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
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intermediateState8);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile10 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray11, jSSourceFileArray12, compilerOptions13);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        boolean boolean9 = compiler0.acceptConstKeyword();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = compiler0.parse(jSSourceFile18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = compiler0.acceptEcmaScript5();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(performanceTracker5);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSError jSError6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        java.lang.String str6 = compiler0.getAstDotGraph();
        java.lang.String str9 = compiler0.getSourceLine("", (int) (byte) 0);
        org.junit.Assert.assertNull(scope1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(performanceTracker5);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        int int9 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile10 };
        com.google.javascript.jscomp.JSSourceFile jSSourceFile12 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile12 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray11, jSSourceFileArray13, compilerOptions14);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile4 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray5 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result7 = compiler0.compile(jSSourceFile4, jSModuleArray5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        boolean boolean6 = compiler0.hasErrors();
        java.lang.Class<?> wildcardClass7 = compiler0.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        boolean boolean6 = compiler0.hasErrors();
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
            com.google.javascript.jscomp.Result result15 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList12, compilerOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSModuleArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        java.lang.Class<?> wildcardClass5 = compiler3.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler2.getErrorManager();
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = compiler2.toSourceArray(jSModule5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(errorManager4);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        java.lang.Class<?> wildcardClass4 = errorManager3.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        java.lang.String str6 = compiler0.getSourceLine("", (int) (short) 0);
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
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSModuleArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder10 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str11 = codeBuilder10.toString();
        java.lang.String str12 = codeBuilder10.toString();
        java.lang.String str13 = codeBuilder10.toString();
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder10, (int) (short) 10, node15);
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
        org.junit.Assert.assertNotNull(jSTypeRegistry9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
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
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile6 };
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile8 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray7, jSSourceFileArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray18 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList19 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList19, jSSourceFileArray18);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray21 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList22 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList22, jSSourceFileArray21);
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList19, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList22, compilerOptions24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNotNull(jSSourceFileArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(jSModuleArray12);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList10 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, jSSourceFileArray9);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList13 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList13, jSSourceFileArray12);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result16 = compiler0.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList13, compilerOptions15);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = compiler0.getSourceLine("", 100);
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
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray5 = compiler0.toSourceArray(jSModule4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(errorManager3);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getWarningCount();
        java.lang.String str6 = compiler0.getSourceLine("hi!", (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError jSError5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder8 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str9 = codeBuilder8.toString();
        java.lang.String str10 = codeBuilder8.toString();
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder8, (int) (byte) 0, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSModuleArray12);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(codingConvention7);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile18 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray19 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile18 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result21 = compiler3.compile(jSSourceFile17, jSSourceFileArray19, compilerOptions20);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray19);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        compiler1.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result8 = compiler1.compile(jSSourceFile5, jSSourceFile6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(intermediateState4);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile4 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile4 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result8 = compiler2.compile(jSSourceFileArray5, jSSourceFileArray6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSModuleArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
            compiler0.rebuildInputsFromModules();
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
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSModuleArray11);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        com.google.javascript.jscomp.JSError jSError18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel19 = compiler0.getErrorLevel(jSError18);
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
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile12 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result16 = compiler0.compile(jSSourceFileArray13, jSModuleArray14, compilerOptions15);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertNotNull(jSModuleArray14);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        java.lang.String str6 = compiler0.getAstDotGraph();
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
        org.junit.Assert.assertNull(scope1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSModuleArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = compiler0.toSourceArray(jSModule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = compiler0.toSource(jSModule10);
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
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getErrors();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = compiler0.toSource(jSModule10);
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
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("hi!", (int) (byte) 0);
        boolean boolean7 = compiler0.hasErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(region6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder6 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str7 = codeBuilder6.toString();
        int int8 = codeBuilder6.getLength();
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler3.toSource(codeBuilder6, (int) (short) -1, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
            boolean boolean8 = compiler0.acceptConstKeyword();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        java.lang.String str6 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        java.lang.String str6 = compiler3.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler3.setErrorManager(errorManager7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: the error manager cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.JSError jSError6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler0.compile(jSSourceFile6, jSSourceFileArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = compiler0.getTypeRegistry();
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
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry9);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler0.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(intermediateState9);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        java.lang.String str6 = compiler0.getSourceLine("", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput12 = compiler0.newExternInput("hi!");
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
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
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
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSError jSError7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel8 = compiler0.getErrorLevel(jSError7);
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
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSModuleArray13);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
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
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
            java.lang.String[] strArray8 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getErrors();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        java.lang.String str6 = compiler0.getAstDotGraph();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] { jSModule13 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result16 = compiler0.compile(jSSourceFileArray12, jSModuleArray14, compilerOptions15);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertNotNull(jSModuleArray14);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] { jSModule7 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler4.init(jSSourceFileArray6, jSModuleArray8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertNotNull(jSModuleArray8);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PassConfig passConfig7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = compiler0.acceptEcmaScript5();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput12 = compiler0.getInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler4.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler4.getWarnings();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = compiler0.toSourceArray(jSModule9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        compiler0.disableThreads();
        java.lang.String str7 = compiler0.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder7, 0, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        int int3 = compiler2.getWarningCount();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler2.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule6 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray7 = new com.google.javascript.jscomp.JSModule[] { jSModule6 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler2.init(jSSourceFileArray5, jSModuleArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertNotNull(jSModuleArray7);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
            java.lang.Class<?> wildcardClass12 = sourceMap11.getClass();
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
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        java.lang.String str8 = compiler0.getAstDotGraph();
        java.util.List<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList11 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, jSSourceFileArray10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileList9, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, compilerOptions13);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler2.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(errorManager4);
        com.google.javascript.jscomp.JSError jSError6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler5.report(jSError6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(errorManager4);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(performanceTracker7);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
            com.google.javascript.jscomp.Result result15 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList12, compilerOptions14);
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
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
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
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
            java.lang.String str11 = compiler0.getSourceLine("hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler0.getCodingConvention();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.rebuildInputsFromModules();
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
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        int int7 = compiler0.getErrorCount();
        boolean boolean8 = compiler0.hasErrors();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region11 = compiler0.getSourceRegion("hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        compiler0.disableThreads();
        java.lang.String str7 = compiler0.getAstDotGraph();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.rhino.Node node3 = compiler2.getRoot();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder4 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str5 = codeBuilder4.toString();
        java.lang.String str6 = codeBuilder4.toString();
        java.lang.String str7 = codeBuilder4.toString();
        java.lang.String str8 = codeBuilder4.toString();
        int int9 = codeBuilder4.getLength();
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler2.toSource(codeBuilder4, (int) (short) 1, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        java.lang.String str6 = compiler0.getSourceLine("", (int) (short) 0);
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler0.toSourceArray(jSModule7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        com.google.javascript.jscomp.JSError jSError15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel16 = compiler0.getErrorLevel(jSError15);
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
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(intermediateState13);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getWarnings();
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        java.lang.String str6 = compiler0.getAstDotGraph();
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
        org.junit.Assert.assertNull(scope1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler0.rebuildInputsFromModules();
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
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        com.google.javascript.jscomp.PassConfig passConfig15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(region14);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        int int9 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile10 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray11, jSSourceFileArray12, compilerOptions13);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler2.getState();
        compiler1.setState(intermediateState4);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        boolean boolean8 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getErrors();
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
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile8 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray9, jSSourceFileArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray5 = compiler0.toSourceArray(jSModule4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile2 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile3 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result5 = compiler0.compile(jSSourceFile2, jSSourceFile3, compilerOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        java.lang.String str6 = compiler3.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile7 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler3.compile(jSSourceFileArray8, jSSourceFileArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler0.compile(jSSourceFile9, jSSourceFileArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        compiler0.disableThreads();
        compiler0.disableThreads();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler2.getSourceMap();
        int int4 = compiler2.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile4 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result7 = compiler0.compile(jSSourceFile4, jSSourceFile5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.hasErrors();
        java.lang.String str7 = compiler0.toSource();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray11, jSSourceFileArray12, compilerOptions13);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        int int7 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler0.compile(jSSourceFileArray8, jSSourceFileArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray3 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList4 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList4, jSSourceFileArray3);
        com.google.javascript.jscomp.JSModule[] jSModuleArray6 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList7 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList7, jSModuleArray6);
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler2.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList4, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList7, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSSourceFileArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSModuleArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.hasErrors();
        java.lang.String str7 = compiler0.toSource();
        java.lang.Class<?> wildcardClass8 = compiler0.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = compiler0.toSourceArray(jSModule5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler0.getState();
        com.google.javascript.jscomp.Scope scope10 = compiler0.getTopScope();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNull(scope10);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError jSError4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel5 = compiler0.getErrorLevel(jSError4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getWarningCount();
        java.lang.String str6 = compiler0.getSourceLine("hi!", (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Region region7 = compiler0.getSourceRegion("", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(region7);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(result10);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        compiler0.disableThreads();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler0.getErrorManager();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        int int7 = compiler4.getErrorCount();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder8 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str9 = codeBuilder8.toString();
        java.lang.String str10 = codeBuilder8.toString();
        java.lang.String str11 = codeBuilder8.toString();
        java.lang.String str12 = codeBuilder8.toString();
        int int13 = codeBuilder8.getLength();
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler4.toSource(codeBuilder8, (int) (byte) 0, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
            com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler0.getInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(jSErrorArray12);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList6 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, jSSourceFileArray5);
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList9, jSModuleArray8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList9, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getMessages();
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSModuleArray11);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        java.lang.Class<?> wildcardClass4 = compiler2.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        compiler0.disableThreads();
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
        org.junit.Assert.assertNotNull(jSErrorArray6);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = compiler0.parse(jSSourceFile6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        compiler0.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler0.getInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.PassConfig passConfig4 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(jSErrorArray3);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PassConfig passConfig6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertNotNull(jSErrorArray4);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        int int3 = compiler2.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler2.getMessages();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile6 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler2.init(jSSourceFileArray5, jSSourceFileArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
            compiler0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        java.lang.String str6 = compiler3.getAstDotGraph();
        com.google.javascript.jscomp.Result result7 = compiler3.getResult();
        com.google.javascript.jscomp.PassConfig passConfig8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler3.setPassConfig(passConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(result7);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.Class<?> wildcardClass5 = compiler1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.JSError jSError1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel2 = compiler0.getErrorLevel(jSError1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList5 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList5, jSSourceFileArray4);
        com.google.javascript.jscomp.JSModule[] jSModuleArray7 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList8 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList8, jSModuleArray7);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList5, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList8, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(codingConvention3);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSModuleArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler2.getState();
        compiler1.setState(intermediateState4);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList7 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, jSSourceFileArray6);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList10 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, jSSourceFileArray9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSModule jSModule2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray3 = compiler0.toSourceArray(jSModule2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        boolean boolean8 = compiler0.isIdeMode();
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError jSError5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler4.report(jSError5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("hi!", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(region6);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        boolean boolean6 = compiler0.hasErrors();
        boolean boolean7 = compiler0.isIdeMode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region10 = compiler0.getSourceRegion("", 10);
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
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError jSError6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel7 = compiler0.getErrorLevel(jSError6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        com.google.javascript.jscomp.JSModule jSModule15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray16 = compiler0.toSourceArray(jSModule15);
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
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        java.lang.String str7 = compiler0.toSource();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions8);
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
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Region region7 = compiler0.getSourceRegion("", 0);
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(region7);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result7 = compiler0.compile(jSSourceFileArray4, jSSourceFileArray5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler0.getState();
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intermediateState9);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile7 };
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray10 = new com.google.javascript.jscomp.JSModule[] { jSModule9 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray8, jSModuleArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSModuleArray10);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler0.compile(jSSourceFile9, jSSourceFileArray10, compilerOptions11);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler4.getErrors();
        java.lang.String str8 = compiler4.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile9 };
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile11 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler4.init(jSSourceFileArray10, jSSourceFileArray12, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.rebuildInputsFromModules();
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
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
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
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(sourceMap11);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        compiler0.disableThreads();
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
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
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
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
            boolean boolean8 = compiler0.hasErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap5);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(errorManager7);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        java.lang.String str7 = compiler0.toSource();
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
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(result10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        java.lang.String str6 = compiler0.toSource();
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler0.getTypeRegistry();
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
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        int int9 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Result result10 = compiler0.getResult();
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(result10);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSModuleArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getErrors();
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
        org.junit.Assert.assertNotNull(jSErrorArray8);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        java.lang.Class<?> wildcardClass3 = errorManager2.getClass();
        org.junit.Assert.assertNull(scope1);
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        boolean boolean6 = compiler0.hasErrors();
        boolean boolean7 = compiler0.isIdeMode();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        int int6 = compiler4.getErrorCount();
        compiler4.reportCodeChange();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
            compiler0.optimize();
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
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
        boolean boolean6 = compiler0.hasErrors();
        boolean boolean7 = compiler0.isIdeMode();
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
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        compiler0.disableThreads();
        java.lang.String str7 = compiler0.getAstDotGraph();
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
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getWarningCount();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
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
        org.junit.Assert.assertNull(sourceMap4);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList5 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList5, jSSourceFileArray4);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList8 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList8, jSSourceFileArray7);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler0.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList5, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList8, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getErrors();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile9 };
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
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSModuleArray11);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getWarningCount();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(sourceMap4);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        boolean boolean15 = compiler0.isTypeCheckingEnabled();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(intermediateState11);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.rhino.Node node3 = compiler2.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler2.getState();
        com.google.javascript.jscomp.JSError jSError5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel6 = compiler2.getErrorLevel(jSError5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(intermediateState4);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(sourceMap4);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput8 = compiler0.getInput("hi!");
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
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.JSError jSError8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel9 = compiler0.getErrorLevel(jSError8);
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler2.getState();
        compiler1.setState(intermediateState4);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = compiler1.parse(jSSourceFile6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(performanceTracker10);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = null;
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        int int7 = compiler0.getErrorCount();
        boolean boolean8 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = compiler0.parse(jSSourceFile9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
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
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(performanceTracker5);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        com.google.javascript.jscomp.PassConfig passConfig29 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig29);
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
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        compiler0.setErrorManager(errorManager7);
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
        org.junit.Assert.assertNotNull(errorManager7);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = compiler0.parse(jSSourceFile5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(intermediateState8);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = compiler2.toSource(jSModule3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNull(sourceMap14);
        org.junit.Assert.assertNotNull(intermediateState16);
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNotNull(intermediateState22);
        org.junit.Assert.assertNotNull(intermediateState27);
        org.junit.Assert.assertNotNull(jSErrorArray28);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder10 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int11 = codeBuilder10.getLength();
        int int12 = codeBuilder10.getLength();
        java.lang.String str13 = codeBuilder10.toString();
        java.lang.String str14 = codeBuilder10.toString();
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler4.toSource(codeBuilder10, (int) (short) 0, node16);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray17 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile18 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray19 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile18 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result21 = compiler0.compile(jSSourceFileArray17, jSSourceFileArray19, compilerOptions20);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray17);
        org.junit.Assert.assertNotNull(jSSourceFileArray19);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        java.lang.String str6 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(codingConvention7);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray30 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList31 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList31, jSSourceFileArray30);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray33 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList34 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList34, jSSourceFileArray33);
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList31, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList34, compilerOptions36);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSError jSError7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel8 = compiler0.getErrorLevel(jSError7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList10 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, jSSourceFileArray9);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList13 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList13, jSSourceFileArray12);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result16 = compiler0.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList13, compilerOptions15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        compiler0.disableThreads();
        java.lang.String str7 = compiler0.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler0.newExternInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler10.initOptions(compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getWarningCount();
        java.lang.Class<?> wildcardClass4 = compiler0.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
            com.google.javascript.jscomp.Result result16 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList13, compilerOptions15);
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
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray17 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList18 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList18, jSSourceFileArray17);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray20 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList21 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList21, jSSourceFileArray20);
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result24 = compiler0.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList18, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList21, compilerOptions23);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        compiler0.disableThreads();
        boolean boolean17 = compiler0.acceptEcmaScript5();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptConstKeyword();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        boolean boolean8 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler0.compile(jSSourceFileArray9, jSSourceFileArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        boolean boolean4 = compiler0.hasErrors();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.jscomp.JSError jSError4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel5 = compiler0.getErrorLevel(jSError4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(performanceTracker3);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile9 };
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSModuleArray11);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile3 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile3 };
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
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Region region7 = compiler0.getSourceRegion("", 0);
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(region7);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler2.tracker;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNull(performanceTracker4);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
            boolean boolean18 = compiler0.acceptEcmaScript5();
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
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler0.getCodingConvention();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
            java.lang.String[] strArray10 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        boolean boolean6 = compiler0.hasErrors();
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile8 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray9, jSSourceFileArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        com.google.javascript.jscomp.JSError jSError13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler10.report(jSError13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        java.lang.Class<?> wildcardClass6 = compiler4.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Region region9 = compiler0.getSourceRegion("hi!", (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder9 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int10 = codeBuilder9.getLength();
        java.lang.String str11 = codeBuilder9.toString();
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder9, 1, node13);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        compiler0.disableThreads();
        java.lang.String str7 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setState(intermediateState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        compiler0.reportCodeChange();
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
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Region region9 = compiler0.getSourceRegion("hi!", (int) (short) 0);
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSModuleArray13);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        com.google.javascript.jscomp.JSError jSError17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(intermediateState14);
        org.junit.Assert.assertNotNull(errorManager15);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        java.lang.String str6 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler0.toSourceArray(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(codingConvention7);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope1);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        com.google.javascript.jscomp.JSModule jSModule15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = compiler10.toSource(jSModule15);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        java.lang.Class<?> wildcardClass8 = compiler0.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
            java.lang.String[] strArray16 = compiler0.toSourceArray(jSModule15);
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
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler0.getInput("");
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
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile18 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray19 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile18 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray20 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray19, jSModuleArray20, compilerOptions21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(jSSourceFileArray19);
        org.junit.Assert.assertNotNull(jSModuleArray20);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result7 = compiler3.compile(jSSourceFileArray4, jSSourceFileArray5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
        boolean boolean6 = compiler0.hasErrors();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSModuleArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler0.getErrorManager();
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
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError jSError7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        compiler0.reportCodeChange();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(intermediateState13);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        com.google.javascript.jscomp.JSModule jSModule27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = compiler0.toSource(jSModule27);
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
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region31 = compiler0.getSourceRegion("hi!", (int) (byte) 1);
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
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        int int9 = compiler0.getWarningCount();
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        int int6 = compiler3.getWarningCount();
        java.lang.Class<?> wildcardClass7 = compiler3.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intermediateState11);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        int int6 = compiler0.getWarningCount();
        int int7 = compiler0.getWarningCount();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        com.google.javascript.rhino.Node node15 = compiler10.getRoot();
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = compiler0.parse(jSSourceFile5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        compiler0.reportCodeChange();
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSModuleArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile21 = null;
        com.google.javascript.jscomp.JSModule jSModule22 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] { jSModule22 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result25 = compiler0.compile(jSSourceFile21, jSModuleArray23, compilerOptions24);
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
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(result15);
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNotNull(jSModuleArray23);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError jSError8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel9 = compiler0.getErrorLevel(jSError8);
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray3 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList4 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList4, jSSourceFileArray3);
        com.google.javascript.jscomp.JSModule[] jSModuleArray6 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList7 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList7, jSModuleArray6);
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList4, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList7, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(jSSourceFileArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSModuleArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = null;
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
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
            java.lang.String str16 = compiler10.getSourceLine("", (int) '4');
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
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        int int5 = compiler0.getWarningCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray15 = compiler10.toSourceArray(jSModule14);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
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
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
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
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile11 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFile10, jSSourceFileArray12, compilerOptions13);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = compiler1.getErrorCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getMessages();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSErrorArray8);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        java.lang.String str5 = compiler0.toSource();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        java.lang.String str11 = compiler7.getSourceLine("", (-1));
        int int12 = compiler7.getErrorCount();
        int int13 = compiler7.getWarningCount();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler7.getErrorManager();
        compiler0.setErrorManager(errorManager14);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(errorManager14);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler4.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler4.tracker;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNull(performanceTracker8);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = compiler6.toSource(jSModule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(errorManager5);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = compiler0.acceptConstKeyword();
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
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        compiler0.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker7);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
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
            compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList10, compilerOptions12);
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
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        com.google.javascript.jscomp.PassConfig passConfig18 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig18);
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
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler3.getTopScope();
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler3.toSourceArray(jSModule7);
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
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
            com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler8.getCodingConvention();
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        java.lang.String str6 = compiler0.getSourceLine("", (int) (short) 0);
        java.lang.String str7 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = compiler0.parse(jSSourceFile8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        compiler0.reportCodeChange();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
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
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getErrors();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray10 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler0.compile(jSSourceFile9, jSModuleArray10, compilerOptions11);
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
        org.junit.Assert.assertNotNull(jSModuleArray10);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler0.getErrorManager();
        boolean boolean7 = compiler0.isIdeMode();
        java.lang.Class<?> wildcardClass8 = compiler0.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        org.junit.Assert.assertNotNull(jSErrorArray2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
    }
}

