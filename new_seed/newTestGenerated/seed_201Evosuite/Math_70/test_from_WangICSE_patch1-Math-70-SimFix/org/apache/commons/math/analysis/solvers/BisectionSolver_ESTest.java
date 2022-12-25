/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 25 05:27:43 GMT 2022
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1663.1075842483967);
      doubleArray0[1] = 3143.2189989;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      bisectionSolver0.setAbsoluteAccuracy(0.0);
      double double0 = bisectionSolver0.solve(72.8729, 876.7731494129689);
      assertEquals(53, bisectionSolver0.getIterationCount());
      assertEquals(876.7731494129689, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1663.1075842483967);
      doubleArray0[1] = 3143.2189989;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-395.12569657), 3143.2189989, (-1663.1075842483967));
      assertEquals(31, bisectionSolver0.getIterationCount());
      assertEquals((-3.175626184619971E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1666.923651538511);
      doubleArray0[1] = 3143.2189989;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-3352.45243512674), (-1057.8293423836317));
      assertEquals(31, bisectionSolver0.getIterationCount());
      assertEquals((-1057.829342650761), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1663.1075842483967);
      doubleArray0[1] = 3143.2189989;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      double double0 = bisectionSolver0.solve((-1244.5998190338044), 1662.74403971, (-590.78));
      assertEquals(31, bisectionSolver0.getIterationCount());
      assertEquals(3.002648906738214E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1663.1075842483967);
      doubleArray0[1] = 3143.2189989;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      double double0 = bisectionSolver0.solve((-1663.1075842483967), 0.0, 3143.2189989);
      assertEquals(30, bisectionSolver0.getIterationCount());
      assertEquals((-3.872224093061864E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1666.923651538511);
      doubleArray0[1] = 3143.2189989;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      double double0 = bisectionSolver0.solve((-1666.923651538511), 0.0);
      assertEquals(30, bisectionSolver0.getIterationCount());
      assertEquals((-3.881109067095702E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) null, 3189.1, 3189.1, 3189.1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,189.1, 3,189.1]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double[] doubleArray0 = new double[2];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-2695.20704433), 1.0, 1.0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Abscissa 0 is duplicated at both indices 1 and 1
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 971.218028869967;
      PolynomialFunction[] polynomialFunctionArray0 = new PolynomialFunction[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      polynomialFunctionArray0[0] = polynomialFunction0;
      PolynomialSplineFunction polynomialSplineFunction0 = new PolynomialSplineFunction(doubleArray0, polynomialFunctionArray0);
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialSplineFunction0, 0.0023474414062499976, 1100.009631361, 1.8339385986328107E-5);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Argument 1,031.259 outside domain [0 ; 971.218]
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-2550.466221062225), Double.POSITIVE_INFINITY, (-2550.466221062225));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) null, 0.0, 2600.69018713, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) null, (-1605.10032684825), (-1605.10032684825));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-1,605.1, -1,605.1]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 6.232959685995654, 768666.6268750371);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Abscissa 0 is duplicated at both indices 1 and 1
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) null, (-3431.92), (-3187.307593554237));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(Double.POSITIVE_INFINITY, 0.0, 4529949.245697083);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [\u221E, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1663.1075842483967);
      doubleArray0[1] = 3143.2189989;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      bisectionSolver0.setMaximalIterationCount(1363);
      // Undeclared exception!
      bisectionSolver0.solve(1.0E-15, Double.POSITIVE_INFINITY, (-395.12569657));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.setMaximalIterationCount((-1));
      try { 
        bisectionSolver0.solve((-5500.0853), 1.0, 14.848315617615272);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-1) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(1.0, 764606.1750149453, 1.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(2611.41235741371, 2611.41235741371);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,611.412, 2,611.412]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.setMaximalIterationCount((-1525));
      try { 
        bisectionSolver0.solve((-1.0), 5.260722938537598E-7);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-1,525) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((-3956.54841132229), 1119002.9458109709);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BisectionSolver bisectionSolver0 = null;
      try {
        bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function to solve cannot be null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 4368.93211758;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-2695.20704433), 4368.93211758);
      assertEquals(32, bisectionSolver0.getIterationCount());
      assertEquals(4368.9321171688125, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, 1.0, Double.POSITIVE_INFINITY);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      try { 
        bisectionSolver0.solve(1.0E-15, Double.POSITIVE_INFINITY, (-395.12569657));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Abscissa 0 is duplicated at both indices 1 and 1
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      try { 
        bisectionSolver0.solve(72.8729, 876.7731494129689);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Abscissa 0 is duplicated at both indices 1 and 1
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, 0.0, 1.0, 0.0);
      assertEquals(19, bisectionSolver0.getIterationCount());
      assertEquals(4.76837158203125E-7, double0, 0.01);
  }
}
