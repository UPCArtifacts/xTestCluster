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
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler0.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getMessages();
        boolean boolean12 = compiler0.hasErrors();
        com.google.javascript.jscomp.Scope scope13 = compiler0.getTopScope();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter14 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        double double17 = compiler16.getProgress();
        double double18 = compiler16.getProgress();
        java.lang.String str19 = compiler16.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager20 = compiler16.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention21 = compiler16.getCodingConvention();
        int int22 = compiler16.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = compiler16.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode24 = compiler16.languageMode();
        com.google.javascript.jscomp.CodingConvention codingConvention25 = compiler16.getCodingConvention();
        com.google.javascript.rhino.Node node26 = compiler16.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState27 = compiler16.getState();
        compiler16.reportCodeChange();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState29 = compiler16.getState();
        compiler0.setState(intermediateState29);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter14);
        org.junit.Assert.assertNull(performanceTracker15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(errorManager20);
        org.junit.Assert.assertNotNull(codingConvention21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry23);
        org.junit.Assert.assertTrue("'" + languageMode24 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode24.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(codingConvention25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(intermediateState27);
        org.junit.Assert.assertNotNull(intermediateState29);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getWarnings();
        java.lang.Class<?> wildcardClass11 = compiler0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getErrors();
        java.lang.String str10 = compiler0.toSource();
        boolean boolean11 = compiler0.hasErrors();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = compiler0.getTypeRegistry();
        double double13 = compiler0.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable14 = compiler0.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        double double7 = compiler6.getProgress();
        double double8 = compiler6.getProgress();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        double double10 = compiler9.getProgress();
        double double11 = compiler9.getProgress();
        java.lang.String str12 = compiler9.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler9.getErrorManager();
        compiler6.setErrorManager(errorManager13);
        compiler0.setErrorManager(errorManager13);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        double double17 = compiler16.getProgress();
        double double18 = compiler16.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler16.getErrorManager();
        compiler0.setErrorManager(errorManager19);
        java.lang.String str21 = compiler0.toSource();
        com.google.javascript.jscomp.Region region24 = compiler0.getSourceRegion("", (int) (byte) -1);
        com.google.javascript.jscomp.SourceMap sourceMap25 = compiler0.getSourceMap();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder27 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str28 = codeBuilder27.toString();
        java.lang.String str29 = codeBuilder27.toString();
        int int30 = codeBuilder27.getLength();
        java.lang.String str31 = codeBuilder27.toString();
        int int32 = codeBuilder27.getLength();
        com.google.javascript.rhino.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder27, 10, node34);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(region24);
        org.junit.Assert.assertNull(sourceMap25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler0.languageMode();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode9 = compiler0.languageMode();
        java.lang.String str12 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode14 = compiler0.languageMode();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + languageMode9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode9.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + languageMode14 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode14.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        int int8 = compiler0.getErrorCount();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(errorManager9);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(errorManager9);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        com.google.javascript.jscomp.SourceFile sourceFile9 = null;
        com.google.javascript.jscomp.SourceFile sourceFile10 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler0.compile(sourceFile9, sourceFile10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(result6);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNotNull(intermediateState8);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        compiler0.disableThreads();
        int int10 = compiler0.getErrorCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter12 = compiler0.getReverseAbstractInterpreter();
        boolean boolean13 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode14 = compiler0.languageMode();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry11);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + languageMode14 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode14.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSTypeRegistry15);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getErrors();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler0.getSourceMap();
        boolean boolean11 = compiler0.isIdeMode();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Result result13 = compiler0.getResult();
        double double14 = compiler0.getProgress();
        boolean boolean15 = compiler0.acceptConstKeyword();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(result13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        double double7 = compiler6.getProgress();
        double double8 = compiler6.getProgress();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        double double10 = compiler9.getProgress();
        double double11 = compiler9.getProgress();
        java.lang.String str12 = compiler9.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler9.getErrorManager();
        compiler6.setErrorManager(errorManager13);
        compiler0.setErrorManager(errorManager13);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter16 = compiler0.getReverseAbstractInterpreter();
        boolean boolean17 = compiler0.hasErrors();
        boolean boolean18 = compiler0.isIdeMode();
        com.google.javascript.jscomp.SourceFile sourceFile19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node20 = compiler0.parse(sourceFile19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(intermediateState4);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        double double12 = compiler11.getProgress();
        double double13 = compiler11.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler11.getErrorManager();
        boolean boolean15 = compiler11.acceptConstKeyword();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler11.getErrorManager();
        compiler0.setErrorManager(errorManager16);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter18 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter19 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        double double21 = compiler20.getProgress();
        double double22 = compiler20.getProgress();
        java.lang.String str23 = compiler20.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler20.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention25 = compiler20.getCodingConvention();
        int int26 = compiler20.getWarningCount();
        boolean boolean27 = compiler20.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention28 = compiler20.getCodingConvention();
        compiler20.disableThreads();
        int int30 = compiler20.getErrorCount();
        boolean boolean31 = compiler20.isIdeMode();
        compiler20.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        double double34 = compiler33.getProgress();
        double double35 = compiler33.getProgress();
        java.lang.String str36 = compiler33.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager37 = compiler33.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention38 = compiler33.getCodingConvention();
        int int39 = compiler33.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = compiler33.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode41 = compiler33.languageMode();
        com.google.javascript.jscomp.CodingConvention codingConvention42 = compiler33.getCodingConvention();
        com.google.javascript.rhino.Node node43 = compiler33.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState44 = compiler33.getState();
        compiler33.reportCodeChange();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState46 = compiler33.getState();
        compiler20.setState(intermediateState46);
        compiler0.setState(intermediateState46);
        double double49 = compiler0.getProgress();
        boolean boolean50 = compiler0.isTypeCheckingEnabled();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter18);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(codingConvention25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(codingConvention28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(errorManager37);
        org.junit.Assert.assertNotNull(codingConvention38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry40);
        org.junit.Assert.assertTrue("'" + languageMode41 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode41.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(codingConvention42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(intermediateState44);
        org.junit.Assert.assertNotNull(intermediateState46);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        double double7 = compiler6.getProgress();
        double double8 = compiler6.getProgress();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        double double10 = compiler9.getProgress();
        double double11 = compiler9.getProgress();
        java.lang.String str12 = compiler9.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler9.getErrorManager();
        compiler6.setErrorManager(errorManager13);
        compiler0.setErrorManager(errorManager13);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter16 = compiler0.getReverseAbstractInterpreter();
        java.lang.String str17 = compiler0.toSource();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        double double19 = compiler18.getProgress();
        double double20 = compiler18.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler18.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(errorManager21);
        compiler0.setErrorManager(errorManager21);
        com.google.javascript.jscomp.JSModule jSModule24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = compiler0.toSource(jSModule24);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager21);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode9 = compiler0.languageMode();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        double double11 = compiler10.getProgress();
        double double12 = compiler10.getProgress();
        java.lang.String str13 = compiler10.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler10.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention15 = compiler10.getCodingConvention();
        int int16 = compiler10.getWarningCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler10.getState();
        compiler0.setState(intermediateState17);
        boolean boolean19 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + languageMode9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode9.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(codingConvention15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intermediateState17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getErrors();
        java.lang.String str10 = compiler0.toSource();
        boolean boolean11 = compiler0.hasErrors();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        double double14 = compiler13.getProgress();
        double double15 = compiler13.getProgress();
        java.lang.String str16 = compiler13.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler13.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention18 = compiler13.getCodingConvention();
        int int19 = compiler13.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = compiler13.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode21 = compiler13.languageMode();
        com.google.javascript.jscomp.CodingConvention codingConvention22 = compiler13.getCodingConvention();
        com.google.javascript.rhino.Node node23 = compiler13.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState24 = compiler13.getState();
        compiler0.setState(intermediateState24);
        boolean boolean26 = compiler0.acceptEcmaScript5();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope28 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Result result30 = compiler0.getResult();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(codingConvention18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry20);
        org.junit.Assert.assertTrue("'" + languageMode21 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode21.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(codingConvention22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(intermediateState24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertNotNull(result30);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        double double12 = compiler11.getProgress();
        double double13 = compiler11.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler11.getErrorManager();
        boolean boolean15 = compiler11.acceptConstKeyword();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler11.getErrorManager();
        compiler0.setErrorManager(errorManager16);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter18 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter19 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray20 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray21 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result23 = compiler0.compile(jSSourceFileArray20, jSModuleArray21, compilerOptions22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter18);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter19);
        org.junit.Assert.assertNotNull(jSSourceFileArray20);
        org.junit.Assert.assertNotNull(jSModuleArray21);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        boolean boolean8 = compiler0.acceptEcmaScript5();
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = compiler0.getTypeRegistry();
        java.lang.String str11 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.SourceFile sourceFile12 = null;
        com.google.javascript.jscomp.SourceFile sourceFile13 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result15 = compiler0.compile(sourceFile12, sourceFile13, compilerOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        boolean boolean8 = compiler0.acceptEcmaScript5();
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = compiler0.getReverseAbstractInterpreter();
        boolean boolean11 = compiler0.hasErrors();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler0.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile15 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray16 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile15 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray17 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result19 = compiler0.compile(jSSourceFileArray16, jSSourceFileArray17, compilerOptions18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(jSSourceFileArray16);
        org.junit.Assert.assertNotNull(jSSourceFileArray17);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        boolean boolean4 = compiler0.acceptConstKeyword();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        double double7 = compiler6.getProgress();
        double double8 = compiler6.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler6.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = compiler6.getTypeRegistry();
        com.google.javascript.jscomp.Result result11 = compiler6.getResult();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        double double13 = compiler12.getProgress();
        double double14 = compiler12.getProgress();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        double double16 = compiler15.getProgress();
        double double17 = compiler15.getProgress();
        java.lang.String str18 = compiler15.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler15.getErrorManager();
        compiler12.setErrorManager(errorManager19);
        compiler6.setErrorManager(errorManager19);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        double double23 = compiler22.getProgress();
        double double24 = compiler22.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager25 = compiler22.getErrorManager();
        compiler6.setErrorManager(errorManager25);
        java.lang.String str27 = compiler6.toSource();
        com.google.javascript.jscomp.Region region30 = compiler6.getSourceRegion("", (int) (byte) -1);
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        double double32 = compiler31.getProgress();
        double double33 = compiler31.getProgress();
        java.lang.String str34 = compiler31.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager35 = compiler31.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention36 = compiler31.getCodingConvention();
        int int37 = compiler31.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = compiler31.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode39 = compiler31.languageMode();
        com.google.javascript.jscomp.CodingConvention codingConvention40 = compiler31.getCodingConvention();
        com.google.javascript.rhino.Node node41 = compiler31.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState42 = compiler31.getState();
        compiler6.setState(intermediateState42);
        compiler0.setState(intermediateState42);
        boolean boolean45 = compiler0.isTypeCheckingEnabled();
        int int46 = compiler0.getWarningCount();
        java.lang.String str47 = compiler0.toSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray48 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(jSTypeRegistry10);
        org.junit.Assert.assertNotNull(result11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(region30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(errorManager35);
        org.junit.Assert.assertNotNull(codingConvention36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry38);
        org.junit.Assert.assertTrue("'" + languageMode39 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode39.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(codingConvention40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(intermediateState42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.hasErrors();
        boolean boolean6 = compiler0.isIdeMode();
        double double7 = compiler0.getProgress();
        java.lang.String str8 = compiler0.getAstDotGraph();
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
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jSModuleArray10);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        compiler0.disableThreads();
        int int10 = compiler0.getErrorCount();
        boolean boolean11 = compiler0.isIdeMode();
        compiler0.reportCodeChange();
        java.lang.String str13 = compiler0.toSource();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray16 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result18 = compiler0.compile(jSSourceFileArray15, jSModuleArray16, compilerOptions17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        compiler0.disableThreads();
        int int10 = compiler0.getErrorCount();
        boolean boolean11 = compiler0.isIdeMode();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode12 = compiler0.languageMode();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + languageMode12 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode12.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getErrors();
        java.lang.String str10 = compiler0.toSource();
        boolean boolean11 = compiler0.hasErrors();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        double double14 = compiler13.getProgress();
        double double15 = compiler13.getProgress();
        java.lang.String str16 = compiler13.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler13.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention18 = compiler13.getCodingConvention();
        int int19 = compiler13.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = compiler13.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode21 = compiler13.languageMode();
        com.google.javascript.jscomp.CodingConvention codingConvention22 = compiler13.getCodingConvention();
        com.google.javascript.rhino.Node node23 = compiler13.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState24 = compiler13.getState();
        compiler0.setState(intermediateState24);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState27 = compiler0.getState();
        int int28 = compiler0.getErrorCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(codingConvention18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry20);
        org.junit.Assert.assertTrue("'" + languageMode21 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode21.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(codingConvention22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(intermediateState24);
        org.junit.Assert.assertNotNull(jSTypeRegistry26);
        org.junit.Assert.assertNotNull(intermediateState27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        boolean boolean7 = compiler0.acceptConstKeyword();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        double double12 = compiler11.getProgress();
        double double13 = compiler11.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler11.getErrorManager();
        boolean boolean15 = compiler11.acceptConstKeyword();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler11.getErrorManager();
        compiler0.setErrorManager(errorManager16);
        com.google.javascript.jscomp.Scope scope18 = compiler0.getTopScope();
        compiler0.disableThreads();
        int int20 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSModule jSModule21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray22 = compiler0.toSourceArray(jSModule21);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        boolean boolean4 = compiler0.acceptConstKeyword();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        double double7 = compiler6.getProgress();
        double double8 = compiler6.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler6.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = compiler6.getTypeRegistry();
        com.google.javascript.jscomp.Result result11 = compiler6.getResult();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        double double13 = compiler12.getProgress();
        double double14 = compiler12.getProgress();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        double double16 = compiler15.getProgress();
        double double17 = compiler15.getProgress();
        java.lang.String str18 = compiler15.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler15.getErrorManager();
        compiler12.setErrorManager(errorManager19);
        compiler6.setErrorManager(errorManager19);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        double double23 = compiler22.getProgress();
        double double24 = compiler22.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager25 = compiler22.getErrorManager();
        compiler6.setErrorManager(errorManager25);
        java.lang.String str27 = compiler6.toSource();
        com.google.javascript.jscomp.Region region30 = compiler6.getSourceRegion("", (int) (byte) -1);
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        double double32 = compiler31.getProgress();
        double double33 = compiler31.getProgress();
        java.lang.String str34 = compiler31.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager35 = compiler31.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention36 = compiler31.getCodingConvention();
        int int37 = compiler31.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = compiler31.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode39 = compiler31.languageMode();
        com.google.javascript.jscomp.CodingConvention codingConvention40 = compiler31.getCodingConvention();
        com.google.javascript.rhino.Node node41 = compiler31.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState42 = compiler31.getState();
        compiler6.setState(intermediateState42);
        compiler0.setState(intermediateState42);
        com.google.javascript.jscomp.Result result45 = compiler0.getResult();
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        double double47 = compiler46.getProgress();
        double double48 = compiler46.getProgress();
        java.lang.String str49 = compiler46.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager50 = compiler46.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention51 = compiler46.getCodingConvention();
        int int52 = compiler46.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray53 = compiler46.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker54 = null;
        compiler46.tracker = performanceTracker54;
        com.google.javascript.jscomp.ErrorManager errorManager56 = compiler46.getErrorManager();
        compiler0.setErrorManager(errorManager56);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder58 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str59 = codeBuilder58.toString();
        java.lang.String str60 = codeBuilder58.toString();
        java.lang.String str61 = codeBuilder58.toString();
        java.lang.String str62 = codeBuilder58.toString();
        int int63 = codeBuilder58.getLength();
        int int64 = codeBuilder58.getLength();
        int int65 = codeBuilder58.getLength();
        java.lang.String str66 = codeBuilder58.toString();
        com.google.javascript.rhino.Node node68 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder58, (int) (byte) 1, node68);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(jSTypeRegistry10);
        org.junit.Assert.assertNotNull(result11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(region30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(errorManager35);
        org.junit.Assert.assertNotNull(codingConvention36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry38);
        org.junit.Assert.assertTrue("'" + languageMode39 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode39.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(codingConvention40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(intermediateState42);
        org.junit.Assert.assertNotNull(result45);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(errorManager50);
        org.junit.Assert.assertNotNull(codingConvention51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray53);
        org.junit.Assert.assertNotNull(errorManager56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getErrors();
        java.lang.String str10 = compiler0.toSource();
        boolean boolean11 = compiler0.hasErrors();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler0.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray14 = compiler0.getErrors();
        com.google.javascript.jscomp.JSModule jSModule15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = compiler0.toSource(jSModule15);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNotNull(jSErrorArray14);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        int int4 = compiler0.getWarningCount();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(scope8);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        boolean boolean8 = compiler0.acceptEcmaScript5();
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = compiler0.getReverseAbstractInterpreter();
        boolean boolean11 = compiler0.hasErrors();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler0.getErrorManager();
        com.google.javascript.jscomp.SourceFile sourceFile13 = null;
        com.google.javascript.jscomp.SourceFile sourceFile14 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result16 = compiler0.compile(sourceFile13, sourceFile14, compilerOptions15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(errorManager12);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        java.lang.String str9 = compiler0.toSource();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(result6);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler0.getCodingConvention();
        boolean boolean10 = compiler0.hasErrors();
        compiler0.disableThreads();
        int int12 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        double double14 = compiler13.getProgress();
        double double15 = compiler13.getProgress();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        double double17 = compiler16.getProgress();
        double double18 = compiler16.getProgress();
        java.lang.String str19 = compiler16.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager20 = compiler16.getErrorManager();
        compiler13.setErrorManager(errorManager20);
        compiler0.setErrorManager(errorManager20);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(errorManager20);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = null;
        compiler0.tracker = performanceTracker4;
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        java.lang.String str8 = compiler0.toSource();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler0.getReverseAbstractInterpreter();
        boolean boolean10 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode11 = compiler0.languageMode();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + languageMode11 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode11.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }
}

