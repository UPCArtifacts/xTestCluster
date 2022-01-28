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
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str1 = codeBuilder0.toString();
        java.lang.String str2 = codeBuilder0.toString();
        int int3 = codeBuilder0.getLength();
        int int4 = codeBuilder0.getLength();
        int int5 = codeBuilder0.getLength();
        java.lang.String str6 = codeBuilder0.toString();
        int int7 = codeBuilder0.getLength();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
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
        compiler0.disableThreads();
        double double19 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        double double21 = compiler20.getProgress();
        double double22 = compiler20.getProgress();
        java.lang.String str23 = compiler20.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler20.getErrorManager();
        compiler20.reportCodeChange();
        boolean boolean26 = compiler20.acceptEcmaScript5();
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler20.getErrorManager();
        compiler0.setErrorManager(errorManager27);
        com.google.javascript.jscomp.ErrorManager errorManager29 = compiler0.getErrorManager();
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(errorManager27);
        org.junit.Assert.assertNotNull(errorManager29);
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
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getErrors();
        com.google.javascript.rhino.Node node10 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        double double12 = compiler11.getProgress();
        double double13 = compiler11.getProgress();
        java.lang.String str14 = compiler11.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler11.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler11.getErrorManager();
        compiler0.setErrorManager(errorManager16);
        com.google.javascript.jscomp.JSError jSError18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel19 = compiler0.getErrorLevel(jSError18);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(errorManager16);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler0.getErrorManager();
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
        org.junit.Assert.assertNotNull(errorManager12);
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
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler0.tracker = performanceTracker8;
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile11 };
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
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        boolean boolean8 = compiler0.acceptEcmaScript5();
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = compiler0.getReverseAbstractInterpreter();
        boolean boolean11 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler0.getState();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap14 = compiler13.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        double double16 = compiler15.getProgress();
        double double17 = compiler15.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler15.getErrorManager();
        boolean boolean19 = compiler15.acceptConstKeyword();
        com.google.javascript.jscomp.ErrorManager errorManager20 = compiler15.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        double double22 = compiler21.getProgress();
        double double23 = compiler21.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler21.getErrorManager();
        compiler15.setErrorManager(errorManager24);
        compiler13.setErrorManager(errorManager24);
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        double double28 = compiler27.getProgress();
        double double29 = compiler27.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager30 = compiler27.getErrorManager();
        com.google.javascript.jscomp.SourceMap sourceMap31 = compiler27.getSourceMap();
        boolean boolean32 = compiler27.hasErrors();
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        double double34 = compiler33.getProgress();
        double double35 = compiler33.getProgress();
        java.lang.String str36 = compiler33.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager37 = compiler33.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention38 = compiler33.getCodingConvention();
        int int39 = compiler33.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray40 = compiler33.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker41 = null;
        compiler33.tracker = performanceTracker41;
        com.google.javascript.jscomp.ErrorManager errorManager43 = compiler33.getErrorManager();
        compiler27.setErrorManager(errorManager43);
        compiler13.setErrorManager(errorManager43);
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler(errorManager43);
        compiler0.setErrorManager(errorManager43);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder48 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int49 = codeBuilder48.getLength();
        java.lang.String str50 = codeBuilder48.toString();
        int int51 = codeBuilder48.getLength();
        java.lang.String str52 = codeBuilder48.toString();
        int int53 = codeBuilder48.getLength();
        com.google.javascript.rhino.Node node55 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder48, (int) '#', node55);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
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
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertNull(sourceMap14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(errorManager20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager30);
        org.junit.Assert.assertNull(sourceMap31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(errorManager37);
        org.junit.Assert.assertNotNull(codingConvention38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray40);
        org.junit.Assert.assertNotNull(errorManager43);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        com.google.javascript.jscomp.PassConfig passConfig11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig11);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        boolean boolean8 = compiler0.acceptEcmaScript5();
        boolean boolean9 = compiler0.hasErrors();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler0.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler0.getErrors();
        int int13 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = compiler0.getTypeRegistry();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry10);
        org.junit.Assert.assertNotNull(intermediateState11);
        org.junit.Assert.assertNotNull(jSErrorArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry14);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str1 = codeBuilder0.toString();
        java.lang.String str2 = codeBuilder0.toString();
        java.lang.String str3 = codeBuilder0.toString();
        int int4 = codeBuilder0.getLength();
        int int5 = codeBuilder0.getLength();
        java.lang.String str6 = codeBuilder0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = compiler0.getTypeRegistry();
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
        org.junit.Assert.assertNotNull(jSTypeRegistry24);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        double double6 = compiler5.getProgress();
        double double7 = compiler5.getProgress();
        java.lang.String str8 = compiler5.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler5.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler5.getCodingConvention();
        int int11 = compiler5.getWarningCount();
        boolean boolean12 = compiler5.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler5.getCodingConvention();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager14);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(errorManager14);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNotNull(errorManager14);
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
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getErrors();
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
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler0.languageMode();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode9 = compiler0.languageMode();
        java.lang.String str12 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode14 = compiler0.languageMode();
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
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + languageMode9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode9.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + languageMode14 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode14.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
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
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        int int8 = compiler0.getWarningCount();
        int int9 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler0.getState();
        int int11 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler0.getWarnings();
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
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler0.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder6 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str7 = codeBuilder6.toString();
        java.lang.String str8 = codeBuilder6.toString();
        int int9 = codeBuilder6.getLength();
        int int10 = codeBuilder6.getLength();
        int int11 = codeBuilder6.getLength();
        java.lang.String str12 = codeBuilder6.toString();
        java.lang.String str13 = codeBuilder6.toString();
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder6, (int) (short) 0, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        int int4 = compiler0.getWarningCount();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        java.lang.String str8 = compiler0.toSource();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
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
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler0.getCodingConvention();
        java.lang.Class<?> wildcardClass10 = codingConvention9.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        double double6 = compiler5.getProgress();
        double double7 = compiler5.getProgress();
        java.lang.String str8 = compiler5.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler5.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler5.getCodingConvention();
        int int11 = compiler5.getWarningCount();
        boolean boolean12 = compiler5.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler5.getCodingConvention();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager14);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        double double17 = compiler16.getProgress();
        double double18 = compiler16.getProgress();
        java.lang.String str19 = compiler16.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager20 = compiler16.getErrorManager();
        compiler16.reportCodeChange();
        boolean boolean22 = compiler16.acceptEcmaScript5();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState23 = compiler16.getState();
        compiler0.setState(intermediateState23);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(errorManager20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intermediateState23);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        java.lang.Class<?> wildcardClass26 = compiler0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
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
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        double double10 = compiler9.getProgress();
        double double11 = compiler9.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler9.getErrorManager();
        com.google.javascript.rhino.Node node13 = compiler9.getRoot();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        double double15 = compiler14.getProgress();
        double double16 = compiler14.getProgress();
        java.lang.String str17 = compiler14.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler14.getErrorManager();
        boolean boolean19 = compiler14.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = compiler14.tracker;
        boolean boolean21 = compiler14.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState22 = compiler14.getState();
        compiler9.setState(intermediateState22);
        compiler0.setState(intermediateState22);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(performanceTracker20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intermediateState22);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap11 = compiler0.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
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
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        compiler0.disableThreads();
        int int10 = compiler0.getErrorCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter12 = compiler0.getReverseAbstractInterpreter();
        boolean boolean13 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode14 = compiler0.languageMode();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        double double16 = compiler15.getProgress();
        double double17 = compiler15.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler15.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = compiler15.getTypeRegistry();
        boolean boolean20 = compiler15.acceptEcmaScript5();
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler15.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(errorManager21);
        compiler0.setErrorManager(errorManager21);
        com.google.javascript.jscomp.JsAst jsAst24 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.replaceScript(jsAst24);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertNotNull(jSTypeRegistry19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(errorManager21);
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
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler0.languageMode();
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode11 = compiler0.languageMode();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
        org.junit.Assert.assertTrue("'" + languageMode11 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode11.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
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
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        int int7 = compiler0.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler0.getSourceMap();
        double double9 = compiler0.getProgress();
        boolean boolean10 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JsAst jsAst11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.addNewScript(jsAst11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(result6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
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
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler0.tracker = performanceTracker8;
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = compiler0.getTypeRegistry();
        boolean boolean12 = compiler0.hasErrors();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.Scope scope14 = compiler0.getTopScope();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNotNull(jSTypeRegistry11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry13);
        org.junit.Assert.assertNull(scope14);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = null;
        compiler0.tracker = performanceTracker4;
        com.google.javascript.jscomp.SourceFile sourceFile6 = null;
        com.google.javascript.jscomp.SourceFile sourceFile7 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler0.compile(sourceFile6, sourceFile7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
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
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        int int8 = compiler0.getWarningCount();
        java.lang.Class<?> wildcardClass9 = compiler0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(result6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.rhino.Node node9 = compiler0.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getWarnings();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        double double11 = compiler10.getProgress();
        double double12 = compiler10.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker14 = null;
        compiler10.tracker = performanceTracker14;
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler10.getErrorManager();
        compiler0.setErrorManager(errorManager16);
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager16);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertTrue("'" + languageMode8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode8.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + languageMode9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode9.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(errorManager16);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        int int4 = compiler0.getWarningCount();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode5 = compiler0.languageMode();
        boolean boolean6 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + languageMode5 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode5.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSErrorArray7);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = null;
        compiler0.tracker = performanceTracker4;
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        double double7 = compiler0.getProgress();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getMessages();
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler0.getCodingConvention();
        compiler0.reportCodeChange();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertNotNull(codingConvention9);
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
        int int51 = compiler0.getWarningCount();
        com.google.javascript.jscomp.SourceFile sourceFile52 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray53 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result55 = compiler0.compile(sourceFile52, jSSourceFileArray53, compilerOptions54);
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler0.getErrorManager();
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
        org.junit.Assert.assertNotNull(errorManager14);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray45 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray46 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray45, jSSourceFileArray46, compilerOptions47);
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
        org.junit.Assert.assertNotNull(jSSourceFileArray45);
        org.junit.Assert.assertNotNull(jSSourceFileArray46);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        java.lang.String str10 = compiler0.getAstDotGraph();
        java.lang.String str11 = compiler0.toSource();
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler0.getErrors();
        com.google.javascript.jscomp.SourceFile sourceFile13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = compiler0.parse(sourceFile13);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(jSErrorArray12);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray10 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray9, jSModuleArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertNotNull(jSModuleArray10);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        boolean boolean11 = compiler0.acceptEcmaScript5();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
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
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
}

