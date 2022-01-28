/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 23 18:37:34 GMT 2021
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.MinimizeExitPoints;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MinimizeExitPoints_ESTest extends MinimizeExitPoints_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = new Node((-1027));
      minimizeExitPoints0.tryMinimizeExits(node0, 0, "");
      assertEquals((-1027), node0.getType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = new Node((-1027));
      Node node1 = new Node((-925), node0);
      minimizeExitPoints0.process(node0, node1);
      assertFalse(node0.isInstanceOf());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints((AbstractCompiler) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, minimizeExitPoints0);
      Node node0 = new Node(0);
      // Undeclared exception!
      try { 
        minimizeExitPoints0.visit(nodeTraversal0, (Node) null, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.MinimizeExitPoints", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      // Undeclared exception!
      try { 
        minimizeExitPoints0.tryMinimizeExits((Node) null, 0, "com.google.javascript.jscomp.MinimizeExitPoints");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.MinimizeExitPoints", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      // Undeclared exception!
      try { 
        minimizeExitPoints0.process((Node) null, (Node) null);
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
  public void test5()  throws Throwable  {
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints((AbstractCompiler) null);
      Node node0 = Node.newString("A!KE3K=QJ");
      // Undeclared exception!
      try { 
        minimizeExitPoints0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints((AbstractCompiler) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, minimizeExitPoints0);
      Node node0 = new Node(0);
      minimizeExitPoints0.visit(nodeTraversal0, node0, (Node) null);
      assertEquals(32, Node.INCRDECR_PROP);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = new Node(18);
      minimizeExitPoints0.tryMinimizeExits(node0, 4, (String) null);
      assertFalse(node0.isNE());
  }
}
