/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 21:25:50 GMT 2021
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Stroke;
import java.awt.SystemColor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.PeriodAxisLabelInfo;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.plot.WaferMapPlot;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ValueMarker_ESTest extends ValueMarker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker((-1984.905834712349));
      ValueMarker valueMarker1 = new ValueMarker((-2494.836649036));
      boolean boolean0 = valueMarker1.equals(valueMarker0);
      assertFalse(valueMarker0.equals((Object)valueMarker1));
      assertFalse(boolean0);
      assertEquals((-2494.836649036), valueMarker1.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      ValueMarker valueMarker0 = new ValueMarker((-908.957385318), spiderWebPlot0.DEFAULT_LABEL_BACKGROUND_PAINT, spiderWebPlot0.DEFAULT_LABEL_OUTLINE_STROKE, spiderWebPlot0.DEFAULT_LABEL_SHADOW_PAINT, spiderWebPlot0.DEFAULT_OUTLINE_STROKE, 1.0F);
      assertEquals((-908.957385318), valueMarker0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.menu;
      Font font0 = PeriodAxisLabelInfo.DEFAULT_FONT;
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      JFreeChart jFreeChart0 = new JFreeChart((String) null, font0, waferMapPlot0, false);
      Stroke stroke0 = jFreeChart0.getBorderStroke();
      ValueMarker valueMarker0 = new ValueMarker(0.0, systemColor0, stroke0);
      double double0 = valueMarker0.getValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker((-2500.3055727118285));
      double double0 = valueMarker0.getValue();
      assertEquals((-2500.3055727118285), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.controlDkShadow;
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1199.818713395967));
      Stroke stroke0 = cyclicNumberAxis0.getAdvanceLineStroke();
      ValueMarker valueMarker0 = null;
      try {
        valueMarker0 = new ValueMarker((-1199.818713395967), systemColor0, stroke0, cyclicNumberAxis0.DEFAULT_AXIS_LINE_PAINT, cyclicNumberAxis0.DEFAULT_AXIS_LINE_STROKE, 2.0F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'alpha' value must be in the range 0.0f to 1.0f
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Color color0 = Color.GREEN;
      ValueMarker valueMarker0 = null;
      try {
        valueMarker0 = new ValueMarker(3800.4, color0, (Stroke) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker((-1984.905834712349));
      ValueMarker valueMarker1 = new ValueMarker((-2494.836649036));
      boolean boolean0 = valueMarker0.equals(valueMarker1);
      assertEquals((-2494.836649036), valueMarker1.getValue(), 0.01);
      assertFalse(boolean0);
      assertFalse(valueMarker1.equals((Object)valueMarker0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IntervalMarker intervalMarker0 = new IntervalMarker(1071.4088661671606, 1071.4088661671606);
      ValueMarker valueMarker0 = new ValueMarker(1071.4088661671606);
      boolean boolean0 = valueMarker0.equals(intervalMarker0);
      assertEquals(1071.4088661671606, valueMarker0.getValue(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker((-1984.905834712349));
      Object object0 = new Object();
      boolean boolean0 = valueMarker0.equals(object0);
      assertFalse(boolean0);
      assertEquals((-1984.905834712349), valueMarker0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker((-1984.905834712349));
      boolean boolean0 = valueMarker0.equals(valueMarker0);
      assertEquals((-1984.905834712349), valueMarker0.getValue(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(5700.28733);
      ValueMarker valueMarker1 = (ValueMarker)valueMarker0.clone();
      boolean boolean0 = valueMarker0.equals(valueMarker1);
      assertTrue(boolean0);
      assertEquals(5700.28733, valueMarker1.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(5700.28733);
      valueMarker0.setValue(5700.28733);
      assertEquals(5700.28733, valueMarker0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(5700.28733);
      double double0 = valueMarker0.getValue();
      assertEquals(5700.28733, double0, 0.01);
  }
}
