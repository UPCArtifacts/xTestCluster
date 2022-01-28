/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 22:15:00 GMT 2021
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.CenterArrangement;
import org.jfree.chart.block.ColorBlock;
import org.jfree.chart.block.EmptyBlock;
import org.jfree.chart.block.LengthConstraintType;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.Size2D;
import org.jfree.chart.util.UnitType;
import org.jfree.data.Range;
import org.jfree.data.jdbc.JDBCXYDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BorderArrangement_ESTest extends BorderArrangement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleInsets rectangleInsets0 = new RectangleInsets();
      blockContainer0.setMargin(rectangleInsets0);
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals(6.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      Range range0 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
      Range range1 = Range.shift(range0, 0.0, false);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range1, range0);
      Size2D size2D0 = borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Range range0 = new Range(2908.2742677, 2908.2742677);
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      Range range1 = defaultMultiValueCategoryDataset0.getRangeBounds(true);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, range1);
      Size2D size2D0 = borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      Range range0 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
      Range range1 = Range.expand(range0, (-916.1688698), 1151.5584091976);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range1, range0, (Graphics2D) null);
      assertEquals(0.0, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      blockContainer0.setMargin((-1906.105457256471), 1.0, (-1168.76441579686), 0.0);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      Range range0 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(1.0, size2D0.width, 0.01);
      assertEquals((-3074.869873053331), size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      Range range0 = jDBCXYDataset0.getRangeBounds(true);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, range0);
      Size2D size2D0 = borderArrangement0.arrangeFR(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range(2.0, 2.0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(1355.0134, range0);
      Size2D size2D0 = borderArrangement0.arrangeFR(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(2.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      UnitType unitType0 = UnitType.ABSOLUTE;
      RectangleInsets rectangleInsets0 = new RectangleInsets(unitType0, 1.7976931348623157E308, (-972.127291793), 1793, 121.7430842);
      blockContainer0.setMargin(rectangleInsets0);
      BufferedImage bufferedImage0 = new BufferedImage(1793, 1, 1);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, graphics2D0, 1);
      assertEquals((-849.384207593), size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      Color color0 = Color.MAGENTA;
      ColorBlock colorBlock0 = new ColorBlock(color0, 610.306852111793, 610.306852111793);
      borderArrangement0.add(colorBlock0, (Object) null);
      BlockContainer blockContainer0 = new BlockContainer();
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 610.306852111793);
      assertEquals(610.306852111793, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      blockContainer0.setMargin(0.0, 0.0, (-788.403978), 5.0607114227488378E17);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals((-788.403978), size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.NONE;
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((-5523L), (Range) null, lengthConstraintType0, (-5523L), (Range) null, lengthConstraintType0);
      Size2D size2D0 = borderArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals((-5523.0), size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.RANGE;
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, (Range) null, lengthConstraintType0, 0.0, (Range) null, lengthConstraintType0);
      Size2D size2D0 = borderArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(1306.4164, 1306.4164);
      Size2D size2D0 = borderArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(1306.4164, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range(2.0, 2.0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(1355.0134, range0);
      Size2D size2D0 = borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(2.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((-1032.1652681206695), 0.0);
      BlockContainer blockContainer0 = new BlockContainer();
      Size2D size2D0 = borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals((-1032.1652681206695), size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFR(blockContainer0, (Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((-127.4737), (-457.367561865292));
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFR(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (0.0) <= upper (-127.4737).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN((BlockContainer) null, (Graphics2D) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, (-1097.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (0.0) <= upper (-1097.0).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((-1703.98357765), (-369.9258050793537));
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (0.0) <= upper (-369.9258050793537).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.add(blockContainer0, "v\t");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.jfree.chart.util.RectangleEdge
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, 0.0);
      Size2D size2D0 = borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      Range range0 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, range0);
      Size2D size2D0 = borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((Range) null, (Range) null);
      // Undeclared exception!
      try { 
        borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      Size2D size2D0 = borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      Range range0 = defaultMultiValueCategoryDataset0.getRangeBounds(true);
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.NONE;
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(Double.NaN, range0, lengthConstraintType0, (-1.0), range0, lengthConstraintType0);
      Size2D size2D0 = borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range((-1097.0), (-1097.0));
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, (-1097.0));
      // Undeclared exception!
      try { 
        borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range(0.0, 0.0);
      BorderArrangement borderArrangement0 = new BorderArrangement();
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.NONE;
      LengthConstraintType lengthConstraintType1 = LengthConstraintType.RANGE;
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(3196.4920077434153, range0, lengthConstraintType1, 2242.0, range0, lengthConstraintType0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.FIXED;
      LengthConstraintType lengthConstraintType1 = LengthConstraintType.NONE;
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((-818.919283), (Range) null, lengthConstraintType0, (-818.919283), (Range) null, lengthConstraintType1);
      // Undeclared exception!
      try { 
        borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (0.0) <= upper (-818.919283).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      BorderArrangement borderArrangement1 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      Object object0 = new Object();
      boolean boolean0 = borderArrangement0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeRR(blockContainer0, (Range) null, (Range) null, (Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 1408.861259);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock((-2.147483648E9), (-2.147483648E9));
      borderArrangement0.add(emptyBlock0, (Object) null);
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      Size2D size2D0 = borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range((-1097.0), (-1097.0));
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, range0);
      Size2D size2D0 = borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals((-1097.0), size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range(780.076678575, 780.076678575);
      BorderArrangement borderArrangement0 = new BorderArrangement();
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.NONE;
      LengthConstraintType lengthConstraintType1 = LengthConstraintType.RANGE;
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(1132.35, range0, lengthConstraintType0, 0.0, range0, lengthConstraintType1);
      // Undeclared exception!
      try { 
        borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      Range range0 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.NONE;
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(2714.213861333824, range0, lengthConstraintType0, 2714.213861333824, range0, lengthConstraintType0);
      CenterArrangement centerArrangement0 = new CenterArrangement();
      BlockContainer blockContainer0 = new BlockContainer(centerArrangement0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFR(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      Size2D size2D0 = borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.clear();
  }
}
