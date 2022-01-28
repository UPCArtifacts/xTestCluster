/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 08 13:54:48 GMT 2021
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.PoissonDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PoissonDistributionImpl_ESTest extends PoissonDistributionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(3894.204, 3894.204);
      double double0 = poissonDistributionImpl0.probability(10000000);
      assertEquals(3894.204, poissonDistributionImpl0.getMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = null;
      try {
        poissonDistributionImpl0 = new PoissonDistributionImpl(0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math.distribution.PoissonDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(2872.2151068057606, 2872.2151068057606);
      int int0 = poissonDistributionImpl0.sample();
      assertEquals(2883, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(Integer.MAX_VALUE, 6.283185307179586, Integer.MAX_VALUE);
      double double0 = poissonDistributionImpl0.normalApproximateProbability(Integer.MAX_VALUE);
      assertEquals(2.147483647E9, poissonDistributionImpl0.getMean(), 0.01);
      assertEquals(0.5000043044249243, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(3894.60274763551);
      int int0 = poissonDistributionImpl0.getDomainUpperBound(3894.60274763551);
      assertEquals(3894.60274763551, poissonDistributionImpl0.getMean(), 0.01);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.008768700134139386);
      int int0 = poissonDistributionImpl0.getDomainLowerBound(0.008768700134139386);
      assertEquals(0.008768700134139386, poissonDistributionImpl0.getMean(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.5, 0.0);
      double double0 = poissonDistributionImpl0.cumulativeProbability((-1));
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.5, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(Integer.MAX_VALUE);
      // Undeclared exception!
      poissonDistributionImpl0.sample();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1176.4947737861448, (-164.73658));
      // Undeclared exception!
      poissonDistributionImpl0.cumulativeProbability(10000000);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1817.4942975, (-1.0));
      try { 
        poissonDistributionImpl0.cumulativeProbability(268);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Continued fraction diverged to NaN for value 1,817.494
         //
         verifyException("org.apache.commons.math.util.ContinuedFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(576.73155913593, 0, 0);
      try { 
        poissonDistributionImpl0.cumulativeProbability(0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Continued fraction convergents failed to converge for value 576.732
         //
         verifyException("org.apache.commons.math.util.ContinuedFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = null;
      try {
        poissonDistributionImpl0 = new PoissonDistributionImpl((-2713.1), (-2713.1), Integer.MAX_VALUE);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math.distribution.PoissonDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = null;
      try {
        poissonDistributionImpl0 = new PoissonDistributionImpl((-1470.2194840114496), (-1470.2194840114496));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math.distribution.PoissonDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.09090909090909091, 50);
      assertEquals(0.09090909090909091, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(135.2349319725, (-1.0), (-770));
      double double0 = poissonDistributionImpl0.cumulativeProbability(Integer.MAX_VALUE);
      assertEquals(1.0, double0, 0.01);
      assertEquals(135.2349319725, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(3894.204);
      double double0 = poissonDistributionImpl0.probability(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(Integer.MAX_VALUE);
      double double0 = poissonDistributionImpl0.probability(Integer.MAX_VALUE);
      assertEquals(0.0, double0, 0.01);
      assertEquals(2.147483647E9, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.5, 0.0);
      double double0 = poissonDistributionImpl0.probability(1);
      assertEquals(0.3032653298563167, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(135.2349319725, (-1.0), (-770));
      double double0 = poissonDistributionImpl0.probability((-2327));
      assertEquals(0.0, double0, 0.01);
      assertEquals(135.2349319725, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(3029.749);
      double double0 = poissonDistributionImpl0.normalApproximateProbability(1155);
      assertEquals(3029.749, poissonDistributionImpl0.getMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = null;
      try {
        poissonDistributionImpl0 = new PoissonDistributionImpl((double) (-13), (-13));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math.distribution.PoissonDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.5, 0.0);
      int int0 = poissonDistributionImpl0.sample();
      assertEquals(0.5, poissonDistributionImpl0.getMean(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(3029.749);
      poissonDistributionImpl0.getMean();
  }
}
