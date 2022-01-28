/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 23 18:26:49 GMT 2021
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.JsAst;
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.Tracer;
import com.google.javascript.jscomp.TypeValidator;
import com.google.javascript.jscomp.VarCheck;
import com.google.javascript.rhino.Node;
import java.io.File;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Compiler_ESTest extends Compiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.initCompilerOptionsIfTesting();
      assertFalse(compiler0.isTypeCheckingEnabled());
      assertEquals(0.0, compiler0.getProgress(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Callable<Object> callable0 = (Callable<Object>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable0).call();
      Object object0 = Compiler.runCallableWithLargeStack(callable0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ExtractPrototypeMemberDeclarations.Pattern extractPrototypeMemberDeclarations_Pattern0 = ExtractPrototypeMemberDeclarations.Pattern.USE_ANON_FUNCTION;
      ExtractPrototypeMemberDeclarations extractPrototypeMemberDeclarations0 = new ExtractPrototypeMemberDeclarations(compiler0, extractPrototypeMemberDeclarations_Pattern0);
      Callable<ExtractPrototypeMemberDeclarations> callable0 = (Callable<ExtractPrototypeMemberDeclarations>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn(extractPrototypeMemberDeclarations0).when(callable0).call();
      Compiler.runCallable(callable0, false, false);
      assertEquals(0.0, compiler0.getProgress(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("\"f2j");
      assertEquals(0.0, compiler0.getProgress(), 0.01);
      assertFalse(compiler0.isTypeCheckingEnabled());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("");
      assertFalse(node0.hasChildren());
      
      compiler0.getWarningCount();
      assertEquals(0.0, compiler0.getProgress(), 0.01);
      assertFalse(compiler0.hasErrors());
      assertFalse(compiler0.isTypeCheckingEnabled());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      LinkedList<SourceFile> linkedList0 = new LinkedList<SourceFile>();
      LinkedList<JSModule> linkedList1 = new LinkedList<JSModule>();
      CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
      compiler0.compileModules((List<SourceFile>) linkedList0, (List<JSModule>) linkedList1, compilerOptions0);
      TypeValidator typeValidator0 = compiler0.getTypeValidator();
      assertEquals(0.0, compiler0.getProgress(), 0.01);
      assertNotNull(typeValidator0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("");
      assertFalse(node0.hasOneChild());
      
      compiler0.getResult();
      assertEquals(0.0, compiler0.getProgress(), 0.01);
      assertFalse(compiler0.hasErrors());
      assertFalse(compiler0.isTypeCheckingEnabled());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Logger logger0 = Logger.getLogger(" R9.6pru$xqGt6HB");
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      compiler0.getOptions();
      assertEquals(0.0, compiler0.getProgress(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      Tracer tracer0 = new Tracer("", "y;4^'hRjj_f-SjM");
      // Undeclared exception!
      try { 
        compiler0.stopTracer(tracer0, "a;]> iw6jA ofAPOLVu");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        compiler0.replaceScript((JsAst) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        compiler0.processAMDAndCommonJSModules();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Node node0 = Node.newString("{PI9,H|aI7y5B +n3", 1088, (-1306));
      // Undeclared exception!
      try { 
        compiler0.prepareAst(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        compiler0.parseInputs();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      // Undeclared exception!
      try { 
        compiler0.newExternInput("BNRzp(NRdmwy#eY/`");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      // Undeclared exception!
      try { 
        compiler0.newExternInput((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // a source must have a name
         //
         verifyException("com.google.javascript.jscomp.SourceFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        compiler0.isInliningForbidden();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        compiler0.initOptions((CompilerOptions) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Logger logger0 = Logger.getLogger("com.google.javascript.jscomp.NameReferenceGraph");
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      // Undeclared exception!
      try { 
        compiler0.getCodingConvention();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      // Undeclared exception!
      try { 
        compiler0.buildKnownSymbolTable();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Compiler compiler0 = null;
      try {
        compiler0 = new Compiler((ErrorManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // the error manager cannot be null
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      Logger logger0 = Logger.getGlobal();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(lightweightMessageFormatter0, logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      compiler0.getSourceLine("", 0);
      assertEquals(0.0, compiler0.getProgress(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        compiler0.getTypeRegistry();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        compiler0.getResult();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Logger logger0 = Logger.getLogger("checkMissingGetCssName");
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      // Undeclared exception!
      try { 
        compiler0.acceptConstKeyword();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      compiler0.setErrorManager(loggerErrorManager0);
      assertEquals(0.0, compiler0.getProgress(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Logger logger0 = Logger.getLogger("com.google.javascript.jscomp.NameReferenceGraph");
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      // Undeclared exception!
      try { 
        compiler0.getSynthesizedExternsInput();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ErrorManager errorManager0 = compiler0.getErrorManager();
      assertFalse(compiler0.isTypeCheckingEnabled());
      assertNotNull(errorManager0);
      assertEquals(0.0, compiler0.getProgress(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getAstDotGraph();
      assertEquals(0.0, compiler0.getProgress(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        compiler0.getSourceLine("aA\"kw9HRz87wBd)Nx/", 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Node node0 = Node.newString("{PI9,H|aI7y5B +n3", 1088, (-1306));
      DiagnosticType diagnosticType0 = VarCheck.STRICT_MODULE_DEP_ERROR;
      String[] stringArray0 = new String[1];
      JSError jSError0 = JSError.make("JSC_STRICT_MODULE_DEPENDENCY", node0, diagnosticType0, stringArray0);
      compiler0.report(jSError0);
      assertEquals(0.0, compiler0.getProgress(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Node node0 = Node.newString("{PI9,H|aI7y5B +n3", 1088, (-1306));
      String[] stringArray0 = new String[1];
      JSError jSError0 = JSError.make("JSC_STRICT_MODULE_DEPENDENCY", node0, compiler0.OPTIMIZE_LOOP_ERROR, stringArray0);
      // Undeclared exception!
      try { 
        compiler0.report(jSError0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Compiler.CodeBuilder compiler_CodeBuilder0 = new Compiler.CodeBuilder();
      Compiler.CodeBuilder compiler_CodeBuilder1 = compiler_CodeBuilder0.append("7[ydZ{Q_y*Xc");
      assertEquals("7[ydZ{Q_y*Xc", compiler_CodeBuilder1.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        compiler0.getTypeValidator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        compiler0.getDegenerateModuleGraph();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.JSModuleGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Callable<ExtractPrototypeMemberDeclarations> callable0 = (Callable<ExtractPrototypeMemberDeclarations>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((ExtractPrototypeMemberDeclarations) null).when(callable0).call();
      ExtractPrototypeMemberDeclarations extractPrototypeMemberDeclarations0 = Compiler.runCallable(callable0, false, false);
      assertNull(extractPrototypeMemberDeclarations0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream(" R9.6pru$xqGt6HB");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
      Vector<JSModule> vector0 = new Vector<JSModule>();
      // Undeclared exception!
      try { 
        compiler0.compileModules((List<SourceFile>) null, (List<JSModule>) vector0, compilerOptions0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Logger logger0 = Logger.getLogger(" R9.6pru$xqGt6HB");
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Stack<SourceFile> stack0 = new Stack<SourceFile>();
      // Undeclared exception!
      try { 
        compiler0.compile((List<SourceFile>) stack0, (List<SourceFile>) stack0, (CompilerOptions) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Compiler.CodeBuilder compiler_CodeBuilder0 = new Compiler.CodeBuilder();
      compiler_CodeBuilder0.reset();
      assertEquals("", compiler_CodeBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Compiler.CodeBuilder compiler_CodeBuilder0 = new Compiler.CodeBuilder();
      int int0 = compiler_CodeBuilder0.getColumnIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Compiler.CodeBuilder compiler_CodeBuilder0 = new Compiler.CodeBuilder();
      String string0 = compiler_CodeBuilder0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("com.google.javascript.jscomp.TypeInferencePass$TypeInferringCallback");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      compiler0.addToDebugLog("com.google.javascript.jscomp.TypeInferencePass$TypeInferringCallback");
      assertEquals(0.0, compiler0.getProgress(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      // Undeclared exception!
      try { 
        compiler0.removeTryCatchFinally();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.setHasRegExpGlobalReferences(false);
      assertEquals(0.0, compiler0.getProgress(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.initOptions(compilerOptions0);
      // Undeclared exception!
      try { 
        compiler0.recordFunctionInformation();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getModuleGraph();
      assertEquals(0.0, compiler0.getProgress(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Logger logger0 = Logger.getLogger(" R9.6pru$xqGt6HB");
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      compiler0.getTypedScopeCreator();
      assertEquals(0.0, compiler0.getProgress(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        compiler0.loadLibraryCode("Exceeded max number of code motion iterations: {0}");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
      // Undeclared exception!
      try { 
        compiler0.compile((JSSourceFile[]) null, (JSSourceFile[]) null, compilerOptions0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        compiler0.recordFunctionInformation();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      compiler0.getUniqueNameIdSupplier();
      assertEquals(0.0, compiler0.getProgress(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      // Undeclared exception!
      try { 
        compiler0.parse();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      Callable<Object> callable0 = (Callable<Object>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn(locale0).when(callable0).call();
      Object object0 = Compiler.runCallableWithLargeStack(callable0);
      assertSame(locale0, object0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        compiler0.processDefines();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.DefaultPassConfig", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = Compiler.createFillFileName("stripCode");
      assertEquals("[stripCode]", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        compiler0.parseSyntheticCode("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MockFile mockFile0 = new MockFile("6o#4B?JvLti}w\"", "6o#4B?JvLti}w\"");
      SourceFile sourceFile0 = SourceFile.fromFile((File) mockFile0);
      JsAst jsAst0 = new JsAst(sourceFile0);
      // Undeclared exception!
      try { 
        compiler0.replaceIncrementalSourceAst(jsAst0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Logger logger0 = Logger.getLogger("B");
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      boolean boolean0 = compiler0.precheck();
      assertTrue(boolean0);
      assertEquals(0.0, compiler0.getProgress(), 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.parseTestCode("");
      MockFile mockFile0 = new MockFile("6o#4B?JvLti}w\"", "6o#4B?JvLti}w\"");
      SourceFile sourceFile0 = SourceFile.fromFile((File) mockFile0);
      JsAst jsAst0 = new JsAst(sourceFile0);
      // Undeclared exception!
      try { 
        compiler0.replaceIncrementalSourceAst(jsAst0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // No input to replace: /home/mmartinez/preoverfitting/6o#4B?JvLti}w\"/6o#4B?JvLti}w\"
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Logger logger0 = Tracer.logger;
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Compiler.IntermediateState compiler_IntermediateState0 = compiler0.getState();
      compiler0.setState(compiler_IntermediateState0);
      assertEquals(0.0, compiler0.getProgress(), 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Level level0 = Level.INFO;
      Compiler.setLoggingLevel(level0);
      assertEquals(800, level0.intValue());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      LinkedList<SourceFile> linkedList0 = new LinkedList<SourceFile>();
      LinkedList<JSModule> linkedList1 = new LinkedList<JSModule>();
      CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
      compiler0.compileModules((List<SourceFile>) linkedList0, (List<JSModule>) linkedList1, compilerOptions0);
      compiler0.processAMDAndCommonJSModules();
      assertFalse(compiler0.isTypeCheckingEnabled());
      assertEquals(0.0, compiler0.getProgress(), 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      // Undeclared exception!
      try { 
        compiler0.optimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }
}
