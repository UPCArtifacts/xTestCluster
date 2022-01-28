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
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("hi!", (int) (byte) -1);
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler1.getErrors();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = compiler1.toSource(jSModule11);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        java.io.PrintStream printStream18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(printStream18);
        compiler19.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler19.getErrorManager();
        boolean boolean22 = compiler19.acceptConstKeyword();
        boolean boolean23 = compiler19.acceptEcmaScript5();
        java.lang.String str24 = compiler19.toSource();
        java.io.PrintStream printStream25 = null;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(printStream25);
        compiler26.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker28 = null;
        compiler26.tracker = performanceTracker28;
        com.google.javascript.jscomp.Scope scope30 = compiler26.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap31 = compiler26.getSourceMap();
        java.lang.String str32 = compiler26.getAstDotGraph();
        java.lang.String str33 = compiler26.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope34 = compiler26.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap35 = compiler26.getSourceMap();
        compiler26.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager37 = compiler26.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter38 = compiler26.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager39 = compiler26.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler(errorManager39);
        compiler19.setErrorManager(errorManager39);
        compiler1.setErrorManager(errorManager39);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput44 = compiler1.newExternInput("hi!");
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
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(scope30);
        org.junit.Assert.assertNull(sourceMap31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNull(sourceMap35);
        org.junit.Assert.assertNotNull(errorManager37);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter38);
        org.junit.Assert.assertNotNull(errorManager39);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput14 = compiler1.newExternInput("hi!");
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
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        compiler1.disableThreads();
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
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = compiler1.tracker;
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(performanceTracker10);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
            boolean boolean11 = compiler1.acceptEcmaScript5();
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
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        int int8 = compiler1.getWarningCount();
        int int9 = compiler1.getWarningCount();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
            compiler1.addNewScript(jsAst32);
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
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        int int9 = compiler1.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        boolean boolean28 = compiler1.acceptConstKeyword();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        compiler6.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler6.tracker = performanceTracker8;
        com.google.javascript.jscomp.Scope scope10 = compiler6.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler6.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler6.getState();
        java.lang.String str13 = compiler6.getAstDotGraph();
        java.io.PrintStream printStream14 = null;
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(printStream14);
        compiler15.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = null;
        compiler15.tracker = performanceTracker17;
        com.google.javascript.jscomp.Scope scope19 = compiler15.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap20 = compiler15.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState21 = compiler15.getState();
        compiler6.setState(intermediateState21);
        java.io.PrintStream printStream23 = null;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(printStream23);
        compiler24.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler24.getErrorManager();
        boolean boolean27 = compiler24.acceptConstKeyword();
        boolean boolean28 = compiler24.acceptEcmaScript5();
        java.lang.String str29 = compiler24.toSource();
        java.io.PrintStream printStream30 = null;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler(printStream30);
        compiler31.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker33 = null;
        compiler31.tracker = performanceTracker33;
        com.google.javascript.jscomp.Scope scope35 = compiler31.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap36 = compiler31.getSourceMap();
        java.lang.String str37 = compiler31.getAstDotGraph();
        java.lang.String str38 = compiler31.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope39 = compiler31.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap40 = compiler31.getSourceMap();
        compiler31.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager42 = compiler31.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter43 = compiler31.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager44 = compiler31.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler(errorManager44);
        compiler24.setErrorManager(errorManager44);
        compiler6.setErrorManager(errorManager44);
        compiler1.setErrorManager(errorManager44);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNull(sourceMap20);
        org.junit.Assert.assertNotNull(intermediateState21);
        org.junit.Assert.assertNotNull(errorManager26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(scope35);
        org.junit.Assert.assertNull(sourceMap36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(scope39);
        org.junit.Assert.assertNull(sourceMap40);
        org.junit.Assert.assertNotNull(errorManager42);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter43);
        org.junit.Assert.assertNotNull(errorManager44);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler1.getWarnings();
        boolean boolean17 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter18 = compiler1.getReverseAbstractInterpreter();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter18);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
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
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSModuleArray12);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        int int2 = codeBuilder0.getLength();
        java.lang.String str3 = codeBuilder0.toString();
        int int4 = codeBuilder0.getLength();
        int int5 = codeBuilder0.getLength();
        int int6 = codeBuilder0.getLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        boolean boolean10 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = compiler1.toSourceArray(jSModule11);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        com.google.javascript.jscomp.SourceFile sourceFile13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = compiler1.parse(sourceFile13);
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
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        compiler1.reportCodeChange();
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
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSModuleArray11);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.reportCodeChange();
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
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        com.google.javascript.jscomp.JsAst jsAst24 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst24);
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
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        double double7 = compiler1.getProgress();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler1.languageMode();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        compiler1.disableThreads();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap31 = compiler1.getInputsById();
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
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.isIdeMode();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        com.google.javascript.jscomp.CodingConvention codingConvention32 = compiler1.getCodingConvention();
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
        org.junit.Assert.assertNotNull(codingConvention32);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile18 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray19 = new com.google.javascript.jscomp.JSModule[] {};
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
        org.junit.Assert.assertNotNull(jSModuleArray19);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        double double13 = compiler1.getProgress();
        com.google.javascript.jscomp.JSError[] jSErrorArray14 = compiler1.getWarnings();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(jSErrorArray14);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        compiler1.disableThreads();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter12 = compiler1.getReverseAbstractInterpreter();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter12);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        com.google.javascript.jscomp.Scope scope16 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNull(performanceTracker15);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray5 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.Node node6 = compiler1.getRoot();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler1.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSModuleArray8);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        com.google.javascript.jscomp.PassConfig passConfig15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig15);
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
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        int int7 = compiler1.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
            java.lang.String[] strArray10 = compiler1.toSourceArray();
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
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        boolean boolean5 = compiler1.acceptConstKeyword();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap6 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        java.lang.String str4 = compiler0.getSourceLine("hi!", (int) (short) 0);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(performanceTracker5);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder10 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int11 = codeBuilder10.getLength();
        java.lang.String str12 = codeBuilder10.toString();
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder10, (int) (short) 10, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler1.tracker = performanceTracker8;
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
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker30 = compiler1.tracker;
        compiler1.disableThreads();
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
        org.junit.Assert.assertNull(performanceTracker30);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        java.lang.String str6 = compiler1.toSource();
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("", (int) (byte) -1);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = compiler1.getTypeRegistry();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNotNull(jSTypeRegistry10);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        java.lang.Class<?> wildcardClass15 = compiler1.getClass();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap5 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
            com.google.javascript.jscomp.SymbolTable symbolTable11 = compiler1.buildKnownSymbolTable();
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
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        java.lang.String str10 = compiler1.getAstDotGraph();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        int int11 = codeBuilder7.getLength();
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder7, (int) ' ', node13);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(performanceTracker7);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        boolean boolean5 = compiler1.acceptConstKeyword();
        java.lang.String str6 = compiler1.toSource();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput11 = compiler1.newExternInput("hi!");
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
        org.junit.Assert.assertNull(performanceTracker9);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        compiler1.disableThreads();
        java.lang.Class<?> wildcardClass8 = compiler1.getClass();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler1.languageMode();
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
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getErrors();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable7 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSErrorArray6);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        double double7 = compiler1.getProgress();
        com.google.javascript.jscomp.JSError jSError8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel9 = compiler1.getErrorLevel(jSError8);
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
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        com.google.javascript.jscomp.ErrorManager errorManager12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setErrorManager(errorManager12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: the error manager cannot be null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler1.getErrors();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNotNull(jSErrorArray11);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node2 = compiler1.getRoot();
        com.google.javascript.rhino.Node node3 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = compiler1.getErrorCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        java.lang.String str8 = compiler7.getAstDotGraph();
        com.google.javascript.jscomp.PassConfig passConfig9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler7.setPassConfig(passConfig9);
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
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        com.google.javascript.jscomp.CodingConvention codingConvention36 = compiler1.getCodingConvention();
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
        org.junit.Assert.assertNotNull(codingConvention36);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        int int7 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getMessages();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray8);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        compiler1.disableThreads();
        java.lang.String str12 = compiler1.toSource();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.isIdeMode();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler1.getState();
        com.google.javascript.jscomp.JsAst jsAst18 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addNewScript(jsAst18);
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intermediateState17);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
            com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = compiler1.getTypeRegistry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(performanceTracker7);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        com.google.javascript.jscomp.Scope scope16 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNull(performanceTracker15);
        org.junit.Assert.assertNull(scope16);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
            java.lang.String[] strArray22 = compiler1.toSourceArray();
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
        org.junit.Assert.assertNotNull(intermediateState21);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode7 = compiler1.languageMode();
        double double8 = compiler1.getProgress();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + languageMode7 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode7.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        java.lang.String str23 = compiler1.getAstDotGraph();
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
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNotNull(jSTypeRegistry22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray16 = null;
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
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter13);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray18);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(performanceTracker9);
        org.junit.Assert.assertNotNull(result10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        compiler18.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = null;
        compiler18.tracker = performanceTracker20;
        com.google.javascript.jscomp.Scope scope22 = compiler18.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap23 = compiler18.getSourceMap();
        java.lang.String str24 = compiler18.getAstDotGraph();
        java.lang.String str25 = compiler18.getAstDotGraph();
        com.google.javascript.rhino.Node node26 = compiler18.getRoot();
        com.google.javascript.rhino.Node node27 = compiler18.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState28 = compiler18.getState();
        compiler1.setState(intermediateState28);
        com.google.javascript.jscomp.JSError jSError30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel31 = compiler1.getErrorLevel(jSError30);
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
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertNull(sourceMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(intermediateState28);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        com.google.javascript.jscomp.Scope scope10 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNull(scope10);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler1.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNull(performanceTracker7);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
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
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
            com.google.javascript.jscomp.CheckLevel checkLevel19 = compiler1.getErrorLevel(jSError18);
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
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder9 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder9, (int) 'a', node11);
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
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
            com.google.javascript.jscomp.Region region11 = compiler8.getSourceRegion("hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.PassConfig passConfig8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig8);
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
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getMessages();
        boolean boolean8 = compiler1.hasErrors();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        boolean boolean15 = compiler1.acceptEcmaScript5();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertNull(performanceTracker14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler1.getErrors();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(jSErrorArray10);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSModuleArray12);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        boolean boolean12 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JsAst jsAst13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addNewScript(jsAst13);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
            compiler1.normalize();
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
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler1.getCodingConvention();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(codingConvention8);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig29 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig29);
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

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        org.junit.Assert.assertNotNull(errorManager23);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray22 = compiler1.getWarnings();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray23 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule24 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray25 = new com.google.javascript.jscomp.JSModule[] { jSModule24 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray23, jSModuleArray25, compilerOptions26);
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
        org.junit.Assert.assertNotNull(jSErrorArray22);
        org.junit.Assert.assertNotNull(jSSourceFileArray23);
        org.junit.Assert.assertNotNull(jSModuleArray25);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        com.google.javascript.rhino.InputId inputId11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput12 = compiler1.getInput(inputId11);
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
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        org.junit.Assert.assertNotNull(intermediateState31);
        org.junit.Assert.assertNull(scope32);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler1.tracker = performanceTracker9;
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        compiler1.disableThreads();
        com.google.javascript.rhino.Node node8 = compiler1.getRoot();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        com.google.javascript.jscomp.Scope scope16 = compiler1.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNull(performanceTracker15);
        org.junit.Assert.assertNull(scope16);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        java.lang.String str7 = compiler1.toSource();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getWarnings();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(jSErrorArray8);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        int int22 = compiler1.getErrorCount();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node5 = compiler1.getRoot();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        compiler1.disableThreads();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler1.toSourceArray(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        boolean boolean25 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Scope scope26 = compiler1.getTopScope();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(scope26);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap9 = compiler1.getInputsById();
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
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable8 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray18 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile19 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray20 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile19 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray18, jSSourceFileArray20, compilerOptions21);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray18);
        org.junit.Assert.assertNotNull(jSSourceFileArray20);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region33 = compiler1.getSourceRegion("hi!", (int) '#');
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
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        org.junit.Assert.assertNotNull(errorManager8);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = compiler10.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter14 = compiler10.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler10.getErrorManager();
        boolean boolean16 = compiler10.acceptConstKeyword();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter17 = compiler10.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker18 = null;
        compiler10.tracker = performanceTracker18;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = null;
        compiler10.tracker = performanceTracker20;
        com.google.javascript.jscomp.JSError[] jSErrorArray22 = compiler10.getMessages();
        com.google.javascript.jscomp.ErrorManager errorManager23 = compiler10.getErrorManager();
        compiler1.setErrorManager(errorManager23);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNull(performanceTracker12);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter14);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter17);
        org.junit.Assert.assertNotNull(jSErrorArray22);
        org.junit.Assert.assertNotNull(errorManager23);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
            boolean boolean8 = compiler1.acceptConstKeyword();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
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
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler15.initOptions(compilerOptions17);
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
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
            compiler1.optimize();
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
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
            boolean boolean9 = compiler1.hasErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker8);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        boolean boolean25 = compiler1.acceptEcmaScript5();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        org.junit.Assert.assertNotNull(intermediateState21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray23);
        org.junit.Assert.assertNotNull(jSModuleArray25);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler1.getTypeRegistry();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        com.google.javascript.rhino.Node node5 = compiler1.getRoot();
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
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertNotNull(jSModuleArray7);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        compiler1.reportCodeChange();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(sourceMap7);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        com.google.javascript.rhino.Node node22 = compiler1.getRoot();
        compiler1.reportCodeChange();
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
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
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
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        boolean boolean13 = compiler1.hasErrors();
        com.google.javascript.jscomp.SourceFile sourceFile14 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result17 = compiler1.compile(sourceFile14, jSSourceFileArray15, compilerOptions16);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("hi!", (int) (byte) -1);
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler1.getErrors();
        java.lang.Class<?> wildcardClass11 = compiler1.getClass();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile6 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler1.compile(jSSourceFileArray5, jSSourceFileArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.lang.String str6 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
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
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler(errorManager23);
        compiler1.setErrorManager(errorManager23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = compiler1.toSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNull(sourceMap19);
        org.junit.Assert.assertNotNull(errorManager23);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
            com.google.javascript.jscomp.SymbolTable symbolTable22 = compiler1.buildKnownSymbolTable();
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
        org.junit.Assert.assertNotNull(intermediateState21);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node6 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        boolean boolean12 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions13);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        double double7 = compiler1.getProgress();
        com.google.javascript.jscomp.SourceFile sourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler1.compile(sourceFile8, jSSourceFileArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
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
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        boolean boolean8 = compiler1.acceptConstKeyword();
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
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        boolean boolean6 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = compiler1.toSourceArray(jSModule7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker30 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention codingConvention31 = compiler1.getCodingConvention();
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
        org.junit.Assert.assertNull(performanceTracker30);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        java.lang.String str6 = compiler1.toSource();
        com.google.javascript.jscomp.Scope scope7 = compiler1.getTopScope();
        java.io.PrintStream printStream8 = null;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream8);
        compiler9.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler9.tracker = performanceTracker11;
        com.google.javascript.jscomp.Scope scope13 = compiler9.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap14 = compiler9.getSourceMap();
        java.lang.String str15 = compiler9.getAstDotGraph();
        java.lang.String str16 = compiler9.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope17 = compiler9.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap18 = compiler9.getSourceMap();
        java.io.PrintStream printStream19 = null;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream19);
        compiler20.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager22 = compiler20.getErrorManager();
        compiler9.setErrorManager(errorManager22);
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(errorManager22);
        compiler1.setErrorManager(errorManager22);
        boolean boolean26 = compiler1.hasErrors();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNull(sourceMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNull(sourceMap18);
        org.junit.Assert.assertNotNull(errorManager22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter23 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile24 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile24 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result28 = compiler1.compile(jSSourceFileArray25, jSSourceFileArray26, compilerOptions27);
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
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter23);
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker14 = compiler12.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler12.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter16 = compiler12.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler12.getErrorManager();
        boolean boolean18 = compiler12.acceptConstKeyword();
        com.google.javascript.rhino.Node node19 = compiler12.getRoot();
        java.io.PrintStream printStream20 = null;
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(printStream20);
        compiler21.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = null;
        compiler21.tracker = performanceTracker23;
        com.google.javascript.jscomp.Scope scope25 = compiler21.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler21.getSourceMap();
        java.lang.String str27 = compiler21.getAstDotGraph();
        java.lang.String str28 = compiler21.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope29 = compiler21.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap30 = compiler21.getSourceMap();
        java.io.PrintStream printStream31 = null;
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler(printStream31);
        compiler32.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager34 = compiler32.getErrorManager();
        compiler21.setErrorManager(errorManager34);
        com.google.javascript.jscomp.ErrorManager errorManager36 = compiler21.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState37 = compiler21.getState();
        compiler12.setState(intermediateState37);
        compiler1.setState(intermediateState37);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(performanceTracker14);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter16);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(scope25);
        org.junit.Assert.assertNull(sourceMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(scope29);
        org.junit.Assert.assertNull(sourceMap30);
        org.junit.Assert.assertNotNull(errorManager34);
        org.junit.Assert.assertNotNull(errorManager36);
        org.junit.Assert.assertNotNull(intermediateState37);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        compiler1.disableThreads();
        java.lang.String str9 = compiler1.getAstDotGraph();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        compiler1.disableThreads();
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = null;
        compiler1.tracker = performanceTracker4;
        org.junit.Assert.assertNotNull(errorManager3);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = compiler1.getTypeRegistry();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(jSTypeRegistry13);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        boolean boolean8 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder9 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int10 = codeBuilder9.getLength();
        int int11 = codeBuilder9.getLength();
        java.lang.String str12 = codeBuilder9.toString();
        java.lang.String str13 = codeBuilder9.toString();
        int int14 = codeBuilder9.getLength();
        java.lang.String str15 = codeBuilder9.toString();
        java.lang.String str16 = codeBuilder9.toString();
        int int17 = codeBuilder9.getLength();
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder9, 0, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
            boolean boolean8 = compiler1.isIdeMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        int int5 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode7 = compiler1.languageMode();
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
        org.junit.Assert.assertTrue("'" + languageMode7 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode7.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
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
        org.junit.Assert.assertNull(sourceMap6);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        int int2 = codeBuilder0.getLength();
        java.lang.String str3 = codeBuilder0.toString();
        int int4 = codeBuilder0.getLength();
        int int5 = codeBuilder0.getLength();
        java.lang.String str6 = codeBuilder0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
            compiler1.rebuildInputsFromModules();
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
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray22 = compiler1.getWarnings();
        com.google.javascript.rhino.InputId inputId23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput24 = compiler1.getInput(inputId23);
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
        org.junit.Assert.assertNotNull(jSErrorArray22);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
            compiler1.processDefines();
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
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler1.getState();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result8 = compiler1.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(intermediateState6);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setState(intermediateState17);
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
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        java.lang.String str8 = compiler7.getAstDotGraph();
        com.google.javascript.rhino.Node node9 = compiler7.getRoot();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig11);
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
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile27 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray28 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile27 };
        com.google.javascript.jscomp.JSSourceFile jSSourceFile29 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray30 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile29 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result32 = compiler1.compile(jSSourceFileArray28, jSSourceFileArray30, compilerOptions31);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray28);
        org.junit.Assert.assertNotNull(jSSourceFileArray30);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile8 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray7, jSSourceFileArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        int int8 = compiler1.getWarningCount();
        boolean boolean9 = compiler1.isIdeMode();
        compiler1.reportCodeChange();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler1.getErrors();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        int int2 = codeBuilder0.getLength();
        java.lang.String str3 = codeBuilder0.toString();
        java.lang.String str4 = codeBuilder0.toString();
        java.lang.String str5 = codeBuilder0.toString();
        int int6 = codeBuilder0.getLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        boolean boolean22 = compiler1.hasErrors();
        com.google.javascript.rhino.Node node23 = compiler1.getRoot();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        double double7 = compiler1.getProgress();
        java.lang.String str8 = compiler1.getAstDotGraph();
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
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        org.junit.Assert.assertNotNull(errorManager13);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(scope10);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.jscomp.JsAst jsAst3 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        com.google.javascript.jscomp.CodingConvention codingConvention34 = compiler1.getCodingConvention();
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
        org.junit.Assert.assertNotNull(codingConvention34);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        int int2 = codeBuilder0.getLength();
        int int3 = codeBuilder0.getLength();
        int int4 = codeBuilder0.getLength();
        int int5 = codeBuilder0.getLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler1.getErrors();
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
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertNotNull(result17);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = null;
        compiler1.tracker = performanceTracker23;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState25 = compiler1.getState();
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
        org.junit.Assert.assertNotNull(intermediateState25);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        int int2 = codeBuilder0.getLength();
        java.lang.String str3 = codeBuilder0.toString();
        java.lang.String str4 = codeBuilder0.toString();
        int int5 = codeBuilder0.getLength();
        java.lang.String str6 = codeBuilder0.toString();
        java.lang.String str7 = codeBuilder0.toString();
        int int8 = codeBuilder0.getLength();
        int int9 = codeBuilder0.getLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler1.tracker = performanceTracker8;
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNotNull(errorManager9);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        int int16 = compiler1.getErrorCount();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        int int5 = compiler1.getWarningCount();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = compiler1.getSourceLine("hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(sourceMap6);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = null;
        compiler1.tracker = performanceTracker16;
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
        org.junit.Assert.assertNotNull(result15);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        boolean boolean34 = compiler1.isIdeMode();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile35 = null;
        com.google.javascript.jscomp.JSModule jSModule36 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray37 = new com.google.javascript.jscomp.JSModule[] { jSModule36 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result39 = compiler1.compile(jSSourceFile35, jSModuleArray37, compilerOptions38);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSModuleArray37);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(errorManager21);
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler(errorManager21);
        com.google.javascript.jscomp.PassConfig passConfig26 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler25.setPassConfig(passConfig26);
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
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(errorManager4);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler1.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler1.getErrorManager();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(errorManager15);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler7.getMessages();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertTrue("'" + languageMode13 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode13.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(jSErrorArray17);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        java.lang.String str2 = codeBuilder0.toString();
        java.lang.String str3 = codeBuilder0.toString();
        int int4 = codeBuilder0.getLength();
        int int5 = codeBuilder0.getLength();
        int int6 = codeBuilder0.getLength();
        java.lang.Class<?> wildcardClass7 = codeBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        org.junit.Assert.assertTrue("'" + languageMode15 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode15.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter13 = compiler1.getReverseAbstractInterpreter();
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
        org.junit.Assert.assertNotNull(intermediateState12);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler1.tracker;
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions10);
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
        org.junit.Assert.assertNull(performanceTracker9);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter11 = compiler1.getReverseAbstractInterpreter();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter11);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker8);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        java.lang.String str10 = compiler1.getAstDotGraph();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
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
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("hi!", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap10 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(region9);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.jscomp.Result result7 = compiler1.getResult();
        boolean boolean8 = compiler1.acceptConstKeyword();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(result7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        com.google.javascript.jscomp.PassConfig passConfig11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig11);
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
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        compiler1.reportCodeChange();
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
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        boolean boolean6 = compiler1.isIdeMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getMessages();
        java.lang.String str8 = compiler1.toSource();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler1.tracker = performanceTracker9;
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
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node2 = compiler1.getRoot();
        com.google.javascript.rhino.Node node3 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap9 = compiler1.getInputsById();
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
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder25 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int26 = codeBuilder25.getLength();
        int int27 = codeBuilder25.getLength();
        java.lang.String str28 = codeBuilder25.toString();
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder25, (-1), node30);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler1.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler1.tracker = performanceTracker9;
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNull(performanceTracker8);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler1.getMessages();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(jSErrorArray16);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput42 = compiler1.newExternInput("hi!");
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
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter6 = compiler1.getReverseAbstractInterpreter();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter6);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        int int8 = compiler1.getErrorCount();
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
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        boolean boolean8 = compiler1.isTypeCheckingEnabled();
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
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        com.google.javascript.jscomp.JSError jSError17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError17);
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
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
        org.junit.Assert.assertNotNull(jSModuleArray17);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray16 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray17 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result19 = compiler14.compile(jSSourceFileArray16, jSSourceFileArray17, compilerOptions18);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray16);
        org.junit.Assert.assertNotNull(jSSourceFileArray17);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler1.tracker = performanceTracker10;
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(codingConvention9);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions18);
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
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        com.google.javascript.jscomp.JSError jSError41 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError41);
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
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.Node node6 = compiler1.getRoot();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.rhino.Node node9 = compiler1.getRoot();
        com.google.javascript.jscomp.JSError jSError10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray22 = compiler1.getWarnings();
        int int23 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray24 = compiler1.getWarnings();
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
        org.junit.Assert.assertNotNull(jSErrorArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray24);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        boolean boolean15 = compiler1.hasErrors();
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
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        java.lang.Class<?> wildcardClass10 = compiler1.getClass();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        int int8 = compiler1.getWarningCount();
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
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        java.lang.String str2 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler0.getSourceMap();
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(sourceMap3);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.Node node6 = compiler1.getRoot();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.rhino.Node node9 = compiler1.getRoot();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSModuleArray11);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = compiler1.toSourceArray(jSModule11);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
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
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler1.tracker;
        boolean boolean9 = compiler1.isIdeMode();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        com.google.javascript.jscomp.JsAst jsAst30 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addNewScript(jsAst30);
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
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.rhino.Node node9 = compiler1.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler1.getState();
        boolean boolean11 = compiler1.isIdeMode();
        java.lang.Class<?> wildcardClass12 = compiler1.getClass();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        double double10 = compiler1.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler1.getWarnings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertNull(performanceTracker14);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        boolean boolean5 = compiler1.acceptConstKeyword();
        java.lang.String str6 = compiler1.toSource();
        boolean boolean7 = compiler1.acceptConstKeyword();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        int int31 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError jSError32 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel33 = compiler1.getErrorLevel(jSError32);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        double double17 = compiler16.getProgress();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler1.languageMode();
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
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler(errorManager23);
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(errorManager23);
        compiler1.setErrorManager(errorManager23);
        com.google.javascript.jscomp.JSModule jSModule28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = compiler1.toSource(jSModule28);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNull(sourceMap19);
        org.junit.Assert.assertNotNull(errorManager23);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        com.google.javascript.jscomp.CodingConvention codingConvention11 = compiler1.getCodingConvention();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
        org.junit.Assert.assertTrue("'" + languageMode9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode9.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(codingConvention11);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode7 = compiler1.languageMode();
        compiler1.disableThreads();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + languageMode7 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode7.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        boolean boolean6 = compiler1.isIdeMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getMessages();
        int int8 = compiler1.getWarningCount();
        int int9 = compiler1.getWarningCount();
        com.google.javascript.rhino.InputId inputId10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput11 = compiler1.getInput(inputId10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.jscomp.Result result7 = compiler1.getResult();
        compiler1.reportCodeChange();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(result7);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler1.getCodingConvention();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable7 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(codingConvention6);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        boolean boolean11 = compiler1.acceptConstKeyword();
        com.google.javascript.rhino.InputId inputId12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput13 = compiler1.getInput(inputId12);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
            int int11 = compiler1.getWarningCount();
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
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        boolean boolean5 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        double double7 = compiler1.getProgress();
        boolean boolean8 = compiler1.isTypeCheckingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNotNull(jSErrorArray11);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        java.lang.String str3 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap4 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions32);
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
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler15.initOptions(compilerOptions16);
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
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.reportCodeChange();
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
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        int int18 = compiler1.getErrorCount();
        double double19 = compiler1.getProgress();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(intermediateState17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.rhino.Node node9 = compiler1.getRoot();
        java.io.PrintStream printStream10 = null;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(printStream10);
        compiler11.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler11.tracker = performanceTracker13;
        java.lang.String str17 = compiler11.getSourceLine("", 0);
        java.io.PrintStream printStream18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(printStream18);
        compiler19.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker21 = compiler19.tracker;
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        compiler23.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = compiler23.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler23.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter27 = compiler23.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler23.getErrorManager();
        compiler19.setErrorManager(errorManager28);
        compiler11.setErrorManager(errorManager28);
        java.io.PrintStream printStream31 = null;
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler(printStream31);
        compiler32.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker34 = null;
        compiler32.tracker = performanceTracker34;
        com.google.javascript.jscomp.Scope scope36 = compiler32.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap37 = compiler32.getSourceMap();
        java.io.PrintStream printStream38 = null;
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler(printStream38);
        compiler39.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker41 = null;
        compiler39.tracker = performanceTracker41;
        com.google.javascript.jscomp.Scope scope43 = compiler39.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState44 = compiler39.getState();
        compiler32.setState(intermediateState44);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState46 = compiler32.getState();
        compiler11.setState(intermediateState46);
        compiler1.setState(intermediateState46);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(performanceTracker21);
        org.junit.Assert.assertNull(performanceTracker25);
        org.junit.Assert.assertNotNull(errorManager26);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter27);
        org.junit.Assert.assertNotNull(errorManager28);
        org.junit.Assert.assertNull(scope36);
        org.junit.Assert.assertNull(sourceMap37);
        org.junit.Assert.assertNull(scope43);
        org.junit.Assert.assertNotNull(intermediateState44);
        org.junit.Assert.assertNotNull(intermediateState46);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        boolean boolean22 = compiler1.hasErrors();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = compiler1.getTypeRegistry();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry23);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        org.junit.Assert.assertNotNull(intermediateState1);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        com.google.javascript.jscomp.JsAst jsAst17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler16.replaceScript(jsAst17);
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
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getMessages();
        java.lang.String str8 = compiler1.getAstDotGraph();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler12.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode15 = compiler12.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler12.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(errorManager16);
        compiler1.setErrorManager(errorManager16);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + languageMode10 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode10.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertTrue("'" + languageMode15 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode15.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager16);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
            com.google.javascript.jscomp.Region region25 = compiler1.getSourceRegion("", (int) (short) 10);
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
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile27 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray28 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile27 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray29 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result31 = compiler1.compile(jSSourceFileArray28, jSSourceFileArray29, compilerOptions30);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray28);
        org.junit.Assert.assertNotNull(jSSourceFileArray29);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler1.getCodingConvention();
        boolean boolean8 = compiler1.hasErrors();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        boolean boolean8 = compiler1.hasErrors();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        int int5 = compiler1.getErrorCount();
        int int6 = compiler1.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder11 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int12 = codeBuilder11.getLength();
        int int13 = codeBuilder11.getLength();
        java.lang.String str14 = codeBuilder11.toString();
        java.lang.String str15 = codeBuilder11.toString();
        int int16 = codeBuilder11.getLength();
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder11, (int) (byte) 1, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        com.google.javascript.jscomp.Scope scope16 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = compiler1.getWarningCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNull(performanceTracker15);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler1.getWarnings();
        boolean boolean17 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.JSModule jSModule18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray19 = compiler1.toSourceArray(jSModule18);
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        boolean boolean24 = compiler1.isIdeMode();
        com.google.javascript.jscomp.JSModule jSModule25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = compiler1.toSource(jSModule25);
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
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        com.google.javascript.jscomp.Result result27 = compiler1.getResult();
        com.google.javascript.jscomp.SourceFile sourceFile28 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile29 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray30 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile29 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result32 = compiler1.compile(sourceFile28, jSSourceFileArray30, compilerOptions31);
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
        org.junit.Assert.assertNotNull(result27);
        org.junit.Assert.assertNotNull(jSSourceFileArray30);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler1.tracker;
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
        org.junit.Assert.assertNull(performanceTracker9);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler1.getState();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNotNull(intermediateState11);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        java.lang.String str5 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        int int11 = compiler1.getErrorCount();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + languageMode10 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode10.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        int int8 = compiler1.getWarningCount();
        compiler1.disableThreads();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        java.lang.String str9 = compiler1.getSourceLine("", 0);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder10 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int11 = codeBuilder10.getLength();
        int int12 = codeBuilder10.getLength();
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder10, (int) (short) 1, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
            com.google.javascript.jscomp.CompilerInput compilerInput27 = compiler1.newExternInput("");
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
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(region25);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.rhino.Node node9 = compiler1.getRoot();
        boolean boolean10 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray13 = new com.google.javascript.jscomp.JSModule[] { jSModule12 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result15 = compiler1.compile(jSSourceFile11, jSModuleArray13, compilerOptions14);
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSModuleArray13);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node5 = compiler1.getRoot();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
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
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler1.getState();
        com.google.javascript.jscomp.SourceFile sourceFile13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = compiler1.parse(sourceFile13);
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
        org.junit.Assert.assertNotNull(intermediateState12);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        compiler7.reportCodeChange();
        com.google.javascript.jscomp.SourceFile sourceFile11 = null;
        com.google.javascript.jscomp.SourceFile sourceFile12 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler7.compile(sourceFile11, sourceFile12, compilerOptions13);
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
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        boolean boolean5 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        double double7 = compiler1.getProgress();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler1.getCodingConvention();
        java.lang.Class<?> wildcardClass9 = compiler1.getClass();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = compiler1.toSourceArray(jSModule11);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry10);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        compiler1.disableThreads();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter11 = compiler1.getReverseAbstractInterpreter();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter11);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        int int32 = compiler1.getWarningCount();
        int int33 = compiler1.getWarningCount();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        java.lang.String str2 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        org.junit.Assert.assertNotNull(intermediateState1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(errorManager3);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        java.lang.String str12 = compiler1.toSource();
        boolean boolean13 = compiler1.acceptEcmaScript5();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        boolean boolean12 = compiler1.isIdeMode();
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
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap23 = compiler1.getInputsById();
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
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.jscomp.Result result7 = compiler1.getResult();
        com.google.javascript.jscomp.JsAst jsAst8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addNewScript(jsAst8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(result7);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        compiler1.disableThreads();
        java.lang.String str9 = compiler1.toSource();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler1.getErrors();
        int int6 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JsAst jsAst7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile22 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray23 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile22 };
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray23);
        org.junit.Assert.assertNotNull(jSModuleArray25);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable21 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
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
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        boolean boolean7 = compiler1.acceptEcmaScript5();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        com.google.javascript.jscomp.Result result27 = compiler1.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray28 = compiler1.getErrors();
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
        org.junit.Assert.assertNotNull(result27);
        org.junit.Assert.assertNotNull(jSErrorArray28);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getMessages();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler1.tracker;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode10 = compiler1.languageMode();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertNull(performanceTracker9);
        org.junit.Assert.assertTrue("'" + languageMode10 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode10.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler1.getState();
        com.google.javascript.jscomp.Scope scope7 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node8 = compiler1.getRoot();
        com.google.javascript.jscomp.Scope scope9 = compiler1.getTopScope();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState27 = compiler17.getState();
        compiler15.setState(intermediateState27);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter13);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(sourceMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(scope25);
        org.junit.Assert.assertNull(sourceMap26);
        org.junit.Assert.assertNotNull(intermediateState27);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.String str7 = compiler1.getSourceLine("", 0);
        com.google.javascript.rhino.Node node8 = compiler1.getRoot();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler1.tracker = performanceTracker9;
        com.google.javascript.rhino.Node node11 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        com.google.javascript.jscomp.JsAst jsAst17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler15.addNewScript(jsAst17);
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
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        compiler17.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler17.getErrorManager();
        boolean boolean20 = compiler17.acceptConstKeyword();
        boolean boolean21 = compiler17.acceptEcmaScript5();
        java.lang.String str22 = compiler17.toSource();
        java.io.PrintStream printStream23 = null;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(printStream23);
        compiler24.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker26 = null;
        compiler24.tracker = performanceTracker26;
        com.google.javascript.jscomp.Scope scope28 = compiler24.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap29 = compiler24.getSourceMap();
        java.lang.String str30 = compiler24.getAstDotGraph();
        java.lang.String str31 = compiler24.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope32 = compiler24.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap33 = compiler24.getSourceMap();
        compiler24.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager35 = compiler24.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter36 = compiler24.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager37 = compiler24.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler(errorManager37);
        compiler17.setErrorManager(errorManager37);
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler(errorManager37);
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler(errorManager37);
        compiler14.setErrorManager(errorManager37);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertNull(sourceMap29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(scope32);
        org.junit.Assert.assertNull(sourceMap33);
        org.junit.Assert.assertNotNull(errorManager35);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter36);
        org.junit.Assert.assertNotNull(errorManager37);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        java.lang.String str3 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSError jSError4 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        compiler18.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = null;
        compiler18.tracker = performanceTracker20;
        com.google.javascript.jscomp.Scope scope22 = compiler18.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap23 = compiler18.getSourceMap();
        java.lang.String str24 = compiler18.getAstDotGraph();
        java.lang.String str25 = compiler18.getAstDotGraph();
        com.google.javascript.rhino.Node node26 = compiler18.getRoot();
        com.google.javascript.rhino.Node node27 = compiler18.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState28 = compiler18.getState();
        compiler1.setState(intermediateState28);
        com.google.javascript.jscomp.JSError[] jSErrorArray30 = compiler1.getErrors();
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
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertNull(sourceMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(intermediateState28);
        org.junit.Assert.assertNotNull(jSErrorArray30);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
        int int32 = compiler1.getWarningCount();
        boolean boolean33 = compiler1.isTypeCheckingEnabled();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node5 = compiler1.getRoot();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        int int7 = compiler1.getErrorCount();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput11 = compiler1.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(performanceTracker9);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        compiler1.reportCodeChange();
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
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler1.tracker = performanceTracker12;
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
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertNotNull(jSSourceFileArray16);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getErrors();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("hi!", (int) (byte) -1);
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler1.getErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(errorManager4);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.Node node6 = compiler1.getRoot();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.rhino.Node node9 = compiler1.getRoot();
        com.google.javascript.jscomp.JsAst jsAst10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addNewScript(jsAst10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = compiler1.getErrorCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = compiler1.toSource(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        boolean boolean11 = compiler1.acceptConstKeyword();
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
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter13 = compiler1.getReverseAbstractInterpreter();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter13);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        java.lang.String str6 = compiler1.getSourceLine("", 0);
        com.google.javascript.jscomp.SourceFile sourceFile7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = compiler1.parse(sourceFile7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        java.lang.String str20 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.SourceFile sourceFile21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node22 = compiler1.parse(sourceFile21);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        java.lang.String str2 = codeBuilder0.toString();
        int int3 = codeBuilder0.getLength();
        int int4 = codeBuilder0.getLength();
        java.lang.String str5 = codeBuilder0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        boolean boolean6 = compiler1.isTypeCheckingEnabled();
        java.lang.String str7 = compiler1.getAstDotGraph();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        com.google.javascript.jscomp.Scope scope34 = compiler1.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions35);
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
        org.junit.Assert.assertNull(scope34);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getErrors();
        com.google.javascript.jscomp.Result result8 = compiler1.getResult();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(result8);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getMessages();
        java.lang.String str8 = compiler1.getAstDotGraph();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getErrors();
        double double8 = compiler1.getProgress();
        boolean boolean9 = compiler1.acceptConstKeyword();
        compiler1.disableThreads();
        com.google.javascript.jscomp.PassConfig passConfig11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig11);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getMessages();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler1.getSourceMap();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNull(sourceMap9);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getMessages();
        java.lang.String str9 = compiler1.getAstDotGraph();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable28 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
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
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Result result7 = compiler1.getResult();
        com.google.javascript.jscomp.SourceFile sourceFile8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = compiler1.parse(sourceFile8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(result7);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.Node node6 = compiler1.getRoot();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
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
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("hi!", (int) (byte) -1);
        boolean boolean10 = compiler1.acceptConstKeyword();
        compiler1.reportCodeChange();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        boolean boolean8 = compiler1.acceptEcmaScript5();
        java.lang.String str9 = compiler1.toSource();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
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
            compiler15.rebuildInputsFromModules();
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
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.String str7 = compiler1.getSourceLine("", 0);
        com.google.javascript.rhino.Node node8 = compiler1.getRoot();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler1.tracker = performanceTracker9;
        com.google.javascript.rhino.Node node11 = compiler1.getRoot();
        double double12 = compiler1.getProgress();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        compiler1.disableThreads();
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
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertNotNull(intermediateState24);
        org.junit.Assert.assertNotNull(errorManager28);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(errorManager27);
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
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str4 = compiler1.getSourceLine("", (int) (byte) -1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node2 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = compiler1.toSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile8 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler7.compile(jSSourceFileArray9, jSSourceFileArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = null;
        compiler1.tracker = performanceTracker16;
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
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNotNull(jSErrorArray14);
        org.junit.Assert.assertNotNull(result15);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler1.toSourceArray(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        int int7 = compiler1.getWarningCount();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler1.getCodingConvention();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(codingConvention8);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        double double5 = compiler1.getProgress();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
        int int33 = compiler1.getErrorCount();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
            compiler1.normalize();
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
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        java.lang.String str20 = compiler1.getAstDotGraph();
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
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertTrue("'" + languageMode17 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode17.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        java.lang.String str10 = compiler1.toSource();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler1.getTypeRegistry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
            com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getWarnings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
            com.google.javascript.jscomp.Region region18 = compiler1.getSourceRegion("hi!", (int) (short) 10);
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
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile12 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile12 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result15 = compiler1.compile(jSSourceFileArray11, jSSourceFileArray13, compilerOptions14);
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
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        boolean boolean12 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler1.getCodingConvention();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(codingConvention13);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        org.junit.Assert.assertNotNull(errorManager14);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker34 = compiler1.tracker;
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
        org.junit.Assert.assertNull(performanceTracker34);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
        boolean boolean8 = compiler1.hasErrors();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler1.getState();
        java.io.PrintStream printStream10 = null;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(printStream10);
        compiler11.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler11.getErrorManager();
        boolean boolean14 = compiler11.acceptConstKeyword();
        boolean boolean15 = compiler11.hasErrors();
        compiler11.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler11.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler11.getErrorManager();
        compiler1.setErrorManager(errorManager18);
        com.google.javascript.jscomp.SourceMap sourceMap20 = compiler1.getSourceMap();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertNull(sourceMap20);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = compiler1.toSourceArray(jSModule11);
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
        org.junit.Assert.assertNotNull(jSTypeRegistry10);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler1.getState();
        com.google.javascript.jscomp.JsAst jsAst14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.replaceScript(jsAst14);
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
        org.junit.Assert.assertNotNull(intermediateState13);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        java.io.PrintStream printStream21 = null;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(printStream21);
        compiler22.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker24 = null;
        compiler22.tracker = performanceTracker24;
        com.google.javascript.jscomp.Scope scope26 = compiler22.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap27 = compiler22.getSourceMap();
        java.lang.String str28 = compiler22.getAstDotGraph();
        java.lang.String str29 = compiler22.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope30 = compiler22.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap31 = compiler22.getSourceMap();
        compiler22.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager33 = compiler22.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter34 = compiler22.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager35 = compiler22.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler(errorManager35);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState37 = compiler36.getState();
        compiler1.setState(intermediateState37);
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
        org.junit.Assert.assertNull(scope26);
        org.junit.Assert.assertNull(sourceMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(scope30);
        org.junit.Assert.assertNull(sourceMap31);
        org.junit.Assert.assertNotNull(errorManager33);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter34);
        org.junit.Assert.assertNotNull(errorManager35);
        org.junit.Assert.assertNotNull(intermediateState37);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        java.lang.String str6 = compiler1.toSource();
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("", (int) (byte) -1);
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode10 = compiler1.languageMode();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter11 = compiler1.getReverseAbstractInterpreter();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + languageMode10 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode10.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter11);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
            java.lang.String[] strArray10 = compiler1.toSourceArray();
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
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node5 = compiler1.getRoot();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        compiler1.disableThreads();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
            com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter18 = compiler1.getReverseAbstractInterpreter();
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
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler1.getTypeRegistry();
        boolean boolean8 = compiler1.isTypeCheckingEnabled();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.rhino.Node node9 = compiler1.getRoot();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = compiler1.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler1.getSourceMap();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(performanceTracker10);
        org.junit.Assert.assertNull(sourceMap11);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        com.google.javascript.jscomp.SourceFile sourceFile43 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node44 = compiler1.parse(sourceFile43);
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
        org.junit.Assert.assertNull(scope29);
        org.junit.Assert.assertNull(sourceMap30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertNull(sourceMap34);
        org.junit.Assert.assertNotNull(errorManager38);
        org.junit.Assert.assertNotNull(errorManager40);
        org.junit.Assert.assertNotNull(intermediateState41);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
            compiler1.parse();
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
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jSTypeRegistry9);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler1.tracker;
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
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        boolean boolean13 = compiler1.acceptConstKeyword();
        boolean boolean14 = compiler1.isTypeCheckingEnabled();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        boolean boolean11 = compiler1.hasErrors();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node5 = compiler1.getRoot();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = compiler1.getSourceLine("hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter13 = compiler1.getReverseAbstractInterpreter();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(codingConvention12);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter13);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        java.lang.String str8 = compiler1.getSourceLine("", (int) (short) -1);
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
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler1.getCodingConvention();
        com.google.javascript.jscomp.PassConfig passConfig7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(codingConvention6);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray5 = compiler1.toSourceArray(jSModule4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter41 = compiler1.getReverseAbstractInterpreter();
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
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter41);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.String str7 = compiler1.getSourceLine("", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getMessages();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile17 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray18 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFile17, jSModuleArray18, compilerOptions19);
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
        org.junit.Assert.assertNotNull(jSTypeRegistry16);
        org.junit.Assert.assertNotNull(jSModuleArray18);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        boolean boolean7 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder8 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int9 = codeBuilder8.getLength();
        int int10 = codeBuilder8.getLength();
        java.lang.String str11 = codeBuilder8.toString();
        int int12 = codeBuilder8.getLength();
        java.lang.String str13 = codeBuilder8.toString();
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder8, 1, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptEcmaScript5();
        boolean boolean5 = compiler1.acceptEcmaScript5();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        double double30 = compiler1.getProgress();
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        boolean boolean16 = compiler1.acceptConstKeyword();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = compiler1.getTypeRegistry();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry17);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler1.getTypeRegistry();
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler1.tracker;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler1.getState();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(performanceTracker9);
        org.junit.Assert.assertNotNull(intermediateState10);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        com.google.javascript.jscomp.CodingConvention codingConvention32 = compiler1.getCodingConvention();
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
        org.junit.Assert.assertNotNull(codingConvention32);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region15 = compiler1.getSourceRegion("hi!", (int) (short) 100);
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
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
            int int14 = compiler1.getWarningCount();
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
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        boolean boolean11 = compiler1.isTypeCheckingEnabled();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        java.lang.Class<?> wildcardClass32 = compiler1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(performanceTracker11);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.Region region7 = compiler1.getSourceRegion("", 0);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(region7);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        boolean boolean6 = compiler1.isIdeMode();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        compiler1.disableThreads();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(sourceMap7);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
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
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        double double3 = compiler1.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(intermediateState4);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(scope11);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(errorManager21);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule26 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray27 = new com.google.javascript.jscomp.JSModule[] { jSModule26 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler24.init(jSSourceFileArray25, jSModuleArray27, compilerOptions28);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertNotNull(jSModuleArray27);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getMessages();
        java.lang.String str8 = compiler1.getAstDotGraph();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(errorManager14);
        java.lang.Class<?> wildcardClass18 = compiler17.getClass();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
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
        org.junit.Assert.assertNull(performanceTracker6);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
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
        org.junit.Assert.assertNotNull(errorManager30);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        int int7 = compiler1.getErrorCount();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = compiler1.toSource(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder26 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int27 = codeBuilder26.getLength();
        java.lang.String str28 = codeBuilder26.toString();
        java.lang.String str29 = codeBuilder26.toString();
        int int30 = codeBuilder26.getLength();
        int int31 = codeBuilder26.getLength();
        int int32 = codeBuilder26.getLength();
        com.google.javascript.rhino.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder26, 10, node34);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler1.tracker;
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler1.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler1.getSourceMap();
        boolean boolean11 = compiler1.acceptConstKeyword();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(performanceTracker9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions23);
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
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
            java.lang.String str12 = compiler1.getSourceLine("hi!", (int) '#');
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
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(errorManager21);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention codingConvention25 = compiler24.getCodingConvention();
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
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        int int2 = codeBuilder0.getLength();
        java.lang.String str3 = codeBuilder0.toString();
        int int4 = codeBuilder0.getLength();
        java.lang.String str5 = codeBuilder0.toString();
        int int6 = codeBuilder0.getLength();
        int int7 = codeBuilder0.getLength();
        java.lang.String str8 = codeBuilder0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        org.junit.Assert.assertNotNull(errorManager21);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        java.lang.String str3 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        int int21 = compiler1.getErrorCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = compiler1.getSourceLine("", (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        int int2 = codeBuilder0.getLength();
        java.lang.String str3 = codeBuilder0.toString();
        java.lang.String str4 = codeBuilder0.toString();
        int int5 = codeBuilder0.getLength();
        java.lang.String str6 = codeBuilder0.toString();
        int int7 = codeBuilder0.getLength();
        java.lang.String str8 = codeBuilder0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler1.compile(jSSourceFileArray11, jSSourceFileArray12, compilerOptions13);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        compiler1.disableThreads();
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
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler1.tracker;
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(performanceTracker8);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler1.tracker;
        com.google.javascript.jscomp.Scope scope10 = compiler1.getTopScope();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
        org.junit.Assert.assertNull(performanceTracker9);
        org.junit.Assert.assertNull(scope10);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        int int5 = compiler1.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler1.getMessages();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray6);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        compiler17.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler17.getErrorManager();
        boolean boolean20 = compiler17.acceptConstKeyword();
        boolean boolean21 = compiler17.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = compiler17.getTypeRegistry();
        java.io.PrintStream printStream23 = null;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(printStream23);
        compiler24.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker26 = null;
        compiler24.tracker = performanceTracker26;
        com.google.javascript.jscomp.Scope scope28 = compiler24.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap29 = compiler24.getSourceMap();
        java.lang.String str30 = compiler24.getAstDotGraph();
        java.lang.String str31 = compiler24.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope32 = compiler24.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap33 = compiler24.getSourceMap();
        compiler24.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager35 = compiler24.getErrorManager();
        compiler17.setErrorManager(errorManager35);
        boolean boolean37 = compiler17.isIdeMode();
        java.io.PrintStream printStream38 = null;
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler(printStream38);
        compiler39.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker41 = null;
        compiler39.tracker = performanceTracker41;
        com.google.javascript.jscomp.Scope scope43 = compiler39.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap44 = compiler39.getSourceMap();
        java.lang.String str45 = compiler39.getAstDotGraph();
        java.lang.String str46 = compiler39.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope47 = compiler39.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap48 = compiler39.getSourceMap();
        java.io.PrintStream printStream49 = null;
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler(printStream49);
        compiler50.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager52 = compiler50.getErrorManager();
        compiler39.setErrorManager(errorManager52);
        compiler17.setErrorManager(errorManager52);
        compiler1.setErrorManager(errorManager52);
        com.google.javascript.jscomp.SourceMap sourceMap56 = compiler1.getSourceMap();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter57 = compiler1.getReverseAbstractInterpreter();
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
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry22);
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertNull(sourceMap29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(scope32);
        org.junit.Assert.assertNull(sourceMap33);
        org.junit.Assert.assertNotNull(errorManager35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(scope43);
        org.junit.Assert.assertNull(sourceMap44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(scope47);
        org.junit.Assert.assertNull(sourceMap48);
        org.junit.Assert.assertNotNull(errorManager52);
        org.junit.Assert.assertNull(sourceMap56);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter57);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        compiler1.reportCodeChange();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker5);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray15 = compiler1.getErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions16);
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
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        java.lang.String str6 = compiler1.toSource();
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("", (int) (byte) -1);
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode10 = compiler1.languageMode();
        com.google.javascript.jscomp.SourceFile sourceFile11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = compiler1.parse(sourceFile11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + languageMode10 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode10.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        com.google.javascript.jscomp.JSModule jSModule32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = compiler1.toSource(jSModule32);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
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
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker14 = compiler12.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler12.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter16 = compiler12.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler12.getErrorManager();
        boolean boolean18 = compiler12.acceptConstKeyword();
        com.google.javascript.rhino.Node node19 = compiler12.getRoot();
        java.io.PrintStream printStream20 = null;
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(printStream20);
        compiler21.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = null;
        compiler21.tracker = performanceTracker23;
        com.google.javascript.jscomp.Scope scope25 = compiler21.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler21.getSourceMap();
        java.lang.String str27 = compiler21.getAstDotGraph();
        java.lang.String str28 = compiler21.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope29 = compiler21.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap30 = compiler21.getSourceMap();
        java.io.PrintStream printStream31 = null;
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler(printStream31);
        compiler32.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager34 = compiler32.getErrorManager();
        compiler21.setErrorManager(errorManager34);
        com.google.javascript.jscomp.ErrorManager errorManager36 = compiler21.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState37 = compiler21.getState();
        compiler12.setState(intermediateState37);
        compiler1.setState(intermediateState37);
        boolean boolean40 = compiler1.acceptConstKeyword();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(performanceTracker14);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter16);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(scope25);
        org.junit.Assert.assertNull(sourceMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(scope29);
        org.junit.Assert.assertNull(sourceMap30);
        org.junit.Assert.assertNotNull(errorManager34);
        org.junit.Assert.assertNotNull(errorManager36);
        org.junit.Assert.assertNotNull(intermediateState37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        boolean boolean6 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSError jSError7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError7);
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
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.jscomp.Result result7 = compiler1.getResult();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler1.toSourceArray(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(result7);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler1.tracker;
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
        com.google.javascript.jscomp.PassConfig passConfig8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        compiler1.disableThreads();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler1.getCodingConvention();
        java.lang.String str7 = compiler1.getAstDotGraph();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        com.google.javascript.rhino.Node node16 = compiler1.getRoot();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertNotNull(intermediateState14);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler1.getErrors();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = compiler1.getTypeRegistry();
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
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertNotNull(jSTypeRegistry17);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        boolean boolean5 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        java.lang.String str7 = compiler1.getAstDotGraph();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorManager9);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
        boolean boolean8 = compiler1.hasErrors();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler1.getState();
        java.io.PrintStream printStream10 = null;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(printStream10);
        compiler11.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler11.getErrorManager();
        boolean boolean14 = compiler11.acceptConstKeyword();
        boolean boolean15 = compiler11.hasErrors();
        compiler11.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler11.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler11.getErrorManager();
        compiler1.setErrorManager(errorManager18);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = compiler1.getTypeRegistry();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertNotNull(jSTypeRegistry20);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        com.google.javascript.jscomp.SourceMap sourceMap14 = compiler1.getSourceMap();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertNull(sourceMap14);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler1.getMessages();
        java.lang.String str11 = compiler1.getAstDotGraph();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        compiler7.reportCodeChange();
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler7.initOptions(compilerOptions11);
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
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNull(performanceTracker9);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler1.getMessages();
        java.lang.String str19 = compiler1.getSourceLine("hi!", 0);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        com.google.javascript.jscomp.Scope scope16 = compiler1.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray18 = compiler1.getMessages();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNull(performanceTracker15);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(sourceMap17);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler1.getTypeRegistry();
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler1.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(performanceTracker9);
        org.junit.Assert.assertNull(performanceTracker10);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        java.lang.String str8 = compiler1.getSourceLine("", (int) (short) -1);
        com.google.javascript.jscomp.JsAst jsAst9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addNewScript(jsAst9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        com.google.javascript.rhino.Node node5 = compiler1.getRoot();
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
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        boolean boolean41 = compiler1.isIdeMode();
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode7 = compiler1.languageMode();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler1.getTypeRegistry();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + languageMode7 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode7.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        boolean boolean24 = compiler1.isIdeMode();
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
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
            com.google.javascript.jscomp.SymbolTable symbolTable8 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        com.google.javascript.jscomp.SourceFile sourceFile14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = compiler1.parse(sourceFile14);
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
        org.junit.Assert.assertNotNull(jSErrorArray13);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler1.getErrorManager();
        double double15 = compiler1.getProgress();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = compiler1.acceptEcmaScript5();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        java.lang.String str16 = compiler1.toSource();
        com.google.javascript.jscomp.PassConfig passConfig17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig17);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        compiler1.disableThreads();
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
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        java.lang.String str11 = compiler1.toSource();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        boolean boolean8 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getErrors();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions16);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.Node node6 = compiler1.getRoot();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
        compiler1.disableThreads();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
            com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node5 = compiler1.getRoot();
        com.google.javascript.jscomp.Scope scope6 = compiler1.getTopScope();
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
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler1.languageMode();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        boolean boolean10 = compiler1.acceptEcmaScript5();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap8 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(jSErrorArray14);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler1.getReverseAbstractInterpreter();
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
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler1.getState();
        com.google.javascript.jscomp.JSModule jSModule18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray19 = compiler1.toSourceArray(jSModule18);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intermediateState17);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        compiler1.disableThreads();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode7 = compiler1.languageMode();
        boolean boolean8 = compiler1.hasErrors();
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
        org.junit.Assert.assertTrue("'" + languageMode7 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode7.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
        com.google.javascript.rhino.Node node27 = compiler1.getRoot();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler1.getErrorManager();
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNull(sourceMap16);
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertNotNull(intermediateState23);
        org.junit.Assert.assertNotNull(intermediateState25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(errorManager28);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions10);
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
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        com.google.javascript.rhino.InputId inputId40 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput41 = compiler1.getInput(inputId40);
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
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("hi!", (int) (byte) -1);
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler1.getErrors();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder11 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder11, (int) (short) 1, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler1.getTypeRegistry();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        boolean boolean5 = compiler1.acceptConstKeyword();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        double double7 = compiler1.getProgress();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler1.getCodingConvention();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(codingConvention8);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter12 = compiler1.getReverseAbstractInterpreter();
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
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        compiler1.disableThreads();
        compiler1.reportCodeChange();
        int int8 = compiler1.getWarningCount();
        java.lang.String str9 = compiler1.toSource();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler7.initOptions(compilerOptions8);
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
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler1.tracker = performanceTracker3;
        java.lang.String str7 = compiler1.getSourceLine("", 0);
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile9 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result13 = compiler1.compile(jSSourceFileArray10, jSSourceFileArray11, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        boolean boolean11 = compiler1.acceptConstKeyword();
        compiler1.disableThreads();
        java.lang.Class<?> wildcardClass13 = compiler1.getClass();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler1.getState();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        double double6 = compiler1.getProgress();
        java.lang.Class<?> wildcardClass7 = compiler1.getClass();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler1.getTypeRegistry();
        boolean boolean7 = compiler1.acceptEcmaScript5();
        int int8 = compiler1.getWarningCount();
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
        org.junit.Assert.assertNotNull(jSTypeRegistry6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        boolean boolean4 = compiler1.acceptConstKeyword();
        boolean boolean5 = compiler1.hasErrors();
        boolean boolean6 = compiler1.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getErrors();
        double double8 = compiler1.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intermediateState9);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        boolean boolean5 = compiler1.isTypeCheckingEnabled();
        compiler1.reportCodeChange();
        int int7 = compiler1.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler1.getReverseAbstractInterpreter();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler1.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler1.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        int int7 = compiler1.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getWarnings();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray8);
    }
}

