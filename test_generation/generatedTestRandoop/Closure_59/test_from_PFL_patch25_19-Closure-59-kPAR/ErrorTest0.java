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
        compiler0.parse();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result1 = compiler0.getResult();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray1 = compiler0.getErrors();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray1 = compiler0.getWarnings();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.getCodingConvention();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = compiler0.getWarningCount();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler3.acceptConstKeyword();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler2.check();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result3 = compiler0.getResult();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler4.isTypeCheckingEnabled();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getWarnings();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler4.isIdeMode();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler3.parse();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = compiler0.getSourceLine("", 10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = compiler0.getSourceLine("", (int) (byte) 10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler4.acceptEcmaScript5();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = compiler0.toSource();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler2.acceptConstKeyword();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput4 = compiler0.newExternInput("");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler3.check();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler4.hasErrors();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput5 = compiler0.getInput("hi!");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler4.getTypeRegistry();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = compiler0.getErrorCount();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray3 = compiler0.toSourceArray();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        int int3 = compiler0.getErrorCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput4 = compiler0.getInput("hi!");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("hi!", (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        boolean boolean8 = compiler0.isIdeMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler0.getInput("");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        int int6 = compiler4.getErrorCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler4.rebuildInputsFromModules();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = compiler0.getWarningCount();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler0.getInput("");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        java.lang.String str10 = compiler0.toSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput12 = compiler0.newExternInput("hi!");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler2.isIdeMode();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput4 = compiler0.newExternInput("");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        int int7 = compiler4.getErrorCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler4.newExternInput("hi!");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler3.isTypeCheckingEnabled();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler3.getCodingConvention();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler3.rebuildInputsFromModules();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput3 = compiler0.getInput("hi!");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler2.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler2.check();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler4.getErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler4.check();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = compiler0.getSourceLine("hi!", 100);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler0.getInput("hi!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler2.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler2.isIdeMode();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler3.check();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        int int3 = compiler2.getWarningCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput5 = compiler2.newExternInput("");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        java.lang.String str6 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput11 = compiler0.newExternInput("");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = compiler4.toSource();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput18 = compiler3.getInput("");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler2.getWarnings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler2.isTypeCheckingEnabled();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = compiler2.toSource();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler6.parse();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.getCodingConvention();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler4.getErrors();
        java.lang.String str8 = compiler4.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler4.rebuildInputsFromModules();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler3.isIdeMode();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler2.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler2.optimize();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region12 = compiler0.getSourceRegion("hi!", (int) ' ');
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        int int6 = compiler3.getWarningCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = compiler3.getSourceLine("hi!", (int) '#');
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        int int9 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Result result10 = compiler0.getResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler2.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler2.check();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        int int3 = compiler2.getWarningCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler2.optimize();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = compiler15.acceptEcmaScript5();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler0.getTypeRegistry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler0.newExternInput("");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Result result3 = compiler2.getResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler2.acceptConstKeyword();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.rhino.Node node3 = compiler2.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler2.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler2.normalize();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler2.getWarnings();
        com.google.javascript.jscomp.Scope scope5 = compiler2.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler2.acceptConstKeyword();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        int int3 = compiler2.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler2.getMessages();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler2.optimize();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        java.lang.String str6 = compiler0.getAstDotGraph();
        java.lang.String str9 = compiler0.getSourceLine("", (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput11 = compiler0.getInput("hi!");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler4.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler4.getWarnings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = compiler4.toSource();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptConstKeyword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput5 = compiler2.newExternInput("");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler2.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler2.acceptConstKeyword();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler3.getWarnings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler3.getTypeRegistry();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        int int6 = compiler4.getErrorCount();
        compiler4.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = compiler4.acceptConstKeyword();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler4.getErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = compiler4.acceptConstKeyword();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptConstKeyword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region8 = compiler0.getSourceRegion("hi!", (int) (short) 100);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler2.normalize();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler0.isIdeMode();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler4.getErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = compiler4.acceptEcmaScript5();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        int int7 = compiler4.getErrorCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler4.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = compiler4.acceptEcmaScript5();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        java.lang.String str6 = compiler0.toSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler2.getWarnings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = compiler2.getSourceLine("hi!", (int) '4');
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler0.isIdeMode();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager5);
        compiler0.setErrorManager(errorManager5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region11 = compiler0.getSourceRegion("", (int) (byte) 1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler2.optimize();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getWarnings();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        int int3 = compiler0.getErrorCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput5 = compiler0.newExternInput("");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler2.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler2.acceptEcmaScript5();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler3.optimize();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.rhino.Node node3 = compiler2.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler2.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler2.rebuildInputsFromModules();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.isIdeMode();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = compiler0.getSourceLine("hi!", (int) (byte) 1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = compiler3.getTypeRegistry();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler0.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        compiler0.disableThreads();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region10 = compiler0.getSourceRegion("", 10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler0.tracker;
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = compiler0.getSourceLine("hi!", 10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler0.getState();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        int int7 = compiler4.getErrorCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = compiler4.acceptConstKeyword();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getMessages();
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = compiler0.getWarningCount();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
        boolean boolean10 = compiler0.isIdeMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region13 = compiler0.getSourceRegion("", 1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler0.getInput("hi!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        java.lang.String str6 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        compiler0.disableThreads();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput8 = compiler0.getInput("hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        int int8 = compiler0.getErrorCount();
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getWarnings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region13 = compiler0.getSourceRegion("", (int) (byte) 100);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler0.getErrorManager();
        boolean boolean10 = compiler0.isIdeMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = compiler0.getSourceLine("hi!", (int) (byte) 10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        java.lang.String str6 = compiler0.getAstDotGraph();
        java.lang.String str9 = compiler0.getSourceLine("", (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = compiler0.toSource();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result2 = compiler0.getResult();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getErrors();
        int int5 = compiler0.getWarningCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        int int8 = compiler0.getErrorCount();
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
        java.lang.String str10 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = compiler0.getSourceLine("", 1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput8 = compiler0.newExternInput("");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler8.check();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput5 = compiler0.newExternInput("hi!");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        int int6 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Result result7 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler8.getState();
        compiler0.setState(intermediateState9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region13 = compiler0.getSourceRegion("", (int) (short) 1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        java.lang.String str6 = compiler3.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = compiler3.toSource();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler2.getSourceMap();
        int int4 = compiler2.getWarningCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler2.parse();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        java.lang.String str10 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput12 = compiler0.newExternInput("");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        java.lang.String str7 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region11 = compiler0.getSourceRegion("", (int) (short) 10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler2.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(errorManager4);
        compiler5.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler5.normalize();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler0.getInput("");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        boolean boolean8 = compiler0.hasErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        boolean boolean9 = compiler0.hasErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler2.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler2.acceptEcmaScript5();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        boolean boolean5 = compiler0.isIdeMode();
        int int6 = compiler0.getWarningCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput11 = compiler4.newExternInput("");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        int int3 = compiler2.getWarningCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = compiler2.toSource();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler0.getTypeRegistry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = compiler0.getSourceLine("hi!", (int) (short) 10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput18 = compiler0.getInput("");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.rhino.Node node3 = compiler2.getRoot();
        compiler2.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler2.isTypeCheckingEnabled();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        boolean boolean8 = compiler0.hasErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler0.getInput("");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        int int3 = compiler2.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler2.getMessages();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler2.rebuildInputsFromModules();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler15.processDefines();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler2.getWarnings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler2.processDefines();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        java.lang.String str6 = compiler0.getAstDotGraph();
        java.lang.String str9 = compiler0.getSourceLine("", (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result10 = compiler0.getResult();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getMessages();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler2.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler2.hasErrors();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler3.acceptEcmaScript5();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler2.getWarnings();
        com.google.javascript.jscomp.Scope scope5 = compiler2.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler2.acceptEcmaScript5();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput13 = compiler0.getInput("hi!");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler4.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler4.getWarnings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler4.getCodingConvention();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = compiler0.getTypeRegistry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region8 = compiler0.getSourceRegion("hi!", 1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        int int6 = compiler0.getWarningCount();
        int int7 = compiler0.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getWarnings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler0.getInput("");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getWarnings();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        int int8 = compiler0.getErrorCount();
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getWarnings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput12 = compiler0.newExternInput("");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput8 = compiler0.newExternInput("hi!");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler3.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler3.isIdeMode();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        int int6 = compiler4.getErrorCount();
        compiler4.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = compiler4.acceptEcmaScript5();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention12 = compiler0.getCodingConvention();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler4.getErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler4.getCodingConvention();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        java.lang.String str4 = compiler0.toSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        boolean boolean6 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        int int8 = compiler0.getErrorCount();
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput12 = compiler0.newExternInput("");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("hi!", (int) (byte) 0);
        boolean boolean7 = compiler0.hasErrors();
        boolean boolean8 = compiler0.isIdeMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler0.newExternInput("hi!");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler2.getWarnings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler2.getCodingConvention();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = compiler0.getErrorCount();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = compiler0.getSourceLine("", (int) 'a');
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput23 = compiler0.newExternInput("");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = compiler4.acceptConstKeyword();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        java.lang.String str6 = compiler0.getSourceLine("", (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput8 = compiler0.newExternInput("hi!");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler2.getTypeRegistry();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler2.getCodingConvention();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler2.rebuildInputsFromModules();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = compiler0.getTypeRegistry();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.rhino.Node node3 = compiler2.getRoot();
        compiler2.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler2.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler2.acceptConstKeyword();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput14 = compiler0.newExternInput("hi!");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler3.acceptConstKeyword();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler4.getErrors();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler4.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler4.parse();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler4.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = compiler4.toSource();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        int int3 = compiler0.getWarningCount();
        java.lang.String str6 = compiler0.getSourceLine("hi!", (int) (byte) 0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler0.getInput("hi!");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        int int3 = compiler2.getWarningCount();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler2.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler2.rebuildInputsFromModules();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler0.getInput("");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler2.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler2.getWarnings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler2.parse();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput28 = compiler0.getInput("hi!");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        java.lang.String str6 = compiler0.getAstDotGraph();
        java.lang.String str9 = compiler0.getSourceLine("", (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler0.getCodingConvention();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str4 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        java.lang.String str6 = compiler0.getAstDotGraph();
        java.lang.String str9 = compiler0.getSourceLine("", (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = compiler0.getTypeRegistry();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        int int5 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler0.getInput("hi!");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler3.getMessages();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler3.getTopScope();
        java.lang.String str7 = compiler3.getAstDotGraph();
        compiler3.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = compiler3.toSource();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput8 = compiler0.newExternInput("");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region8 = compiler4.getSourceRegion("", 10);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
        boolean boolean6 = compiler0.hasErrors();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = compiler0.getSourceLine("", (int) (byte) 10);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = compiler0.getState();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str4 = compiler0.getSourceLine("", (-1));
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler0.newExternInput("hi!");
    }
}

