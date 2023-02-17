import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
        com.google.javascript.jscomp.CodingConvention codingConvention41 = compiler1.getCodingConvention();
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
        org.junit.Assert.assertNotNull(codingConvention41);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.jscomp.Result result7 = compiler1.getResult();
        boolean boolean8 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler1.getCodingConvention();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(result7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(codingConvention9);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        boolean boolean6 = compiler1.isIdeMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getMessages();
        java.lang.String str8 = compiler1.toSource();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.SourceFile sourceFile10 = null;
        com.google.javascript.jscomp.SourceFile sourceFile11 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result13 = compiler1.compile(sourceFile10, sourceFile11, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jSTypeRegistry9);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        int int2 = codeBuilder0.getLength();
        java.lang.String str3 = codeBuilder0.toString();
        int int4 = codeBuilder0.getLength();
        java.lang.String str5 = codeBuilder0.toString();
        java.lang.String str6 = codeBuilder0.toString();
        int int7 = codeBuilder0.getLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        com.google.javascript.jscomp.JSError jSError11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError11);
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
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        double double7 = compiler1.getProgress();
        boolean boolean8 = compiler1.acceptEcmaScript5();
        boolean boolean9 = compiler1.isIdeMode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = compiler1.getSourceLine("", (int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        com.google.javascript.jscomp.CodingConvention codingConvention17 = compiler1.getCodingConvention();
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
        org.junit.Assert.assertNotNull(codingConvention17);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Result result6 = compiler1.getResult();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(result6);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region13 = compiler1.getSourceRegion("", (int) (short) 1);
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
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        double double5 = compiler1.getProgress();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = compiler1.toSource(jSModule7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.isTypeCheckingEnabled();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler1.getState();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray12, jSSourceFileArray13, compilerOptions14);
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
        org.junit.Assert.assertNotNull(intermediateState11);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler1.getState();
        boolean boolean6 = compiler1.acceptConstKeyword();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler4.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler4.getErrorManager();
        compiler1.setErrorManager(errorManager7);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(errorManager7);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.lang.String str7 = compiler1.toSource();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler1.tracker = performanceTracker9;
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(jSErrorArray8);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler1.getTypeRegistry();
        int int8 = compiler1.getWarningCount();
        boolean boolean9 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode10 = compiler1.languageMode();
        com.google.javascript.jscomp.PassConfig passConfig11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig11);
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
        org.junit.Assert.assertTrue("'" + languageMode10 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode10.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray15 = compiler14.getErrors();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = compiler14.toSource();
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
        org.junit.Assert.assertNotNull(jSErrorArray15);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        boolean boolean16 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter17 = compiler1.getReverseAbstractInterpreter();
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
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter17);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.lang.String str7 = compiler1.toSource();
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
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        boolean boolean15 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode16 = compiler1.languageMode();
        compiler1.reportCodeChange();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + languageMode16 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode16.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptEcmaScript5();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getMessages();
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
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        java.io.PrintStream printStream24 = null;
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler(printStream24);
        compiler25.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker27 = null;
        compiler25.tracker = performanceTracker27;
        com.google.javascript.jscomp.Scope scope29 = compiler25.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap30 = compiler25.getSourceMap();
        java.lang.String str31 = compiler25.getAstDotGraph();
        java.lang.String str32 = compiler25.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope33 = compiler25.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap34 = compiler25.getSourceMap();
        java.io.PrintStream printStream35 = null;
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler(printStream35);
        compiler36.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager38 = compiler36.getErrorManager();
        compiler25.setErrorManager(errorManager38);
        com.google.javascript.jscomp.ErrorManager errorManager40 = compiler25.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState41 = compiler25.getState();
        compiler1.setState(intermediateState41);
        boolean boolean43 = compiler1.isTypeCheckingEnabled();
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
        org.junit.Assert.assertNull(scope29);
        org.junit.Assert.assertNull(sourceMap30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertNull(sourceMap34);
        org.junit.Assert.assertNotNull(errorManager38);
        org.junit.Assert.assertNotNull(errorManager40);
        org.junit.Assert.assertNotNull(intermediateState41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        java.lang.String str6 = compiler1.toSource();
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("", (int) (byte) -1);
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode10 = compiler1.languageMode();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler1.tracker = performanceTracker11;
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + languageMode10 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode10.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode40 = compiler1.languageMode();
        java.lang.String str43 = compiler1.getSourceLine("", 0);
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
        org.junit.Assert.assertTrue("'" + languageMode40 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode40.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        compiler1.disableThreads();
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
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        com.google.javascript.jscomp.Result result17 = compiler1.getResult();
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
        org.junit.Assert.assertNotNull(result17);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        com.google.javascript.jscomp.Scope scope11 = compiler1.getTopScope();
        int int12 = compiler1.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        java.lang.String str2 = codeBuilder0.toString();
        java.lang.String str3 = codeBuilder0.toString();
        java.lang.String str4 = codeBuilder0.toString();
        java.lang.String str5 = codeBuilder0.toString();
        java.lang.String str6 = codeBuilder0.toString();
        java.lang.String str7 = codeBuilder0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode7 = compiler1.languageMode();
        boolean boolean8 = compiler1.hasErrors();
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
        org.junit.Assert.assertTrue("'" + languageMode7 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode7.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler1.getErrorManager();
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
        org.junit.Assert.assertNotNull(errorManager19);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getMessages();
        boolean boolean8 = compiler1.isIdeMode();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler1.getErrorManager();
        com.google.javascript.jscomp.JSError jSError10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel11 = compiler1.getErrorLevel(jSError10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorManager9);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        boolean boolean6 = compiler1.isIdeMode();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(sourceMap7);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        java.lang.String str10 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        com.google.javascript.jscomp.SourceFile sourceFile10 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result13 = compiler1.compile(sourceFile10, jSSourceFileArray11, compilerOptions12);
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
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        double double15 = compiler14.getProgress();
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        compiler17.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler17.tracker = performanceTracker19;
        compiler17.reportCodeChange();
        compiler17.disableThreads();
        com.google.javascript.rhino.Node node23 = compiler17.getRoot();
        java.io.PrintStream printStream24 = null;
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler(printStream24);
        compiler25.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler25.getErrorManager();
        boolean boolean28 = compiler25.acceptConstKeyword();
        boolean boolean29 = compiler25.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = compiler25.getTypeRegistry();
        java.io.PrintStream printStream31 = null;
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler(printStream31);
        compiler32.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker34 = null;
        compiler32.tracker = performanceTracker34;
        com.google.javascript.jscomp.Scope scope36 = compiler32.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap37 = compiler32.getSourceMap();
        java.lang.String str38 = compiler32.getAstDotGraph();
        java.lang.String str39 = compiler32.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope40 = compiler32.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap41 = compiler32.getSourceMap();
        compiler32.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager43 = compiler32.getErrorManager();
        compiler25.setErrorManager(errorManager43);
        compiler17.setErrorManager(errorManager43);
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler(errorManager43);
        compiler14.setErrorManager(errorManager43);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention codingConvention48 = compiler14.getCodingConvention();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(errorManager27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry30);
        org.junit.Assert.assertNull(scope36);
        org.junit.Assert.assertNull(sourceMap37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(scope40);
        org.junit.Assert.assertNull(sourceMap41);
        org.junit.Assert.assertNotNull(errorManager43);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = compiler1.toSourceArray(jSModule12);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(region9);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput13 = compiler1.newExternInput("hi!");
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
        org.junit.Assert.assertNotNull(intermediateState11);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler1.tracker;
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler1.getWarnings();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
        org.junit.Assert.assertTrue("'" + languageMode9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode9.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(performanceTracker11);
        org.junit.Assert.assertNotNull(jSErrorArray12);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        com.google.javascript.rhino.Node node34 = compiler1.getRoot();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
            com.google.javascript.jscomp.Region region12 = compiler1.getSourceRegion("", (int) (short) 100);
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
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray24 = compiler1.getErrors();
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
        org.junit.Assert.assertNotNull(jSErrorArray24);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        java.lang.String str7 = compiler1.toSource();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        compiler1.reportCodeChange();
        int int9 = compiler1.getErrorCount();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker14 = null;
        compiler1.tracker = performanceTracker14;
        boolean boolean16 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceFile sourceFile17 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile18 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray19 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile18 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result21 = compiler1.compile(sourceFile17, jSSourceFileArray19, compilerOptions20);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray19);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        com.google.javascript.jscomp.Region region13 = compiler1.getSourceRegion("hi!", (int) (short) 0);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(result10);
        org.junit.Assert.assertNull(region13);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(sourceMap15);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        java.lang.String str23 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode24 = compiler1.languageMode();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + languageMode24 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode24.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler1.getCodingConvention();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(codingConvention16);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.Node node6 = compiler1.getRoot();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        compiler1.disableThreads();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        int int10 = compiler1.getErrorCount();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler1.getCodingConvention();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(codingConvention10);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler1.getErrorManager();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(errorManager7);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention12 = compiler1.getCodingConvention();
        com.google.javascript.jscomp.JSError jSError13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError13);
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
        org.junit.Assert.assertNotNull(codingConvention12);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Result result7 = compiler1.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getErrors();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(result7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        int int7 = compiler1.getWarningCount();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler1.getCodingConvention();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(codingConvention8);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        boolean boolean8 = compiler1.isTypeCheckingEnabled();
        java.lang.String str9 = compiler1.toSource();
        int int10 = compiler1.getWarningCount();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        int int32 = compiler1.getWarningCount();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable10 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler1.getTypeRegistry();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        int int5 = compiler1.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile7 };
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
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSModuleArray10);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler4.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler4.getErrorManager();
        compiler1.setErrorManager(errorManager7);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = compiler1.acceptEcmaScript5();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNull(performanceTracker9);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(errorManager4);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler5.tracker;
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNull(performanceTracker6);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        double double6 = compiler1.getProgress();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(sourceMap7);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        com.google.javascript.jscomp.SourceMap sourceMap25 = compiler24.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            compiler24.optimize();
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
        org.junit.Assert.assertNull(sourceMap25);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler1.getWarnings();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile14 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile14 };
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
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
        org.junit.Assert.assertNotNull(jSModuleArray17);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(errorManager10);
        com.google.javascript.rhino.Node node13 = compiler12.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray14 = compiler12.getWarnings();
        com.google.javascript.jscomp.JsAst jsAst15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler12.replaceScript(jsAst15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(jSErrorArray14);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode25 = compiler1.languageMode();
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
        org.junit.Assert.assertTrue("'" + languageMode25 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode25.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter6 = compiler1.getReverseAbstractInterpreter();
        java.lang.Class<?> wildcardClass7 = compiler1.getClass();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray29 = compiler1.getErrors();
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
        org.junit.Assert.assertNotNull(jSErrorArray29);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
            com.google.javascript.jscomp.SymbolTable symbolTable9 = compiler1.buildKnownSymbolTable();
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
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        org.junit.Assert.assertNotNull(intermediateState21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        com.google.javascript.jscomp.SourceFile sourceFile42 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result44 = compiler1.compile(sourceFile41, sourceFile42, compilerOptions43);
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
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        compiler1.disableThreads();
        int int9 = compiler1.getErrorCount();
        com.google.javascript.jscomp.Scope scope10 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler1.getSourceMap();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(sourceMap11);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        compiler1.disableThreads();
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
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        compiler7.disableThreads();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler10.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode13 = compiler10.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler10.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler10.getErrorManager();
        compiler7.setErrorManager(errorManager15);
        compiler7.reportCodeChange();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertTrue("'" + languageMode13 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode13.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(errorManager15);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler1.getState();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(intermediateState9);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getMessages();
        java.lang.String str8 = compiler1.getAstDotGraph();
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
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        com.google.javascript.rhino.Node node11 = compiler1.getRoot();
        boolean boolean12 = compiler1.isTypeCheckingEnabled();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(result10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        com.google.javascript.jscomp.JSModule[] jSModuleArray17 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray16, jSModuleArray17, compilerOptions18);
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
        org.junit.Assert.assertNotNull(jSModuleArray17);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter6 = compiler1.getReverseAbstractInterpreter();
        java.lang.String str9 = compiler1.getSourceLine("", 0);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = compiler1.getReverseAbstractInterpreter();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        java.lang.String str10 = compiler1.toSource();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(performanceTracker9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder35 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int36 = codeBuilder35.getLength();
        int int37 = codeBuilder35.getLength();
        int int38 = codeBuilder35.getLength();
        int int39 = codeBuilder35.getLength();
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder35, (int) (short) 10, node41);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
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
        org.junit.Assert.assertNull(region34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        compiler1.reportCodeChange();
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
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        double double15 = compiler14.getProgress();
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        compiler17.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler17.tracker = performanceTracker19;
        compiler17.reportCodeChange();
        compiler17.disableThreads();
        com.google.javascript.rhino.Node node23 = compiler17.getRoot();
        java.io.PrintStream printStream24 = null;
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler(printStream24);
        compiler25.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler25.getErrorManager();
        boolean boolean28 = compiler25.acceptConstKeyword();
        boolean boolean29 = compiler25.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = compiler25.getTypeRegistry();
        java.io.PrintStream printStream31 = null;
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler(printStream31);
        compiler32.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker34 = null;
        compiler32.tracker = performanceTracker34;
        com.google.javascript.jscomp.Scope scope36 = compiler32.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap37 = compiler32.getSourceMap();
        java.lang.String str38 = compiler32.getAstDotGraph();
        java.lang.String str39 = compiler32.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope40 = compiler32.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap41 = compiler32.getSourceMap();
        compiler32.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager43 = compiler32.getErrorManager();
        compiler25.setErrorManager(errorManager43);
        compiler17.setErrorManager(errorManager43);
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler(errorManager43);
        compiler14.setErrorManager(errorManager43);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker48 = null;
        compiler14.tracker = performanceTracker48;
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(errorManager27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry30);
        org.junit.Assert.assertNull(scope36);
        org.junit.Assert.assertNull(sourceMap37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(scope40);
        org.junit.Assert.assertNull(sourceMap41);
        org.junit.Assert.assertNotNull(errorManager43);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler16.getState();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(intermediateState17);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler1.getCodingConvention();
        boolean boolean8 = compiler1.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler1.tracker = performanceTracker9;
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler12.getErrorManager();
        com.google.javascript.jscomp.Scope scope15 = compiler12.getTopScope();
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
        java.io.PrintStream printStream34 = null;
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler(printStream34);
        compiler35.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager37 = compiler35.getErrorManager();
        boolean boolean38 = compiler35.acceptConstKeyword();
        boolean boolean39 = compiler35.acceptEcmaScript5();
        java.lang.String str40 = compiler35.toSource();
        java.io.PrintStream printStream41 = null;
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler(printStream41);
        compiler42.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker44 = null;
        compiler42.tracker = performanceTracker44;
        com.google.javascript.jscomp.Scope scope46 = compiler42.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap47 = compiler42.getSourceMap();
        java.lang.String str48 = compiler42.getAstDotGraph();
        java.lang.String str49 = compiler42.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope50 = compiler42.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap51 = compiler42.getSourceMap();
        compiler42.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager53 = compiler42.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter54 = compiler42.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager55 = compiler42.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler56 = new com.google.javascript.jscomp.Compiler(errorManager55);
        compiler35.setErrorManager(errorManager55);
        compiler17.setErrorManager(errorManager55);
        compiler12.setErrorManager(errorManager55);
        compiler1.setErrorManager(errorManager55);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(sourceMap22);
        org.junit.Assert.assertNotNull(intermediateState23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(scope30);
        org.junit.Assert.assertNull(sourceMap31);
        org.junit.Assert.assertNotNull(intermediateState32);
        org.junit.Assert.assertNotNull(errorManager37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(scope46);
        org.junit.Assert.assertNull(sourceMap47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(scope50);
        org.junit.Assert.assertNull(sourceMap51);
        org.junit.Assert.assertNotNull(errorManager53);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter54);
        org.junit.Assert.assertNotNull(errorManager55);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getMessages();
        boolean boolean9 = compiler1.isIdeMode();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result13 = compiler1.compile(jSSourceFileArray10, jSSourceFileArray11, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode7 = compiler1.languageMode();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler1.getSourceMap();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + languageMode7 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode7.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap9);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node5 = compiler1.getRoot();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        compiler1.disableThreads();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile8 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray10 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray9, jSModuleArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertNotNull(jSModuleArray10);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        double double7 = compiler1.getProgress();
        boolean boolean8 = compiler1.acceptEcmaScript5();
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
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(errorManager4);
        // The following exception was thrown during execution in test generation
        try {
            compiler5.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        int int5 = compiler1.getErrorCount();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] { jSModule7 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler1.compile(jSSourceFileArray6, jSModuleArray8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertNotNull(jSModuleArray8);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        com.google.javascript.jscomp.JsAst jsAst15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addNewScript(jsAst15);
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
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        com.google.javascript.jscomp.SourceMap sourceMap33 = compiler1.getSourceMap();
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
        org.junit.Assert.assertNull(sourceMap33);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler4.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler4.getErrorManager();
        compiler1.setErrorManager(errorManager7);
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getWarnings();
        com.google.javascript.jscomp.Result result10 = compiler1.getResult();
        com.google.javascript.jscomp.Scope scope11 = compiler1.getTopScope();
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(result10);
        org.junit.Assert.assertNull(scope11);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        compiler1.reportCodeChange();
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
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(errorManager10);
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager10);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertNotNull(errorManager10);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        boolean boolean30 = compiler1.isIdeMode();
        com.google.javascript.jscomp.SourceFile sourceFile31 = null;
        com.google.javascript.jscomp.SourceFile sourceFile32 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result34 = compiler1.compile(sourceFile31, sourceFile32, compilerOptions33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler1.getErrors();
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
        org.junit.Assert.assertNotNull(jSErrorArray17);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        com.google.javascript.jscomp.ErrorManager errorManager30 = compiler1.getErrorManager();
        java.lang.String str31 = compiler1.toSource();
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
        org.junit.Assert.assertNotNull(errorManager30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        compiler1.disableThreads();
        com.google.javascript.rhino.Node node8 = compiler1.getRoot();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] { jSModule10 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result13 = compiler1.compile(jSSourceFile9, jSModuleArray11, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(jSModuleArray11);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        com.google.javascript.jscomp.PassConfig passConfig11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig11);
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
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter6 = compiler1.getReverseAbstractInterpreter();
        java.lang.String str9 = compiler1.getSourceLine("", 0);
        java.io.PrintStream printStream10 = null;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(printStream10);
        compiler11.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler11.getErrorManager();
        boolean boolean14 = compiler11.acceptConstKeyword();
        boolean boolean15 = compiler11.hasErrors();
        boolean boolean16 = compiler11.acceptEcmaScript5();
        com.google.javascript.rhino.Node node17 = compiler11.getRoot();
        boolean boolean18 = compiler11.hasErrors();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler11.getState();
        compiler1.setState(intermediateState19);
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intermediateState19);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getErrors();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable12 = compiler1.buildKnownSymbolTable();
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
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        compiler1.reportCodeChange();
        boolean boolean33 = compiler1.hasErrors();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = compiler1.isIdeMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        double double7 = compiler1.getProgress();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        com.google.javascript.jscomp.PassConfig passConfig8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler7.setPassConfig(passConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler1.tracker = performanceTracker8;
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getErrors();
        com.google.javascript.jscomp.Result result10 = compiler1.getResult();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(result10);
    }
}

