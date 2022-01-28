/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 21:44:34 GMT 2021
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.text.AttributedCharacterIterator;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PlotState;
import org.jfree.chart.text.TextBlock;
import org.jfree.chart.text.TextBox;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.time.Minute;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MultiplePiePlot_ESTest extends MultiplePiePlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      multiplePiePlot0.setLimit((-2727.33203368));
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot();
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertEquals((-2727.33203368), multiplePiePlot0.getLimit(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      TextBlock textBlock0 = new TextBlock();
      TextBox textBox0 = new TextBox(textBlock0);
      Paint paint0 = textBox0.getBackgroundPaint();
      multiplePiePlot0.setAggregatedItemsPaint(paint0);
      Color color0 = (Color)multiplePiePlot0.getAggregatedItemsPaint();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
      assertEquals((-64), color0.getRGB());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 2493.8, (-1117.492563102), chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Point point0 = new Point(10, (-1734));
      Rectangle rectangle0 = new Rectangle(point0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      multiplePiePlot0.draw(graphics2D0, rectangle0, point0, (PlotState) null, plotRenderingInfo0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultStatisticalCategoryDataset0);
      multiplePiePlot0.setLimit(1641.81);
      double double0 = multiplePiePlot0.getLimit();
      assertEquals(1641.81, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      multiplePiePlot0.getLegendItems();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultStatisticalCategoryDataset0);
      multiplePiePlot0.getDataset();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      multiplePiePlot0.setDrawingSupplier((DrawingSupplier) null);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot();
      // Undeclared exception!
      try { 
        multiplePiePlot0.equals(multiplePiePlot1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.Plot", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(jDBCCategoryDataset0);
      JFreeChart jFreeChart0 = new JFreeChart(multiplePiePlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 187, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      PlotState plotState0 = new PlotState();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        multiplePiePlot0.draw(graphics2D0, (Rectangle2D) null, (Point2D) null, plotState0, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.RectangleInsets", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      multiplePiePlot0.getDataset();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      MultiplePiePlot multiplePiePlot1 = (MultiplePiePlot)multiplePiePlot0.clone();
      assertTrue(multiplePiePlot1.equals((Object)multiplePiePlot0));
      
      multiplePiePlot1.setBackgroundAlpha(10);
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      multiplePiePlot0.setLimit(799.6767458856609);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot();
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertEquals(799.6767458856609, multiplePiePlot0.getLimit(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      boolean boolean0 = multiplePiePlot0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      MultiplePiePlot multiplePiePlot1 = (MultiplePiePlot)multiplePiePlot0.clone();
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertEquals(0.0, multiplePiePlot1.getLimit(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultStatisticalCategoryDataset0);
      multiplePiePlot0.setLimit(1641.81);
      multiplePiePlot0.getLegendItems();
      assertEquals(1641.81, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultStatisticalCategoryDataset0);
      defaultStatisticalCategoryDataset0.add(multiplePiePlot0.ZERO, (Number) 1.0F, (Comparable) 1.0F, (Comparable) 10);
      multiplePiePlot0.getLegendItems();
      LegendItemCollection legendItemCollection0 = multiplePiePlot0.getLegendItems();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
      assertEquals(1, legendItemCollection0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultStatisticalCategoryDataset0);
      // Undeclared exception!
      try { 
        multiplePiePlot0.setAggregatedItemsPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(taskSeriesCollection0);
      // Undeclared exception!
      try { 
        multiplePiePlot0.setAggregatedItemsKey((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      Minute minute0 = new Minute();
      multiplePiePlot0.setAggregatedItemsKey(minute0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultStatisticalCategoryDataset0);
      // Undeclared exception!
      try { 
        multiplePiePlot0.setDataExtractOrder((TableOrder) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'order' argument
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      multiplePiePlot0.setDataExtractOrder(tableOrder0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultStatisticalCategoryDataset0);
      Font font0 = new Font((Map<? extends AttributedCharacterIterator.Attribute, ?>) null);
      JFreeChart jFreeChart0 = new JFreeChart("}-Sbp", font0, multiplePiePlot0, true);
      // Undeclared exception!
      try { 
        multiplePiePlot0.setPieChart(jFreeChart0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'pieChart' argument must be a chart based on a PiePlot.
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      // Undeclared exception!
      try { 
        multiplePiePlot0.setPieChart((JFreeChart) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'pieChart' argument.
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      multiplePiePlot0.setPieChart(jFreeChart0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      multiplePiePlot0.setDataset((CategoryDataset) null);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultKeyedValues2DDataset0);
      multiplePiePlot0.setDataset(defaultKeyedValues2DDataset0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      multiplePiePlot0.getDataExtractOrder();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      double double0 = multiplePiePlot0.getLimit();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      multiplePiePlot0.setLimit((-2725.397768091744));
      double double0 = multiplePiePlot0.getLimit();
      assertEquals((-2725.397768091744), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      Comparable comparable0 = multiplePiePlot0.getAggregatedItemsKey();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
      assertEquals("Other", comparable0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      String string0 = multiplePiePlot0.getPlotType();
      assertEquals("Multiple Pie Plot", string0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultStatisticalCategoryDataset0);
      defaultStatisticalCategoryDataset0.add(multiplePiePlot0.ZERO, (Number) 1.0F, (Comparable) 10, (Comparable) 10);
      JFreeChart jFreeChart0 = new JFreeChart("", multiplePiePlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false, true, false, false, false);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      jFreeChart0.createBufferedImage(40, 800, (double) 800, (-4.0), chartRenderingInfo0);
      LegendItemCollection legendItemCollection0 = multiplePiePlot0.getLegendItems();
      assertEquals(1, legendItemCollection0.getItemCount());
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }
}
