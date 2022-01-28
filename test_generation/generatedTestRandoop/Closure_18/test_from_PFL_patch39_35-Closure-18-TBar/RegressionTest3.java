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
        com.google.javascript.jscomp.CodingConvention codingConvention20 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Result result21 = compiler0.getResult();
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
        org.junit.Assert.assertNotNull(codingConvention20);
        org.junit.Assert.assertNotNull(result21);
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
        int int29 = compiler0.getWarningCount();
        java.lang.String str30 = compiler0.toSource();
        com.google.javascript.jscomp.SourceFile sourceFile31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node32 = compiler0.parse(sourceFile31);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
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
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        boolean boolean9 = compiler0.hasErrors();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler0.getSourceMap();
        com.google.javascript.rhino.Node node11 = compiler0.getRoot();
        java.lang.String str12 = compiler0.toSource();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter11 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = compiler0.getTypeRegistry();
        boolean boolean13 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        double double15 = compiler14.getProgress();
        double double16 = compiler14.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler14.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = compiler14.getTypeRegistry();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = compiler14.getTypeRegistry();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter20 = compiler14.getReverseAbstractInterpreter();
        int int21 = compiler14.getWarningCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState22 = compiler14.getState();
        compiler0.setState(intermediateState22);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter11);
        org.junit.Assert.assertNotNull(jSTypeRegistry12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(jSTypeRegistry18);
        org.junit.Assert.assertNotNull(jSTypeRegistry19);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intermediateState22);
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
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getErrors();
        java.lang.String str10 = compiler0.toSource();
        boolean boolean11 = compiler0.isTypeCheckingEnabled();
        int int12 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        double double14 = compiler13.getProgress();
        double double15 = compiler13.getProgress();
        java.lang.String str16 = compiler13.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler13.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention18 = compiler13.getCodingConvention();
        int int19 = compiler13.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray20 = compiler13.getWarnings();
        com.google.javascript.rhino.Node node21 = compiler13.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray22 = compiler13.getErrors();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        double double24 = compiler23.getProgress();
        double double25 = compiler23.getProgress();
        java.lang.String str26 = compiler23.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler23.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention28 = compiler23.getCodingConvention();
        int int29 = compiler23.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray30 = compiler23.getWarnings();
        com.google.javascript.rhino.Node node31 = compiler23.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray32 = compiler23.getErrors();
        java.lang.String str33 = compiler23.toSource();
        boolean boolean34 = compiler23.hasErrors();
        compiler23.disableThreads();
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        double double37 = compiler36.getProgress();
        double double38 = compiler36.getProgress();
        java.lang.String str39 = compiler36.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager40 = compiler36.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention41 = compiler36.getCodingConvention();
        int int42 = compiler36.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = compiler36.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode44 = compiler36.languageMode();
        com.google.javascript.jscomp.CodingConvention codingConvention45 = compiler36.getCodingConvention();
        com.google.javascript.rhino.Node node46 = compiler36.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState47 = compiler36.getState();
        compiler23.setState(intermediateState47);
        boolean boolean49 = compiler23.acceptEcmaScript5();
        compiler23.disableThreads();
        com.google.javascript.jscomp.Scope scope51 = compiler23.getTopScope();
        int int52 = compiler23.getWarningCount();
        java.lang.String str53 = compiler23.toSource();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker54 = null;
        compiler23.tracker = performanceTracker54;
        com.google.javascript.jscomp.SourceMap sourceMap56 = compiler23.getSourceMap();
        com.google.javascript.rhino.Node node57 = compiler23.getRoot();
        com.google.javascript.jscomp.ErrorManager errorManager58 = compiler23.getErrorManager();
        compiler13.setErrorManager(errorManager58);
        compiler0.setErrorManager(errorManager58);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(codingConvention18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(jSErrorArray22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(errorManager27);
        org.junit.Assert.assertNotNull(codingConvention28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(jSErrorArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(errorManager40);
        org.junit.Assert.assertNotNull(codingConvention41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry43);
        org.junit.Assert.assertTrue("'" + languageMode44 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode44.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(codingConvention45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(intermediateState47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(scope51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNull(sourceMap56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(errorManager58);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        boolean boolean4 = compiler0.acceptConstKeyword();
        int int5 = compiler0.getWarningCount();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode7 = compiler0.languageMode();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        double double9 = compiler8.getProgress();
        double double10 = compiler8.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler8.getState();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler8.getErrorManager();
        compiler8.disableThreads();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        double double15 = compiler14.getProgress();
        double double16 = compiler14.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler14.getErrorManager();
        boolean boolean18 = compiler14.acceptConstKeyword();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler14.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        double double21 = compiler20.getProgress();
        double double22 = compiler20.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager23 = compiler20.getErrorManager();
        compiler14.setErrorManager(errorManager23);
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        double double26 = compiler25.getProgress();
        double double27 = compiler25.getProgress();
        java.lang.String str28 = compiler25.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager29 = compiler25.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention30 = compiler25.getCodingConvention();
        int int31 = compiler25.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray32 = compiler25.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker33 = null;
        compiler25.tracker = performanceTracker33;
        com.google.javascript.jscomp.ErrorManager errorManager35 = compiler25.getErrorManager();
        compiler14.setErrorManager(errorManager35);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState37 = compiler14.getState();
        compiler8.setState(intermediateState37);
        compiler0.setState(intermediateState37);
        com.google.javascript.jscomp.SourceFile sourceFile40 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node41 = compiler0.parse(sourceFile40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + languageMode7 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode7.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(intermediateState11);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(errorManager29);
        org.junit.Assert.assertNotNull(codingConvention30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray32);
        org.junit.Assert.assertNotNull(errorManager35);
        org.junit.Assert.assertNotNull(intermediateState37);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        boolean boolean9 = compiler0.hasErrors();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.rhino.Node node11 = compiler0.getRoot();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = compiler0.getTypeRegistry();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(jSTypeRegistry12);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter11 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.CodingConvention codingConvention12 = compiler0.getCodingConvention();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter11);
        org.junit.Assert.assertNotNull(codingConvention12);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = null;
        compiler0.tracker = performanceTracker4;
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        java.lang.String str8 = compiler0.toSource();
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
        com.google.javascript.jscomp.Scope scope10 = compiler0.getTopScope();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertNull(scope10);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler0.languageMode();
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler0.getCodingConvention();
        com.google.javascript.rhino.Node node10 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler0.getState();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler0.getState();
        boolean boolean14 = compiler0.hasErrors();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(intermediateState11);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
        java.lang.String str8 = compiler0.getAstDotGraph();
        boolean boolean9 = compiler0.acceptConstKeyword();
        compiler0.disableThreads();
        java.lang.String str11 = compiler0.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable12 = compiler0.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(result6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        int int4 = compiler0.getWarningCount();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler0.getReverseAbstractInterpreter();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
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
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter19 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.CodingConvention codingConvention20 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode21 = compiler0.languageMode();
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
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter19);
        org.junit.Assert.assertNotNull(codingConvention20);
        org.junit.Assert.assertTrue("'" + languageMode21 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode21.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.Region region13 = compiler0.getSourceRegion("Unversioned directory", (int) (byte) -1);
        boolean boolean14 = compiler0.isTypeCheckingEnabled();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler0.tracker = performanceTracker12;
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

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        boolean boolean4 = compiler0.acceptConstKeyword();
        int int5 = compiler0.getWarningCount();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode7 = compiler0.languageMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + languageMode7 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode7.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(intermediateState8);
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
        boolean boolean16 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray17 = null;
        com.google.javascript.jscomp.JSModule jSModule18 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray19 = new com.google.javascript.jscomp.JSModule[] { jSModule18 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result21 = compiler0.compile(jSSourceFileArray17, jSModuleArray19, compilerOptions20);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSModuleArray19);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getErrors();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler0.tracker;
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
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNull(performanceTracker9);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler0.languageMode();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode9 = compiler0.languageMode();
        int int10 = compiler0.getWarningCount();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler0.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = compiler0.tracker;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + languageMode9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode9.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(performanceTracker11);
        org.junit.Assert.assertNull(performanceTracker12);
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
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter6 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        java.lang.String str10 = compiler0.getSourceLine("hi!", 0);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler0.tracker = performanceTracker11;
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter13 = compiler0.getReverseAbstractInterpreter();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter13);
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
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        compiler0.disableThreads();
        int int10 = compiler0.getErrorCount();
        boolean boolean11 = compiler0.isIdeMode();
        compiler0.reportCodeChange();
        java.lang.String str13 = compiler0.toSource();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention15 = compiler0.getCodingConvention();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(codingConvention15);
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
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Region region12 = compiler0.getSourceRegion("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler0.getWarnings();
        java.lang.String str14 = compiler0.toSource();
        com.google.javascript.jscomp.JsAst jsAst15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.addNewScript(jsAst15);
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
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = compiler0.getTypeRegistry();
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
        org.junit.Assert.assertNotNull(jSTypeRegistry51);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        int int8 = compiler0.getWarningCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable9 = compiler0.buildKnownSymbolTable();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler0.getState();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler0.getSourceMap();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getErrors();
        com.google.javascript.rhino.InputId inputId12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput13 = compiler0.getInput(inputId12);
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
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(jSErrorArray11);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        java.lang.String str27 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker28 = null;
        compiler0.tracker = performanceTracker28;
        com.google.javascript.rhino.Node node30 = compiler0.getRoot();
        boolean boolean31 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray32 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile33 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray34 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile33 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray32, jSSourceFileArray34, compilerOptions35);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray32);
        org.junit.Assert.assertNotNull(jSSourceFileArray34);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        int int12 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler0.getCodingConvention();
        java.lang.String str14 = compiler0.toSource();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile15 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray16 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result18 = compiler0.compile(jSSourceFile15, jSModuleArray16, compilerOptions17);
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(jSModuleArray16);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = compiler0.toSource(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(result6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        java.lang.String str6 = compiler0.getAstDotGraph();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getMessages();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.Scope scope10 = compiler0.getTopScope();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertNotNull(jSTypeRegistry9);
        org.junit.Assert.assertNull(scope10);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        compiler13.reportCodeChange();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState26 = compiler13.getState();
        compiler0.setState(intermediateState26);
        com.google.javascript.rhino.Node node28 = compiler0.getRoot();
        com.google.javascript.jscomp.JsAst jsAst29 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.addNewScript(jsAst29);
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
        org.junit.Assert.assertNotNull(intermediateState26);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(result6);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        int int10 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSError jSError11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError11);
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
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(intermediateState5);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        int int4 = compiler0.getWarningCount();
        compiler0.disableThreads();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        boolean boolean11 = compiler0.isIdeMode();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter12 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.Result result13 = compiler0.getResult();
        com.google.javascript.jscomp.JsAst jsAst14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.addNewScript(jsAst14);
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
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter12);
        org.junit.Assert.assertNotNull(result13);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        boolean boolean9 = compiler0.hasErrors();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler0.getSourceMap();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = compiler0.getTypeRegistry();
        int int12 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError jSError14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError14);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(jSTypeRegistry11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray13);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getWarnings();
        boolean boolean12 = compiler0.acceptEcmaScript5();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JsAst jsAst14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.addNewScript(jsAst14);
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = null;
        compiler0.tracker = performanceTracker4;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler0.newExternInput("Unversioned directory");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(sourceMap3);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode13 = compiler0.languageMode();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray15 = compiler0.getWarnings();
        int int16 = compiler0.getErrorCount();
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
        org.junit.Assert.assertTrue("'" + languageMode13 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode13.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNotNull(jSErrorArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray15 = compiler0.toSourceArray();
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
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(result13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.Class<?> wildcardClass2 = errorManager1.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str1 = codeBuilder0.toString();
        java.lang.String str2 = codeBuilder0.toString();
        java.lang.String str3 = codeBuilder0.toString();
        int int4 = codeBuilder0.getLength();
        int int5 = codeBuilder0.getLength();
        java.lang.String str6 = codeBuilder0.toString();
        int int7 = codeBuilder0.getLength();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        int int4 = compiler0.getWarningCount();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertNull(scope8);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        double double9 = compiler8.getProgress();
        double double10 = compiler8.getProgress();
        java.lang.String str11 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler8.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager12);
        compiler0.setErrorManager(errorManager12);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = compiler0.getTypeRegistry();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = compiler0.getTypeRegistry();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(result6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(jSTypeRegistry15);
        org.junit.Assert.assertNotNull(jSTypeRegistry16);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        int int12 = compiler0.getErrorCount();
        java.lang.String str15 = compiler0.getSourceLine("", (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        double double4 = compiler3.getProgress();
        double double5 = compiler3.getProgress();
        java.lang.String str6 = compiler3.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler3.getErrorManager();
        compiler0.setErrorManager(errorManager7);
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler0.tracker = performanceTracker10;
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = compiler0.toSource(jSModule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(errorManager7);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler0.languageMode();
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler0.getCodingConvention();
        com.google.javascript.rhino.Node node10 = compiler0.getRoot();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler0.tracker = performanceTracker11;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        double double4 = compiler3.getProgress();
        double double5 = compiler3.getProgress();
        java.lang.String str6 = compiler3.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler3.getErrorManager();
        compiler0.setErrorManager(errorManager7);
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(errorManager7);
        compiler9.disableThreads();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray13 = new com.google.javascript.jscomp.JSModule[] { jSModule12 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler9.init(jSSourceFileArray11, jSModuleArray13, compilerOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSModuleArray13);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        java.lang.String str6 = compiler0.getAstDotGraph();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        boolean boolean8 = compiler0.acceptConstKeyword();
        compiler0.reportCodeChange();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        compiler0.reportCodeChange();
        java.lang.String str9 = compiler0.getAstDotGraph();
        boolean boolean10 = compiler0.acceptConstKeyword();
        boolean boolean11 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode12 = compiler0.languageMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler0.getMessages();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + languageMode12 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode12.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSErrorArray13);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSError jSError15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel16 = compiler0.getErrorLevel(jSError15);
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intermediateState13);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        boolean boolean7 = compiler0.acceptConstKeyword();
        int int8 = compiler0.getWarningCount();
        int int9 = compiler0.getWarningCount();
        boolean boolean10 = compiler0.hasErrors();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        com.google.javascript.jscomp.Region region16 = compiler0.getSourceRegion("hi!", (-1));
        boolean boolean17 = compiler0.hasErrors();
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
        org.junit.Assert.assertNull(region16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        java.lang.String str6 = compiler0.getAstDotGraph();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        boolean boolean8 = compiler0.hasErrors();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = compiler0.getTypeRegistry();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry9);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        int int8 = compiler0.getWarningCount();
        int int9 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler0.getState();
        int int11 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler0.getWarnings();
        int int13 = compiler0.getWarningCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        double double4 = compiler3.getProgress();
        double double5 = compiler3.getProgress();
        java.lang.String str6 = compiler3.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler3.getErrorManager();
        compiler0.setErrorManager(errorManager7);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler0.getState();
        compiler0.disableThreads();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(intermediateState9);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker26 = compiler0.tracker;
        com.google.javascript.jscomp.Scope scope27 = compiler0.getTopScope();
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
        org.junit.Assert.assertNull(performanceTracker26);
        org.junit.Assert.assertNull(scope27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        int int4 = compiler0.getWarningCount();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        com.google.javascript.jscomp.SourceFile sourceFile9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = compiler0.parse(sourceFile9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
        java.lang.String str8 = compiler0.toSource();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode10 = compiler0.languageMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getMessages();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode13 = compiler0.languageMode();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = compiler0.getTypeRegistry();
        java.lang.String str15 = compiler0.toSource();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertTrue("'" + languageMode10 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode10.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertTrue("'" + languageMode13 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode13.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSTypeRegistry14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        compiler0.disableThreads();
        double double4 = compiler0.getProgress();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile14 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile14 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray16 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result18 = compiler0.compile(jSSourceFileArray15, jSSourceFileArray16, compilerOptions17);
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
        org.junit.Assert.assertNotNull(jSSourceFileArray16);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        double double10 = compiler9.getProgress();
        double double11 = compiler9.getProgress();
        java.lang.String str12 = compiler9.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler9.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler9.getCodingConvention();
        int int15 = compiler9.getWarningCount();
        boolean boolean16 = compiler9.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention17 = compiler9.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState18 = compiler9.getState();
        compiler0.setState(intermediateState18);
        com.google.javascript.jscomp.CodingConvention codingConvention20 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler0.getErrorManager();
        com.google.javascript.rhino.Node node22 = compiler0.getRoot();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(codingConvention17);
        org.junit.Assert.assertNotNull(intermediateState18);
        org.junit.Assert.assertNotNull(codingConvention20);
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        double double9 = compiler8.getProgress();
        double double10 = compiler8.getProgress();
        java.lang.String str11 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler8.getErrorManager();
        boolean boolean13 = compiler8.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker14 = compiler8.tracker;
        compiler8.reportCodeChange();
        int int16 = compiler8.getErrorCount();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler8.getErrorManager();
        compiler0.setErrorManager(errorManager17);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(performanceTracker14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(errorManager17);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getWarnings();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler0.getSourceMap();
        boolean boolean13 = compiler0.isIdeMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray14 = compiler0.getMessages();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        double double16 = compiler15.getProgress();
        double double17 = compiler15.getProgress();
        java.lang.String str18 = compiler15.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler15.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention20 = compiler15.getCodingConvention();
        int int21 = compiler15.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray22 = compiler15.getWarnings();
        com.google.javascript.rhino.Node node23 = compiler15.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray24 = compiler15.getErrors();
        com.google.javascript.jscomp.SourceMap sourceMap25 = compiler15.getSourceMap();
        com.google.javascript.jscomp.JSError[] jSErrorArray26 = compiler15.getWarnings();
        boolean boolean27 = compiler15.acceptEcmaScript5();
        com.google.javascript.jscomp.JSError[] jSErrorArray28 = compiler15.getErrors();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap30 = compiler29.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        double double32 = compiler31.getProgress();
        double double33 = compiler31.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager34 = compiler31.getErrorManager();
        boolean boolean35 = compiler31.acceptConstKeyword();
        com.google.javascript.jscomp.ErrorManager errorManager36 = compiler31.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        double double38 = compiler37.getProgress();
        double double39 = compiler37.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager40 = compiler37.getErrorManager();
        compiler31.setErrorManager(errorManager40);
        compiler29.setErrorManager(errorManager40);
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        double double44 = compiler43.getProgress();
        double double45 = compiler43.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager46 = compiler43.getErrorManager();
        com.google.javascript.jscomp.SourceMap sourceMap47 = compiler43.getSourceMap();
        boolean boolean48 = compiler43.hasErrors();
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler();
        double double50 = compiler49.getProgress();
        double double51 = compiler49.getProgress();
        java.lang.String str52 = compiler49.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager53 = compiler49.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention54 = compiler49.getCodingConvention();
        int int55 = compiler49.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray56 = compiler49.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker57 = null;
        compiler49.tracker = performanceTracker57;
        com.google.javascript.jscomp.ErrorManager errorManager59 = compiler49.getErrorManager();
        compiler43.setErrorManager(errorManager59);
        compiler29.setErrorManager(errorManager59);
        com.google.javascript.jscomp.Compiler compiler62 = new com.google.javascript.jscomp.Compiler(errorManager59);
        compiler15.setErrorManager(errorManager59);
        compiler0.setErrorManager(errorManager59);
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
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSErrorArray14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertNotNull(codingConvention20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(jSErrorArray24);
        org.junit.Assert.assertNull(sourceMap25);
        org.junit.Assert.assertNotNull(jSErrorArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSErrorArray28);
        org.junit.Assert.assertNull(sourceMap30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(errorManager36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager40);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager46);
        org.junit.Assert.assertNull(sourceMap47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(errorManager53);
        org.junit.Assert.assertNotNull(codingConvention54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray56);
        org.junit.Assert.assertNotNull(errorManager59);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter6 = compiler0.getReverseAbstractInterpreter();
        java.lang.String str7 = compiler0.toSource();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        com.google.javascript.jscomp.ErrorManager errorManager49 = compiler0.getErrorManager();
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
        org.junit.Assert.assertNotNull(errorManager49);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter6 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        java.lang.String str10 = compiler0.getSourceLine("hi!", 0);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler0.tracker;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(performanceTracker11);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.Class<?> wildcardClass6 = compiler0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        boolean boolean4 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        double double7 = compiler6.getProgress();
        double double8 = compiler6.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler6.getErrorManager();
        compiler0.setErrorManager(errorManager9);
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        double double12 = compiler11.getProgress();
        double double13 = compiler11.getProgress();
        java.lang.String str14 = compiler11.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler11.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler11.getCodingConvention();
        int int17 = compiler11.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray18 = compiler11.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler11.tracker = performanceTracker19;
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler11.getErrorManager();
        compiler0.setErrorManager(errorManager21);
        com.google.javascript.jscomp.JSError[] jSErrorArray23 = compiler0.getMessages();
        int int24 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        double double26 = compiler25.getProgress();
        double double27 = compiler25.getProgress();
        java.lang.String str28 = compiler25.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager29 = compiler25.getErrorManager();
        compiler25.reportCodeChange();
        com.google.javascript.jscomp.ErrorManager errorManager31 = compiler25.getErrorManager();
        compiler0.setErrorManager(errorManager31);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray18);
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNotNull(jSErrorArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(errorManager29);
        org.junit.Assert.assertNotNull(errorManager31);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        boolean boolean26 = compiler0.isTypeCheckingEnabled();
        boolean boolean27 = compiler0.acceptEcmaScript5();
        boolean boolean28 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray29 = compiler0.getWarnings();
        com.google.javascript.jscomp.SourceMap sourceMap30 = compiler0.getSourceMap();
        com.google.javascript.rhino.Node node31 = compiler0.getRoot();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSErrorArray29);
        org.junit.Assert.assertNull(sourceMap30);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        boolean boolean9 = compiler0.acceptEcmaScript5();
        double double10 = compiler0.getProgress();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        boolean boolean58 = compiler0.hasErrors();
        boolean boolean59 = compiler0.isIdeMode();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker60 = null;
        compiler0.tracker = performanceTracker60;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput63 = compiler0.newExternInput("Unversioned directory");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        int int8 = compiler0.getErrorCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(result6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        boolean boolean4 = compiler0.acceptConstKeyword();
        compiler0.disableThreads();
        boolean boolean6 = compiler0.isIdeMode();
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        boolean boolean9 = compiler0.isIdeMode();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        double double6 = compiler0.getProgress();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode9 = compiler0.languageMode();
        com.google.javascript.jscomp.SourceFile sourceFile10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = compiler0.parse(sourceFile10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertTrue("'" + languageMode9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode9.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        boolean boolean9 = compiler0.hasErrors();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler0.getSourceMap();
        boolean boolean11 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode12 = compiler0.languageMode();
        java.lang.String str13 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node14 = compiler0.getRoot();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + languageMode12 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode12.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        int int8 = compiler0.getErrorCount();
        int int9 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile11 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray10, jSSourceFileArray12, compilerOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
        boolean boolean10 = compiler0.hasErrors();
        double double11 = compiler0.getProgress();
        boolean boolean12 = compiler0.hasErrors();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler0.getReverseAbstractInterpreter();
        int int10 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getWarnings();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(result6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray11);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getMessages();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler0.getErrorManager();
        double double13 = compiler0.getProgress();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry10);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        boolean boolean4 = compiler0.acceptConstKeyword();
        int int5 = compiler0.getWarningCount();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        boolean boolean8 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler0.tracker;
        com.google.javascript.jscomp.SourceFile sourceFile10 = null;
        com.google.javascript.jscomp.SourceFile sourceFile11 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result13 = compiler0.compile(sourceFile10, sourceFile11, compilerOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(performanceTracker9);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError jSError11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel12 = compiler0.getErrorLevel(jSError11);
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
        org.junit.Assert.assertNotNull(errorManager9);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getErrors();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler0.getSourceMap();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNull(sourceMap10);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode10 = compiler0.languageMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getMessages();
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler0.getWarnings();
        boolean boolean13 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker14 = compiler0.tracker;
        com.google.javascript.jscomp.Scope scope15 = compiler0.getTopScope();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertTrue("'" + languageMode10 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode10.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertNotNull(jSErrorArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(performanceTracker14);
        org.junit.Assert.assertNull(scope15);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        com.google.javascript.jscomp.Region region16 = compiler0.getSourceRegion("hi!", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler0.getState();
        com.google.javascript.jscomp.SourceFile sourceFile18 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile19 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray20 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile19 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result22 = compiler0.compile(sourceFile18, jSSourceFileArray20, compilerOptions21);
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
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + languageMode9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode9.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(region16);
        org.junit.Assert.assertNotNull(intermediateState17);
        org.junit.Assert.assertNotNull(jSSourceFileArray20);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        int int4 = compiler0.getWarningCount();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.hasErrors();
        boolean boolean8 = compiler0.hasErrors();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        java.lang.String str8 = compiler0.getAstDotGraph();
        double double9 = compiler0.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager6);
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(errorManager6);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler9.initOptions(compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        java.lang.String str6 = compiler0.getAstDotGraph();
        double double7 = compiler0.getProgress();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        compiler0.reportCodeChange();
        java.lang.String str9 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = compiler0.tracker;
        java.lang.String str11 = compiler0.getAstDotGraph();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(performanceTracker10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        java.lang.String str11 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.InputId inputId12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput13 = compiler0.getInput(inputId12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler0.languageMode();
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler0.getCodingConvention();
        com.google.javascript.rhino.Node node10 = compiler0.getRoot();
        boolean boolean11 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JSError jSError12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError12);
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
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        boolean boolean26 = compiler0.isTypeCheckingEnabled();
        boolean boolean27 = compiler0.acceptEcmaScript5();
        boolean boolean28 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray29 = compiler0.getWarnings();
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        double double31 = compiler30.getProgress();
        double double32 = compiler30.getProgress();
        java.lang.String str33 = compiler30.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager34 = compiler30.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler(errorManager34);
        compiler0.setErrorManager(errorManager34);
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler(errorManager34);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSErrorArray29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(errorManager34);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler0.languageMode();
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler0.getCodingConvention();
        int int10 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getErrors();
        com.google.javascript.rhino.Node node12 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        double double14 = compiler13.getProgress();
        double double15 = compiler13.getProgress();
        compiler13.reportCodeChange();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler13.getState();
        compiler0.setState(intermediateState17);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(intermediateState17);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        com.google.javascript.jscomp.Result result10 = compiler0.getResult();
        double double11 = compiler0.getProgress();
        boolean boolean12 = compiler0.isIdeMode();
        boolean boolean13 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler14.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        double double17 = compiler16.getProgress();
        double double18 = compiler16.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler16.getErrorManager();
        boolean boolean20 = compiler16.acceptConstKeyword();
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler16.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        double double23 = compiler22.getProgress();
        double double24 = compiler22.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager25 = compiler22.getErrorManager();
        compiler16.setErrorManager(errorManager25);
        compiler14.setErrorManager(errorManager25);
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        double double29 = compiler28.getProgress();
        double double30 = compiler28.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager31 = compiler28.getErrorManager();
        com.google.javascript.jscomp.SourceMap sourceMap32 = compiler28.getSourceMap();
        boolean boolean33 = compiler28.hasErrors();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        double double35 = compiler34.getProgress();
        double double36 = compiler34.getProgress();
        java.lang.String str37 = compiler34.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager38 = compiler34.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention39 = compiler34.getCodingConvention();
        int int40 = compiler34.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray41 = compiler34.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker42 = null;
        compiler34.tracker = performanceTracker42;
        com.google.javascript.jscomp.ErrorManager errorManager44 = compiler34.getErrorManager();
        compiler28.setErrorManager(errorManager44);
        compiler14.setErrorManager(errorManager44);
        compiler0.setErrorManager(errorManager44);
        com.google.javascript.jscomp.Scope scope48 = compiler0.getTopScope();
        com.google.javascript.jscomp.CodingConvention codingConvention49 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention50 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState51 = compiler0.getState();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(result10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager31);
        org.junit.Assert.assertNull(sourceMap32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(errorManager38);
        org.junit.Assert.assertNotNull(codingConvention39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray41);
        org.junit.Assert.assertNotNull(errorManager44);
        org.junit.Assert.assertNull(scope48);
        org.junit.Assert.assertNotNull(codingConvention49);
        org.junit.Assert.assertNotNull(codingConvention50);
        org.junit.Assert.assertNotNull(intermediateState51);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Region region7 = compiler0.getSourceRegion("hi!", (-1));
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile8 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler0.compile(jSSourceFileArray9, jSSourceFileArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNull(region7);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        com.google.javascript.jscomp.Scope scope11 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        double double13 = compiler12.getProgress();
        double double14 = compiler12.getProgress();
        java.lang.String str15 = compiler12.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler12.getErrorManager();
        boolean boolean17 = compiler12.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker18 = compiler12.tracker;
        compiler12.reportCodeChange();
        com.google.javascript.jscomp.Result result20 = compiler12.getResult();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        double double22 = compiler21.getProgress();
        double double23 = compiler21.getProgress();
        java.lang.String str24 = compiler21.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager25 = compiler21.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention26 = compiler21.getCodingConvention();
        int int27 = compiler21.getWarningCount();
        boolean boolean28 = compiler21.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention29 = compiler21.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState30 = compiler21.getState();
        compiler12.setState(intermediateState30);
        compiler0.setState(intermediateState30);
        com.google.javascript.jscomp.SourceMap sourceMap33 = compiler0.getSourceMap();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(performanceTracker18);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(errorManager25);
        org.junit.Assert.assertNotNull(codingConvention26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(codingConvention29);
        org.junit.Assert.assertNotNull(intermediateState30);
        org.junit.Assert.assertNull(sourceMap33);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.hasErrors();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        boolean boolean8 = compiler0.isTypeCheckingEnabled();
        boolean boolean9 = compiler0.acceptEcmaScript5();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        double double6 = compiler0.getProgress();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        boolean boolean9 = compiler0.acceptEcmaScript5();
        int int10 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder11 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int12 = codeBuilder11.getLength();
        int int13 = codeBuilder11.getLength();
        java.lang.String str14 = codeBuilder11.toString();
        java.lang.String str15 = codeBuilder11.toString();
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder11, (int) (short) 100, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        double double9 = compiler8.getProgress();
        double double10 = compiler8.getProgress();
        java.lang.String str11 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler8.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager12);
        compiler0.setErrorManager(errorManager12);
        compiler0.reportCodeChange();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(result6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(errorManager12);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        com.google.javascript.rhino.Node node10 = compiler0.getRoot();
        boolean boolean11 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler0.getSourceMap();
        boolean boolean13 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JSError[] jSErrorArray14 = compiler0.getMessages();
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions15);
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSErrorArray14);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        boolean boolean9 = compiler0.hasErrors();
        com.google.javascript.jscomp.Scope scope10 = compiler0.getTopScope();
        int int11 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler0.getErrors();
        com.google.javascript.jscomp.Result result13 = compiler0.getResult();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray12);
        org.junit.Assert.assertNotNull(result13);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        int int7 = compiler0.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler0.getSourceMap();
        double double9 = compiler0.getProgress();
        java.lang.String str10 = compiler0.getAstDotGraph();
        boolean boolean11 = compiler0.isTypeCheckingEnabled();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(result6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        compiler0.disableThreads();
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
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.hasErrors();
        boolean boolean6 = compiler0.isIdeMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getErrors();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        double double10 = compiler9.getProgress();
        double double11 = compiler9.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler9.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = compiler9.getTypeRegistry();
        boolean boolean14 = compiler9.acceptEcmaScript5();
        com.google.javascript.jscomp.Result result15 = compiler9.getResult();
        boolean boolean16 = compiler9.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        double double18 = compiler17.getProgress();
        double double19 = compiler17.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager20 = compiler17.getErrorManager();
        boolean boolean21 = compiler17.acceptConstKeyword();
        com.google.javascript.jscomp.ErrorManager errorManager22 = compiler17.getErrorManager();
        compiler9.setErrorManager(errorManager22);
        java.lang.String str24 = compiler9.toSource();
        com.google.javascript.jscomp.ErrorManager errorManager25 = compiler9.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(errorManager25);
        compiler0.setErrorManager(errorManager25);
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler(errorManager25);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(jSTypeRegistry13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(result15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(errorManager22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(errorManager25);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler0.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray13 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray12, jSModuleArray13, compilerOptions14);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertNotNull(jSModuleArray13);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        int int4 = compiler0.getWarningCount();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode5 = compiler0.languageMode();
        boolean boolean6 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode7 = compiler0.languageMode();
        java.lang.Class<?> wildcardClass8 = compiler0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + languageMode5 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode5.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + languageMode7 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode7.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        double double9 = compiler8.getProgress();
        double double10 = compiler8.getProgress();
        java.lang.String str11 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler8.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager12);
        compiler0.setErrorManager(errorManager12);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(errorManager12);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile16 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray17 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result19 = compiler15.compile(jSSourceFile16, jSModuleArray17, compilerOptions18);
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(jSModuleArray17);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        double double4 = compiler3.getProgress();
        double double5 = compiler3.getProgress();
        java.lang.String str6 = compiler3.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler3.getErrorManager();
        compiler0.setErrorManager(errorManager7);
        compiler0.disableThreads();
        compiler0.disableThreads();
        java.lang.String str11 = compiler0.getAstDotGraph();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler0.getReverseAbstractInterpreter();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(result6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str1 = codeBuilder0.toString();
        java.lang.String str2 = codeBuilder0.toString();
        java.lang.String str3 = codeBuilder0.toString();
        int int4 = codeBuilder0.getLength();
        int int5 = codeBuilder0.getLength();
        int int6 = codeBuilder0.getLength();
        java.lang.String str7 = codeBuilder0.toString();
        java.lang.String str8 = codeBuilder0.toString();
        int int9 = codeBuilder0.getLength();
        java.lang.String str10 = codeBuilder0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.hasErrors();
        boolean boolean6 = compiler0.isIdeMode();
        double double7 = compiler0.getProgress();
        java.lang.String str8 = compiler0.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
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
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getWarnings();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler0.getSourceMap();
        boolean boolean13 = compiler0.hasErrors();
        com.google.javascript.jscomp.SourceFile sourceFile14 = null;
        com.google.javascript.jscomp.SourceFile sourceFile15 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result17 = compiler0.compile(sourceFile14, sourceFile15, compilerOptions16);
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler0.tracker = performanceTracker8;
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode13 = compiler0.languageMode();
        boolean boolean14 = compiler0.hasErrors();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNotNull(jSTypeRegistry11);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertTrue("'" + languageMode13 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode13.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile27 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray28 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile27 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray29 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray28, jSModuleArray29, compilerOptions30);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray28);
        org.junit.Assert.assertNotNull(jSModuleArray29);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler0.languageMode();
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler0.getCodingConvention();
        com.google.javascript.rhino.Node node10 = compiler0.getRoot();
        boolean boolean11 = compiler0.acceptConstKeyword();
        double double12 = compiler0.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
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
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        boolean boolean11 = compiler0.isTypeCheckingEnabled();
        int int12 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler0.getState();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intermediateState13);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler0.tracker = performanceTracker8;
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        double double13 = compiler12.getProgress();
        double double14 = compiler12.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler12.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = compiler12.getTypeRegistry();
        com.google.javascript.jscomp.Result result17 = compiler12.getResult();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        double double19 = compiler18.getProgress();
        double double20 = compiler18.getProgress();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        double double22 = compiler21.getProgress();
        double double23 = compiler21.getProgress();
        java.lang.String str24 = compiler21.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager25 = compiler21.getErrorManager();
        compiler18.setErrorManager(errorManager25);
        compiler12.setErrorManager(errorManager25);
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        double double29 = compiler28.getProgress();
        double double30 = compiler28.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager31 = compiler28.getErrorManager();
        compiler12.setErrorManager(errorManager31);
        java.lang.String str33 = compiler12.toSource();
        com.google.javascript.jscomp.Region region36 = compiler12.getSourceRegion("", (int) (byte) -1);
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        double double38 = compiler37.getProgress();
        double double39 = compiler37.getProgress();
        java.lang.String str40 = compiler37.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager41 = compiler37.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention42 = compiler37.getCodingConvention();
        int int43 = compiler37.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = compiler37.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode45 = compiler37.languageMode();
        com.google.javascript.jscomp.CodingConvention codingConvention46 = compiler37.getCodingConvention();
        com.google.javascript.rhino.Node node47 = compiler37.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState48 = compiler37.getState();
        compiler12.setState(intermediateState48);
        compiler0.setState(intermediateState48);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap51 = compiler0.getInputsById();
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
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNotNull(jSTypeRegistry11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(jSTypeRegistry16);
        org.junit.Assert.assertNotNull(result17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(errorManager25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(region36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(errorManager41);
        org.junit.Assert.assertNotNull(codingConvention42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry44);
        org.junit.Assert.assertTrue("'" + languageMode45 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode45.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(codingConvention46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(intermediateState48);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        double double4 = compiler3.getProgress();
        double double5 = compiler3.getProgress();
        java.lang.String str6 = compiler3.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler3.getErrorManager();
        compiler0.setErrorManager(errorManager7);
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        double double11 = compiler10.getProgress();
        double double12 = compiler10.getProgress();
        java.lang.String str13 = compiler10.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler10.getErrorManager();
        boolean boolean15 = compiler10.hasErrors();
        boolean boolean16 = compiler10.isIdeMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler10.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray18 = compiler10.getErrors();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        double double20 = compiler19.getProgress();
        double double21 = compiler19.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager22 = compiler19.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = compiler19.getTypeRegistry();
        boolean boolean24 = compiler19.acceptEcmaScript5();
        com.google.javascript.jscomp.Result result25 = compiler19.getResult();
        boolean boolean26 = compiler19.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        double double28 = compiler27.getProgress();
        double double29 = compiler27.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager30 = compiler27.getErrorManager();
        boolean boolean31 = compiler27.acceptConstKeyword();
        com.google.javascript.jscomp.ErrorManager errorManager32 = compiler27.getErrorManager();
        compiler19.setErrorManager(errorManager32);
        java.lang.String str34 = compiler19.toSource();
        com.google.javascript.jscomp.ErrorManager errorManager35 = compiler19.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler(errorManager35);
        compiler10.setErrorManager(errorManager35);
        compiler0.setErrorManager(errorManager35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNull(sourceMap9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertNotNull(jSErrorArray18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager22);
        org.junit.Assert.assertNotNull(jSTypeRegistry23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(result25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(errorManager32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(errorManager35);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        com.google.javascript.jscomp.JSModule jSModule31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = compiler0.toSource(jSModule31);
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
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
        boolean boolean11 = compiler0.isIdeMode();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter12 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.Result result13 = compiler0.getResult();
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions14);
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
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter12);
        org.junit.Assert.assertNotNull(result13);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        com.google.javascript.rhino.Node node10 = compiler0.getRoot();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler0.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager12);
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler13.getErrorManager();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(errorManager14);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler0.tracker;
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = compiler0.getReverseAbstractInterpreter();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertNull(performanceTracker9);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = compiler0.getTypeRegistry();
        int int6 = compiler0.getErrorCount();
        java.lang.String str9 = compiler0.getSourceLine("", (int) (short) -1);
        com.google.javascript.jscomp.JsAst jsAst10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.addNewScript(jsAst10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertNotNull(jSTypeRegistry5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        com.google.javascript.rhino.Node node13 = compiler0.getRoot();
        com.google.javascript.rhino.Node node14 = compiler0.getRoot();
        com.google.javascript.jscomp.CodingConvention codingConvention15 = compiler0.getCodingConvention();
        boolean boolean16 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceFile sourceFile17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node18 = compiler0.parse(sourceFile17);
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(codingConvention15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler7.getSourceMap();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(sourceMap8);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker26 = compiler0.tracker;
        com.google.javascript.jscomp.Region region29 = compiler0.getSourceRegion("2021/11/23 10:44", (int) (short) 0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions30);
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
        org.junit.Assert.assertNull(performanceTracker26);
        org.junit.Assert.assertNull(region29);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        int int4 = compiler0.getWarningCount();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode5 = compiler0.languageMode();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter6 = compiler0.getReverseAbstractInterpreter();
        int int7 = compiler0.getErrorCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + languageMode5 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode5.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler0.getState();
        boolean boolean14 = compiler0.acceptConstKeyword();
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
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        double double3 = compiler2.getProgress();
        double double4 = compiler2.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler2.getErrorManager();
        boolean boolean6 = compiler2.acceptConstKeyword();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler2.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        double double9 = compiler8.getProgress();
        double double10 = compiler8.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler8.getErrorManager();
        compiler2.setErrorManager(errorManager11);
        compiler0.setErrorManager(errorManager11);
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        double double15 = compiler14.getProgress();
        double double16 = compiler14.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler14.getErrorManager();
        com.google.javascript.jscomp.SourceMap sourceMap18 = compiler14.getSourceMap();
        boolean boolean19 = compiler14.hasErrors();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        double double21 = compiler20.getProgress();
        double double22 = compiler20.getProgress();
        java.lang.String str23 = compiler20.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler20.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention25 = compiler20.getCodingConvention();
        int int26 = compiler20.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray27 = compiler20.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker28 = null;
        compiler20.tracker = performanceTracker28;
        com.google.javascript.jscomp.ErrorManager errorManager30 = compiler20.getErrorManager();
        compiler14.setErrorManager(errorManager30);
        compiler0.setErrorManager(errorManager30);
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler(errorManager30);
        int int34 = compiler33.getErrorCount();
        com.google.javascript.jscomp.PassConfig passConfig35 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler33.setPassConfig(passConfig35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNull(sourceMap18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(codingConvention25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray27);
        org.junit.Assert.assertNotNull(errorManager30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        boolean boolean11 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler0.getState();
        boolean boolean13 = compiler0.hasErrors();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }
}

