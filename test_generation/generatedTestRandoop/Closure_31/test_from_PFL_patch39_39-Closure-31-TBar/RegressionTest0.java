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
        java.util.logging.Level level0 = null;
        com.google.javascript.jscomp.Compiler.setLoggingLevel(level0);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
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
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.Compiler.MOTION_ITERATIONS_ERROR;
        org.junit.Assert.assertNotNull(diagnosticType0);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder2 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder2, (int) '#', node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = compiler1.isIdeMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result2 = compiler1.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = compiler1.acceptConstKeyword();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setState(intermediateState2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.rhino.InputId inputId3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput4 = compiler1.getInput(inputId3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = compiler1.getTypeRegistry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSError jSError3 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile3 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile3 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray4, jSSourceFileArray5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.JSError jSError3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel4 = compiler1.getErrorLevel(jSError3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        java.lang.Class<?> wildcardClass2 = codeBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray6 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result8 = compiler1.compile(jSSourceFileArray5, jSModuleArray6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertNotNull(jSModuleArray6);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        int int2 = codeBuilder0.getLength();
        java.lang.Class<?> wildcardClass3 = codeBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray2 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray3 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result5 = compiler1.compile(jSSourceFileArray2, jSModuleArray3, compilerOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSSourceFileArray2);
        org.junit.Assert.assertNotNull(jSModuleArray3);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.SourceFile sourceFile5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = compiler1.parse(sourceFile5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile2 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray3 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result5 = compiler1.compile(jSSourceFile2, jSModuleArray3, compilerOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSModuleArray3);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler1.getWarnings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.ErrorManager errorManager5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setErrorManager(errorManager5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: the error manager cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler1.getWarnings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray5 = compiler1.toSourceArray(jSModule4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = compiler1.toSource(jSModule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.JSError jSError5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.Compiler.OPTIMIZE_LOOP_ERROR;
        org.junit.Assert.assertNotNull(diagnosticType0);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder5 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int6 = codeBuilder5.getLength();
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder5, (int) (byte) 100, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler1.getTypeRegistry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile6 };
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray9 = new com.google.javascript.jscomp.JSModule[] { jSModule8 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler1.compile(jSSourceFileArray7, jSModuleArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = compiler1.toSourceArray(jSModule3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler1.languageMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = compiler1.toSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable5 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceFile sourceFile2 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray3 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result5 = compiler1.compile(sourceFile2, jSSourceFileArray3, compilerOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSSourceFileArray3);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = compiler1.getWarningCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = compiler1.acceptEcmaScript5();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSError jSError6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel7 = compiler1.getErrorLevel(jSError6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder3 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int4 = codeBuilder3.getLength();
        int int5 = codeBuilder3.getLength();
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder3, (int) (short) -1, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = compiler1.toSource(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        com.google.javascript.rhino.InputId inputId6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput(inputId6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = compiler1.toSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput5 = compiler1.newExternInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler1.compile(jSSourceFile7, jSModuleArray8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(jSModuleArray8);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.String str7 = compiler1.getSourceLine("", 0);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray10 = new com.google.javascript.jscomp.JSModule[] { jSModule9 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler1.compile(jSSourceFile8, jSModuleArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(jSModuleArray10);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSError jSError6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        java.lang.Class<?> wildcardClass5 = compiler1.getClass();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.SourceFile sourceFile5 = null;
        com.google.javascript.jscomp.SourceFile sourceFile6 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result8 = compiler1.compile(sourceFile5, sourceFile6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = compiler1.isIdeMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder6 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int7 = codeBuilder6.getLength();
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder6, (int) '#', node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile7 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler1.compile(jSSourceFileArray8, jSSourceFileArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.String str7 = compiler1.getSourceLine("", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = compiler1.getErrorCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray3 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray5 = new com.google.javascript.jscomp.JSModule[] { jSModule4 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray3, jSModuleArray5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSSourceFileArray3);
        org.junit.Assert.assertNotNull(jSModuleArray5);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        double double3 = compiler1.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = compiler1.getSourceLine("", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceFile sourceFile6 = null;
        com.google.javascript.jscomp.SourceFile sourceFile7 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler1.compile(sourceFile6, sourceFile7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.String str7 = compiler1.getSourceLine("", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result8 = compiler1.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.rhino.InputId inputId4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput5 = compiler1.getInput(inputId4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.String str7 = compiler1.getSourceLine("", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler1.getCodingConvention();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceFile sourceFile2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result5 = compiler1.compile(sourceFile2, sourceFile3, compilerOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode7 = compiler1.languageMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = compiler1.hasErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.JsAst jsAst4 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addNewScript(jsAst4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = compiler1.getWarningCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = compiler1.getWarningCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        double double3 = compiler1.getProgress();
        com.google.javascript.jscomp.PassConfig passConfig4 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result8 = compiler1.compile(jSSourceFileArray5, jSSourceFileArray6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSError jSError9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler1.getTypeRegistry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.SourceFile sourceFile4 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result7 = compiler1.compile(sourceFile4, jSSourceFileArray5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region4 = compiler1.getSourceRegion("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        double double3 = compiler1.getProgress();
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = compiler1.toSource(jSModule4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = compiler1.hasErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = compiler1.acceptEcmaScript5();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Scope scope7 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = compiler1.isTypeCheckingEnabled();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder2 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int3 = codeBuilder2.getLength();
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder2, (int) (short) -1, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.SourceFile sourceFile8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = compiler1.parse(sourceFile8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler1.tracker = performanceTracker6;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray10 = new com.google.javascript.jscomp.JSModule[] { jSModule9 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray8, jSModuleArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSModuleArray10);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler10.tracker = performanceTracker12;
        com.google.javascript.jscomp.Scope scope14 = compiler10.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler10.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler10.getState();
        compiler1.setState(intermediateState16);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile18 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray19 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile18 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray20 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result22 = compiler1.compile(jSSourceFileArray19, jSModuleArray20, compilerOptions21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(intermediateState16);
        org.junit.Assert.assertNotNull(jSSourceFileArray19);
        org.junit.Assert.assertNotNull(jSModuleArray20);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = compiler1.toSourceArray(jSModule5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.PassConfig passConfig8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.Class<?> wildcardClass7 = compiler1.getClass();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler1.tracker = performanceTracker6;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.SourceFile sourceFile9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = compiler1.parse(sourceFile9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getWarnings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(sourceMap8);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = compiler1.toSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = compiler1.isIdeMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(sourceMap8);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder6 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int7 = codeBuilder6.getLength();
        int int8 = codeBuilder6.getLength();
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder6, (int) '4', node10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = compiler1.toSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable8 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        double double3 = compiler1.getProgress();
        com.google.javascript.jscomp.SourceFile sourceFile4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = compiler1.parse(sourceFile4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.JSError jSError8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler1.toSourceArray(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler1.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSError jSError9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel10 = compiler1.getErrorLevel(jSError9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.SourceFile sourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler1.compile(sourceFile9, jSSourceFileArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.SourceFile sourceFile5 = null;
        com.google.javascript.jscomp.SourceFile sourceFile6 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result8 = compiler1.compile(sourceFile5, sourceFile6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.SourceFile sourceFile5 = null;
        com.google.javascript.jscomp.SourceFile sourceFile6 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result8 = compiler1.compile(sourceFile5, sourceFile6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = compiler1.acceptEcmaScript5();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(sourceMap8);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = compiler1.getErrorCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = compiler1.toSourceArray(jSModule5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap7 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        int int2 = codeBuilder0.getLength();
        java.lang.String str3 = codeBuilder0.toString();
        int int4 = codeBuilder0.getLength();
        java.lang.String str5 = codeBuilder0.toString();
        java.lang.Class<?> wildcardClass6 = codeBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder5 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int6 = codeBuilder5.getLength();
        java.lang.String str7 = codeBuilder5.toString();
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder5, (int) (short) 100, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray6 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result8 = compiler1.compile(jSSourceFile5, jSModuleArray6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(jSModuleArray6);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        double double3 = compiler1.getProgress();
        com.google.javascript.jscomp.SourceFile sourceFile4 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile5 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result8 = compiler1.compile(sourceFile4, jSSourceFileArray6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable9 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler10.tracker = performanceTracker12;
        com.google.javascript.jscomp.Scope scope14 = compiler10.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler10.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler10.getState();
        compiler1.setState(intermediateState16);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(intermediateState16);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.rhino.InputId inputId8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler1.getInput(inputId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder1 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int2 = codeBuilder1.getLength();
        int int3 = codeBuilder1.getLength();
        java.lang.String str4 = codeBuilder1.toString();
        int int5 = codeBuilder1.getLength();
        java.lang.String str6 = codeBuilder1.toString();
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder1, 1, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable5 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput4 = compiler1.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        java.lang.Class<?> wildcardClass4 = errorManager3.getClass();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region8 = compiler1.getSourceRegion("", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.SourceFile sourceFile9 = null;
        com.google.javascript.jscomp.SourceFile sourceFile10 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler1.compile(sourceFile9, sourceFile10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        com.google.javascript.jscomp.SourceFile sourceFile6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = compiler1.parse(sourceFile6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode7 = compiler1.languageMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = performanceTracker3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Scope scope7 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = compiler1.getSourceLine("hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = compiler1.getSourceLine("hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = compiler1.isTypeCheckingEnabled();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = compiler1.getWarningCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.String str7 = compiler1.getSourceLine("", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.JSError jSError5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule6 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray7 = new com.google.javascript.jscomp.JSModule[] { jSModule6 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray5, jSModuleArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertNotNull(jSModuleArray7);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.String str7 = compiler1.getSourceLine("", 0);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        com.google.javascript.jscomp.JSModule jSModule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = compiler1.toSourceArray(jSModule6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region5 = compiler1.getSourceRegion("hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler1.getReverseAbstractInterpreter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(sourceMap8);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap8 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceFile sourceFile7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = compiler1.parse(sourceFile7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope8 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode9 = compiler1.languageMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(scope8);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler1.tracker = performanceTracker6;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler4.getErrorManager();
        compiler1.setErrorManager(errorManager6);
        com.google.javascript.rhino.InputId inputId8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler1.getInput(inputId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        java.lang.Class<?> wildcardClass9 = compiler1.getClass();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler1.tracker;
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker8);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        com.google.javascript.jscomp.JSError jSError6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = compiler1.getWarningCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = compiler1.getSourceLine("hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler10.tracker = performanceTracker12;
        com.google.javascript.jscomp.Scope scope14 = compiler10.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler10.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler10.getState();
        compiler1.setState(intermediateState16);
        com.google.javascript.jscomp.JSError jSError18 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(intermediateState16);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler12.getErrorManager();
        compiler1.setErrorManager(errorManager14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = compiler1.acceptEcmaScript5();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager14);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler4.getErrorManager();
        compiler1.setErrorManager(errorManager6);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile8 };
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile10 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray9, jSSourceFileArray11, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region5 = compiler1.getSourceRegion("hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler1.getReverseAbstractInterpreter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = compiler1.acceptEcmaScript5();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler10.tracker = performanceTracker12;
        com.google.javascript.jscomp.Scope scope14 = compiler10.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler10.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler10.getState();
        compiler1.setState(intermediateState16);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result18 = compiler1.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(intermediateState16);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
        com.google.javascript.jscomp.SourceFile sourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile9 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler1.compile(sourceFile8, jSSourceFileArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter6 = compiler1.getReverseAbstractInterpreter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler10.tracker = performanceTracker12;
        com.google.javascript.jscomp.Scope scope14 = compiler10.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler10.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler10.getState();
        compiler1.setState(intermediateState16);
        java.lang.Class<?> wildcardClass18 = compiler1.getClass();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(intermediateState16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray9 = new com.google.javascript.jscomp.JSModule[] { jSModule8 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler1.compile(jSSourceFile7, jSModuleArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile10 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray9, jSSourceFileArray11, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.JsAst jsAst4 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addNewScript(jsAst4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler1.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler1.getWarnings();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable14 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(jSErrorArray13);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = compiler1.acceptConstKeyword();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        double double7 = compiler1.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        com.google.javascript.jscomp.SourceFile sourceFile6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = compiler1.parse(sourceFile6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = compiler1.isIdeMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler1.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile14 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile14 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result17 = compiler1.compile(jSSourceFileArray13, jSSourceFileArray15, compilerOptions16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile13 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile13 };
        com.google.javascript.jscomp.JSSourceFile jSSourceFile15 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray16 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile15 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result18 = compiler1.compile(jSSourceFileArray14, jSSourceFileArray16, compilerOptions17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertNotNull(jSSourceFileArray16);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNull(performanceTracker6);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.PassConfig passConfig12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile6 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray7, jSModuleArray8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter13 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PassConfig passConfig14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter13);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSError jSError11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = compiler1.acceptEcmaScript5();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput8 = compiler1.newExternInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile5 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result8 = compiler1.compile(jSSourceFileArray4, jSSourceFileArray6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.String str7 = compiler1.getSourceLine("", 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = compiler1.hasErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region8 = compiler1.getSourceRegion("", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        java.lang.String str14 = compiler8.getAstDotGraph();
        java.lang.String str15 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope16 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler8.getSourceMap();
        compiler8.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler8.getErrorManager();
        compiler1.setErrorManager(errorManager19);
        com.google.javascript.jscomp.JSModule jSModule21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray22 = compiler1.toSourceArray(jSModule21);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        com.google.javascript.rhino.InputId inputId3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput4 = compiler1.getInput(inputId3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        java.lang.String str14 = compiler8.getAstDotGraph();
        java.lang.String str15 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope16 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler8.getSourceMap();
        compiler8.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler8.getErrorManager();
        compiler1.setErrorManager(errorManager19);
        boolean boolean21 = compiler1.isIdeMode();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode10 = compiler1.languageMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile6 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler1.compile(jSSourceFileArray7, jSSourceFileArray8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        compiler1.disableThreads();
        com.google.javascript.jscomp.JSError jSError10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel11 = compiler1.getErrorLevel(jSError10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray7 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler1.compile(jSSourceFile6, jSModuleArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(jSModuleArray7);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler1.toSourceArray(jSModule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceFile sourceFile7 = null;
        com.google.javascript.jscomp.SourceFile sourceFile8 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler1.compile(sourceFile7, sourceFile8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler1.toSourceArray(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray9 = new com.google.javascript.jscomp.JSModule[] { jSModule8 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler1.compile(jSSourceFile7, jSModuleArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = compiler1.toSource(jSModule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNull(sourceMap12);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node2 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = node2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node2 = compiler1.getRoot();
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler1.compile(jSSourceFile7, jSModuleArray8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler4.getErrorManager();
        compiler1.setErrorManager(errorManager6);
        java.lang.Class<?> wildcardClass8 = errorManager6.getClass();
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler1.tracker;
        com.google.javascript.jscomp.JsAst jsAst9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addNewScript(jsAst9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker8);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler12.getErrorManager();
        compiler1.setErrorManager(errorManager14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = compiler1.getSourceLine("", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager14);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray9 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler1.compile(jSSourceFileArray8, jSModuleArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode5 = compiler1.languageMode();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + languageMode5 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode5.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = compiler1.getErrorCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable7 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = compiler1.toSourceArray(jSModule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.JSError jSError9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel10 = compiler1.getErrorLevel(jSError9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
        com.google.javascript.jscomp.JsAst jsAst8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter13 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile15 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray16 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile15 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray14, jSSourceFileArray16, compilerOptions17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter13);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertNotNull(jSSourceFileArray16);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler1.tracker;
        com.google.javascript.jscomp.SourceFile sourceFile9 = null;
        com.google.javascript.jscomp.SourceFile sourceFile10 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler1.compile(sourceFile9, sourceFile10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker8);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap8 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        com.google.javascript.jscomp.JSError jSError6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSError jSError8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap7);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        com.google.javascript.jscomp.JsAst jsAst6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter13 = compiler1.getReverseAbstractInterpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable14 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter13);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        double double3 = compiler1.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = compiler1.hasErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder3 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int4 = codeBuilder3.getLength();
        java.lang.String str5 = codeBuilder3.toString();
        java.lang.String str6 = codeBuilder3.toString();
        java.lang.String str7 = codeBuilder3.toString();
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder3, 0, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = compiler1.getTypeRegistry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler1.getCodingConvention();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(sourceMap8);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray15 = new com.google.javascript.jscomp.JSModule[] { jSModule14 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray13, jSModuleArray15, compilerOptions16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertNotNull(jSModuleArray15);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler8.getState();
        compiler1.setState(intermediateState13);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler1.getState();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile16 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray17 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile16 };
        com.google.javascript.jscomp.JSModule jSModule18 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray19 = new com.google.javascript.jscomp.JSModule[] { jSModule18 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray17, jSModuleArray19, compilerOptions20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(jSSourceFileArray17);
        org.junit.Assert.assertNotNull(jSModuleArray19);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler1.getErrorManager();
        com.google.javascript.jscomp.SourceFile sourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler1.compile(sourceFile9, jSSourceFileArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = compiler1.toSource(jSModule7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray5, jSSourceFileArray6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.JsAst jsAst9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = compiler1.toSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile5 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray4, jSSourceFileArray6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSError jSError7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel8 = compiler1.getErrorLevel(jSError7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler8.getState();
        compiler1.setState(intermediateState13);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler1.getState();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile16 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray17 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result19 = compiler1.compile(jSSourceFile16, jSModuleArray17, compilerOptions18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(jSModuleArray17);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap7 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler1.getMessages();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node5 = compiler1.getRoot();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder6 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int7 = codeBuilder6.getLength();
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder6, 0, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = compiler1.getSourceLine("", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Scope scope7 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        java.lang.String str6 = compiler1.toSource();
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("", (int) (byte) -1);
        com.google.javascript.jscomp.PassConfig passConfig10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(region9);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region12 = compiler1.getSourceRegion("", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = scope4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        java.lang.String str14 = compiler8.getAstDotGraph();
        java.lang.String str15 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope16 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler8.getSourceMap();
        compiler8.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler8.getErrorManager();
        compiler1.setErrorManager(errorManager19);
        boolean boolean21 = compiler1.isIdeMode();
        com.google.javascript.jscomp.JsAst jsAst22 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler1.tracker = performanceTracker6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = compiler1.getTypeRegistry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(performanceTracker8);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        double double3 = compiler1.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getErrors();
        java.lang.Class<?> wildcardClass8 = compiler1.getClass();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node2 = compiler1.getRoot();
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = compiler1.isIdeMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.String str7 = compiler1.getSourceLine("", 0);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray10 = new com.google.javascript.jscomp.JSModule[] { jSModule9 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray8, jSModuleArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSModuleArray10);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = compiler1.toSource(jSModule4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.newExternInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = compiler1.toSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler1.tracker = performanceTracker6;
        com.google.javascript.jscomp.JSError jSError8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.JSError jSError12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler1.languageMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler1.toSourceArray(jSModule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler1.languageMode();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray9, jSSourceFileArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.String str7 = compiler1.getSourceLine("", 0);
        com.google.javascript.rhino.Node node8 = compiler1.getRoot();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile9 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray10, jSModuleArray11, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSModuleArray11);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler4.getErrorManager();
        compiler1.setErrorManager(errorManager6);
        com.google.javascript.jscomp.Scope scope8 = compiler1.getTopScope();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile9 };
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile11 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray10, jSSourceFileArray12, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler1.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler4.getErrorManager();
        compiler1.setErrorManager(errorManager6);
        com.google.javascript.jscomp.Scope scope8 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(scope8);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.SourceFile sourceFile8 = null;
        com.google.javascript.jscomp.SourceFile sourceFile9 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler1.compile(sourceFile8, sourceFile9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder7, (int) ' ', node9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.JSError jSError5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel6 = compiler1.getErrorLevel(jSError5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler1.getState();
        com.google.javascript.jscomp.SourceFile sourceFile7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = compiler1.parse(sourceFile7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(intermediateState6);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getMessages();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Scope scope7 = compiler1.getTopScope();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = compiler1.toSource(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = compiler1.getReverseAbstractInterpreter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode5 = compiler1.languageMode();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + languageMode5 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode5.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable7 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(intermediateState6);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = compiler1.toSourceArray(jSModule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler8.getState();
        compiler1.setState(intermediateState13);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable15 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(intermediateState13);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        java.lang.String str14 = compiler8.getAstDotGraph();
        java.lang.String str15 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope16 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler8.getSourceMap();
        compiler8.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler8.getErrorManager();
        compiler1.setErrorManager(errorManager19);
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler1.getErrorManager();
        com.google.javascript.jscomp.SourceFile sourceFile22 = null;
        com.google.javascript.jscomp.SourceFile sourceFile23 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result25 = compiler1.compile(sourceFile22, sourceFile23, compilerOptions24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertNotNull(errorManager21);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        com.google.javascript.jscomp.SourceFile sourceFile8 = null;
        com.google.javascript.jscomp.SourceFile sourceFile9 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler1.compile(sourceFile8, sourceFile9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler1.tracker = performanceTracker6;
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = compiler1.toSource(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler1.tracker = performanceTracker6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable9 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(performanceTracker8);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler1.getErrorManager();
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = compiler1.toSource(jSModule9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorManager8);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        java.lang.String str14 = compiler8.getAstDotGraph();
        java.lang.String str15 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope16 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler8.getSourceMap();
        compiler8.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler8.getErrorManager();
        compiler1.setErrorManager(errorManager19);
        boolean boolean21 = compiler1.isIdeMode();
        boolean boolean22 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.JSError jSError23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel24 = compiler1.getErrorLevel(jSError23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode5 = compiler1.languageMode();
        com.google.javascript.jscomp.JSError jSError6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + languageMode5 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode5.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        int int8 = compiler1.getWarningCount();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setErrorManager(errorManager6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: the error manager cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile9 };
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile11 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler1.compile(jSSourceFileArray10, jSSourceFileArray12, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler1.getCodingConvention();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        int int8 = compiler1.getWarningCount();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        java.lang.String str14 = compiler8.getAstDotGraph();
        java.lang.String str15 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope16 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler8.getSourceMap();
        compiler8.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler8.getErrorManager();
        compiler1.setErrorManager(errorManager19);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray22, jSModuleArray23, compilerOptions24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertNotNull(jSModuleArray23);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JsAst jsAst9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNull(sourceMap8);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.rhino.InputId inputId5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler1.getInput(inputId5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler1.tracker = performanceTracker9;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput12 = compiler1.newExternInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope13 = compiler1.getTopScope();
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray15 = compiler1.toSourceArray(jSModule14);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNull(scope13);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder6 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int7 = codeBuilder6.getLength();
        int int8 = codeBuilder6.getLength();
        java.lang.String str9 = codeBuilder6.toString();
        int int10 = codeBuilder6.getLength();
        int int11 = codeBuilder6.getLength();
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder6, (int) (short) -1, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        double double3 = compiler1.getProgress();
        com.google.javascript.jscomp.SourceFile sourceFile4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result7 = compiler1.compile(sourceFile4, sourceFile5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler1.languageMode();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler10.getErrorManager();
        boolean boolean13 = compiler10.acceptConstKeyword();
        boolean boolean14 = compiler10.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = compiler10.getTypeRegistry();
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        compiler17.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler17.tracker = performanceTracker19;
        com.google.javascript.jscomp.Scope scope21 = compiler17.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler17.getSourceMap();
        java.lang.String str23 = compiler17.getAstDotGraph();
        java.lang.String str24 = compiler17.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope25 = compiler17.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler17.getSourceMap();
        compiler17.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler17.getErrorManager();
        compiler10.setErrorManager(errorManager28);
        compiler1.setErrorManager(errorManager28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry15);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(sourceMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(scope25);
        org.junit.Assert.assertNull(sourceMap26);
        org.junit.Assert.assertNotNull(errorManager28);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        java.lang.String str14 = compiler8.getAstDotGraph();
        java.lang.String str15 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope16 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler8.getSourceMap();
        compiler8.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler8.getErrorManager();
        compiler1.setErrorManager(errorManager19);
        boolean boolean21 = compiler1.isIdeMode();
        com.google.javascript.jscomp.JSError jSError22 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler1.languageMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        java.lang.String str14 = compiler8.getAstDotGraph();
        java.lang.String str15 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope16 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler8.getSourceMap();
        compiler8.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler8.getErrorManager();
        compiler1.setErrorManager(errorManager19);
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler1.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput23 = compiler1.newExternInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertNotNull(errorManager21);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.JsAst jsAst5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = compiler1.getSourceLine("hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(performanceTracker7);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        compiler1.disableThreads();
        java.io.PrintStream printStream10 = null;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(printStream10);
        compiler11.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler11.tracker = performanceTracker13;
        com.google.javascript.jscomp.Scope scope15 = compiler11.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap16 = compiler11.getSourceMap();
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        compiler18.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = null;
        compiler18.tracker = performanceTracker20;
        com.google.javascript.jscomp.Scope scope22 = compiler18.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState23 = compiler18.getState();
        compiler11.setState(intermediateState23);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState25 = compiler11.getState();
        compiler1.setState(intermediateState25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = compiler1.acceptConstKeyword();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNull(sourceMap16);
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertNotNull(intermediateState23);
        org.junit.Assert.assertNotNull(intermediateState25);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = compiler1.toSourceArray(jSModule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray5 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = compiler1.acceptConstKeyword();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        compiler1.disableThreads();
        java.io.PrintStream printStream10 = null;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(printStream10);
        compiler11.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler11.tracker = performanceTracker13;
        com.google.javascript.jscomp.Scope scope15 = compiler11.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap16 = compiler11.getSourceMap();
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        compiler18.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = null;
        compiler18.tracker = performanceTracker20;
        com.google.javascript.jscomp.Scope scope22 = compiler18.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState23 = compiler18.getState();
        compiler11.setState(intermediateState23);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState25 = compiler11.getState();
        compiler1.setState(intermediateState25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = compiler1.acceptEcmaScript5();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNull(sourceMap16);
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertNotNull(intermediateState23);
        org.junit.Assert.assertNotNull(intermediateState25);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        // The following exception was thrown during execution in test generation
        try {
            compiler7.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope13 = compiler1.getTopScope();
        com.google.javascript.jscomp.JSError[] jSErrorArray14 = compiler1.getErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNotNull(jSErrorArray14);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = compiler1.toSource(jSModule5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        compiler5.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler5.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler5.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler5.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler5.getErrorManager();
        compiler1.setErrorManager(errorManager10);
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = compiler1.isTypeCheckingEnabled();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNull(sourceMap12);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        com.google.javascript.jscomp.SourceFile sourceFile11 = null;
        com.google.javascript.jscomp.SourceFile sourceFile12 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler1.compile(sourceFile11, sourceFile12, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter13 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(errorManager14);
        compiler15.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention codingConvention17 = compiler15.getCodingConvention();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter13);
        org.junit.Assert.assertNotNull(errorManager14);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node2 = compiler1.getRoot();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile5 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray4, jSSourceFileArray6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.SourceFile sourceFile8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = compiler1.parse(sourceFile8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray10 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler1.compile(jSSourceFile9, jSModuleArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNotNull(jSModuleArray10);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler1.tracker = performanceTracker6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(performanceTracker8);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter11 = compiler1.getReverseAbstractInterpreter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        boolean boolean8 = compiler1.hasErrors();
        com.google.javascript.jscomp.Result result9 = compiler1.getResult();
        com.google.javascript.jscomp.SourceFile sourceFile10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = compiler1.parse(sourceFile10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(result9);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        java.lang.String str14 = compiler8.getAstDotGraph();
        java.lang.String str15 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope16 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler8.getSourceMap();
        compiler8.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler8.getErrorManager();
        compiler1.setErrorManager(errorManager19);
        boolean boolean21 = compiler1.isIdeMode();
        boolean boolean22 = compiler1.hasErrors();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler8.getState();
        compiler1.setState(intermediateState13);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(intermediateState13);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        boolean boolean5 = compiler1.acceptConstKeyword();
        java.lang.String str6 = compiler1.toSource();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray7, jSModuleArray8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSModuleArray8);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        double double3 = compiler1.getProgress();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result7 = compiler1.compile(jSSourceFileArray4, jSSourceFileArray5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        java.lang.String str6 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap7 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable7 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler1.languageMode();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler10.getErrorManager();
        boolean boolean13 = compiler10.acceptConstKeyword();
        boolean boolean14 = compiler10.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = compiler10.getTypeRegistry();
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        compiler17.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler17.tracker = performanceTracker19;
        com.google.javascript.jscomp.Scope scope21 = compiler17.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler17.getSourceMap();
        java.lang.String str23 = compiler17.getAstDotGraph();
        java.lang.String str24 = compiler17.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope25 = compiler17.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler17.getSourceMap();
        compiler17.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler17.getErrorManager();
        compiler10.setErrorManager(errorManager28);
        compiler1.setErrorManager(errorManager28);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry15);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(sourceMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(scope25);
        org.junit.Assert.assertNull(sourceMap26);
        org.junit.Assert.assertNotNull(errorManager28);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        boolean boolean8 = compiler1.hasErrors();
        com.google.javascript.jscomp.Result result9 = compiler1.getResult();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder10 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int11 = codeBuilder10.getLength();
        int int12 = codeBuilder10.getLength();
        java.lang.String str13 = codeBuilder10.toString();
        java.lang.String str14 = codeBuilder10.toString();
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder10, (int) (short) -1, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        double double9 = compiler1.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput11 = compiler1.newExternInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler1.getCodingConvention();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNull(sourceMap12);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope13 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray14 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNull(scope13);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Scope scope7 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSError jSError6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel7 = compiler1.getErrorLevel(jSError6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        compiler1.disableThreads();
        java.io.PrintStream printStream10 = null;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(printStream10);
        compiler11.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler11.tracker = performanceTracker13;
        com.google.javascript.jscomp.Scope scope15 = compiler11.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap16 = compiler11.getSourceMap();
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        compiler18.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = null;
        compiler18.tracker = performanceTracker20;
        com.google.javascript.jscomp.Scope scope22 = compiler18.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState23 = compiler18.getState();
        compiler11.setState(intermediateState23);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState25 = compiler11.getState();
        compiler1.setState(intermediateState25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap27 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNull(sourceMap16);
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertNotNull(intermediateState23);
        org.junit.Assert.assertNotNull(intermediateState25);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler1.getSourceMap();
        com.google.javascript.rhino.InputId inputId13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput14 = compiler1.getInput(inputId13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNull(sourceMap12);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Scope scope13 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertNull(scope13);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        java.lang.String str14 = compiler8.getAstDotGraph();
        java.lang.String str15 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope16 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler8.getSourceMap();
        compiler8.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler8.getErrorManager();
        compiler1.setErrorManager(errorManager19);
        boolean boolean21 = compiler1.isIdeMode();
        boolean boolean22 = compiler1.acceptConstKeyword();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region25 = compiler1.getSourceRegion("hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray2 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile3 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile3 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result6 = compiler0.compile(jSSourceFileArray2, jSSourceFileArray4, compilerOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(jSSourceFileArray2);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode9 = compiler1.languageMode();
        com.google.javascript.rhino.Node node10 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = compiler1.getSourceLine("hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
        org.junit.Assert.assertTrue("'" + languageMode9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode9.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = compiler1.getErrorCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        java.lang.String str14 = compiler8.getAstDotGraph();
        java.lang.String str15 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope16 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler8.getSourceMap();
        compiler8.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler8.getErrorManager();
        compiler1.setErrorManager(errorManager19);
        boolean boolean21 = compiler1.isIdeMode();
        boolean boolean22 = compiler1.acceptConstKeyword();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getErrors();
        com.google.javascript.jscomp.JsAst jsAst8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addNewScript(jsAst8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode9 = compiler1.languageMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker8);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node5 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getErrors();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.isIdeMode();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray7 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler1.compile(jSSourceFile6, jSModuleArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSModuleArray7);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler1.getErrorManager();
        java.lang.String str15 = compiler1.getSourceLine("hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = compiler1.getSourceLine("hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler12.getErrorManager();
        compiler1.setErrorManager(errorManager14);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(errorManager14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = compiler16.hasErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager14);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node2 = compiler1.getRoot();
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = compiler1.toSourceArray(jSModule3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope8 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = compiler1.isIdeMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(scope8);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler1.getState();
        com.google.javascript.jscomp.Scope scope7 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceFile sourceFile8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = compiler1.parse(sourceFile8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        java.lang.String str14 = compiler8.getAstDotGraph();
        java.lang.String str15 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope16 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler8.getSourceMap();
        compiler8.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler8.getErrorManager();
        compiler1.setErrorManager(errorManager19);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState21 = compiler1.getState();
        int int22 = compiler1.getWarningCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = compiler1.getSourceLine("hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertNotNull(intermediateState21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        compiler1.disableThreads();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile9 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray10, jSSourceFileArray11, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.rhino.InputId inputId5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler1.getInput(inputId5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter13 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler1.getErrorManager();
        boolean boolean15 = compiler1.acceptEcmaScript5();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter13);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        java.lang.String str6 = compiler1.toSource();
        boolean boolean7 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler1.toSourceArray(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = compiler1.isIdeMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        java.lang.String str14 = compiler8.getAstDotGraph();
        java.lang.String str15 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope16 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler8.getSourceMap();
        compiler8.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler8.getErrorManager();
        compiler1.setErrorManager(errorManager19);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        boolean boolean7 = compiler1.acceptConstKeyword();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.JSError jSError5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel6 = compiler1.getErrorLevel(jSError5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        compiler5.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler5.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler5.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler5.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler5.getErrorManager();
        compiler1.setErrorManager(errorManager10);
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler1.getSourceMap();
        com.google.javascript.rhino.Node node13 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter14 = compiler1.getReverseAbstractInterpreter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile7 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler1.compile(jSSourceFileArray8, jSSourceFileArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getErrors();
        double double8 = compiler1.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PassConfig passConfig3 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = compiler1.acceptEcmaScript5();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler1.languageMode();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        java.lang.String str14 = compiler8.getAstDotGraph();
        java.lang.String str15 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope16 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler8.getSourceMap();
        compiler8.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler8.getErrorManager();
        compiler1.setErrorManager(errorManager19);
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = compiler1.getSourceLine("hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        compiler5.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler5.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler5.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler5.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler5.getErrorManager();
        compiler1.setErrorManager(errorManager10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = compiler1.acceptConstKeyword();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertNotNull(errorManager10);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap11 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler1.languageMode();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler10.getErrorManager();
        boolean boolean13 = compiler10.acceptConstKeyword();
        boolean boolean14 = compiler10.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = compiler10.getTypeRegistry();
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        compiler17.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler17.tracker = performanceTracker19;
        com.google.javascript.jscomp.Scope scope21 = compiler17.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler17.getSourceMap();
        java.lang.String str23 = compiler17.getAstDotGraph();
        java.lang.String str24 = compiler17.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope25 = compiler17.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler17.getSourceMap();
        compiler17.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler17.getErrorManager();
        compiler10.setErrorManager(errorManager28);
        compiler1.setErrorManager(errorManager28);
        java.lang.String str31 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry15);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(sourceMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(scope25);
        org.junit.Assert.assertNull(sourceMap26);
        org.junit.Assert.assertNotNull(errorManager28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = compiler1.isTypeCheckingEnabled();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        boolean boolean8 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError jSError9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel10 = compiler1.getErrorLevel(jSError9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node2 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler1.toSourceArray(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        compiler5.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler5.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler5.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler5.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler5.getErrorManager();
        compiler1.setErrorManager(errorManager10);
        com.google.javascript.jscomp.SourceFile sourceFile12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = compiler1.parse(sourceFile12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertNotNull(errorManager10);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = compiler1.getErrorCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(sourceMap8);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        java.lang.String str6 = compiler1.toSource();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable7 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray9 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray8, jSModuleArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PassConfig passConfig9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = compiler1.toSourceArray(jSModule3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = compiler1.isTypeCheckingEnabled();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap6);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Scope scope13 = compiler1.getTopScope();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray15 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result17 = compiler1.compile(jSSourceFileArray14, jSModuleArray15, compilerOptions16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertNotNull(jSModuleArray15);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        boolean boolean8 = compiler1.isTypeCheckingEnabled();
        boolean boolean9 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile10 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSModuleArray12);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.JsAst jsAst8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler1.compile(jSSourceFile11, jSModuleArray12, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(jSModuleArray12);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        compiler1.disableThreads();
        int int9 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] { jSModule11 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler1.compile(jSSourceFile10, jSModuleArray12, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(jSModuleArray12);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSError jSError6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel7 = compiler1.getErrorLevel(jSError6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        compiler1.disableThreads();
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler1.toSourceArray(jSModule7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        boolean boolean8 = compiler1.isTypeCheckingEnabled();
        boolean boolean9 = compiler1.isTypeCheckingEnabled();
        java.lang.String str10 = compiler1.toSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = compiler1.getSourceLine("hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler4.getErrorManager();
        compiler1.setErrorManager(errorManager6);
        com.google.javascript.jscomp.Scope scope8 = compiler1.getTopScope();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getWarnings();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = compiler1.isIdeMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getErrors();
        com.google.javascript.rhino.InputId inputId8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler1.getInput(inputId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler1.tracker = performanceTracker6;
        com.google.javascript.jscomp.JsAst jsAst8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Scope scope7 = compiler1.getTopScope();
        com.google.javascript.rhino.InputId inputId8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler1.getInput(inputId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler4.getErrorManager();
        compiler1.setErrorManager(errorManager6);
        com.google.javascript.jscomp.Scope scope8 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceFile sourceFile9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = compiler1.parse(sourceFile9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(scope8);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        int int5 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray7 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler1.compile(jSSourceFileArray6, jSModuleArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertNotNull(jSModuleArray7);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceFile sourceFile7 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile8 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler1.compile(sourceFile7, jSSourceFileArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JsAst jsAst7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addNewScript(jsAst7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = compiler1.acceptConstKeyword();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        compiler5.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler5.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler5.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler5.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler5.getErrorManager();
        compiler1.setErrorManager(errorManager10);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertNotNull(errorManager10);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler1.tracker;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.SourceFile sourceFile10 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile11 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler1.compile(sourceFile10, jSSourceFileArray12, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler1.languageMode();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler10.getErrorManager();
        boolean boolean13 = compiler10.acceptConstKeyword();
        boolean boolean14 = compiler10.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = compiler10.getTypeRegistry();
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        compiler17.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler17.tracker = performanceTracker19;
        com.google.javascript.jscomp.Scope scope21 = compiler17.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler17.getSourceMap();
        java.lang.String str23 = compiler17.getAstDotGraph();
        java.lang.String str24 = compiler17.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope25 = compiler17.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler17.getSourceMap();
        compiler17.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler17.getErrorManager();
        compiler10.setErrorManager(errorManager28);
        compiler1.setErrorManager(errorManager28);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState31 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry15);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(sourceMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(scope25);
        org.junit.Assert.assertNull(sourceMap26);
        org.junit.Assert.assertNotNull(errorManager28);
        org.junit.Assert.assertNotNull(intermediateState31);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.Node node6 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = compiler1.getSourceLine("hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler1.getState();
        com.google.javascript.jscomp.Scope scope7 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap8 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        compiler5.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler5.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler5.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler5.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler5.getErrorManager();
        compiler1.setErrorManager(errorManager10);
        com.google.javascript.jscomp.Region region14 = compiler1.getSourceRegion("hi!", (int) (byte) 0);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder15 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int16 = codeBuilder15.getLength();
        int int17 = codeBuilder15.getLength();
        java.lang.String str18 = codeBuilder15.toString();
        int int19 = codeBuilder15.getLength();
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder15, (int) (byte) 10, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler12.getErrorManager();
        compiler1.setErrorManager(errorManager14);
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(intermediateState17);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        compiler5.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler5.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler5.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler5.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler5.getErrorManager();
        compiler1.setErrorManager(errorManager10);
        com.google.javascript.jscomp.Result result12 = compiler1.getResult();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNotNull(result12);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray8);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        java.lang.String str14 = compiler8.getAstDotGraph();
        java.lang.String str15 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope16 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler8.getSourceMap();
        compiler8.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler8.getErrorManager();
        compiler1.setErrorManager(errorManager19);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSError jSError22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel23 = compiler1.getErrorLevel(jSError22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("hi!", (int) (byte) -1);
        boolean boolean10 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile11 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray12, jSSourceFileArray13, compilerOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode9 = compiler1.languageMode();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] { jSModule11 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray10, jSModuleArray12, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
        org.junit.Assert.assertTrue("'" + languageMode9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode9.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSModuleArray12);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node2 = compiler1.getRoot();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.SourceFile sourceFile4 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result7 = compiler1.compile(sourceFile4, jSSourceFileArray5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        java.lang.String str14 = compiler8.getAstDotGraph();
        java.lang.String str15 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope16 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler8.getSourceMap();
        compiler8.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler8.getErrorManager();
        compiler1.setErrorManager(errorManager19);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState21 = compiler1.getState();
        double double22 = compiler1.getProgress();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertNotNull(intermediateState21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.io.PrintStream printStream8 = null;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream8);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler9.getState();
        compiler1.setState(intermediateState10);
        com.google.javascript.jscomp.PassConfig passConfig12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(intermediateState10);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSError jSError7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler8.getState();
        compiler1.setState(intermediateState13);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(intermediateState13);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.SourceFile sourceFile2 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray3 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result5 = compiler0.compile(sourceFile2, jSSourceFileArray3, compilerOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSSourceFileArray3);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNull(sourceMap6);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler1.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        boolean boolean8 = compiler1.isTypeCheckingEnabled();
        boolean boolean9 = compiler1.isTypeCheckingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        java.lang.String str14 = compiler8.getAstDotGraph();
        java.lang.String str15 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope16 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler8.getSourceMap();
        compiler8.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler8.getErrorManager();
        compiler1.setErrorManager(errorManager19);
        com.google.javascript.rhino.InputId inputId21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput22 = compiler1.getInput(inputId21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap6 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.SourceFile sourceFile8 = null;
        com.google.javascript.jscomp.SourceFile sourceFile9 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler1.compile(sourceFile8, sourceFile9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = compiler1.isIdeMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler1.tracker = performanceTracker9;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler1.tracker = performanceTracker11;
        com.google.javascript.rhino.InputId inputId13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput14 = compiler1.getInput(inputId13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.lang.String str8 = compiler1.getAstDotGraph();
        compiler1.disableThreads();
        java.io.PrintStream printStream10 = null;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(printStream10);
        compiler11.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler11.tracker = performanceTracker13;
        com.google.javascript.jscomp.Scope scope15 = compiler11.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap16 = compiler11.getSourceMap();
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        compiler18.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = null;
        compiler18.tracker = performanceTracker20;
        com.google.javascript.jscomp.Scope scope22 = compiler18.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState23 = compiler18.getState();
        compiler11.setState(intermediateState23);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState25 = compiler11.getState();
        compiler1.setState(intermediateState25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = compiler1.toSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNull(sourceMap16);
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertNotNull(intermediateState23);
        org.junit.Assert.assertNotNull(intermediateState25);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler12.getErrorManager();
        compiler1.setErrorManager(errorManager14);
        com.google.javascript.jscomp.JSModule jSModule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray17 = compiler1.toSourceArray(jSModule16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager14);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        compiler5.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler5.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler5.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler5.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler5.getErrorManager();
        compiler1.setErrorManager(errorManager10);
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = compiler1.getTypeRegistry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNull(sourceMap12);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.rhino.Node node9 = compiler1.getRoot();
        com.google.javascript.rhino.Node node10 = compiler1.getRoot();
        com.google.javascript.jscomp.JSError jSError11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.JSError jSError6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker5);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler1.getState();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(intermediateState5);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        double double9 = compiler1.getProgress();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = compiler1.toSource(jSModule10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler1.languageMode();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        double double8 = compiler1.getProgress();
        com.google.javascript.jscomp.SourceFile sourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler1.compile(sourceFile9, jSSourceFileArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter6 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = compiler1.toSource(jSModule7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter6);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        compiler5.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler5.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler5.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler5.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler5.getErrorManager();
        compiler1.setErrorManager(errorManager10);
        com.google.javascript.jscomp.Region region14 = compiler1.getSourceRegion("hi!", (int) (byte) 0);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile15 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray16 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result18 = compiler1.compile(jSSourceFile15, jSModuleArray16, compilerOptions17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertNotNull(jSModuleArray16);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        compiler1.disableThreads();
        int int9 = compiler1.getWarningCount();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(sourceMap8);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler1.getState();
        com.google.javascript.jscomp.SourceFile sourceFile7 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile8 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler1.compile(sourceFile7, jSSourceFileArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap7);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        java.lang.String str14 = compiler8.getAstDotGraph();
        java.lang.String str15 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope16 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler8.getSourceMap();
        compiler8.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler8.getErrorManager();
        compiler1.setErrorManager(errorManager19);
        boolean boolean21 = compiler1.isIdeMode();
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        compiler23.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = null;
        compiler23.tracker = performanceTracker25;
        com.google.javascript.jscomp.Scope scope27 = compiler23.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap28 = compiler23.getSourceMap();
        java.lang.String str29 = compiler23.getAstDotGraph();
        java.lang.String str30 = compiler23.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope31 = compiler23.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap32 = compiler23.getSourceMap();
        java.io.PrintStream printStream33 = null;
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler(printStream33);
        compiler34.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager36 = compiler34.getErrorManager();
        compiler23.setErrorManager(errorManager36);
        compiler1.setErrorManager(errorManager36);
        com.google.javascript.jscomp.Scope scope39 = compiler1.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager40 = compiler1.getErrorManager();
        com.google.javascript.rhino.InputId inputId41 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput42 = compiler1.getInput(inputId41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(scope27);
        org.junit.Assert.assertNull(sourceMap28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(scope31);
        org.junit.Assert.assertNull(sourceMap32);
        org.junit.Assert.assertNotNull(errorManager36);
        org.junit.Assert.assertNull(scope39);
        org.junit.Assert.assertNotNull(errorManager40);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler1.tracker = performanceTracker6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(performanceTracker8);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JsAst jsAst5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addNewScript(jsAst5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode9 = compiler1.languageMode();
        com.google.javascript.rhino.Node node10 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
        org.junit.Assert.assertTrue("'" + languageMode9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode9.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler1.languageMode();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler10.getErrorManager();
        boolean boolean13 = compiler10.acceptConstKeyword();
        boolean boolean14 = compiler10.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = compiler10.getTypeRegistry();
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        compiler17.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler17.tracker = performanceTracker19;
        com.google.javascript.jscomp.Scope scope21 = compiler17.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler17.getSourceMap();
        java.lang.String str23 = compiler17.getAstDotGraph();
        java.lang.String str24 = compiler17.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope25 = compiler17.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler17.getSourceMap();
        compiler17.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler17.getErrorManager();
        compiler10.setErrorManager(errorManager28);
        compiler1.setErrorManager(errorManager28);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState31 = compiler1.getState();
        com.google.javascript.jscomp.Region region34 = compiler1.getSourceRegion("", (-1));
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry15);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(sourceMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(scope25);
        org.junit.Assert.assertNull(sourceMap26);
        org.junit.Assert.assertNotNull(errorManager28);
        org.junit.Assert.assertNotNull(intermediateState31);
        org.junit.Assert.assertNull(region34);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSError jSError9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel10 = compiler1.getErrorLevel(jSError9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(sourceMap8);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler1.getState();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile7 };
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray10 = new com.google.javascript.jscomp.JSModule[] { jSModule9 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler1.compile(jSSourceFileArray8, jSModuleArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSModuleArray10);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler4.getErrorManager();
        compiler1.setErrorManager(errorManager6);
        com.google.javascript.jscomp.Scope scope8 = compiler1.getTopScope();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getWarnings();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setState(intermediateState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler1.getSourceMap();
        com.google.javascript.jscomp.SourceFile sourceFile13 = null;
        com.google.javascript.jscomp.SourceFile sourceFile14 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result16 = compiler1.compile(sourceFile13, sourceFile14, compilerOptions15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNull(sourceMap12);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceFile sourceFile7 = null;
        com.google.javascript.jscomp.SourceFile sourceFile8 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler1.compile(sourceFile7, sourceFile8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler1.getTypeRegistry();
        int int8 = compiler1.getWarningCount();
        com.google.javascript.rhino.Node node9 = compiler1.getRoot();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile10 };
        com.google.javascript.jscomp.JSSourceFile jSSourceFile12 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile12 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray11, jSSourceFileArray13, compilerOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler1.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler1.getWarnings();
        int int14 = compiler1.getWarningCount();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = compiler1.toSource(jSModule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler1.languageMode();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler10.getErrorManager();
        boolean boolean13 = compiler10.acceptConstKeyword();
        boolean boolean14 = compiler10.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = compiler10.getTypeRegistry();
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        compiler17.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler17.tracker = performanceTracker19;
        com.google.javascript.jscomp.Scope scope21 = compiler17.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler17.getSourceMap();
        java.lang.String str23 = compiler17.getAstDotGraph();
        java.lang.String str24 = compiler17.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope25 = compiler17.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler17.getSourceMap();
        compiler17.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler17.getErrorManager();
        compiler10.setErrorManager(errorManager28);
        compiler1.setErrorManager(errorManager28);
        java.lang.String str31 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = compiler1.getSourceLine("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry15);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(sourceMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(scope25);
        org.junit.Assert.assertNull(sourceMap26);
        org.junit.Assert.assertNotNull(errorManager28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getErrors();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder9 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int10 = codeBuilder9.getLength();
        int int11 = codeBuilder9.getLength();
        int int12 = codeBuilder9.getLength();
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder9, (int) (byte) 1, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = compiler1.acceptConstKeyword();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        boolean boolean6 = compiler1.isIdeMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getMessages();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder8 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int9 = codeBuilder8.getLength();
        int int10 = codeBuilder8.getLength();
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder8, (int) (byte) 1, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        double double9 = compiler1.getProgress();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode10 = compiler1.languageMode();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray13 = new com.google.javascript.jscomp.JSModule[] { jSModule12 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray11, jSModuleArray13, compilerOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + languageMode10 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode10.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSModuleArray13);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler1.getTypeRegistry();
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JsAst jsAst9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = compiler1.hasErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler1.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler1.getWarnings();
        int int14 = compiler1.getWarningCount();
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler1.getSourceMap();
        com.google.javascript.jscomp.SourceFile sourceFile16 = null;
        com.google.javascript.jscomp.SourceFile sourceFile17 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result19 = compiler1.compile(sourceFile16, sourceFile17, compilerOptions18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(sourceMap15);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler8.getState();
        compiler1.setState(intermediateState13);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter15 = compiler1.getReverseAbstractInterpreter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(intermediateState13);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler1.tracker;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile10 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray11, jSSourceFileArray12, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(performanceTracker9);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node2 = compiler1.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler1.getErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(intermediateState3);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler1.languageMode();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler10.getErrorManager();
        boolean boolean13 = compiler10.acceptConstKeyword();
        boolean boolean14 = compiler10.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = compiler10.getTypeRegistry();
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        compiler17.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler17.tracker = performanceTracker19;
        com.google.javascript.jscomp.Scope scope21 = compiler17.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler17.getSourceMap();
        java.lang.String str23 = compiler17.getAstDotGraph();
        java.lang.String str24 = compiler17.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope25 = compiler17.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler17.getSourceMap();
        compiler17.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler17.getErrorManager();
        compiler10.setErrorManager(errorManager28);
        compiler1.setErrorManager(errorManager28);
        java.lang.String str31 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry15);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(sourceMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(scope25);
        org.junit.Assert.assertNull(sourceMap26);
        org.junit.Assert.assertNotNull(errorManager28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        int int8 = compiler1.getWarningCount();
        java.lang.Class<?> wildcardClass9 = compiler1.getClass();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node2 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = compiler1.getWarningCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
    }
}

