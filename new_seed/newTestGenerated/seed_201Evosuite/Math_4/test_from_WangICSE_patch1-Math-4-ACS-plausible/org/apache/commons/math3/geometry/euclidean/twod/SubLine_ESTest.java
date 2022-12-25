/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 25 04:39:18 GMT 2022
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.Segment;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.geometry.partitioning.Side;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SubLine_ESTest extends SubLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Vector2D vector2D1 = new Vector2D(1.0E-10, (-1.0E-10));
      Line line0 = new Line(vector2D1, vector2D1);
      SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line0);
      assertNotNull(subHyperplane_SplitSubHyperplane0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Vector2D vector2D1 = new Vector2D(1.0E-10, (-1.0E-10));
      Line line0 = new Line(vector2D1, vector2D1);
      Segment segment0 = new Segment(vector2D1, vector2D0, line0);
      SubLine subLine1 = new SubLine(segment0);
      Hyperplane<Euclidean2D> hyperplane0 = subLine0.getHyperplane();
      Side side0 = subLine1.side(hyperplane0);
      assertEquals(Side.HYPER, side0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Vector2D vector2D1 = new Vector2D(1.0E-10, (-1.0E-10));
      Line line0 = new Line(vector2D1, vector2D1);
      Side side0 = subLine0.side(line0);
      assertEquals(Side.HYPER, side0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, 3548.70737);
      SubLine subLine0 = line0.wholeHyperplane();
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Plane plane0 = new Plane(vector3D0);
      Vector2D vector2D1 = plane0.toSubSpace(vector3D0);
      Line line1 = new Line(vector2D1, (-431.95513401638));
      SubLine subLine1 = line1.wholeHyperplane();
      Vector2D vector2D2 = subLine0.intersection(subLine1, false);
      assertEquals(Double.POSITIVE_INFINITY, vector2D2.getNormSq(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D((-0.6242454216097367), (-3899.17));
      Vector2D vector2D1 = new Vector2D((-1.0), vector2D0, (-0.6242454216097367), vector2D0);
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D1, line0);
      SubLine subLine0 = new SubLine(segment0);
      Line line1 = new Line(vector2D0, vector2D1);
      SubLine subLine1 = line1.wholeHyperplane();
      Vector2D vector2D2 = subLine0.intersection(subLine1, false);
      assertFalse(vector2D2.isNaN());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D((-3481.015963394), 1.0000025320339693E-10);
      Segment segment0 = new Segment(vector2D0, vector2D0, (Line) null);
      SubLine subLine0 = new SubLine(segment0);
      IntervalsSet intervalsSet0 = new IntervalsSet((-1727.632), (-0.6496369390800625));
      BSPTree<Euclidean1D> bSPTree0 = intervalsSet0.getTree(false);
      Vector1D vector1D0 = Vector1D.NaN;
      BSPTree<Euclidean1D> bSPTree1 = bSPTree0.getCell(vector1D0);
      IntervalsSet intervalsSet1 = new IntervalsSet(bSPTree1);
      AbstractSubHyperplane<Euclidean2D, Euclidean1D> abstractSubHyperplane0 = subLine0.buildNew((Hyperplane<Euclidean2D>) null, intervalsSet1);
      assertNotSame(subLine0, abstractSubHyperplane0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NaN;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      // Undeclared exception!
      try { 
        subLine0.split((Hyperplane<Euclidean2D>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.Line", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      IntervalsSet intervalsSet0 = new IntervalsSet((-3680.7), (-3680.7));
      BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>(subLine0);
      IntervalsSet intervalsSet1 = intervalsSet0.buildNew(bSPTree0);
      SubLine subLine1 = new SubLine(line0, intervalsSet1);
      // Undeclared exception!
      try { 
        subLine1.split(line0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.euclidean.twod.SubLine cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      // Undeclared exception!
      try { 
        subLine0.side((Hyperplane<Euclidean2D>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.Line", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      IntervalsSet intervalsSet0 = new IntervalsSet();
      Object object0 = new Object();
      BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>(object0);
      IntervalsSet intervalsSet1 = intervalsSet0.buildNew(bSPTree0);
      SubLine subLine0 = new SubLine(line0, intervalsSet1);
      // Undeclared exception!
      try { 
        subLine0.side(line0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      // Undeclared exception!
      try { 
        subLine0.intersection((SubLine) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.SubLine", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NaN;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Line line0 = new Line(vector2D0, vector2D0);
      BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>(line0);
      IntervalsSet intervalsSet0 = new IntervalsSet(bSPTree0);
      SubLine subLine1 = new SubLine(line0, intervalsSet0);
      // Undeclared exception!
      try { 
        subLine0.intersection(subLine1, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.euclidean.twod.Line cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IntervalsSet intervalsSet0 = new IntervalsSet();
      SubLine subLine0 = new SubLine((Hyperplane<Euclidean2D>) null, intervalsSet0);
      // Undeclared exception!
      try { 
        subLine0.getSegments();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.SubLine", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, 0.7401380825037718);
      BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>(line0);
      IntervalsSet intervalsSet0 = new IntervalsSet(bSPTree0);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      // Undeclared exception!
      try { 
        subLine0.getSegments();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.euclidean.twod.Line cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      SubLine subLine0 = null;
      try {
        subLine0 = new SubLine(vector2D0, (Vector2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.Line", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SubLine subLine0 = null;
      try {
        subLine0 = new SubLine((Segment) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.SubLine", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Line line0 = new Line(vector2D0, (-1445.081994155));
      SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line0);
      assertNotNull(subHyperplane_SplitSubHyperplane0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, vector2D0);
      line0.setOriginOffset((-1.0));
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line0);
      assertNotNull(subHyperplane_SplitSubHyperplane0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, (-1.0E-10));
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line0);
      assertNotNull(subHyperplane_SplitSubHyperplane0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line0);
      assertNotNull(subHyperplane_SplitSubHyperplane0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Line line0 = new Line(vector2D0, (-1445.081994155));
      Side side0 = subLine0.side(line0);
      assertEquals(Side.PLUS, side0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, vector2D0);
      line0.setOriginOffset(1452.4529473);
      Line line1 = new Line(vector2D0, 0.0);
      SubLine subLine0 = line1.wholeHyperplane();
      Side side0 = subLine0.side(line0);
      assertEquals(Side.PLUS, side0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      Vector2D vector2D1 = new Vector2D((-122.856), (-588.6));
      Line line1 = new Line(vector2D1, vector2D1);
      Side side0 = subLine0.side(line1);
      assertEquals(Side.MINUS, side0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      Vector2D vector2D1 = subLine0.intersection(subLine0, false);
      assertEquals(Double.NaN, vector2D1.getNormInf(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      SubLine subLine1 = line0.wholeHyperplane();
      Vector2D vector2D1 = subLine1.intersection(subLine0, false);
      assertNull(vector2D1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      SubLine subLine1 = new SubLine(vector2D0, vector2D0);
      Vector2D vector2D1 = subLine0.intersection(subLine1, true);
      assertNull(vector2D1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NaN;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Vector2D vector2D1 = subLine0.intersection(subLine0, true);
      assertNull(vector2D1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Line line0 = new Line(vector2D0, (-1.0E-10));
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine1 = new SubLine(segment0);
      Vector2D vector2D1 = subLine0.intersection(subLine1, true);
      assertEquals(0.0, vector2D1.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Vector2D vector2D1 = subLine0.intersection(subLine0, false);
      assertNull(vector2D1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      Vector2D vector2D1 = subLine0.intersection(subLine0, false);
      assertNull(vector2D1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      List<Segment> list0 = subLine0.getSegments();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Line line0 = new Line(vector2D0, (-1.0E-10));
      LinkedList<SubHyperplane<Euclidean1D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean1D>>();
      IntervalsSet intervalsSet0 = new IntervalsSet(linkedList0);
      AbstractSubHyperplane<Euclidean2D, Euclidean1D> abstractSubHyperplane0 = subLine0.buildNew(line0, intervalsSet0);
      assertNotSame(subLine0, abstractSubHyperplane0);
  }
}
