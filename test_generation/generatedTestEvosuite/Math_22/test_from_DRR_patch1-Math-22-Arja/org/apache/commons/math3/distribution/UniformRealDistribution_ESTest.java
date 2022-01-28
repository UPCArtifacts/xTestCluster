/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 08 14:47:13 GMT 2021
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.UniformRealDistribution;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UniformRealDistribution_ESTest extends UniformRealDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution(1.5874010519681994, Double.POSITIVE_INFINITY);
      uniformRealDistribution0.reseedRandomGenerator(1454L);
      double double0 = uniformRealDistribution0.sample();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertEquals(1.5874010519681994, uniformRealDistribution0.getSupportLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution(120.42537106587304, 3800.34970255, 1.5874010519681994);
      double double0 = uniformRealDistribution0.sample();
      assertEquals(3442.034612039853, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution((-232.1367610489), 0.0);
      assertEquals((-232.1367610489), uniformRealDistribution0.getSupportLowerBound(), 0.01);
      
      double double0 = uniformRealDistribution0.inverseCumulativeProbability(0.5);
      assertEquals(4490.622985856176, uniformRealDistribution0.getNumericalVariance(), 0.01);
      assertEquals(0.0, uniformRealDistribution0.getSupportUpperBound(), 0.01);
      assertEquals((-116.06838052445), uniformRealDistribution0.getNumericalMean(), 0.01);
      assertEquals((-116.06838052445), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution(0.0, 120.42537106587304, 30.7020067887282);
      double double0 = uniformRealDistribution0.probability(0.0, 120.42537106587304);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(60.21268553293652, uniformRealDistribution0.getNumericalMean(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution((-2450.243184517011), 0.0);
      double double0 = uniformRealDistribution0.cumulativeProbability((-2450.243184517011));
      assertEquals((-1225.1215922585054), uniformRealDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, uniformRealDistribution0.getSupportUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.density(1.0);
      assertEquals(1.0, double0, 0.01);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution(1.0, 1.5874010519681994);
      double double0 = uniformRealDistribution0.density(1.0);
      assertEquals(1.7024143839193155, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution((-2450.243184517011), 0.0);
      double double0 = uniformRealDistribution0.sample();
      assertEquals(0.0, uniformRealDistribution0.getSupportUpperBound(), 0.01);
      assertEquals((-238.5807504030933), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution((-1.0), 0.0);
      double double0 = uniformRealDistribution0.getSupportUpperBound();
      assertEquals((-0.5), uniformRealDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.getSupportUpperBound();
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(1.0, double0, 0.01);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.getSupportLowerBound();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution((-2450.243184517011), 0.0);
      double double0 = uniformRealDistribution0.getSupportLowerBound();
      assertEquals((-1225.1215922585054), uniformRealDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, uniformRealDistribution0.getSupportUpperBound(), 0.01);
      assertEquals((-2450.243184517011), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
      assertEquals(1.0E-9, double0, 0.01);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution(well19937c0, (-2.0), 0.0, 0.0);
      double double0 = uniformRealDistribution0.getNumericalMean();
      assertEquals((-1.0), double0, 0.01);
      assertEquals(0.0, uniformRealDistribution0.getSupportUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution((RandomGenerator) null, (-3697.260022781762), 0.9166666666666666, 1.2246467991473532E-16);
      // Undeclared exception!
      try { 
        uniformRealDistribution0.sample();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.UniformRealDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      UniformRealDistribution uniformRealDistribution0 = null;
      try {
        uniformRealDistribution0 = new UniformRealDistribution(well19937c0, (-2.0433926409457167E-7), (-2.0433926409457167E-7), (-2.0433926409457167E-7));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower bound (-0) must be strictly less than upper bound (-0)
         //
         verifyException("org.apache.commons.math3.distribution.UniformRealDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = null;
      try {
        uniformRealDistribution0 = new UniformRealDistribution(12.0, 1.0E-6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower bound (12) must be strictly less than upper bound (0)
         //
         verifyException("org.apache.commons.math3.distribution.UniformRealDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.cumulativeProbability(1.0E-6);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(1.0E-6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.cumulativeProbability((-1534.1938233243));
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.cumulativeProbability(5220.4063027354);
      assertEquals(1.0, double0, 0.01);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.density(1203.002112);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution(1.5874010519681994, Double.POSITIVE_INFINITY);
      double double0 = uniformRealDistribution0.density(1.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.5874010519681994, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, uniformRealDistribution0.getSupportUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = null;
      try {
        uniformRealDistribution0 = new UniformRealDistribution(19.147034, 1.0E-6, 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower bound (19.147) must be strictly less than upper bound (0)
         //
         verifyException("org.apache.commons.math3.distribution.UniformRealDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution(1.5874010519681994, Double.POSITIVE_INFINITY);
      boolean boolean0 = uniformRealDistribution0.isSupportLowerBoundInclusive();
      assertEquals(Double.POSITIVE_INFINITY, uniformRealDistribution0.getNumericalMean(), 0.01);
      assertTrue(boolean0);
      assertEquals(1.5874010519681994, uniformRealDistribution0.getSupportLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution(1.5874010519681994, Double.POSITIVE_INFINITY);
      double double0 = uniformRealDistribution0.getSupportLowerBound();
      assertEquals(1.5874010519681994, double0, 0.01);
      assertEquals(Double.POSITIVE_INFINITY, uniformRealDistribution0.getSupportUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution((-3519.882433919), (-1885.86389169308), (-3519.882433919));
      double double0 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
      assertEquals(222501.38302817676, uniformRealDistribution0.getNumericalVariance(), 0.01);
      assertEquals((-3519.882433919), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution((-3519.882433919), (-1885.86389169308), (-3519.882433919));
      boolean boolean0 = uniformRealDistribution0.isSupportUpperBoundInclusive();
      assertEquals(222501.38302817676, uniformRealDistribution0.getNumericalVariance(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.getNumericalVariance();
      assertEquals(0.08333333333333333, double0, 0.01);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(1.0, uniformRealDistribution0.getSupportUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution((-4188.255891173), (-1607.3047149));
      double double0 = uniformRealDistribution0.getSupportUpperBound();
      assertEquals((-1607.3047149), double0, 0.01);
      assertEquals((-2897.7803030365003), uniformRealDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.getNumericalMean();
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      boolean boolean0 = uniformRealDistribution0.isSupportConnected();
      assertTrue(boolean0);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
  }
}
