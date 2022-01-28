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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile10 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler1.compile(jSSourceFileArray11, jSSourceFileArray12, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
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
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile16 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray17 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile16 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result19 = compiler1.compile(jSSourceFileArray15, jSSourceFileArray17, compilerOptions18);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
        org.junit.Assert.assertNotNull(jSSourceFileArray17);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Scope scope8 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNull(scope8);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        int int6 = compiler1.getErrorCount();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler8.getState();
        compiler1.setState(intermediateState14);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertNotNull(intermediateState14);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        java.lang.String str12 = compiler1.getSourceLine("", 0);
        com.google.javascript.jscomp.JSError jSError13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel14 = compiler1.getErrorLevel(jSError13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
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
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.String str7 = compiler1.getSourceLine("", 0);
        java.io.PrintStream printStream8 = null;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream8);
        compiler9.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler9.tracker;
        java.io.PrintStream printStream12 = null;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(printStream12);
        compiler13.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler13.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler13.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter17 = compiler13.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler13.getErrorManager();
        compiler9.setErrorManager(errorManager18);
        compiler1.setErrorManager(errorManager18);
        java.lang.Class<?> wildcardClass21 = compiler1.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(performanceTracker11);
        org.junit.Assert.assertNull(performanceTracker15);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter17);
        org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler1.getState();
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
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray17 = compiler1.toSourceArray();
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
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(errorManager16);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler4.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler4.getErrorManager();
        compiler1.setErrorManager(errorManager7);
        com.google.javascript.jscomp.JSError jSError9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel10 = compiler1.getErrorLevel(jSError9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(errorManager7);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        boolean boolean5 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.SourceFile sourceFile7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = compiler1.parse(sourceFile7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput8 = compiler1.newExternInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler1.getCodingConvention();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(performanceTracker7);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
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
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(sourceMap7);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        java.lang.String str12 = compiler1.toSource();
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler1.getWarnings();
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
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jSErrorArray13);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler1.compile(jSSourceFileArray8, jSSourceFileArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule6 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray7 = new com.google.javascript.jscomp.JSModule[] { jSModule6 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler1.compile(jSSourceFileArray5, jSModuleArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertNotNull(jSModuleArray7);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertNotNull(intermediateState21);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSError jSError9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel10 = compiler1.getErrorLevel(jSError9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNull(sourceMap8);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap10 = compiler1.getInputsById();
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
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node5 = compiler1.getRoot();
        com.google.javascript.jscomp.JsAst jsAst6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.jscomp.JsAst jsAst7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addNewScript(jsAst7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node2 = compiler1.getRoot();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler1.getWarnings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(scope4);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = compiler1.getSourceLine("", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        java.lang.String str12 = compiler1.toSource();
        java.lang.Class<?> wildcardClass13 = compiler1.getClass();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler1.getState();
        compiler1.disableThreads();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(intermediateState6);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.JSModule jSModule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = compiler1.toSourceArray(jSModule6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(performanceTracker5);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        compiler1.reportCodeChange();
        compiler1.disableThreads();
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
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
            compiler1.addNewScript(jsAst9);
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
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        boolean boolean15 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.JSModule jSModule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = compiler1.toSource(jSModule16);
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
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter13);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        compiler1.disableThreads();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.rhino.InputId inputId9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler1.getInput(inputId9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.rhino.Node node8 = compiler1.getRoot();
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
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
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
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler1.getMessages();
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState24 = compiler23.getState();
        java.io.PrintStream printStream25 = null;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(printStream25);
        compiler26.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler26.getErrorManager();
        compiler23.setErrorManager(errorManager28);
        compiler1.setErrorManager(errorManager28);
        boolean boolean31 = compiler1.acceptEcmaScript5();
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
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertNotNull(intermediateState24);
        org.junit.Assert.assertNotNull(errorManager28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getMessages();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = compiler1.tracker;
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNull(performanceTracker10);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.rhino.InputId inputId7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput8 = compiler1.getInput(inputId7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        int int5 = compiler1.getWarningCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable6 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
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
            com.google.javascript.jscomp.Region region34 = compiler1.getSourceRegion("", (int) (short) 10);
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
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
        com.google.javascript.jscomp.Result result15 = compiler1.getResult();
        com.google.javascript.jscomp.JsAst jsAst16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst16);
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
        org.junit.Assert.assertNotNull(result15);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler1.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker8);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + languageMode10 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode10.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceFile sourceFile10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = compiler1.parse(sourceFile10);
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
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler1.getTypeRegistry();
        int int8 = compiler1.getWarningCount();
        boolean boolean9 = compiler1.hasErrors();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
            com.google.javascript.jscomp.Region region10 = compiler1.getSourceRegion("hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler8.getErrorManager();
        boolean boolean11 = compiler8.acceptConstKeyword();
        boolean boolean12 = compiler8.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = compiler8.getTypeRegistry();
        java.io.PrintStream printStream14 = null;
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(printStream14);
        compiler15.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = null;
        compiler15.tracker = performanceTracker17;
        com.google.javascript.jscomp.Scope scope19 = compiler15.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap20 = compiler15.getSourceMap();
        java.lang.String str21 = compiler15.getAstDotGraph();
        java.lang.String str22 = compiler15.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope23 = compiler15.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap24 = compiler15.getSourceMap();
        compiler15.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler15.getErrorManager();
        compiler8.setErrorManager(errorManager26);
        compiler1.setErrorManager(errorManager26);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry13);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNull(sourceMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(scope23);
        org.junit.Assert.assertNull(sourceMap24);
        org.junit.Assert.assertNotNull(errorManager26);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler1.getState();
        com.google.javascript.jscomp.JsAst jsAst9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addNewScript(jsAst9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(intermediateState8);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.ErrorManager errorManager23 = compiler1.getErrorManager();
        java.lang.Class<?> wildcardClass24 = errorManager23.getClass();
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
        org.junit.Assert.assertNotNull(jSTypeRegistry22);
        org.junit.Assert.assertNotNull(errorManager23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.String str7 = compiler1.getSourceLine("", 0);
        java.io.PrintStream printStream8 = null;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream8);
        compiler9.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler9.tracker;
        java.io.PrintStream printStream12 = null;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(printStream12);
        compiler13.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler13.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler13.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter17 = compiler13.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler13.getErrorManager();
        compiler9.setErrorManager(errorManager18);
        compiler1.setErrorManager(errorManager18);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder21 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int22 = codeBuilder21.getLength();
        int int23 = codeBuilder21.getLength();
        java.lang.String str24 = codeBuilder21.toString();
        java.lang.String str25 = codeBuilder21.toString();
        int int26 = codeBuilder21.getLength();
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder21, (int) (byte) -1, node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(performanceTracker11);
        org.junit.Assert.assertNull(performanceTracker15);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter17);
        org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope8 = compiler1.getTopScope();
        com.google.javascript.jscomp.JsAst jsAst9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst9);
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
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.Node node6 = compiler1.getRoot();
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
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        double double3 = compiler1.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = compiler1.getSourceLine("hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler8.getErrorManager();
        boolean boolean11 = compiler8.acceptConstKeyword();
        boolean boolean12 = compiler8.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = compiler8.getTypeRegistry();
        java.io.PrintStream printStream14 = null;
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(printStream14);
        compiler15.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = null;
        compiler15.tracker = performanceTracker17;
        com.google.javascript.jscomp.Scope scope19 = compiler15.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap20 = compiler15.getSourceMap();
        java.lang.String str21 = compiler15.getAstDotGraph();
        java.lang.String str22 = compiler15.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope23 = compiler15.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap24 = compiler15.getSourceMap();
        compiler15.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler15.getErrorManager();
        compiler8.setErrorManager(errorManager26);
        compiler1.setErrorManager(errorManager26);
        boolean boolean29 = compiler1.hasErrors();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry13);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNull(sourceMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(scope23);
        org.junit.Assert.assertNull(sourceMap24);
        org.junit.Assert.assertNotNull(errorManager26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = compiler15.acceptEcmaScript5();
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
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        double double3 = compiler1.getProgress();
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        java.lang.String str6 = compiler1.getSourceLine("", 0);
        com.google.javascript.jscomp.PassConfig passConfig7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray15 = compiler1.getMessages();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
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
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNotNull(jSErrorArray14);
        org.junit.Assert.assertNotNull(jSErrorArray15);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        com.google.javascript.rhino.Node node17 = compiler1.getRoot();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
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
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
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
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node2 = compiler1.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler1.getState();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile4 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile4 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray5, jSSourceFileArray6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getErrors();
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
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap3 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        compiler7.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler7.newExternInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        compiler1.disableThreads();
        com.google.javascript.jscomp.Result result8 = compiler1.getResult();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(result8);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
        compiler1.disableThreads();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = compiler1.toSourceArray(jSModule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        boolean boolean10 = compiler1.hasErrors();
        com.google.javascript.jscomp.SourceFile sourceFile11 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile12 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile12 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result15 = compiler1.compile(sourceFile11, jSSourceFileArray13, compilerOptions14);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        int int8 = compiler1.getWarningCount();
        boolean boolean9 = compiler1.acceptEcmaScript5();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder6 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int7 = codeBuilder6.getLength();
        int int8 = codeBuilder6.getLength();
        java.lang.String str9 = codeBuilder6.toString();
        int int10 = codeBuilder6.getLength();
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder6, (int) (byte) 10, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        compiler1.disableThreads();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
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
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler1.getCodingConvention();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(codingConvention7);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler4.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler4.getErrorManager();
        compiler1.setErrorManager(errorManager7);
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
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(errorManager7);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler1.getState();
        double double9 = compiler1.getProgress();
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
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler1.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(performanceTracker7);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler1.getMessages();
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState24 = compiler23.getState();
        java.io.PrintStream printStream25 = null;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(printStream25);
        compiler26.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler26.getErrorManager();
        compiler23.setErrorManager(errorManager28);
        compiler1.setErrorManager(errorManager28);
        boolean boolean31 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSError[] jSErrorArray32 = compiler1.getMessages();
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
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertNotNull(intermediateState24);
        org.junit.Assert.assertNotNull(errorManager28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSErrorArray32);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.Node node6 = compiler1.getRoot();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError jSError8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel9 = compiler1.getErrorLevel(jSError8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable7 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler1.newExternInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = compiler1.isTypeCheckingEnabled();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNotNull(intermediateState15);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        com.google.javascript.jscomp.JSModule[] jSModuleArray19 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result21 = compiler1.compile(jSSourceFile18, jSModuleArray19, compilerOptions20);
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
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
        java.lang.String str12 = compiler1.toSource();
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler1.getWarnings();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result17 = compiler1.compile(jSSourceFileArray14, jSSourceFileArray15, compilerOptions16);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler1.tracker = performanceTracker8;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap11 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertNull(performanceTracker10);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray23 = compiler1.getMessages();
        java.lang.String str24 = compiler1.toSource();
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions25);
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
        org.junit.Assert.assertNotNull(jSErrorArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.isIdeMode();
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
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        double double3 = compiler1.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler15.getState();
        // The following exception was thrown during execution in test generation
        try {
            compiler15.check();
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
        org.junit.Assert.assertNotNull(intermediateState16);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        com.google.javascript.jscomp.Result result7 = compiler1.getResult();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable8 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(result7);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable6 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.JsAst jsAst5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
        com.google.javascript.rhino.InputId inputId10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput11 = compiler1.getInput(inputId10);
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
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        java.lang.Class<?> wildcardClass5 = languageMode4.getClass();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getErrors();
        double double8 = compiler1.getProgress();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        com.google.javascript.jscomp.JSModule jSModule18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray19 = compiler1.toSourceArray(jSModule18);
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
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(intermediateState8);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        boolean boolean5 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile7 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray8, jSSourceFileArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler1.getMessages();
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState24 = compiler23.getState();
        java.io.PrintStream printStream25 = null;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(printStream25);
        compiler26.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler26.getErrorManager();
        compiler23.setErrorManager(errorManager28);
        compiler1.setErrorManager(errorManager28);
        boolean boolean31 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder32 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int33 = codeBuilder32.getLength();
        int int34 = codeBuilder32.getLength();
        java.lang.String str35 = codeBuilder32.toString();
        com.google.javascript.rhino.Node node37 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder32, (int) (byte) 10, node37);
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
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertNotNull(intermediateState24);
        org.junit.Assert.assertNotNull(errorManager28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node2 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result3 = compiler1.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker14 = compiler1.tracker;
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
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertNull(performanceTracker14);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("hi!", (int) (byte) -1);
        boolean boolean10 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler1.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder12 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int13 = codeBuilder12.getLength();
        int int14 = codeBuilder12.getLength();
        int int15 = codeBuilder12.getLength();
        java.lang.String str16 = codeBuilder12.toString();
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder12, 1, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(performanceTracker11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler1.getState();
        double double9 = compiler1.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = compiler1.isTypeCheckingEnabled();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker14 = null;
        compiler1.tracker = performanceTracker14;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile16 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray17 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile16 };
        com.google.javascript.jscomp.JSModule jSModule18 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray19 = new com.google.javascript.jscomp.JSModule[] { jSModule18 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result21 = compiler1.compile(jSSourceFileArray17, jSModuleArray19, compilerOptions20);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray17);
        org.junit.Assert.assertNotNull(jSModuleArray19);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
            com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler1.newExternInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray16 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile17 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray18 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile17 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray16, jSSourceFileArray18, compilerOptions19);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray16);
        org.junit.Assert.assertNotNull(jSSourceFileArray18);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        com.google.javascript.jscomp.JSModule jSModule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = compiler15.toSource(jSModule16);
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
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile13 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile13 };
        com.google.javascript.jscomp.JSModule jSModule15 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray16 = new com.google.javascript.jscomp.JSModule[] { jSModule15 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result18 = compiler1.compile(jSSourceFileArray14, jSModuleArray16, compilerOptions17);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertNotNull(jSModuleArray16);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        java.lang.String str40 = compiler1.toSource();
        int int41 = compiler1.getErrorCount();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        compiler1.disableThreads();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getMessages();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("hi!", (int) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result13 = compiler1.compile(jSSourceFileArray10, jSModuleArray11, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSModuleArray11);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        java.lang.String str8 = compiler7.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler7.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler1.getMessages();
        boolean boolean22 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Region region25 = compiler1.getSourceRegion("hi!", (-1));
        com.google.javascript.rhino.InputId inputId26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput27 = compiler1.getInput(inputId26);
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
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(region25);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getErrors();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
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
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = compiler1.toSource(jSModule11);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
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
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
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
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler15.getWarnings();
        com.google.javascript.jscomp.PassConfig passConfig17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler15.setPassConfig(passConfig17);
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
        org.junit.Assert.assertNotNull(jSErrorArray16);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node5 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.reportCodeChange();
        boolean boolean6 = compiler1.hasErrors();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile22 = null;
        com.google.javascript.jscomp.JSModule jSModule23 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray24 = new com.google.javascript.jscomp.JSModule[] { jSModule23 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result26 = compiler1.compile(jSSourceFile22, jSModuleArray24, compilerOptions25);
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
        org.junit.Assert.assertNotNull(jSModuleArray24);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        java.lang.String str13 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSError[] jSErrorArray14 = compiler1.getErrors();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(jSErrorArray14);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        com.google.javascript.jscomp.JSError jSError31 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError31);
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
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.JsAst jsAst5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler1.getState();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNotNull(intermediateState8);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        java.lang.String str13 = compiler1.getAstDotGraph();
        compiler1.reportCodeChange();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        java.lang.String str12 = compiler1.toSource();
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler14.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode17 = compiler14.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler14.getErrorManager();
        compiler1.setErrorManager(errorManager18);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions21);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertTrue("'" + languageMode17 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode17.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager18);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JsAst jsAst7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = compiler1.getTypeRegistry();
        boolean boolean23 = compiler1.hasErrors();
        com.google.javascript.jscomp.Result result24 = compiler1.getResult();
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
        org.junit.Assert.assertNotNull(jSTypeRegistry22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(result24);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        java.lang.String str8 = compiler7.getAstDotGraph();
        int int9 = compiler7.getWarningCount();
        com.google.javascript.jscomp.JsAst jsAst10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler7.replaceScript(jsAst10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        com.google.javascript.jscomp.JsAst jsAst2 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.addNewScript(jsAst2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker14 = null;
        compiler1.tracker = performanceTracker14;
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter16 = compiler1.getReverseAbstractInterpreter();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter16);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        int int6 = compiler1.getErrorCount();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler8.getState();
        compiler1.setState(intermediateState14);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertNotNull(intermediateState14);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler4.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler4.getErrorManager();
        compiler1.setErrorManager(errorManager7);
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = compiler1.toSource(jSModule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(errorManager7);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder12 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int13 = codeBuilder12.getLength();
        int int14 = codeBuilder12.getLength();
        java.lang.String str15 = codeBuilder12.toString();
        java.lang.String str16 = codeBuilder12.toString();
        int int17 = codeBuilder12.getLength();
        java.lang.String str18 = codeBuilder12.toString();
        java.lang.String str19 = codeBuilder12.toString();
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder12, (int) '4', node21);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler1.getErrors();
        int int6 = compiler1.getWarningCount();
        compiler1.disableThreads();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        com.google.javascript.jscomp.SourceFile sourceFile2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result5 = compiler0.compile(sourceFile2, sourceFile3, compilerOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        double double3 = compiler1.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.JSModule jSModule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = compiler1.toSource(jSModule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder6 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int7 = codeBuilder6.getLength();
        int int8 = codeBuilder6.getLength();
        java.lang.String str9 = codeBuilder6.toString();
        java.lang.String str10 = codeBuilder6.toString();
        int int11 = codeBuilder6.getLength();
        java.lang.String str12 = codeBuilder6.toString();
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder6, (int) (byte) 1, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        boolean boolean9 = compiler1.hasErrors();
        com.google.javascript.rhino.InputId inputId10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput11 = compiler1.getInput(inputId10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        double double7 = compiler1.getProgress();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        java.lang.String str7 = compiler1.getAstDotGraph();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        compiler1.disableThreads();
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
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSModuleArray10);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        com.google.javascript.jscomp.PassConfig passConfig10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.String str7 = compiler1.getSourceLine("", 0);
        com.google.javascript.rhino.Node node8 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = compiler1.acceptConstKeyword();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
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
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(sourceMap8);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        com.google.javascript.jscomp.JSModule jSModule22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray23 = compiler1.toSourceArray(jSModule22);
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
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getErrors();
        double double8 = compiler1.getProgress();
        compiler1.reportCodeChange();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler1.getMessages();
        boolean boolean22 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Region region25 = compiler1.getSourceRegion("", (-1));
        com.google.javascript.jscomp.JSModule jSModule26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = compiler1.toSource(jSModule26);
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
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(region25);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler1.tracker = performanceTracker12;
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertNotNull(errorManager10);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler1.tracker = performanceTracker8;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile2 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray3 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile2 };
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray5 = new com.google.javascript.jscomp.JSModule[] { jSModule4 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray3, jSModuleArray5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(jSSourceFileArray3);
        org.junit.Assert.assertNotNull(jSModuleArray5);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNull(sourceMap8);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.String str7 = compiler1.getSourceLine("", 0);
        java.io.PrintStream printStream8 = null;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream8);
        compiler9.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler9.tracker;
        java.io.PrintStream printStream12 = null;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(printStream12);
        compiler13.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler13.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler13.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter17 = compiler13.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler13.getErrorManager();
        compiler9.setErrorManager(errorManager18);
        compiler1.setErrorManager(errorManager18);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(performanceTracker11);
        org.junit.Assert.assertNull(performanceTracker15);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter17);
        org.junit.Assert.assertNotNull(errorManager18);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        boolean boolean15 = compiler1.acceptConstKeyword();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
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
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder10 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int11 = codeBuilder10.getLength();
        java.lang.String str12 = codeBuilder10.toString();
        java.lang.String str13 = codeBuilder10.toString();
        int int14 = codeBuilder10.getLength();
        int int15 = codeBuilder10.getLength();
        int int16 = codeBuilder10.getLength();
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder10, 0, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        int int6 = compiler1.getErrorCount();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler8.getState();
        compiler1.setState(intermediateState14);
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
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertNotNull(intermediateState14);
        org.junit.Assert.assertNotNull(jSSourceFileArray17);
        org.junit.Assert.assertNotNull(jSModuleArray19);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        int int8 = compiler1.getWarningCount();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler4.getErrorManager();
        compiler1.setErrorManager(errorManager6);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
            compiler1.rebuildInputsFromModules();
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
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler1.tracker = performanceTracker8;
        int int10 = compiler1.getErrorCount();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
        boolean boolean10 = compiler1.hasErrors();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable11 = compiler1.buildKnownSymbolTable();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setState(intermediateState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
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
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        double double3 = compiler1.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = compiler1.isIdeMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getMessages();
        boolean boolean8 = compiler1.acceptConstKeyword();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        boolean boolean5 = compiler1.acceptConstKeyword();
        java.lang.String str6 = compiler1.toSource();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(sourceMap8);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = compiler1.getTypeRegistry();
        boolean boolean23 = compiler1.hasErrors();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile24 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile24 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray26 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray25, jSModuleArray26, compilerOptions27);
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
        org.junit.Assert.assertNotNull(jSTypeRegistry22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertNotNull(jSModuleArray26);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler1.getErrors();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
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
        org.junit.Assert.assertNotNull(jSErrorArray13);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
            com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler1.getCodingConvention();
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
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = compiler1.getWarningCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(intermediateState8);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = compiler1.toSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        boolean boolean14 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.JSError jSError15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel16 = compiler1.getErrorLevel(jSError15);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
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
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSModuleArray11);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions1 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        compiler1.disableThreads();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler1.toSourceArray(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = compiler1.getTypeRegistry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.String str7 = compiler1.getSourceLine("", 0);
        java.io.PrintStream printStream8 = null;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream8);
        compiler9.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler9.tracker;
        java.io.PrintStream printStream12 = null;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(printStream12);
        compiler13.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler13.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler13.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter17 = compiler13.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler13.getErrorManager();
        compiler9.setErrorManager(errorManager18);
        compiler1.setErrorManager(errorManager18);
        java.io.PrintStream printStream21 = null;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(printStream21);
        compiler22.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker24 = null;
        compiler22.tracker = performanceTracker24;
        com.google.javascript.jscomp.Scope scope26 = compiler22.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap27 = compiler22.getSourceMap();
        java.io.PrintStream printStream28 = null;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler(printStream28);
        compiler29.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker31 = null;
        compiler29.tracker = performanceTracker31;
        com.google.javascript.jscomp.Scope scope33 = compiler29.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState34 = compiler29.getState();
        compiler22.setState(intermediateState34);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState36 = compiler22.getState();
        compiler1.setState(intermediateState36);
        com.google.javascript.jscomp.PassConfig passConfig38 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(performanceTracker11);
        org.junit.Assert.assertNull(performanceTracker15);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter17);
        org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertNull(scope26);
        org.junit.Assert.assertNull(sourceMap27);
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertNotNull(intermediateState34);
        org.junit.Assert.assertNotNull(intermediateState36);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile12 = null;
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] { jSModule13 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result16 = compiler1.compile(jSSourceFile12, jSModuleArray14, compilerOptions15);
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
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(jSModuleArray14);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        boolean boolean8 = compiler1.acceptEcmaScript5();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap9 = compiler1.getInputsById();
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
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler1.getWarnings();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray13 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result15 = compiler1.compile(jSSourceFileArray12, jSModuleArray13, compilerOptions14);
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
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertNotNull(jSModuleArray13);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler1.getErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.Result result8 = compiler1.getResult();
        com.google.javascript.jscomp.Result result9 = compiler1.getResult();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNotNull(result9);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = compiler1.isTypeCheckingEnabled();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        java.lang.String str6 = compiler1.toSource();
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("", (int) (byte) -1);
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        compiler1.disableThreads();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler10.tracker = performanceTracker12;
        com.google.javascript.jscomp.Scope scope14 = compiler10.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler10.getSourceMap();
        java.lang.String str16 = compiler10.getAstDotGraph();
        java.lang.String str17 = compiler10.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope18 = compiler10.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap19 = compiler10.getSourceMap();
        compiler10.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler10.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter22 = compiler10.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager23 = compiler10.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(errorManager23);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState25 = compiler24.getState();
        compiler1.setState(intermediateState25);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter27 = compiler1.getReverseAbstractInterpreter();
        double double28 = compiler1.getProgress();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNull(sourceMap19);
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter22);
        org.junit.Assert.assertNotNull(errorManager23);
        org.junit.Assert.assertNotNull(intermediateState25);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler1.tracker;
        com.google.javascript.jscomp.PassConfig passConfig9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNull(performanceTracker8);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap11 = compiler1.getInputsById();
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
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler1.getMessages();
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
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertNotNull(jSErrorArray21);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getErrors();
        com.google.javascript.jscomp.SourceFile sourceFile9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = compiler1.parse(sourceFile9);
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
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
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
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = compiler1.toSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNotNull(intermediateState15);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
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
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler1.getTypeRegistry();
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder9 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int10 = codeBuilder9.getLength();
        int int11 = codeBuilder9.getLength();
        java.lang.String str12 = codeBuilder9.toString();
        int int13 = codeBuilder9.getLength();
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder9, (int) (short) 100, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler1.getSourceMap();
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
        org.junit.Assert.assertNull(sourceMap22);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler1.getErrors();
        int int6 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile7 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray9 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray8, jSModuleArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
        org.junit.Assert.assertNotNull(intermediateState21);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap5 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        java.lang.String str12 = compiler1.getSourceLine("", 0);
        com.google.javascript.jscomp.PassConfig passConfig13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray16 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray17 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result19 = compiler1.compile(jSSourceFileArray16, jSModuleArray17, compilerOptions18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(jSSourceFileArray16);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        int int8 = compiler1.getWarningCount();
        java.lang.Class<?> wildcardClass9 = compiler1.getClass();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        com.google.javascript.jscomp.PassConfig passConfig22 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig22);
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
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        java.lang.String str6 = compiler1.toSource();
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("", (int) (byte) -1);
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler1.tracker = performanceTracker11;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput14 = compiler1.newExternInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
        boolean boolean16 = compiler1.acceptConstKeyword();
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
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter13);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler15.getWarnings();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray17 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray18 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result20 = compiler15.compile(jSSourceFileArray17, jSSourceFileArray18, compilerOptions19);
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
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertNotNull(jSSourceFileArray17);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = compiler1.toSource(jSModule7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        int int6 = compiler1.getErrorCount();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler8.getState();
        compiler1.setState(intermediateState14);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray16 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule17 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray18 = new com.google.javascript.jscomp.JSModule[] { jSModule17 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray16, jSModuleArray18, compilerOptions19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertNotNull(intermediateState14);
        org.junit.Assert.assertNotNull(jSSourceFileArray16);
        org.junit.Assert.assertNotNull(jSModuleArray18);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler1.getMessages();
        com.google.javascript.jscomp.Result result22 = compiler1.getResult();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region25 = compiler1.getSourceRegion("", (int) '4');
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
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertNotNull(result22);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler1.getCodingConvention();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(codingConvention7);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        double double8 = compiler1.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = compiler1.acceptConstKeyword();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler1.tracker = performanceTracker6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler1.tracker;
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        java.lang.String str10 = compiler1.getAstDotGraph();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        java.lang.String str8 = compiler1.toSource();
        java.lang.String str9 = compiler1.toSource();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Region region11 = compiler1.getSourceRegion("", (int) (short) 0);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNull(region11);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler1.tracker = performanceTracker8;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput11 = compiler1.newExternInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        com.google.javascript.jscomp.JSError jSError39 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel40 = compiler1.getErrorLevel(jSError39);
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
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.rhino.Node node8 = compiler1.getRoot();
        com.google.javascript.jscomp.SourceFile sourceFile9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = compiler1.parse(sourceFile9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        java.lang.String str6 = compiler1.toSource();
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
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter20 = compiler8.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler8.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(errorManager21);
        compiler1.setErrorManager(errorManager21);
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter20);
        org.junit.Assert.assertNotNull(errorManager21);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getMessages();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node2 = compiler1.getRoot();
        java.lang.String str3 = compiler1.getAstDotGraph();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        int int8 = compiler1.getWarningCount();
        boolean boolean9 = compiler1.acceptEcmaScript5();
        java.lang.String str10 = compiler1.toSource();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.Node node6 = compiler1.getRoot();
        com.google.javascript.jscomp.JsAst jsAst7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addNewScript(jsAst7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int8 = codeBuilder7.getLength();
        int int9 = codeBuilder7.getLength();
        java.lang.String str10 = codeBuilder7.toString();
        java.lang.String str11 = codeBuilder7.toString();
        int int12 = codeBuilder7.getLength();
        java.lang.String str13 = codeBuilder7.toString();
        java.lang.String str14 = codeBuilder7.toString();
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder7, (-1), node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler15.getWarnings();
        // The following exception was thrown during execution in test generation
        try {
            compiler15.normalize();
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
        org.junit.Assert.assertNotNull(jSErrorArray16);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        java.lang.String str6 = compiler1.getSourceLine("", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        boolean boolean31 = compiler1.isTypeCheckingEnabled();
        compiler1.disableThreads();
        double double33 = compiler1.getProgress();
        java.lang.Class<?> wildcardClass34 = compiler1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        com.google.javascript.jscomp.JSError jSError16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler15.report(jSError16);
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
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        com.google.javascript.jscomp.PassConfig passConfig8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig8);
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
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler1.tracker = performanceTracker8;
        com.google.javascript.jscomp.PassConfig passConfig10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        double double8 = compiler1.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = compiler1.acceptEcmaScript5();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.isIdeMode();
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        compiler7.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler7.getErrorManager();
        boolean boolean10 = compiler7.acceptConstKeyword();
        boolean boolean11 = compiler7.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = compiler7.getTypeRegistry();
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = null;
        compiler14.tracker = performanceTracker16;
        com.google.javascript.jscomp.Scope scope18 = compiler14.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap19 = compiler14.getSourceMap();
        java.lang.String str20 = compiler14.getAstDotGraph();
        java.lang.String str21 = compiler14.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope22 = compiler14.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap23 = compiler14.getSourceMap();
        compiler14.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager25 = compiler14.getErrorManager();
        compiler7.setErrorManager(errorManager25);
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler7.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = compiler7.getTypeRegistry();
        com.google.javascript.jscomp.ErrorManager errorManager29 = compiler7.getErrorManager();
        compiler1.setErrorManager(errorManager29);
        com.google.javascript.jscomp.Scope scope31 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region34 = compiler1.getSourceRegion("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry12);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNull(sourceMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertNull(sourceMap23);
        org.junit.Assert.assertNotNull(errorManager25);
        org.junit.Assert.assertNotNull(errorManager27);
        org.junit.Assert.assertNotNull(jSTypeRegistry28);
        org.junit.Assert.assertNotNull(errorManager29);
        org.junit.Assert.assertNull(scope31);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler1.tracker = performanceTracker5;
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler1.getErrors();
        int int6 = compiler1.getWarningCount();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node6 = compiler1.getRoot();
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler1.toSourceArray(jSModule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap7 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap6);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSError jSError3 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSModuleArray13);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode5 = compiler1.languageMode();
        double double6 = compiler1.getProgress();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + languageMode5 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode5.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
            compiler1.normalize();
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
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler1.getMessages();
        boolean boolean22 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.JSModule jSModule23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray24 = compiler1.toSourceArray(jSModule23);
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
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.JSError jSError6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(performanceTracker5);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        java.lang.String str8 = compiler1.getAstDotGraph();
        compiler1.reportCodeChange();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler1.getCodingConvention();
        com.google.javascript.rhino.InputId inputId8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler1.getInput(inputId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(codingConvention7);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
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
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.JsAst jsAst5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        java.lang.String str6 = compiler1.toSource();
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("", (int) (byte) -1);
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler1.tracker = performanceTracker11;
        java.lang.String str13 = compiler1.getAstDotGraph();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray15 = compiler1.getMessages();
        boolean boolean16 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.SourceFile sourceFile17 = null;
        com.google.javascript.jscomp.SourceFile sourceFile18 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result20 = compiler1.compile(sourceFile17, sourceFile18, compilerOptions19);
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
        org.junit.Assert.assertNotNull(jSErrorArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        boolean boolean31 = compiler1.isTypeCheckingEnabled();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput34 = compiler1.newExternInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        int int10 = compiler1.getWarningCount();
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
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        boolean boolean5 = compiler1.acceptConstKeyword();
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
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        java.lang.String str3 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler1.getCodingConvention();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        com.google.javascript.jscomp.Result result7 = compiler1.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getMessages();
        com.google.javascript.jscomp.SourceFile sourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile10 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result13 = compiler1.compile(sourceFile9, jSSourceFileArray11, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(result7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler1.tracker = performanceTracker8;
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler1.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler1.getErrorManager();
        com.google.javascript.jscomp.SourceFile sourceFile15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = compiler1.parse(sourceFile15);
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
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertNotNull(errorManager14);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = compiler1.tracker;
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions17);
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
        org.junit.Assert.assertNull(performanceTracker16);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        java.lang.String str6 = compiler1.toSource();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable7 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        java.lang.Class<?> wildcardClass39 = compiler1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        int int8 = compiler1.getWarningCount();
        boolean boolean9 = compiler1.acceptEcmaScript5();
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
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder7, (int) (byte) -1, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        java.lang.String str6 = compiler1.toSource();
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("", (int) (byte) -1);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler1.tracker = performanceTracker10;
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(region9);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler1.getState();
        double double9 = compiler1.getProgress();
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
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        com.google.javascript.jscomp.SourceFile sourceFile41 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray42 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result44 = compiler1.compile(sourceFile41, jSSourceFileArray42, compilerOptions43);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray42);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = compiler1.isTypeCheckingEnabled();
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
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        com.google.javascript.jscomp.SourceMap sourceMap16 = compiler1.getSourceMap();
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
        org.junit.Assert.assertNull(sourceMap16);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getErrors();
        com.google.javascript.jscomp.JsAst jsAst7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addNewScript(jsAst7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getMessages();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler1.getMessages();
        boolean boolean22 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Region region25 = compiler1.getSourceRegion("", (-1));
        com.google.javascript.rhino.InputId inputId26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput27 = compiler1.getInput(inputId26);
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
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(region25);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
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
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNull(performanceTracker6);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        com.google.javascript.jscomp.JSModule jSModule18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = compiler1.toSource(jSModule18);
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
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        com.google.javascript.jscomp.SourceFile sourceFile2 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile3 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile3 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result6 = compiler0.compile(sourceFile2, jSSourceFileArray4, compilerOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray6, jSSourceFileArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        boolean boolean22 = compiler1.hasErrors();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode23 = compiler1.languageMode();
        boolean boolean24 = compiler1.isIdeMode();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + languageMode23 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode23.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        java.lang.String str40 = compiler1.toSource();
        java.io.PrintStream printStream41 = null;
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler(printStream41);
        compiler42.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker44 = null;
        compiler42.tracker = performanceTracker44;
        com.google.javascript.jscomp.Scope scope46 = compiler42.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState47 = compiler42.getState();
        compiler1.setState(intermediateState47);
        com.google.javascript.jscomp.JSError jSError49 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError49);
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(scope46);
        org.junit.Assert.assertNotNull(intermediateState47);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        boolean boolean5 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.PassConfig passConfig6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap8 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        com.google.javascript.jscomp.JsAst jsAst16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst16);
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
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        boolean boolean8 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSError jSError9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError9);
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
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.String str7 = compiler1.getSourceLine("", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable8 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler1.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable10 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNotNull(errorManager9);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        com.google.javascript.jscomp.SourceMap sourceMap23 = compiler1.getSourceMap();
        compiler1.reportCodeChange();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(sourceMap23);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler1.getState();
        double double9 = compiler1.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler1.getWarnings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JsAst jsAst6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        double double7 = compiler1.getProgress();
        boolean boolean8 = compiler1.acceptEcmaScript5();
        java.lang.String str9 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        java.lang.String str6 = compiler1.toSource();
        boolean boolean7 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler1.getCodingConvention();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(codingConvention8);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        compiler1.disableThreads();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
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
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap6 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap5);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker2 = compiler0.tracker;
        org.junit.Assert.assertNull(performanceTracker2);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        boolean boolean6 = compiler1.isIdeMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getMessages();
        int int8 = compiler1.getWarningCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable9 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Scope scope8 = compiler1.getTopScope();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = compiler1.getTypeRegistry();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(jSTypeRegistry9);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
            com.google.javascript.jscomp.SymbolTable symbolTable8 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        boolean boolean5 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        com.google.javascript.jscomp.JSError jSError7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel8 = compiler1.getErrorLevel(jSError7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSErrorArray6);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler1.getReverseAbstractInterpreter();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler1.getMessages();
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState24 = compiler23.getState();
        java.io.PrintStream printStream25 = null;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(printStream25);
        compiler26.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler26.getErrorManager();
        compiler23.setErrorManager(errorManager28);
        compiler1.setErrorManager(errorManager28);
        boolean boolean31 = compiler1.acceptEcmaScript5();
        boolean boolean32 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray33 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile34 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray35 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile34 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray33, jSSourceFileArray35, compilerOptions36);
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
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertNotNull(intermediateState24);
        org.junit.Assert.assertNotNull(errorManager28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray33);
        org.junit.Assert.assertNotNull(jSSourceFileArray35);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        compiler7.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler7.getErrorManager();
        boolean boolean10 = compiler7.acceptConstKeyword();
        boolean boolean11 = compiler7.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = compiler7.getTypeRegistry();
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = null;
        compiler14.tracker = performanceTracker16;
        com.google.javascript.jscomp.Scope scope18 = compiler14.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap19 = compiler14.getSourceMap();
        java.lang.String str20 = compiler14.getAstDotGraph();
        java.lang.String str21 = compiler14.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope22 = compiler14.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap23 = compiler14.getSourceMap();
        compiler14.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager25 = compiler14.getErrorManager();
        compiler7.setErrorManager(errorManager25);
        boolean boolean27 = compiler7.isIdeMode();
        java.io.PrintStream printStream28 = null;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler(printStream28);
        compiler29.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker31 = null;
        compiler29.tracker = performanceTracker31;
        com.google.javascript.jscomp.Scope scope33 = compiler29.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap34 = compiler29.getSourceMap();
        java.lang.String str35 = compiler29.getAstDotGraph();
        java.lang.String str36 = compiler29.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope37 = compiler29.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap38 = compiler29.getSourceMap();
        java.io.PrintStream printStream39 = null;
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler(printStream39);
        compiler40.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager42 = compiler40.getErrorManager();
        compiler29.setErrorManager(errorManager42);
        compiler7.setErrorManager(errorManager42);
        compiler1.setErrorManager(errorManager42);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry12);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNull(sourceMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertNull(sourceMap23);
        org.junit.Assert.assertNotNull(errorManager25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertNull(sourceMap34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(scope37);
        org.junit.Assert.assertNull(sourceMap38);
        org.junit.Assert.assertNotNull(errorManager42);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        double double3 = compiler1.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.String str7 = compiler1.getSourceLine("", 0);
        com.google.javascript.rhino.Node node8 = compiler1.getRoot();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler1.tracker = performanceTracker9;
        double double11 = compiler1.getProgress();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile12 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile12 };
        com.google.javascript.jscomp.JSSourceFile jSSourceFile14 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile14 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray13, jSSourceFileArray15, compilerOptions16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        double double8 = compiler1.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = compiler1.isTypeCheckingEnabled();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler1.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler1.getErrorManager();
        com.google.javascript.rhino.Node node15 = compiler1.getRoot();
        boolean boolean16 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler1.getErrors();
        int int18 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray19 = compiler1.getMessages();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray19);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        double double7 = compiler1.getProgress();
        java.lang.String str8 = compiler1.getAstDotGraph();
        int int9 = compiler1.getErrorCount();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNotNull(intermediateState15);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler1.getErrors();
        int int6 = compiler1.getWarningCount();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler1.getErrorManager();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNotNull(errorManager8);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
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
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        com.google.javascript.jscomp.SourceFile sourceFile15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = compiler1.parse(sourceFile15);
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
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        com.google.javascript.jscomp.Region region8 = compiler1.getSourceRegion("", (-1));
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(region8);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        com.google.javascript.jscomp.SourceFile sourceFile18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = compiler1.parse(sourceFile18);
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
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray13 = new com.google.javascript.jscomp.JSModule[] { jSModule12 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result15 = compiler1.compile(jSSourceFileArray11, jSModuleArray13, compilerOptions14);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSModuleArray13);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        boolean boolean5 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        double double7 = compiler1.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getErrors();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile9 };
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] { jSModule11 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler1.compile(jSSourceFileArray10, jSModuleArray12, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSModuleArray12);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        int int6 = compiler1.getErrorCount();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler8.tracker = performanceTracker10;
        com.google.javascript.jscomp.Scope scope12 = compiler8.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler8.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler8.getState();
        compiler1.setState(intermediateState14);
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
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertNotNull(intermediateState14);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        java.lang.String str12 = compiler1.toSource();
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler14.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode17 = compiler14.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler14.getErrorManager();
        compiler1.setErrorManager(errorManager18);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler1.getErrors();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = compiler1.getTypeRegistry();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertTrue("'" + languageMode17 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode17.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertNotNull(jSTypeRegistry22);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = compiler1.getTypeRegistry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        boolean boolean16 = compiler1.acceptConstKeyword();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region19 = compiler1.getSourceRegion("", (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
            java.lang.String[] strArray10 = compiler1.toSourceArray(jSModule9);
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
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSError jSError7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel8 = compiler1.getErrorLevel(jSError7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNull(sourceMap6);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        boolean boolean8 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JsAst jsAst10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst10);
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
        org.junit.Assert.assertNull(sourceMap9);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        java.io.PrintStream printStream8 = null;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream8);
        compiler9.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler9.tracker = performanceTracker11;
        com.google.javascript.jscomp.Scope scope13 = compiler9.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap14 = compiler9.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler9.getState();
        java.lang.String str16 = compiler9.getAstDotGraph();
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        compiler18.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = null;
        compiler18.tracker = performanceTracker20;
        com.google.javascript.jscomp.Scope scope22 = compiler18.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap23 = compiler18.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState24 = compiler18.getState();
        compiler9.setState(intermediateState24);
        compiler1.setState(intermediateState24);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.SourceFile sourceFile28 = null;
        com.google.javascript.jscomp.SourceFile sourceFile29 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result31 = compiler1.compile(sourceFile28, sourceFile29, compilerOptions30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNull(sourceMap14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertNull(sourceMap23);
        org.junit.Assert.assertNotNull(intermediateState24);
        org.junit.Assert.assertNotNull(jSTypeRegistry27);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        java.lang.String str2 = codeBuilder0.toString();
        java.lang.String str3 = codeBuilder0.toString();
        java.lang.String str4 = codeBuilder0.toString();
        java.lang.String str5 = codeBuilder0.toString();
        java.lang.String str6 = codeBuilder0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
            compiler1.init(jSSourceFileArray6, jSModuleArray7, compilerOptions8);
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
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        java.lang.String str9 = compiler1.getSourceLine("", 0);
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
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        java.lang.String str12 = compiler1.toSource();
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler14.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode17 = compiler14.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler14.getErrorManager();
        compiler1.setErrorManager(errorManager18);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler1.getErrors();
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
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertTrue("'" + languageMode17 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode17.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertNotNull(jSErrorArray21);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        compiler1.disableThreads();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        double double15 = compiler1.getProgress();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile7 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray9 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray8, jSModuleArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler15.getWarnings();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable17 = compiler15.buildKnownSymbolTable();
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
        org.junit.Assert.assertNotNull(jSErrorArray16);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = null;
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
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        com.google.javascript.jscomp.ErrorManager errorManager23 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(errorManager23);
        com.google.javascript.jscomp.JSError jSError25 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler24.report(jSError25);
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
        org.junit.Assert.assertNotNull(errorManager23);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result4 = compiler0.compile(sourceFile1, sourceFile2, compilerOptions3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions10);
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
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        java.lang.String str8 = compiler1.toSource();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
        com.google.javascript.jscomp.JSError jSError8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.Node node6 = compiler1.getRoot();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
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
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        java.lang.String str12 = compiler1.getSourceLine("", 0);
        com.google.javascript.jscomp.JsAst jsAst13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        com.google.javascript.jscomp.Scope scope32 = compiler1.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig33 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig33);
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
        org.junit.Assert.assertNotNull(intermediateState31);
        org.junit.Assert.assertNull(scope32);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        boolean boolean8 = compiler1.isTypeCheckingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler1.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder5 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int6 = codeBuilder5.getLength();
        int int7 = codeBuilder5.getLength();
        java.lang.String str8 = codeBuilder5.toString();
        java.lang.String str9 = codeBuilder5.toString();
        int int10 = codeBuilder5.getLength();
        java.lang.String str11 = codeBuilder5.toString();
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder5, (int) 'a', node13);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        java.lang.String str6 = compiler1.toSource();
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
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter20 = compiler8.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler8.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(errorManager21);
        compiler1.setErrorManager(errorManager21);
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter20);
        org.junit.Assert.assertNotNull(errorManager21);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        double double8 = compiler1.getProgress();
        com.google.javascript.rhino.Node node9 = compiler1.getRoot();
        com.google.javascript.rhino.InputId inputId10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput11 = compiler1.getInput(inputId10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler1.getState();
        compiler1.disableThreads();
        com.google.javascript.rhino.InputId inputId8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler1.getInput(inputId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(intermediateState6);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler1.getSourceMap();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter12 = compiler1.getReverseAbstractInterpreter();
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
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + languageMode10 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode10.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter12);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray15 = compiler1.getMessages();
        boolean boolean16 = compiler1.isTypeCheckingEnabled();
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
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNotNull(jSErrorArray14);
        org.junit.Assert.assertNotNull(jSErrorArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        boolean boolean5 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap7 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSErrorArray6);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler1.getWarnings();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable17 = compiler1.buildKnownSymbolTable();
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
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSErrorArray16);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        double double7 = compiler1.getProgress();
        boolean boolean8 = compiler1.acceptEcmaScript5();
        java.lang.String str9 = compiler1.getAstDotGraph();
        boolean boolean10 = compiler1.acceptEcmaScript5();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getErrors();
        com.google.javascript.jscomp.JsAst jsAst10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addNewScript(jsAst10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.isIdeMode();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder6 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int7 = codeBuilder6.getLength();
        java.lang.String str8 = codeBuilder6.toString();
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder6, (int) (byte) -1, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getErrors();
        com.google.javascript.jscomp.Result result10 = compiler1.getResult();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(result10);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.isIdeMode();
        com.google.javascript.rhino.InputId inputId6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput(inputId6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
            boolean boolean12 = compiler1.isTypeCheckingEnabled();
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
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        boolean boolean6 = compiler1.isIdeMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getMessages();
        com.google.javascript.rhino.InputId inputId8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler1.getInput(inputId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        compiler9.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler9.getErrorManager();
        boolean boolean12 = compiler9.acceptConstKeyword();
        boolean boolean13 = compiler9.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker14 = compiler9.tracker;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler9.getState();
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        compiler17.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler17.tracker = performanceTracker19;
        com.google.javascript.jscomp.Scope scope21 = compiler17.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler17.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState23 = compiler17.getState();
        java.lang.String str24 = compiler17.getAstDotGraph();
        java.io.PrintStream printStream25 = null;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(printStream25);
        compiler26.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker28 = null;
        compiler26.tracker = performanceTracker28;
        com.google.javascript.jscomp.Scope scope30 = compiler26.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap31 = compiler26.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState32 = compiler26.getState();
        compiler17.setState(intermediateState32);
        compiler9.setState(intermediateState32);
        compiler1.setState(intermediateState32);
        com.google.javascript.jscomp.Result result36 = compiler1.getResult();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(performanceTracker14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(sourceMap22);
        org.junit.Assert.assertNotNull(intermediateState23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(scope30);
        org.junit.Assert.assertNull(sourceMap31);
        org.junit.Assert.assertNotNull(intermediateState32);
        org.junit.Assert.assertNotNull(result36);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(sourceMap8);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler15.check();
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
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        com.google.javascript.jscomp.JsAst jsAst6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addNewScript(jsAst6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        java.lang.String str10 = compiler1.getAstDotGraph();
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler12.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler12.getState();
        compiler1.setState(intermediateState15);
        com.google.javascript.jscomp.JSError jSError17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel18 = compiler1.getErrorLevel(jSError17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(intermediateState15);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode15 = compiler1.languageMode();
        int int16 = compiler1.getErrorCount();
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
        org.junit.Assert.assertTrue("'" + languageMode15 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode15.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        boolean boolean8 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        com.google.javascript.rhino.InputId inputId10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput11 = compiler1.getInput(inputId10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        java.lang.String str13 = codeBuilder9.toString();
        int int14 = codeBuilder9.getLength();
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder9, 0, node16);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        com.google.javascript.jscomp.SourceMap sourceMap23 = compiler1.getSourceMap();
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray25 = compiler1.toSourceArray();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(sourceMap23);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = compiler1.toSourceArray(jSModule5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
            boolean boolean9 = compiler1.acceptEcmaScript5();
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
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder18 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int19 = codeBuilder18.getLength();
        int int20 = codeBuilder18.getLength();
        java.lang.String str21 = codeBuilder18.toString();
        java.lang.String str22 = codeBuilder18.toString();
        java.lang.String str23 = codeBuilder18.toString();
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder18, (int) (byte) 10, node25);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
            com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter17 = compiler16.getReverseAbstractInterpreter();
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
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler1.getErrors();
        java.lang.Class<?> wildcardClass6 = jSErrorArray5.getClass();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getErrors();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = compiler1.getSourceLine("hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler15.getWarnings();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap17 = compiler15.getInputsById();
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
        org.junit.Assert.assertNotNull(jSErrorArray16);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        java.lang.String str12 = compiler1.getSourceLine("", 0);
        com.google.javascript.jscomp.JSError jSError13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.SourceFile sourceFile11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = compiler1.parse(sourceFile11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        java.lang.String str9 = compiler1.getSourceLine("", 0);
        java.io.PrintStream printStream10 = null;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(printStream10);
        compiler11.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler11.getErrorManager();
        compiler1.setErrorManager(errorManager13);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(errorManager13);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler1.getSourceMap();
        boolean boolean12 = compiler1.acceptEcmaScript5();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler1.tracker = performanceTracker9;
        com.google.javascript.jscomp.SourceFile sourceFile11 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile12 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile12 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result15 = compiler1.compile(sourceFile11, jSSourceFileArray13, compilerOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = compiler1.isIdeMode();
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
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        compiler1.disableThreads();
        com.google.javascript.rhino.Node node8 = compiler1.getRoot();
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
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        java.lang.String str6 = compiler1.toSource();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap8 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(sourceMap7);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        boolean boolean14 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule16 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray17 = new com.google.javascript.jscomp.JSModule[] { jSModule16 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray15, jSModuleArray17, compilerOptions18);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
        org.junit.Assert.assertNotNull(jSModuleArray17);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray23 = compiler1.getMessages();
        java.lang.String str24 = compiler1.getAstDotGraph();
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
        org.junit.Assert.assertNotNull(jSErrorArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        boolean boolean31 = compiler1.isTypeCheckingEnabled();
        compiler1.disableThreads();
        double double33 = compiler1.getProgress();
        com.google.javascript.jscomp.PassConfig passConfig34 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig34);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
        java.io.PrintStream printStream8 = null;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream8);
        compiler9.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler9.getErrorManager();
        boolean boolean12 = compiler9.acceptConstKeyword();
        boolean boolean13 = compiler9.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = compiler9.getTypeRegistry();
        java.io.PrintStream printStream15 = null;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream15);
        compiler16.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker18 = null;
        compiler16.tracker = performanceTracker18;
        com.google.javascript.jscomp.Scope scope20 = compiler16.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap21 = compiler16.getSourceMap();
        java.lang.String str22 = compiler16.getAstDotGraph();
        java.lang.String str23 = compiler16.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope24 = compiler16.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap25 = compiler16.getSourceMap();
        compiler16.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler16.getErrorManager();
        compiler9.setErrorManager(errorManager27);
        compiler1.setErrorManager(errorManager27);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention codingConvention30 = compiler1.getCodingConvention();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry14);
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNull(sourceMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(scope24);
        org.junit.Assert.assertNull(sourceMap25);
        org.junit.Assert.assertNotNull(errorManager27);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        int int2 = codeBuilder0.getLength();
        java.lang.String str3 = codeBuilder0.toString();
        int int4 = codeBuilder0.getLength();
        java.lang.String str5 = codeBuilder0.toString();
        java.lang.String str6 = codeBuilder0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler1.getMessages();
        boolean boolean22 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Region region25 = compiler1.getSourceRegion("", (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region28 = compiler1.getSourceRegion("hi!", (int) '#');
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
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(region25);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
        java.io.PrintStream printStream8 = null;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream8);
        compiler9.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler9.getErrorManager();
        boolean boolean12 = compiler9.acceptConstKeyword();
        boolean boolean13 = compiler9.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = compiler9.getTypeRegistry();
        java.io.PrintStream printStream15 = null;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream15);
        compiler16.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker18 = null;
        compiler16.tracker = performanceTracker18;
        com.google.javascript.jscomp.Scope scope20 = compiler16.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap21 = compiler16.getSourceMap();
        java.lang.String str22 = compiler16.getAstDotGraph();
        java.lang.String str23 = compiler16.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope24 = compiler16.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap25 = compiler16.getSourceMap();
        compiler16.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler16.getErrorManager();
        compiler9.setErrorManager(errorManager27);
        compiler1.setErrorManager(errorManager27);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry14);
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNull(sourceMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(scope24);
        org.junit.Assert.assertNull(sourceMap25);
        org.junit.Assert.assertNotNull(errorManager27);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node5 = compiler1.getRoot();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler1.toSourceArray(jSModule7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        java.lang.String str2 = codeBuilder0.toString();
        java.lang.String str3 = codeBuilder0.toString();
        int int4 = codeBuilder0.getLength();
        int int5 = codeBuilder0.getLength();
        int int6 = codeBuilder0.getLength();
        int int7 = codeBuilder0.getLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        boolean boolean8 = compiler1.isTypeCheckingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
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
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        boolean boolean5 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        double double7 = compiler1.getProgress();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler1.getCodingConvention();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder9 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int10 = codeBuilder9.getLength();
        int int11 = codeBuilder9.getLength();
        int int12 = codeBuilder9.getLength();
        java.lang.String str13 = codeBuilder9.toString();
        int int14 = codeBuilder9.getLength();
        int int15 = codeBuilder9.getLength();
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder9, 0, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode7 = compiler1.languageMode();
        boolean boolean8 = compiler1.hasErrors();
        com.google.javascript.rhino.InputId inputId9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler1.getInput(inputId9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + languageMode7 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode7.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = compiler1.getTypeRegistry();
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
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNotNull(jSTypeRegistry22);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        int int8 = compiler1.getErrorCount();
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
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler1.tracker = performanceTracker8;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        java.lang.String str6 = compiler1.toSource();
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("", (int) (byte) -1);
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode11 = compiler1.languageMode();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertTrue("'" + languageMode11 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode11.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler1.tracker = performanceTracker8;
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler1.getWarnings();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertNotNull(jSErrorArray10);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler1.getState();
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
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler4.getErrorManager();
        compiler1.setErrorManager(errorManager6);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager6);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler8.newExternInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.isIdeMode();
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        compiler7.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler7.getErrorManager();
        boolean boolean10 = compiler7.acceptConstKeyword();
        boolean boolean11 = compiler7.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = compiler7.getTypeRegistry();
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = null;
        compiler14.tracker = performanceTracker16;
        com.google.javascript.jscomp.Scope scope18 = compiler14.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap19 = compiler14.getSourceMap();
        java.lang.String str20 = compiler14.getAstDotGraph();
        java.lang.String str21 = compiler14.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope22 = compiler14.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap23 = compiler14.getSourceMap();
        compiler14.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager25 = compiler14.getErrorManager();
        compiler7.setErrorManager(errorManager25);
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler7.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = compiler7.getTypeRegistry();
        com.google.javascript.jscomp.ErrorManager errorManager29 = compiler7.getErrorManager();
        compiler1.setErrorManager(errorManager29);
        com.google.javascript.jscomp.Scope scope31 = compiler1.getTopScope();
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
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry12);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNull(sourceMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertNull(sourceMap23);
        org.junit.Assert.assertNotNull(errorManager25);
        org.junit.Assert.assertNotNull(errorManager27);
        org.junit.Assert.assertNotNull(jSTypeRegistry28);
        org.junit.Assert.assertNotNull(errorManager29);
        org.junit.Assert.assertNull(scope31);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        com.google.javascript.jscomp.SourceFile sourceFile14 = null;
        com.google.javascript.jscomp.SourceFile sourceFile15 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result17 = compiler1.compile(sourceFile14, sourceFile15, compilerOptions16);
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
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter6 = compiler1.getReverseAbstractInterpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput8 = compiler1.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter6);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        compiler1.reportCodeChange();
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
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        int int8 = compiler1.getWarningCount();
        boolean boolean9 = compiler1.hasErrors();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap10 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        boolean boolean5 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile7 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray9 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray8, jSModuleArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
            compiler1.addNewScript(jsAst8);
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
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        java.lang.String str2 = codeBuilder0.toString();
        java.lang.String str3 = codeBuilder0.toString();
        java.lang.String str4 = codeBuilder0.toString();
        java.lang.String str5 = codeBuilder0.toString();
        int int6 = codeBuilder0.getLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        java.lang.String str10 = compiler1.getAstDotGraph();
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler12.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler12.getState();
        compiler1.setState(intermediateState15);
        com.google.javascript.rhino.InputId inputId17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput18 = compiler1.getInput(inputId17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(intermediateState15);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        boolean boolean6 = compiler1.isTypeCheckingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap7 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.String str7 = compiler1.getSourceLine("", 0);
        java.io.PrintStream printStream8 = null;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream8);
        compiler9.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler9.tracker;
        java.io.PrintStream printStream12 = null;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(printStream12);
        compiler13.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler13.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler13.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter17 = compiler13.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler13.getErrorManager();
        compiler9.setErrorManager(errorManager18);
        compiler1.setErrorManager(errorManager18);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(errorManager18);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(performanceTracker11);
        org.junit.Assert.assertNull(performanceTracker15);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter17);
        org.junit.Assert.assertNotNull(errorManager18);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile32 = null;
        com.google.javascript.jscomp.JSModule jSModule33 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray34 = new com.google.javascript.jscomp.JSModule[] { jSModule33 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result36 = compiler1.compile(jSSourceFile32, jSModuleArray34, compilerOptions35);
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
        org.junit.Assert.assertNotNull(jSModuleArray34);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler1.getMessages();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker14 = compiler1.tracker;
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertNull(performanceTracker14);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray23 = compiler1.getMessages();
        com.google.javascript.jscomp.SourceFile sourceFile24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = compiler1.parse(sourceFile24);
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
        org.junit.Assert.assertNotNull(jSErrorArray23);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler15.getWarnings();
        com.google.javascript.jscomp.SourceFile sourceFile17 = null;
        com.google.javascript.jscomp.SourceFile sourceFile18 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result20 = compiler15.compile(sourceFile17, sourceFile18, compilerOptions19);
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
        org.junit.Assert.assertNotNull(jSErrorArray16);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        compiler1.disableThreads();
        com.google.javascript.jscomp.JSError jSError8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        boolean boolean31 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = null;
        compiler1.tracker = performanceTracker32;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = compiler1.getTypeRegistry();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry34);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        double double7 = compiler1.getProgress();
        boolean boolean8 = compiler1.acceptEcmaScript5();
        java.lang.String str9 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region12 = compiler1.getSourceRegion("hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
            com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler1.languageMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(performanceTracker7);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node5 = compiler1.getRoot();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.jscomp.JSError jSError7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel8 = compiler1.getErrorLevel(jSError7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
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
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSModuleArray10);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getErrors();
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler8.getErrorManager();
        boolean boolean11 = compiler8.acceptConstKeyword();
        boolean boolean12 = compiler8.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = compiler8.getTypeRegistry();
        java.io.PrintStream printStream14 = null;
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(printStream14);
        compiler15.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = null;
        compiler15.tracker = performanceTracker17;
        com.google.javascript.jscomp.Scope scope19 = compiler15.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap20 = compiler15.getSourceMap();
        java.lang.String str21 = compiler15.getAstDotGraph();
        java.lang.String str22 = compiler15.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope23 = compiler15.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap24 = compiler15.getSourceMap();
        compiler15.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler15.getErrorManager();
        compiler8.setErrorManager(errorManager26);
        compiler1.setErrorManager(errorManager26);
        compiler1.disableThreads();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry13);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNull(sourceMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(scope23);
        org.junit.Assert.assertNull(sourceMap24);
        org.junit.Assert.assertNotNull(errorManager26);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = performanceTracker15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNull(performanceTracker15);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler1.getErrors();
        int int6 = compiler1.getWarningCount();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager13);
        // The following exception was thrown during execution in test generation
        try {
            compiler14.normalize();
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
        org.junit.Assert.assertNotNull(errorManager13);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        java.lang.String str9 = compiler1.getSourceLine("", 0);
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler1.getErrorManager();
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(errorManager10);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        com.google.javascript.jscomp.Scope scope15 = compiler1.getTopScope();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(scope15);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        compiler1.disableThreads();
        com.google.javascript.rhino.InputId inputId8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler1.getInput(inputId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler1.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(sourceMap8);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler1.getCodingConvention();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(codingConvention6);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.InputId inputId1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput2 = compiler0.getInput(inputId1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler1.getMessages();
        boolean boolean22 = compiler1.acceptConstKeyword();
        java.lang.String str23 = compiler1.getAstDotGraph();
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
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = compiler1.getTypeRegistry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        com.google.javascript.jscomp.SourceMap sourceMap23 = compiler1.getSourceMap();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter24 = compiler1.getReverseAbstractInterpreter();
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
        org.junit.Assert.assertNull(sourceMap23);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter24);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        boolean boolean31 = compiler1.isTypeCheckingEnabled();
        compiler1.disableThreads();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = compiler1.tracker;
        com.google.javascript.jscomp.JsAst jsAst17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addNewScript(jsAst17);
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
        org.junit.Assert.assertNull(performanceTracker16);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
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
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        boolean boolean8 = compiler1.hasErrors();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
            com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler1.getCodingConvention();
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
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler1.tracker = performanceTracker9;
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler1.getErrorManager();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNotNull(errorManager11);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable9 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNull(performanceTracker8);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        double double3 = compiler1.getProgress();
        java.lang.Class<?> wildcardClass4 = compiler1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
            com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = compiler1.getTypeRegistry();
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
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        java.lang.String str17 = compiler1.getSourceLine("hi!", 0);
        int int18 = compiler1.getWarningCount();
        com.google.javascript.jscomp.PassConfig passConfig19 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig19);
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler1.getCodingConvention();
        boolean boolean10 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.Scope scope11 = compiler1.getTopScope();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(scope11);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        boolean boolean31 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JsAst jsAst32 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst32);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.SourceFile sourceFile3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = compiler1.parse(sourceFile3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        java.lang.String str17 = compiler1.getSourceLine("hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray18 = compiler1.toSourceArray();
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler1.tracker = performanceTracker12;
        com.google.javascript.jscomp.PassConfig passConfig14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig14);
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
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
        com.google.javascript.jscomp.Result result10 = compiler1.getResult();
        java.lang.String str11 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(performanceTracker9);
        org.junit.Assert.assertNotNull(result10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap9 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(performanceTracker8);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getErrors();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSErrorArray6);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler1.getErrors();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result17 = compiler1.compile(jSSourceFileArray14, jSSourceFileArray15, compilerOptions16);
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
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler1.getWarnings();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker18 = null;
        compiler1.tracker = performanceTracker18;
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
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertNull(sourceMap17);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
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
        java.lang.String str12 = compiler1.toSource();
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler14.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode17 = compiler14.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler14.getErrorManager();
        compiler1.setErrorManager(errorManager18);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler1.getErrors();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput23 = compiler1.newExternInput("hi!");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertTrue("'" + languageMode17 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode17.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertNotNull(jSErrorArray21);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node2 = compiler1.getRoot();
        com.google.javascript.rhino.Node node3 = compiler1.getRoot();
        java.lang.String str4 = compiler1.getAstDotGraph();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
            compiler1.rebuildInputsFromModules();
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
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler1.getState();
        double double9 = compiler1.getProgress();
        java.lang.Class<?> wildcardClass10 = compiler1.getClass();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getErrors();
        double double8 = compiler1.getProgress();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getWarnings();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler1.getCodingConvention();
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
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(codingConvention9);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
        boolean boolean8 = compiler1.hasErrors();
        boolean boolean9 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = compiler1.toSourceArray(jSModule10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile12 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile12 };
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
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertNotNull(jSModuleArray15);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler1.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable9 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
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
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler1.getState();
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
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNotNull(intermediateState8);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(performanceTracker7);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = compiler1.toSource(jSModule9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNull(sourceMap8);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Result result7 = compiler1.getResult();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(result7);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptEcmaScript5();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.lang.String str7 = compiler1.toSource();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        boolean boolean8 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray10 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler1.compile(jSSourceFileArray9, jSModuleArray10, compilerOptions11);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertNotNull(jSModuleArray10);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler1.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler1.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = compiler1.getTypeRegistry();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(jSTypeRegistry15);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
            com.google.javascript.jscomp.CompilerInput compilerInput18 = compiler15.newExternInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler1.getCodingConvention();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        compiler7.disableThreads();
        com.google.javascript.rhino.Node node9 = compiler7.getRoot();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        boolean boolean16 = compiler1.acceptConstKeyword();
        boolean boolean17 = compiler1.acceptConstKeyword();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNull(sourceMap8);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler1.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler1.getErrorManager();
        boolean boolean11 = compiler1.isIdeMode();
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = compiler1.toSource(jSModule12);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler4.getErrorManager();
        compiler1.setErrorManager(errorManager6);
        com.google.javascript.jscomp.Scope scope8 = compiler1.getTopScope();
        compiler1.disableThreads();
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(scope8);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        java.lang.String str40 = compiler1.toSource();
        java.io.PrintStream printStream41 = null;
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler(printStream41);
        compiler42.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker44 = null;
        compiler42.tracker = performanceTracker44;
        com.google.javascript.jscomp.Scope scope46 = compiler42.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState47 = compiler42.getState();
        compiler1.setState(intermediateState47);
        compiler1.disableThreads();
        java.lang.String str50 = compiler1.toSource();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(scope46);
        org.junit.Assert.assertNotNull(intermediateState47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        compiler1.disableThreads();
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
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
        boolean boolean22 = compiler1.isIdeMode();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray23 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule24 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray25 = new com.google.javascript.jscomp.JSModule[] { jSModule24 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result27 = compiler1.compile(jSSourceFileArray23, jSModuleArray25, compilerOptions26);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray23);
        org.junit.Assert.assertNotNull(jSModuleArray25);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(sourceMap7);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        compiler1.reportCodeChange();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
        org.junit.Assert.assertTrue("'" + languageMode9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode9.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("hi!", 0);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(region9);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler1.getCodingConvention();
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
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertNotNull(jSModuleArray10);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler1.tracker = performanceTracker8;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = compiler1.tracker;
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler1.getErrors();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertNull(performanceTracker10);
        org.junit.Assert.assertNotNull(jSErrorArray11);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
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
        com.google.javascript.jscomp.JsAst jsAst14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addNewScript(jsAst14);
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
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.rhino.Node node8 = compiler1.getRoot();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler10.tracker = performanceTracker12;
        com.google.javascript.jscomp.Scope scope14 = compiler10.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler10.getSourceMap();
        java.lang.String str16 = compiler10.getAstDotGraph();
        java.lang.String str17 = compiler10.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope18 = compiler10.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap19 = compiler10.getSourceMap();
        java.io.PrintStream printStream20 = null;
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(printStream20);
        compiler21.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager23 = compiler21.getErrorManager();
        compiler10.setErrorManager(errorManager23);
        com.google.javascript.jscomp.ErrorManager errorManager25 = compiler10.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState26 = compiler10.getState();
        compiler1.setState(intermediateState26);
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNull(sourceMap19);
        org.junit.Assert.assertNotNull(errorManager23);
        org.junit.Assert.assertNotNull(errorManager25);
        org.junit.Assert.assertNotNull(intermediateState26);
    }
}

