/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 18:59:40 GMT 2021
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Cbrt;
import org.apache.commons.math.analysis.function.Ceil;
import org.apache.commons.math.analysis.function.Constant;
import org.apache.commons.math.analysis.function.Exp;
import org.apache.commons.math.analysis.function.Identity;
import org.apache.commons.math.analysis.function.Inverse;
import org.apache.commons.math.analysis.function.Power;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Signum;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Power power0 = new Power((-1335.812));
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1302.1343036042924);
      regulaFalsiSolver0.solve(51, (UnivariateRealFunction) power0, (double) 51, (-1335.812), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-4454.68));
      Exp exp0 = new Exp();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      pegasusSolver0.solve(12, (UnivariateRealFunction) exp0, 0.0, (-746.7423950658351), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1702.583055726637));
      Inverse inverse0 = new Inverse();
      pegasusSolver0.solve(58, (UnivariateRealFunction) inverse0, (-1893.869003448632), 8.0E298, (-1893.869003448632));
      pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2474.7));
      Ceil ceil0 = new Ceil();
      illinoisSolver0.solve(108, (UnivariateRealFunction) ceil0, (-4.460529701712068E305), 1.59642E-319, (-2474.7));
      illinoisSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver(432.85103172, 1);
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(4, (UnivariateRealFunction) cbrt0, 538.2839386, (-382.18202), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [538.284, -382.182]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-900.3061323134925), (-1.0));
      Constant constant0 = new Constant(1.0E-6);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1668, (UnivariateRealFunction) constant0, 27.77777777777778, (double) 1668, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [27.778, 1,668], values: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1, (UnivariateRealFunction) cbrt0, (double) 1, (double) 1, 0.0, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1335.812), (-1335.812), (-1335.812));
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(32, (UnivariateRealFunction) signum0, (double) 32, (-1335.812), (double) 0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [32, -1,335.812]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1335.812));
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(5, (UnivariateRealFunction) null, (double) 5, 2136.011743120646, 6.344780561308204E-307, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(-0.0);
      Inverse inverse0 = new Inverse();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2942, (UnivariateRealFunction) inverse0, (-991.4000845), 0.036, (-948.3726181));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (2,942) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Exp exp0 = new Exp();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) exp0, (-1466.4202156090378), 193.0, (-1466.4202156090378));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Inverse inverse0 = new Inverse();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(293, (UnivariateRealFunction) inverse0, (double) 293, (-948.3726181), (-948.3726181));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [293, -948.373]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1702.583055726637));
      Inverse inverse0 = new Inverse();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(295, (UnivariateRealFunction) inverse0, 446.8, 8.0E298, (-1893.869003448632));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [446.8, 80,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000], values: [0.002, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1335.812), (-1335.812));
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      pegasusSolver0.solve(3235, (UnivariateRealFunction) signum0, (-2456.6349374037372), 2.718281828459045, 2.718281828459045, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      pegasusSolver0.solve(134, (UnivariateRealFunction) signum0, (-2464.246826), (double) 134, 1.0729272079707111E-4, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(3235, (UnivariateRealFunction) signum0, (-2464.246826), 2.718281828459045, 2.718281828459045, allowedSolution0);
      assertEquals(2.718281828459045, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-4.2138394757195413E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.2287726682767242E-5, (-0.0010544378664194586));
      Identity identity0 = new Identity();
      double double0 = pegasusSolver0.solve(2145744065, (UnivariateRealFunction) identity0, 4.0959088942557475E-6, 0.0, 0.0, allowedSolution0);
      assertEquals(4.0959088942557475E-6, pegasusSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2474.7));
      Ceil ceil0 = new Ceil();
      double double0 = illinoisSolver0.solve(108, (UnivariateRealFunction) ceil0, 0.0, 1.8582856774680576E-306, (-3806.83));
      assertEquals(1.8582856774680576E-306, illinoisSolver0.getMax(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sigmoid sigmoid0 = new Sigmoid((-2.2598705421875334E-297), (-677.37915484));
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-1505), (UnivariateRealFunction) sigmoid0, (-677.37915484), 0.5, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,505) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      pegasusSolver0.solve(134, (UnivariateRealFunction) signum0, (-2464.246826), (double) 134, 1.0729272079707111E-4, allowedSolution0);
  }
}
