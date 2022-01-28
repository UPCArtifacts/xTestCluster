import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region3 = compiler0.getSourceRegion("Unversioned directory", (int) '#');
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getMessages();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter3 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = compiler0.getWarningCount();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = compiler0.getWarningCount();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.getCodingConvention();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = compiler0.getErrorCount();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap4 = compiler0.getInputsById();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput5 = compiler0.newExternInput("2021/11/23 10:44");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region7 = compiler0.getSourceRegion("Unversioned directory", (int) (short) 10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        double double4 = compiler3.getProgress();
        double double5 = compiler3.getProgress();
        java.lang.String str6 = compiler3.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler3.getErrorManager();
        compiler0.setErrorManager(errorManager7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap9 = compiler0.getInputsById();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        double double4 = compiler3.getProgress();
        double double5 = compiler3.getProgress();
        java.lang.String str6 = compiler3.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler3.getErrorManager();
        compiler0.setErrorManager(errorManager7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.isIdeMode();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = compiler0.getErrorCount();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = compiler0.getSourceLine("hi!", (int) (byte) 10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode2 = compiler0.languageMode();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.hasErrors();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler0.languageMode();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("hi!", (int) 'a');
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = compiler0.getTypeRegistry();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = compiler0.toSource();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler0.newExternInput("Unversioned directory");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap2 = compiler0.getInputsById();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.hasErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler0.newExternInput("Unversioned directory");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        int int7 = compiler0.getWarningCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = compiler0.getSourceLine("Unversioned directory", 100);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        int int7 = compiler0.getWarningCount();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = compiler0.getSourceLine("Unversioned directory", (int) '4');
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Scope scope4 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region7 = compiler0.getSourceRegion("Unversioned directory", (int) '#');
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.hasErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap6 = compiler0.getInputsById();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode3 = compiler0.languageMode();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) ' ');
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region11 = compiler0.getSourceRegion("2021/11/23 10:44", (int) (short) 1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        double double4 = compiler3.getProgress();
        double double5 = compiler3.getProgress();
        java.lang.String str6 = compiler3.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler3.getErrorManager();
        compiler0.setErrorManager(errorManager7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable10 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region13 = compiler0.getSourceRegion("", (int) (byte) 1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter6 = compiler0.getReverseAbstractInterpreter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        java.lang.String str6 = compiler0.getAstDotGraph();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        boolean boolean8 = compiler0.acceptConstKeyword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap9 = compiler0.getInputsById();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
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
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap18 = compiler0.getInputsById();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
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
        boolean boolean11 = compiler0.acceptEcmaScript5();
        com.google.javascript.rhino.Node node12 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = compiler0.getSourceLine("", (int) '4');
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region11 = compiler0.getSourceRegion("", 100);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
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
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode13 = compiler0.languageMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput15 = compiler0.newExternInput("hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result4 = compiler0.getResult();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler0.languageMode();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput5 = compiler0.newExternInput("hi!");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = compiler0.getSourceLine("2021/11/23 10:44", (int) (byte) 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap11 = compiler0.getInputsById();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        double double4 = compiler3.getProgress();
        double double5 = compiler3.getProgress();
        java.lang.String str6 = compiler3.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler3.getErrorManager();
        compiler0.setErrorManager(errorManager7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap46 = compiler0.getInputsById();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region14 = compiler0.getSourceRegion("2021/11/23 10:44", (int) (short) 100);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
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
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode13 = compiler0.languageMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = compiler0.getSourceLine("Unversioned directory", (int) '#');
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(errorManager4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler5.optimize();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        int int4 = compiler0.getWarningCount();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        boolean boolean7 = compiler0.acceptConstKeyword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = compiler0.getSourceLine("2021/11/23 10:44", 100);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        java.lang.String str9 = compiler0.getSourceLine("Unversioned directory", (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = compiler0.getSourceLine("2021/11/23 10:44", (int) (byte) 10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler9.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler9.normalize();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
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
        com.google.javascript.jscomp.Scope scope14 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = compiler0.getSourceLine("2021/11/23 10:44", (int) 'a');
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap28 = compiler0.getInputsById();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(errorManager4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler5.isTypeCheckingEnabled();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler9.tracker;
        java.lang.String str12 = compiler9.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = compiler9.hasErrors();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        int int8 = compiler0.getWarningCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = compiler0.getSourceLine("2021/11/23 10:44", (int) (byte) 100);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = compiler9.acceptEcmaScript5();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str48 = compiler0.getSourceLine("2021/11/23 10:44", (int) (byte) 1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap12 = compiler0.getInputsById();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        int int7 = compiler0.getErrorCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        int int4 = compiler0.getWarningCount();
        compiler0.disableThreads();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap7 = compiler0.getInputsById();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = compiler0.getTypeRegistry();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
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
        int int10 = compiler0.getErrorCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter6 = compiler0.getReverseAbstractInterpreter();
        int int7 = compiler0.getWarningCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = compiler0.getSourceLine("hi!", (int) 'a');
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        double double6 = compiler0.getProgress();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter15 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = compiler0.hasErrors();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap19 = compiler0.getInputsById();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler0.newExternInput("hi!");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler9.processDefines();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput14 = compiler0.newExternInput("hi!");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler9.tracker;
        java.lang.String str12 = compiler9.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = compiler9.acceptConstKeyword();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap11 = compiler0.getInputsById();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = compiler0.getSourceLine("hi!", 1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        double double6 = compiler0.getProgress();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region24 = compiler0.getSourceRegion("", (int) (short) 10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        java.lang.String str11 = compiler0.toSource();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter12 = compiler0.getReverseAbstractInterpreter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region15 = compiler0.getSourceRegion("2021/11/23 10:44", (int) (byte) 100);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler9.tracker;
        java.lang.String str12 = compiler9.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler9.processDefines();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = compiler0.getSourceLine("Unversioned directory", (int) (short) 10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        com.google.javascript.jscomp.CodingConvention codingConvention26 = compiler0.getCodingConvention();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap27 = compiler0.getInputsById();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput12 = compiler0.newExternInput("Unversioned directory");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.hasErrors();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        boolean boolean7 = compiler0.acceptConstKeyword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler0.newExternInput("hi!");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap10 = compiler0.getInputsById();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = compiler0.getSourceLine("2021/11/23 10:44", 10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler9.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = compiler9.hasErrors();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
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
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        double double26 = compiler25.getProgress();
        double double27 = compiler25.getProgress();
        java.lang.String str28 = compiler25.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager29 = compiler25.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention30 = compiler25.getCodingConvention();
        int int31 = compiler25.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = compiler25.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode33 = compiler25.languageMode();
        com.google.javascript.jscomp.CodingConvention codingConvention34 = compiler25.getCodingConvention();
        com.google.javascript.rhino.Node node35 = compiler25.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState36 = compiler25.getState();
        compiler0.setState(intermediateState36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = compiler9.acceptConstKeyword();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        double double4 = compiler3.getProgress();
        double double5 = compiler3.getProgress();
        java.lang.String str6 = compiler3.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler3.getErrorManager();
        compiler0.setErrorManager(errorManager7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler0.getCodingConvention();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        com.google.javascript.jscomp.Result result18 = compiler0.getResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter6 = compiler0.getReverseAbstractInterpreter();
        int int7 = compiler0.getWarningCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        int int4 = compiler0.getWarningCount();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.hasErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap8 = compiler0.getInputsById();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        java.lang.String str10 = compiler0.getSourceLine("", 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap11 = compiler0.getInputsById();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        double double4 = compiler3.getProgress();
        double double5 = compiler3.getProgress();
        java.lang.String str6 = compiler3.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler3.getErrorManager();
        compiler0.setErrorManager(errorManager7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = compiler0.toSource();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        int int9 = compiler0.getErrorCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap10 = compiler0.getInputsById();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region12 = compiler0.getSourceRegion("", (int) '4');
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
        java.lang.String str8 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region11 = compiler0.getSourceRegion("hi!", (int) 'a');
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        int int7 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        double double9 = compiler8.getProgress();
        double double10 = compiler8.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler8.getState();
        compiler0.setState(intermediateState11);
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler0.getMessages();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap14 = compiler0.getInputsById();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.isIdeMode();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap10 = compiler0.getInputsById();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
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
        java.lang.String str20 = compiler0.toSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = compiler0.getWarningCount();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        int int7 = compiler0.getWarningCount();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        java.lang.String str9 = compiler0.toSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
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
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(errorManager11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = compiler12.getTypeRegistry();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        int int7 = compiler0.getWarningCount();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region11 = compiler0.getSourceRegion("hi!", (int) (byte) 10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        int int7 = compiler0.getWarningCount();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        java.lang.String str9 = compiler0.toSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput11 = compiler0.newExternInput("2021/11/23 10:44");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
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
        double double19 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap14 = compiler0.getInputsById();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(errorManager14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = compiler15.acceptEcmaScript5();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
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
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(errorManager11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler12.check();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        int int7 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        double double9 = compiler8.getProgress();
        double double10 = compiler8.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler8.getState();
        compiler0.setState(intermediateState11);
        java.lang.String str15 = compiler0.getSourceLine("hi!", 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = compiler0.getSourceLine("2021/11/23 10:44", (int) '4');
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap13 = compiler0.getInputsById();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.hasErrors();
        boolean boolean6 = compiler0.isIdeMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap9 = compiler0.getInputsById();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region9 = compiler0.getSourceRegion("Unversioned directory", (int) '#');
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput5 = compiler0.newExternInput("2021/11/23 10:44");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap7 = compiler0.getInputsById();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region15 = compiler0.getSourceRegion("2021/11/23 10:44", (int) '#');
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler0.languageMode();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = compiler0.getTypeRegistry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap10 = compiler0.getInputsById();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
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
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler0.newExternInput("Unversioned directory");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
        com.google.javascript.jscomp.CodingConvention codingConvention27 = compiler0.getCodingConvention();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = compiler9.isTypeCheckingEnabled();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
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
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode22 = compiler0.languageMode();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput25 = compiler0.newExternInput("2021/11/23 10:44");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
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
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler0.tracker;
        double double12 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput14 = compiler0.newExternInput("Unversioned directory");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap14 = compiler0.getInputsById();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        java.lang.String str7 = compiler0.toSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler0.newExternInput("Unversioned directory");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.hasErrors();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter6 = compiler0.getReverseAbstractInterpreter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap7 = compiler0.getInputsById();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        boolean boolean9 = compiler0.acceptConstKeyword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        int int7 = compiler0.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler0.getSourceMap();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = compiler0.getTypeRegistry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput11 = compiler0.newExternInput("2021/11/23 10:44");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Region region4 = compiler0.getSourceRegion("hi!", (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = compiler0.isIdeMode();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
        double double19 = compiler0.getProgress();
        com.google.javascript.jscomp.Scope scope20 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap21 = compiler0.getInputsById();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Region region4 = compiler0.getSourceRegion("hi!", (int) (short) 0);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region8 = compiler0.getSourceRegion("2021/11/23 10:44", (int) '#');
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
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
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        int int7 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        double double9 = compiler8.getProgress();
        double double10 = compiler8.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler8.getState();
        compiler0.setState(intermediateState11);
        java.lang.String str13 = compiler0.toSource();
        com.google.javascript.jscomp.JSError[] jSErrorArray14 = compiler0.getMessages();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        double double16 = compiler15.getProgress();
        double double17 = compiler15.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler15.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = compiler15.getTypeRegistry();
        com.google.javascript.jscomp.Result result20 = compiler15.getResult();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        double double22 = compiler21.getProgress();
        double double23 = compiler21.getProgress();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        double double25 = compiler24.getProgress();
        double double26 = compiler24.getProgress();
        java.lang.String str27 = compiler24.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler24.getErrorManager();
        compiler21.setErrorManager(errorManager28);
        compiler15.setErrorManager(errorManager28);
        compiler0.setErrorManager(errorManager28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = compiler0.getSourceLine("hi!", (int) ' ');
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        boolean boolean8 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.rhino.Node node5 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = compiler0.getWarningCount();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        java.lang.String str6 = compiler0.getAstDotGraph();
        boolean boolean7 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = compiler0.getSourceLine("Unversioned directory", (int) (byte) 1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        java.lang.String str7 = compiler0.toSource();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler0.getReverseAbstractInterpreter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap9 = compiler0.getInputsById();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput14 = compiler0.newExternInput("Unversioned directory");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.hasErrors();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        boolean boolean8 = compiler0.isTypeCheckingEnabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
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
        com.google.javascript.jscomp.Scope scope14 = compiler0.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap16 = compiler0.getInputsById();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
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
        int int14 = compiler0.getWarningCount();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode15 = compiler0.languageMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap16 = compiler0.getInputsById();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput20 = compiler0.newExternInput("Unversioned directory");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
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
        com.google.javascript.rhino.Node node11 = compiler0.getRoot();
        com.google.javascript.rhino.Node node12 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
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
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
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
        boolean boolean10 = compiler0.isIdeMode();
        boolean boolean11 = compiler0.acceptEcmaScript5();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region14 = compiler0.getSourceRegion("Unversioned directory", (int) (short) 10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        java.lang.String str7 = compiler0.toSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
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
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = compiler0.getSourceLine("Unversioned directory", (int) (short) 10);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention11 = compiler9.getCodingConvention();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region14 = compiler0.getSourceRegion("2021/11/23 10:44", (int) (short) 100);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap12 = compiler0.getInputsById();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = compiler0.getSourceLine("2021/11/23 10:44", (int) '#');
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap11 = compiler0.getInputsById();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        int int8 = compiler0.getWarningCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = compiler0.getSourceLine("2021/11/23 10:44", (int) '#');
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Region region11 = compiler0.getSourceRegion("hi!", 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = compiler0.getSourceLine("2021/11/23 10:44", 1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput46 = compiler0.newExternInput("hi!");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
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
        boolean boolean13 = compiler0.hasErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap14 = compiler0.getInputsById();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        int int4 = compiler0.getWarningCount();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        boolean boolean8 = compiler0.acceptConstKeyword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler0.newExternInput("2021/11/23 10:44");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
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
        com.google.javascript.jscomp.SourceMap sourceMap14 = compiler0.getSourceMap();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region18 = compiler0.getSourceRegion("2021/11/23 10:44", (int) (byte) 10);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
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
        boolean boolean11 = compiler0.acceptEcmaScript5();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap14 = compiler0.getInputsById();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        boolean boolean4 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap6 = compiler0.getInputsById();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        com.google.javascript.jscomp.Region region9 = compiler0.getSourceRegion("Unversioned directory", (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = compiler0.getSourceLine("hi!", (int) ' ');
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        int int7 = compiler0.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region11 = compiler0.getSourceRegion("hi!", (int) (short) 1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
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
        com.google.javascript.rhino.Node node10 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        boolean boolean7 = compiler0.isIdeMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
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
        com.google.javascript.jscomp.Region region12 = compiler0.getSourceRegion("2021/11/23 10:44", (int) (byte) 0);
        com.google.javascript.jscomp.Scope scope13 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
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
        boolean boolean11 = compiler0.hasErrors();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode12 = compiler0.languageMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput14 = compiler0.newExternInput("Unversioned directory");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        int int4 = compiler0.getWarningCount();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region8 = compiler0.getSourceRegion("hi!", (int) (short) 100);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager3);
        double double5 = compiler4.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler4.getCodingConvention();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
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
        boolean boolean26 = compiler0.isTypeCheckingEnabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        java.lang.String str7 = compiler0.toSource();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region11 = compiler0.getSourceRegion("2021/11/23 10:44", (int) (byte) 10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.rhino.Node node5 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = compiler0.getSourceLine("", (int) '#');
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
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
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode22 = compiler0.languageMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = compiler0.getSourceLine("2021/11/23 10:44", (int) (byte) 100);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
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
        int int13 = compiler0.getErrorCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
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
        boolean boolean46 = compiler0.isTypeCheckingEnabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        int int7 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        double double9 = compiler8.getProgress();
        double double10 = compiler8.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler8.getState();
        compiler0.setState(intermediateState11);
        java.lang.String str13 = compiler0.toSource();
        com.google.javascript.jscomp.JSError[] jSErrorArray14 = compiler0.getMessages();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        double double16 = compiler15.getProgress();
        double double17 = compiler15.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler15.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = compiler15.getTypeRegistry();
        com.google.javascript.jscomp.Result result20 = compiler15.getResult();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        double double22 = compiler21.getProgress();
        double double23 = compiler21.getProgress();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        double double25 = compiler24.getProgress();
        double double26 = compiler24.getProgress();
        java.lang.String str27 = compiler24.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler24.getErrorManager();
        compiler21.setErrorManager(errorManager28);
        compiler15.setErrorManager(errorManager28);
        compiler0.setErrorManager(errorManager28);
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler(errorManager28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean33 = compiler32.acceptConstKeyword();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        int int7 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        double double9 = compiler8.getProgress();
        double double10 = compiler8.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler8.getState();
        compiler0.setState(intermediateState11);
        java.lang.String str15 = compiler0.getSourceLine("hi!", 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = compiler0.getSourceLine("hi!", (int) ' ');
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap8 = compiler0.getInputsById();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
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
        boolean boolean11 = compiler0.acceptEcmaScript5();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = compiler0.getSourceLine("", (int) (byte) 1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput8 = compiler0.newExternInput("2021/11/23 10:44");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap10 = compiler0.getInputsById();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
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
        com.google.javascript.jscomp.Scope scope28 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
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
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap11 = compiler0.getInputsById();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.hasErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        boolean boolean7 = compiler0.acceptConstKeyword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        boolean boolean4 = compiler0.acceptConstKeyword();
        compiler0.disableThreads();
        boolean boolean6 = compiler0.isIdeMode();
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap8 = compiler0.getInputsById();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
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
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput30 = compiler0.newExternInput("2021/11/23 10:44");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        int int7 = compiler0.getErrorCount();
        boolean boolean8 = compiler0.acceptConstKeyword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = compiler0.getSourceLine("Unversioned directory", (int) (short) 100);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable10 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = compiler0.getTypeRegistry();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = compiler0.getTypeRegistry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler4.getReverseAbstractInterpreter();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.getCodingConvention();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput16 = compiler0.newExternInput("2021/11/23 10:44");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = compiler0.toSource();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = compiler0.getSourceLine("2021/11/23 10:44", 1);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap12 = compiler0.getInputsById();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        double double9 = compiler8.getProgress();
        double double10 = compiler8.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler8.getErrorManager();
        boolean boolean12 = compiler8.acceptConstKeyword();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler8.getErrorManager();
        compiler0.setErrorManager(errorManager13);
        java.lang.String str15 = compiler0.toSource();
        boolean boolean16 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap18 = compiler0.getInputsById();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
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
        int int14 = compiler0.getWarningCount();
        compiler0.disableThreads();
        int int16 = compiler0.getWarningCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        int int9 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = compiler0.getSourceLine("", (int) (short) 10);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region23 = compiler0.getSourceRegion("2021/11/23 10:44", 10);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap13 = compiler0.getInputsById();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region14 = compiler0.getSourceRegion("hi!", (int) 'a');
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        int int9 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler0.getState();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode11 = compiler0.languageMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap12 = compiler0.getInputsById();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler0.getReverseAbstractInterpreter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap9 = compiler0.getInputsById();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
        java.lang.String str8 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler0.newExternInput("2021/11/23 10:44");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        int int7 = compiler0.getErrorCount();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }
}

