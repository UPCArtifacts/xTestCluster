import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker1.getLabelOffset();
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        float float12 = valueMarker1.getAlpha();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Paint paint8 = valueMarker1.getPaint();
        java.awt.Font font9 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.awt.Font font3 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(font3);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        float float12 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.addChangeListener(markerChangeListener13);
        java.lang.Object obj15 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker1.notifyListeners(markerChangeEvent16);
        float float18 = valueMarker1.getAlpha();
        java.awt.Font font19 = valueMarker1.getLabelFont();
        float float20 = valueMarker1.getAlpha();
        java.awt.Paint paint21 = null;
        valueMarker1.setOutlinePaint(paint21);
        java.awt.Paint paint23 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        float float12 = valueMarker1.getAlpha();
        valueMarker1.setLabel("");
        valueMarker1.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint18 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint20 = valueMarker1.getOutlinePaint();
        valueMarker1.setLabel("hi!");
        java.awt.Paint paint23 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.awt.Paint paint8 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke9 = valueMarker1.getStroke();
        java.awt.Paint paint10 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker14.notifyListeners(markerChangeEvent17);
        valueMarker14.setValue((double) 0.8f);
        boolean boolean21 = valueMarker12.equals((java.lang.Object) valueMarker14);
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker23.addChangeListener(markerChangeListener26);
        double double28 = valueMarker23.getValue();
        java.awt.Paint paint29 = valueMarker23.getOutlinePaint();
        java.awt.Paint paint30 = valueMarker23.getLabelPaint();
        java.awt.Paint paint31 = valueMarker23.getPaint();
        valueMarker12.setPaint(paint31);
        java.lang.Class<?> wildcardClass33 = valueMarker12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray34 = valueMarker1.getListeners((java.lang.Class) wildcardClass33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        java.awt.Stroke stroke11 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker4.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker12.notifyListeners(markerChangeEvent15);
        valueMarker12.setValue((double) 0.8f);
        boolean boolean19 = valueMarker10.equals((java.lang.Object) valueMarker12);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker12.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker12.addChangeListener(markerChangeListener21);
        java.awt.Paint paint23 = valueMarker12.getOutlinePaint();
        valueMarker1.setPaint(paint23);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker26.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker26.addChangeListener(markerChangeListener29);
        double double31 = valueMarker26.getValue();
        java.awt.Paint paint32 = valueMarker26.getLabelPaint();
        valueMarker1.setPaint(paint32);
        org.jfree.chart.text.TextAnchor textAnchor34 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(textAnchor34);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        float float10 = valueMarker1.getAlpha();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        float float16 = valueMarker13.getAlpha();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        java.lang.Class<?> wildcardClass18 = stroke17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray19 = valueMarker1.getListeners((java.lang.Class) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.BasicStroke; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8f + "'", float10 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.removeChangeListener(markerChangeListener10);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        java.lang.Object obj10 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint13 = valueMarker12.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker12.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor14);
        valueMarker1.setValue(100.0d);
        java.lang.Object obj18 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        java.awt.Paint paint7 = valueMarker4.getPaint();
        java.lang.String str8 = valueMarker4.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker4.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType9);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker12.addChangeListener(markerChangeListener15);
        double double17 = valueMarker12.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker12.getLabelAnchor();
        valueMarker12.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker12.getLabelOffset();
        java.awt.Paint paint22 = valueMarker12.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint22);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        valueMarker1.setValue((double) 10L);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint16 = valueMarker15.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        java.awt.Paint paint21 = valueMarker18.getPaint();
        java.awt.Stroke stroke22 = valueMarker18.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint16, stroke22);
        float float24 = valueMarker23.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker23.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor25);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker1.addChangeListener(markerChangeListener27);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = valueMarker1.getLabelOffset();
        java.awt.Paint paint30 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertNotNull(textAnchor25);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        java.lang.String str11 = valueMarker1.getLabel();
        java.awt.Paint paint12 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker14.notifyListeners(markerChangeEvent17);
        java.awt.Stroke stroke19 = valueMarker14.getStroke();
        java.lang.Object obj20 = valueMarker14.clone();
        valueMarker14.setValue((double) (short) 100);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType23 = valueMarker14.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType23);
        java.awt.Stroke stroke25 = valueMarker1.getOutlineStroke();
        java.lang.String str26 = valueMarker1.getLabel();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType23);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getLabelPaint();
        java.lang.String str10 = valueMarker1.getLabel();
        valueMarker1.setAlpha((float) (short) 1);
        java.lang.Object obj13 = valueMarker1.clone();
        java.awt.Font font14 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 'a');
        valueMarker16.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker16.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        valueMarker1.setLabelPaint(paint10);
        java.lang.String str12 = valueMarker1.getLabel();
        java.awt.Paint paint13 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        valueMarker17.notifyListeners(markerChangeEvent20);
        valueMarker17.setValue((double) 0.8f);
        boolean boolean24 = valueMarker15.equals((java.lang.Object) valueMarker17);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker17.getLabelAnchor();
        java.awt.Stroke stroke26 = valueMarker17.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke26);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor25);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.addChangeListener(markerChangeListener10);
        valueMarker1.setValue((double) (-1L));
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getPaint();
        java.lang.String str19 = valueMarker15.getLabel();
        double double20 = valueMarker15.getValue();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker15.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor21);
        java.lang.String str23 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        java.awt.Paint paint28 = valueMarker25.getPaint();
        java.awt.Stroke stroke29 = valueMarker25.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker31.setLabel("");
        java.awt.Paint paint34 = valueMarker31.getOutlinePaint();
        valueMarker25.setLabelPaint(paint34);
        float float36 = valueMarker25.getAlpha();
        valueMarker25.setLabel("");
        valueMarker25.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor41 = valueMarker25.getLabelTextAnchor();
        java.awt.Paint paint42 = valueMarker25.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType43 = valueMarker25.getLabelOffsetType();
        java.awt.Paint paint44 = valueMarker25.getOutlinePaint();
        java.lang.Class<?> wildcardClass45 = valueMarker25.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray46 = valueMarker1.getListeners((java.lang.Class) wildcardClass45);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.8f + "'", float36 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(lengthAdjustmentType43);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getOutlinePaint();
        valueMarker1.setLabelPaint(paint8);
        java.awt.Font font10 = valueMarker1.getLabelFont();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker15.notifyListeners(markerChangeEvent18);
        valueMarker15.setValue((double) 0.8f);
        boolean boolean22 = valueMarker13.equals((java.lang.Object) valueMarker15);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker15.addChangeListener(markerChangeListener23);
        java.awt.Paint paint25 = valueMarker15.getLabelPaint();
        valueMarker1.setLabelPaint(paint25);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        float float11 = valueMarker8.getAlpha();
        java.awt.Stroke stroke12 = valueMarker8.getOutlineStroke();
        boolean boolean13 = valueMarker1.equals((java.lang.Object) valueMarker8);
        float float14 = valueMarker8.getAlpha();
        valueMarker8.setLabel("");
        java.awt.Font font17 = valueMarker8.getLabelFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker8.notifyListeners(markerChangeEvent18);
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker8.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(textAnchor20);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        valueMarker8.notifyListeners(markerChangeEvent11);
        valueMarker8.setValue((double) 0.8f);
        boolean boolean15 = valueMarker6.equals((java.lang.Object) valueMarker8);
        valueMarker8.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker8.removeChangeListener(markerChangeListener18);
        boolean boolean20 = valueMarker1.equals((java.lang.Object) valueMarker8);
        java.awt.Font font21 = valueMarker1.getLabelFont();
        java.lang.Object obj22 = valueMarker1.clone();
        java.awt.Stroke stroke23 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.lang.String str6 = valueMarker1.getLabel();
        java.awt.Paint paint7 = valueMarker1.getPaint();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType2 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.removeChangeListener(markerChangeListener3);
        org.junit.Assert.assertNotNull(lengthAdjustmentType2);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker9.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets10);
        java.awt.Stroke stroke12 = valueMarker1.getStroke();
        double double13 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker15.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker15.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker15.addChangeListener(markerChangeListener20);
        valueMarker15.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker15.addChangeListener(markerChangeListener24);
        valueMarker15.setValue((double) (-1L));
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker15.getLabelOffsetType();
        float float29 = valueMarker15.getAlpha();
        boolean boolean30 = valueMarker1.equals((java.lang.Object) float29);
        valueMarker1.setAlpha(0.8f);
        java.awt.Stroke stroke33 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker1.removeChangeListener(markerChangeListener34);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.8f + "'", float29 == 0.8f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(stroke33);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1.0f);
        valueMarker1.setLabel("hi!");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(font4);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        float float11 = valueMarker10.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker10.getLabelTextAnchor();
        java.lang.String str13 = valueMarker10.getLabel();
        java.awt.Paint paint14 = valueMarker10.getPaint();
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker10.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(textAnchor15);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getPaint();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        valueMarker19.notifyListeners(markerChangeEvent22);
        valueMarker19.setValue((double) 0.8f);
        boolean boolean26 = valueMarker17.equals((java.lang.Object) valueMarker19);
        java.awt.Stroke stroke27 = valueMarker19.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint15, stroke27);
        java.awt.Stroke stroke29 = valueMarker28.getOutlineStroke();
        valueMarker1.setStroke(stroke29);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker1.removeChangeListener(markerChangeListener31);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent33 = null;
        valueMarker1.notifyListeners(markerChangeEvent33);
        java.awt.Paint paint35 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        valueMarker10.setValue((double) 10);
        java.awt.Stroke stroke13 = valueMarker10.getOutlineStroke();
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker10.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(textAnchor14);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        valueMarker1.setAlpha(0.0f);
        java.awt.Paint paint14 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.addChangeListener(markerChangeListener15);
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType21 = valueMarker18.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker18.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker18.addChangeListener(markerChangeListener23);
        java.awt.Paint paint25 = valueMarker18.getLabelPaint();
        java.awt.Font font26 = valueMarker18.getLabelFont();
        valueMarker1.setLabelFont(font26);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(font26);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        float float12 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.addChangeListener(markerChangeListener13);
        java.lang.Object obj15 = valueMarker1.clone();
        java.awt.Stroke stroke16 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.removeChangeListener(markerChangeListener17);
        java.awt.Paint paint19 = valueMarker1.getPaint();
        double double20 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke6 = valueMarker5.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        java.awt.Paint paint14 = valueMarker11.getPaint();
        java.lang.String str15 = valueMarker11.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker11.getLabelOffsetType();
        valueMarker8.setLabelOffsetType(lengthAdjustmentType16);
        valueMarker5.setLabelOffsetType(lengthAdjustmentType16);
        valueMarker1.setLabelOffsetType(lengthAdjustmentType16);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker1.addChangeListener(markerChangeListener20);
        java.lang.String str22 = valueMarker1.getLabel();
        float float23 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        valueMarker1.notifyListeners(markerChangeEvent7);
        valueMarker1.setLabel("");
        valueMarker1.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker14.notifyListeners(markerChangeEvent17);
        valueMarker14.setValue((double) 0.8f);
        java.lang.Class<?> wildcardClass21 = valueMarker14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray22 = valueMarker1.getListeners((java.lang.Class) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        valueMarker1.setStroke(stroke11);
        float float13 = valueMarker1.getAlpha();
        java.lang.Class<?> wildcardClass14 = valueMarker1.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        float float11 = valueMarker10.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker10.getLabelTextAnchor();
        java.lang.String str13 = valueMarker10.getLabel();
        valueMarker10.setValue((double) 0.0f);
        valueMarker10.setAlpha((float) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            valueMarker10.setAlpha((float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Paint paint11 = valueMarker7.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str14 = valueMarker13.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker13.addChangeListener(markerChangeListener15);
        java.awt.Font font17 = valueMarker13.getLabelFont();
        valueMarker7.setLabelFont(font17);
        valueMarker1.setLabelFont(font17);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker1.removeChangeListener(markerChangeListener20);
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        float float26 = valueMarker23.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker23.getLabelOffsetType();
        valueMarker23.setLabel("hi!");
        java.awt.Font font30 = valueMarker23.getLabelFont();
        valueMarker1.setLabelFont(font30);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType32 = valueMarker1.getLabelOffsetType();
        java.awt.Stroke stroke33 = valueMarker1.getStroke();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNotNull(lengthAdjustmentType32);
        org.junit.Assert.assertNotNull(stroke33);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.lang.Object obj3 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getPaint();
        java.awt.Stroke stroke12 = valueMarker8.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getOutlinePaint();
        valueMarker8.setLabelPaint(paint17);
        float float19 = valueMarker8.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker8.addChangeListener(markerChangeListener20);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker8.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker26.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        valueMarker26.notifyListeners(markerChangeEvent29);
        valueMarker26.setValue((double) 0.8f);
        boolean boolean33 = valueMarker24.equals((java.lang.Object) valueMarker26);
        java.awt.Stroke stroke34 = valueMarker26.getStroke();
        valueMarker8.setStroke(stroke34);
        java.awt.Stroke stroke36 = valueMarker8.getOutlineStroke();
        valueMarker1.setStroke(stroke36);
        valueMarker1.setAlpha((float) 1L);
        org.jfree.chart.text.TextAnchor textAnchor40 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(textAnchor40);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        java.awt.Font font12 = valueMarker7.getLabelFont();
        valueMarker1.setLabelFont(font12);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.addChangeListener(markerChangeListener14);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker1.addChangeListener(markerChangeListener16);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.lang.Object obj3 = valueMarker1.clone();
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        float float9 = valueMarker6.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker6.getLabelOffsetType();
        valueMarker6.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker22.notifyListeners(markerChangeEvent25);
        valueMarker22.setValue((double) 0.8f);
        boolean boolean29 = valueMarker20.equals((java.lang.Object) valueMarker22);
        java.awt.Stroke stroke30 = valueMarker22.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint18, stroke30);
        java.awt.Paint paint32 = valueMarker31.getOutlinePaint();
        valueMarker6.setOutlinePaint(paint32);
        java.awt.Stroke stroke34 = valueMarker6.getStroke();
        valueMarker1.setStroke(stroke34);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor36 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(rectangleAnchor36);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        float float12 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.addChangeListener(markerChangeListener13);
        java.lang.Object obj15 = valueMarker1.clone();
        java.awt.Stroke stroke16 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.removeChangeListener(markerChangeListener17);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker1.addChangeListener(markerChangeListener19);
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(textAnchor21);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.lang.String str6 = valueMarker2.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getPaint();
        valueMarker2.setLabelPaint(paint11);
        java.lang.String str13 = valueMarker2.getLabel();
        java.awt.Paint paint14 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker16.addChangeListener(markerChangeListener19);
        double double21 = valueMarker16.getValue();
        java.awt.Paint paint22 = valueMarker16.getOutlinePaint();
        java.awt.Paint paint23 = valueMarker16.getLabelPaint();
        valueMarker16.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        valueMarker16.notifyListeners(markerChangeEvent26);
        float float28 = valueMarker16.getAlpha();
        java.awt.Stroke stroke29 = valueMarker16.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker31.setLabel("");
        java.awt.Paint paint34 = valueMarker31.getPaint();
        java.lang.String str35 = valueMarker31.getLabel();
        double double36 = valueMarker31.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType37 = valueMarker31.getLabelOffsetType();
        java.awt.Paint paint38 = valueMarker31.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = valueMarker31.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType40 = valueMarker31.getLabelOffsetType();
        java.awt.Paint paint41 = valueMarker31.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker43.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener46 = null;
        valueMarker43.addChangeListener(markerChangeListener46);
        double double48 = valueMarker43.getValue();
        java.awt.Paint paint49 = valueMarker43.getLabelPaint();
        java.awt.Paint paint50 = valueMarker43.getOutlinePaint();
        java.awt.Stroke stroke51 = valueMarker43.getOutlineStroke();
        java.awt.Stroke stroke52 = valueMarker43.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker54 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1, paint14, stroke29, paint41, stroke52, (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.8f + "'", float28 == 0.8f);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(rectangleInsets39);
        org.junit.Assert.assertNotNull(lengthAdjustmentType40);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertNotNull(stroke52);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.lang.Object obj3 = valueMarker1.clone();
        valueMarker1.setValue((double) (short) 10);
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 100);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker9.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType10);
        java.awt.Font font12 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelFont(font12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(textAnchor6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        valueMarker1.setValue((double) (short) 1);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker6.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker9.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker9.getLabelOffsetType();
        valueMarker6.setLabelOffsetType(lengthAdjustmentType13);
        java.awt.Font font15 = valueMarker6.getLabelFont();
        valueMarker1.setLabelFont(font15);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.lang.String str17 = valueMarker13.getLabel();
        double double18 = valueMarker13.getValue();
        java.awt.Stroke stroke19 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint22 = valueMarker21.getLabelPaint();
        valueMarker13.setOutlinePaint(paint22);
        java.awt.Paint paint24 = valueMarker13.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker13.addChangeListener(markerChangeListener25);
        java.awt.Font font27 = valueMarker13.getLabelFont();
        valueMarker1.setLabelFont(font27);
        java.lang.Object obj29 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker31.setLabel("");
        java.awt.Paint paint34 = valueMarker31.getPaint();
        java.lang.Class<?> wildcardClass35 = valueMarker31.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray36 = valueMarker1.getListeners((java.lang.Class) wildcardClass35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        valueMarker1.setAlpha(0.0f);
        valueMarker1.setLabel("");
        java.awt.Paint paint15 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        valueMarker19.notifyListeners(markerChangeEvent22);
        valueMarker19.setValue((double) 0.8f);
        boolean boolean26 = valueMarker17.equals((java.lang.Object) valueMarker19);
        java.awt.Stroke stroke27 = valueMarker19.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor28 = valueMarker19.getLabelTextAnchor();
        java.awt.Paint paint29 = valueMarker19.getPaint();
        valueMarker1.setOutlinePaint(paint29);
        java.awt.Stroke stroke31 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(textAnchor28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.addChangeListener(markerChangeListener8);
        java.awt.Paint paint10 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        float float12 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.addChangeListener(markerChangeListener13);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        valueMarker19.notifyListeners(markerChangeEvent22);
        valueMarker19.setValue((double) 0.8f);
        boolean boolean26 = valueMarker17.equals((java.lang.Object) valueMarker19);
        java.awt.Stroke stroke27 = valueMarker19.getStroke();
        valueMarker1.setStroke(stroke27);
        java.awt.Stroke stroke29 = valueMarker1.getOutlineStroke();
        float float30 = valueMarker1.getAlpha();
        java.awt.Paint paint31 = valueMarker1.getLabelPaint();
        valueMarker1.setAlpha((float) 0L);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.8f + "'", float30 == 0.8f);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        java.awt.Stroke stroke11 = valueMarker3.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker3.getLabelTextAnchor();
        java.awt.Paint paint13 = valueMarker3.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker3.getLabelAnchor();
        java.awt.Paint paint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker3.setPaint(paint15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        java.lang.Object obj11 = valueMarker1.clone();
        java.lang.String str12 = valueMarker1.getLabel();
        double double13 = valueMarker1.getValue();
        java.awt.Paint paint14 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        float float5 = valueMarker1.getAlpha();
        java.awt.Font font6 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.removeChangeListener(markerChangeListener7);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Font font13 = valueMarker10.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker15.getLabelTextAnchor();
        valueMarker10.setLabelTextAnchor(textAnchor18);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker10.removeChangeListener(markerChangeListener20);
        org.jfree.chart.text.TextAnchor textAnchor22 = valueMarker10.getLabelTextAnchor();
        boolean boolean23 = valueMarker1.equals((java.lang.Object) valueMarker10);
        java.lang.String str24 = valueMarker10.getLabel();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker10.getLabelAnchor();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(textAnchor18);
        org.junit.Assert.assertNotNull(textAnchor22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(rectangleAnchor25);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Paint paint8 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        double double11 = valueMarker1.getValue();
        java.awt.Stroke stroke12 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getPaint();
        java.awt.Stroke stroke18 = valueMarker14.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        java.awt.Paint paint23 = valueMarker20.getOutlinePaint();
        valueMarker14.setLabelPaint(paint23);
        float float25 = valueMarker14.getAlpha();
        valueMarker14.setLabel("");
        valueMarker14.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor30 = valueMarker14.getLabelTextAnchor();
        java.awt.Paint paint31 = valueMarker14.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType32 = valueMarker14.getLabelOffsetType();
        double double33 = valueMarker14.getValue();
        org.jfree.chart.text.TextAnchor textAnchor34 = valueMarker14.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor34);
        java.awt.Paint paint36 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(lengthAdjustmentType32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor34);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Stroke stroke7 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.addChangeListener(markerChangeListener8);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker9.notifyListeners(markerChangeEvent12);
        valueMarker9.setValue((double) 0.8f);
        boolean boolean16 = valueMarker7.equals((java.lang.Object) valueMarker9);
        java.awt.Stroke stroke17 = valueMarker9.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint5, stroke17);
        valueMarker18.setValue((double) 100);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getPaint();
        java.awt.Stroke stroke10 = valueMarker6.getOutlineStroke();
        java.awt.Font font11 = valueMarker6.getLabelFont();
        valueMarker1.setLabelFont(font11);
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        valueMarker17.notifyListeners(markerChangeEvent20);
        valueMarker17.setValue((double) 0.8f);
        boolean boolean24 = valueMarker15.equals((java.lang.Object) valueMarker17);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker17.getLabelOffsetType();
        boolean boolean26 = valueMarker1.equals((java.lang.Object) lengthAdjustmentType25);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor27);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        float float10 = valueMarker1.getAlpha();
        java.awt.Stroke stroke11 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8f + "'", float10 == 0.8f);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint8 = valueMarker7.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker7.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor9);
        java.awt.Stroke stroke11 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.addChangeListener(markerChangeListener12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker1.getLabelOffset();
        java.lang.Object obj15 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        valueMarker1.setValue((double) 0.8f);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.lang.String str13 = valueMarker9.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker9.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker9.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        valueMarker19.notifyListeners(markerChangeEvent22);
        valueMarker19.setValue((double) 0.8f);
        boolean boolean26 = valueMarker17.equals((java.lang.Object) valueMarker19);
        java.awt.Stroke stroke27 = valueMarker19.getStroke();
        valueMarker9.setOutlineStroke(stroke27);
        valueMarker1.setOutlineStroke(stroke27);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = valueMarker1.getLabelOffset();
        java.awt.Stroke stroke31 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 1);
        valueMarker33.setValue((double) 'a');
        boolean boolean36 = valueMarker1.equals((java.lang.Object) valueMarker33);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener37 = null;
        valueMarker1.addChangeListener(markerChangeListener37);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        float float11 = valueMarker10.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker10.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        valueMarker10.notifyListeners(markerChangeEvent13);
        java.lang.Object obj15 = null;
        boolean boolean16 = valueMarker10.equals(obj15);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.lang.Object obj8 = valueMarker1.clone();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        java.lang.String str11 = valueMarker1.getLabel();
        valueMarker1.setValue((double) (byte) 10);
        java.awt.Paint paint14 = valueMarker1.getPaint();
        java.lang.String str15 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.addChangeListener(markerChangeListener10);
        valueMarker1.setValue((double) (-1L));
        valueMarker1.setValue((double) 10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        double double3 = valueMarker1.getValue();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Stroke stroke2 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker5.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker5.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker5.addChangeListener(markerChangeListener10);
        valueMarker5.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker5.getLabelTextAnchor();
        java.lang.String str15 = valueMarker5.getLabel();
        java.awt.Paint paint16 = valueMarker5.getOutlinePaint();
        java.awt.Paint paint17 = valueMarker5.getLabelPaint();
        valueMarker1.setPaint(paint17);
        java.lang.Class<?> wildcardClass19 = paint17.getClass();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        valueMarker1.setValue((double) 100.0f);
        java.awt.Paint paint9 = valueMarker1.getOutlinePaint();
        java.lang.Object obj10 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.removeChangeListener(markerChangeListener11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker12.addChangeListener(markerChangeListener15);
        double double17 = valueMarker12.getValue();
        java.awt.Paint paint18 = valueMarker12.getOutlinePaint();
        java.awt.Paint paint19 = valueMarker12.getLabelPaint();
        java.awt.Paint paint20 = valueMarker12.getPaint();
        valueMarker12.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        java.awt.Paint paint27 = valueMarker24.getPaint();
        java.awt.Stroke stroke28 = valueMarker24.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker30.setLabel("");
        java.awt.Paint paint33 = valueMarker30.getOutlinePaint();
        valueMarker24.setLabelPaint(paint33);
        float float35 = valueMarker24.getAlpha();
        valueMarker24.setLabel("");
        valueMarker24.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor40 = valueMarker24.getLabelTextAnchor();
        java.awt.Paint paint41 = valueMarker24.getOutlinePaint();
        valueMarker12.setLabelPaint(paint41);
        java.lang.String str43 = valueMarker12.getLabel();
        java.awt.Stroke stroke44 = valueMarker12.getStroke();
        valueMarker1.setStroke(stroke44);
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.8f + "'", float35 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor40);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(rectangleInsets46);
        org.junit.Assert.assertNotNull(rectangleInsets47);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        double double9 = valueMarker1.getValue();
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        valueMarker8.notifyListeners(markerChangeEvent11);
        valueMarker8.setValue((double) 0.8f);
        boolean boolean15 = valueMarker6.equals((java.lang.Object) valueMarker8);
        valueMarker8.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker8.removeChangeListener(markerChangeListener18);
        boolean boolean20 = valueMarker1.equals((java.lang.Object) valueMarker8);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker1.getLabelAnchor();
        java.awt.Font font22 = valueMarker1.getLabelFont();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType23 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker1.addChangeListener(markerChangeListener24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(lengthAdjustmentType23);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.addChangeListener(markerChangeListener12);
        valueMarker1.setValue((double) (short) 10);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        java.awt.Paint paint20 = valueMarker17.getPaint();
        java.awt.Paint paint21 = valueMarker17.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str24 = valueMarker23.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker23.addChangeListener(markerChangeListener25);
        java.awt.Font font27 = valueMarker23.getLabelFont();
        valueMarker17.setLabelFont(font27);
        java.awt.Stroke stroke29 = valueMarker17.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker31.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker31.addChangeListener(markerChangeListener34);
        double double36 = valueMarker31.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor37 = valueMarker31.getLabelAnchor();
        valueMarker31.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = valueMarker31.getLabelOffset();
        valueMarker17.setLabelOffset(rectangleInsets40);
        valueMarker1.setLabelOffset(rectangleInsets40);
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor45 = valueMarker44.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor45);
        java.awt.Font font47 = valueMarker1.getLabelFont();
        java.awt.Font font48 = valueMarker1.getLabelFont();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor37);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertNotNull(rectangleAnchor45);
        org.junit.Assert.assertNotNull(font47);
        org.junit.Assert.assertNotNull(font48);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getPaint();
        java.lang.String str10 = valueMarker6.getLabel();
        double double11 = valueMarker6.getValue();
        java.awt.Stroke stroke12 = valueMarker6.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        valueMarker16.notifyListeners(markerChangeEvent19);
        valueMarker16.setValue((double) 0.8f);
        boolean boolean23 = valueMarker14.equals((java.lang.Object) valueMarker16);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker16.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker16.addChangeListener(markerChangeListener25);
        java.awt.Paint paint27 = valueMarker16.getOutlinePaint();
        valueMarker6.setLabelPaint(paint27);
        valueMarker1.setLabelPaint(paint27);
        float float30 = valueMarker1.getAlpha();
        java.awt.Font font31 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.8f + "'", float30 == 0.8f);
        org.junit.Assert.assertNotNull(font31);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke6 = valueMarker5.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        java.awt.Paint paint14 = valueMarker11.getPaint();
        java.lang.String str15 = valueMarker11.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker11.getLabelOffsetType();
        valueMarker8.setLabelOffsetType(lengthAdjustmentType16);
        valueMarker5.setLabelOffsetType(lengthAdjustmentType16);
        valueMarker1.setLabelOffsetType(lengthAdjustmentType16);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker1.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke22 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(stroke22);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.addChangeListener(markerChangeListener10);
        valueMarker1.setValue((double) (-1L));
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        float float15 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker17.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType18);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = valueMarker1.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelTextAnchor(textAnchor21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8f + "'", float15 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        java.awt.Stroke stroke7 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint10 = valueMarker9.getLabelPaint();
        valueMarker1.setOutlinePaint(paint10);
        java.awt.Paint paint12 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.addChangeListener(markerChangeListener13);
        java.lang.Object obj15 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getLabelPaint();
        java.lang.String str10 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint13 = valueMarker12.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getPaint();
        java.lang.String str19 = valueMarker15.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker15.getLabelOffsetType();
        valueMarker12.setLabelOffsetType(lengthAdjustmentType20);
        valueMarker1.setLabelOffsetType(lengthAdjustmentType20);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.awt.Stroke stroke13 = valueMarker9.getOutlineStroke();
        java.awt.Stroke stroke14 = valueMarker9.getStroke();
        valueMarker1.setStroke(stroke14);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker1.notifyListeners(markerChangeEvent16);
        valueMarker1.setValue((double) 0);
        java.awt.Font font20 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke21 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker1.addChangeListener(markerChangeListener22);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker9.addChangeListener(markerChangeListener12);
        double double14 = valueMarker9.getValue();
        java.awt.Paint paint15 = valueMarker9.getOutlinePaint();
        java.awt.Paint paint16 = valueMarker9.getLabelPaint();
        valueMarker9.setLabel("");
        java.awt.Paint paint19 = valueMarker9.getOutlinePaint();
        valueMarker9.setAlpha(0.0f);
        java.awt.Font font22 = valueMarker9.getLabelFont();
        valueMarker1.setLabelFont(font22);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        java.awt.Paint paint7 = valueMarker4.getPaint();
        java.awt.Stroke stroke8 = valueMarker4.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Paint paint13 = valueMarker10.getOutlinePaint();
        valueMarker4.setLabelPaint(paint13);
        float float15 = valueMarker4.getAlpha();
        valueMarker4.setLabel("");
        valueMarker4.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker4.getLabelTextAnchor();
        java.awt.Paint paint21 = valueMarker4.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker4.getLabelOffsetType();
        java.awt.Paint paint23 = valueMarker4.getOutlinePaint();
        valueMarker2.setPaint(paint23);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        valueMarker28.notifyListeners(markerChangeEvent31);
        valueMarker28.setValue((double) 0.8f);
        boolean boolean35 = valueMarker26.equals((java.lang.Object) valueMarker28);
        java.awt.Stroke stroke36 = valueMarker28.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) '#', paint23, stroke36);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8f + "'", float15 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(stroke36);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker7.notifyListeners(markerChangeEvent10);
        valueMarker7.setValue((double) 0.8f);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getPaint();
        java.awt.Stroke stroke19 = valueMarker15.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        java.awt.Paint paint24 = valueMarker21.getOutlinePaint();
        valueMarker15.setLabelPaint(paint24);
        float float26 = valueMarker15.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker15.addChangeListener(markerChangeListener27);
        java.awt.Stroke stroke29 = valueMarker15.getOutlineStroke();
        valueMarker7.setStroke(stroke29);
        valueMarker1.setStroke(stroke29);
        java.lang.String str32 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent33 = null;
        valueMarker1.notifyListeners(markerChangeEvent33);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(rectangleAnchor35);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        float float9 = valueMarker1.getAlpha();
        java.awt.Stroke stroke10 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getOutlinePaint();
        valueMarker1.setLabelPaint(paint8);
        java.awt.Paint paint10 = valueMarker1.getPaint();
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint12 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint13 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        java.lang.Object obj6 = valueMarker1.clone();
        java.awt.Paint paint7 = valueMarker1.getPaint();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        java.lang.String str11 = valueMarker1.getLabel();
        java.lang.Class<?> wildcardClass12 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        java.awt.Font font3 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker5.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker5.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker5.addChangeListener(markerChangeListener10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker5.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor12);
        java.awt.Paint paint14 = valueMarker1.getLabelPaint();
        java.lang.String str15 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        java.awt.Paint paint7 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        java.awt.Paint paint14 = valueMarker11.getPaint();
        java.awt.Stroke stroke15 = valueMarker11.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        java.awt.Paint paint20 = valueMarker17.getOutlinePaint();
        valueMarker11.setLabelPaint(paint20);
        float float22 = valueMarker11.getAlpha();
        valueMarker11.setLabel("");
        java.awt.Paint paint25 = valueMarker11.getOutlinePaint();
        java.awt.Paint paint26 = valueMarker11.getOutlinePaint();
        java.awt.Paint paint27 = valueMarker11.getPaint();
        java.awt.Paint paint28 = valueMarker11.getLabelPaint();
        valueMarker1.setOutlinePaint(paint28);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.8f + "'", float22 == 0.8f);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        float float12 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.addChangeListener(markerChangeListener13);
        java.awt.Stroke stroke15 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker1.getLabelTextAnchor();
        java.lang.String str17 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        valueMarker19.notifyListeners(markerChangeEvent22);
        valueMarker19.setValue((double) 0.8f);
        java.lang.Class<?> wildcardClass26 = valueMarker19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray27 = valueMarker1.getListeners((java.lang.Class) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        valueMarker1.setAlpha((float) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker1.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.addChangeListener(markerChangeListener13);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getPaint();
        java.lang.String str12 = valueMarker8.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint15 = valueMarker14.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker14.getLabelAnchor();
        valueMarker8.setLabelAnchor(rectangleAnchor16);
        valueMarker1.setLabelAnchor(rectangleAnchor16);
        java.awt.Font font19 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
        org.junit.Assert.assertNotNull(font19);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font2 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke3 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke4 = valueMarker1.getOutlineStroke();
        valueMarker1.setLabel("");
        java.awt.Paint paint7 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker9.addChangeListener(markerChangeListener12);
        double double14 = valueMarker9.getValue();
        java.awt.Paint paint15 = valueMarker9.getLabelPaint();
        java.awt.Paint paint16 = valueMarker9.getOutlinePaint();
        java.lang.String str17 = valueMarker9.getLabel();
        java.awt.Paint paint18 = valueMarker9.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker9.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor19);
        valueMarker1.setLabel("hi!");
        float float23 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        java.awt.Stroke stroke7 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint10 = valueMarker9.getLabelPaint();
        valueMarker1.setOutlinePaint(paint10);
        java.awt.Paint paint12 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.addChangeListener(markerChangeListener13);
        valueMarker1.setValue(52.0d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke6 = valueMarker5.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        java.awt.Paint paint14 = valueMarker11.getPaint();
        java.lang.String str15 = valueMarker11.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker11.getLabelOffsetType();
        valueMarker8.setLabelOffsetType(lengthAdjustmentType16);
        valueMarker5.setLabelOffsetType(lengthAdjustmentType16);
        valueMarker1.setLabelOffsetType(lengthAdjustmentType16);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker1.addChangeListener(markerChangeListener20);
        java.awt.Paint paint22 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker24.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker24.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker24.getLabelAnchor();
        java.lang.Class<?> wildcardClass30 = rectangleAnchor29.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray31 = valueMarker1.getListeners((java.lang.Class) wildcardClass30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.util.RectangleAnchor; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertNotNull(rectangleAnchor29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.lang.Object obj2 = valueMarker1.clone();
        valueMarker1.setLabel("");
        java.awt.Font font5 = valueMarker1.getLabelFont();
        java.lang.String str6 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }
}

