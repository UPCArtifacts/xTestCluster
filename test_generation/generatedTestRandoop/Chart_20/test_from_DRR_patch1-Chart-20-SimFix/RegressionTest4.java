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
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        float float11 = valueMarker10.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker10.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker10.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker10.notifyListeners(markerChangeEvent14);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker10.removeChangeListener(markerChangeListener16);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint20 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(textAnchor18);
        org.junit.Assert.assertNotNull(textAnchor19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setAlpha((float) (byte) 1);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker4.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker4.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType8);
        double double10 = valueMarker1.getValue();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(textAnchor11);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        java.awt.Paint paint7 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        java.lang.Object obj10 = valueMarker1.clone();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.removeChangeListener(markerChangeListener12);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.awt.Stroke stroke6 = valueMarker2.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker2.getLabelOffset();
        java.awt.Paint paint8 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Paint paint13 = valueMarker10.getPaint();
        java.awt.Stroke stroke14 = valueMarker10.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        java.awt.Paint paint19 = valueMarker16.getOutlinePaint();
        valueMarker10.setLabelPaint(paint19);
        float float21 = valueMarker10.getAlpha();
        valueMarker10.setLabel("");
        valueMarker10.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 100);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker27.getLabelOffsetType();
        valueMarker27.setValue(10.0d);
        java.awt.Stroke stroke31 = valueMarker27.getOutlineStroke();
        valueMarker10.setStroke(stroke31);
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent37 = null;
        valueMarker34.notifyListeners(markerChangeEvent37);
        java.awt.Stroke stroke39 = valueMarker34.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType40 = valueMarker34.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker42.setLabel("");
        java.awt.Paint paint45 = valueMarker42.getPaint();
        java.awt.Stroke stroke46 = valueMarker42.getOutlineStroke();
        java.awt.Stroke stroke47 = valueMarker42.getStroke();
        valueMarker34.setStroke(stroke47);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent49 = null;
        valueMarker34.notifyListeners(markerChangeEvent49);
        valueMarker34.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener53 = null;
        valueMarker34.removeChangeListener(markerChangeListener53);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener55 = null;
        valueMarker34.removeChangeListener(markerChangeListener55);
        java.awt.Paint paint57 = valueMarker34.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker59 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker59.setLabel("");
        float float62 = valueMarker59.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker64 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker64.setLabel("");
        java.awt.Paint paint67 = valueMarker64.getPaint();
        java.awt.Stroke stroke68 = valueMarker64.getOutlineStroke();
        java.awt.Font font69 = valueMarker64.getLabelFont();
        valueMarker59.setLabelFont(font69);
        java.awt.Stroke stroke71 = valueMarker59.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker73 = new org.jfree.chart.plot.ValueMarker((-1.0d), paint8, stroke31, paint57, stroke71, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.8f + "'", float21 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(lengthAdjustmentType40);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 0.8f + "'", float62 == 0.8f);
        org.junit.Assert.assertNotNull(paint67);
        org.junit.Assert.assertNotNull(stroke68);
        org.junit.Assert.assertNotNull(font69);
        org.junit.Assert.assertNotNull(stroke71);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        valueMarker1.setValue((double) (short) 100);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getPaint();
        java.lang.String str16 = valueMarker12.getLabel();
        double double17 = valueMarker12.getValue();
        java.awt.Stroke stroke18 = valueMarker12.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint21 = valueMarker20.getLabelPaint();
        valueMarker12.setOutlinePaint(paint21);
        valueMarker1.setOutlinePaint(paint21);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker1.addChangeListener(markerChangeListener24);
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker27.addChangeListener(markerChangeListener30);
        double double32 = valueMarker27.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker27.getLabelAnchor();
        valueMarker27.setLabel("hi!");
        java.awt.Stroke stroke36 = valueMarker27.getStroke();
        valueMarker1.setOutlineStroke(stroke36);
        java.awt.Stroke stroke38 = null;
        valueMarker1.setOutlineStroke(stroke38);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor33);
        org.junit.Assert.assertNotNull(stroke36);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.awt.Paint paint1 = null;
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker3.addChangeListener(markerChangeListener6);
        double double8 = valueMarker3.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker3.getLabelAnchor();
        valueMarker3.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker3.getLabelOffset();
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
        java.awt.Paint paint28 = valueMarker14.getOutlinePaint();
        java.awt.Stroke stroke29 = valueMarker14.getOutlineStroke();
        valueMarker3.setOutlineStroke(stroke29);
        java.awt.Stroke stroke31 = valueMarker3.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker33.setLabel("");
        java.awt.Paint paint36 = valueMarker33.getPaint();
        java.awt.Stroke stroke37 = valueMarker33.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker39.setLabel("");
        java.awt.Paint paint42 = valueMarker39.getOutlinePaint();
        valueMarker33.setLabelPaint(paint42);
        float float44 = valueMarker33.getAlpha();
        valueMarker33.setLabel("");
        java.awt.Paint paint47 = valueMarker33.getOutlinePaint();
        java.awt.Paint paint48 = valueMarker33.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker50 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker50.setLabel("");
        float float53 = valueMarker50.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType54 = valueMarker50.getLabelOffsetType();
        valueMarker50.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker59 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker59.setLabel("");
        java.awt.Paint paint62 = valueMarker59.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker64 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker66 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker66.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent69 = null;
        valueMarker66.notifyListeners(markerChangeEvent69);
        valueMarker66.setValue((double) 0.8f);
        boolean boolean73 = valueMarker64.equals((java.lang.Object) valueMarker66);
        java.awt.Stroke stroke74 = valueMarker66.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker75 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint62, stroke74);
        java.awt.Paint paint76 = valueMarker75.getOutlinePaint();
        valueMarker50.setOutlinePaint(paint76);
        java.awt.Stroke stroke78 = valueMarker50.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker80 = new org.jfree.chart.plot.ValueMarker(0.0d, paint1, stroke31, paint48, stroke78, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.8f + "'", float44 == 0.8f);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.8f + "'", float53 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType54);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(stroke74);
        org.junit.Assert.assertNotNull(paint76);
        org.junit.Assert.assertNotNull(stroke78);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(textAnchor18);
        org.junit.Assert.assertNotNull(textAnchor22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100.0f);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        double double3 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        valueMarker1.setStroke(stroke11);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.removeChangeListener(markerChangeListener13);
        java.lang.String str15 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker1.notifyListeners(markerChangeEvent16);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.awt.Stroke stroke8 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str11 = valueMarker10.getLabel();
        java.awt.Paint paint12 = valueMarker10.getLabelPaint();
        valueMarker1.setLabelPaint(paint12);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker15.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor18);
        java.awt.Paint paint20 = valueMarker1.getOutlinePaint();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(textAnchor21);
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.addChangeListener(markerChangeListener10);
        valueMarker1.setValue((double) (-1L));
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        java.awt.Font font15 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        java.awt.Paint paint21 = valueMarker18.getPaint();
        java.lang.String str22 = valueMarker18.getLabel();
        java.awt.Paint paint23 = valueMarker18.getLabelPaint();
        java.awt.Paint paint24 = valueMarker18.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker26.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker26.addChangeListener(markerChangeListener29);
        double double31 = valueMarker26.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker26.getLabelAnchor();
        valueMarker26.setLabel("hi!");
        java.awt.Stroke stroke35 = valueMarker26.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) (short) 0, paint24, stroke35);
        valueMarker1.setPaint(paint24);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener38 = null;
        valueMarker1.addChangeListener(markerChangeListener38);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor32);
        org.junit.Assert.assertNotNull(stroke35);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue(0.0d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(textAnchor8);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        valueMarker1.notifyListeners(markerChangeEvent11);
        java.awt.Stroke stroke13 = valueMarker1.getOutlineStroke();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(textAnchor16);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        valueMarker1.setLabel("");
        double double12 = valueMarker1.getValue();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        float float6 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker8.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker8.notifyListeners(markerChangeEvent10);
        float float12 = valueMarker8.getAlpha();
        java.awt.Font font13 = valueMarker8.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker8.removeChangeListener(markerChangeListener14);
        java.lang.String str16 = valueMarker8.getLabel();
        java.awt.Font font17 = valueMarker8.getLabelFont();
        valueMarker1.setLabelFont(font17);
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(textAnchor19);
        org.junit.Assert.assertNotNull(textAnchor20);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        float float8 = valueMarker1.getAlpha();
        java.awt.Stroke stroke9 = valueMarker1.getStroke();
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        boolean boolean10 = valueMarker1.equals((java.lang.Object) (short) -1);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getPaint();
        java.lang.String str16 = valueMarker12.getLabel();
        java.awt.Paint paint17 = valueMarker12.getLabelPaint();
        valueMarker1.setLabelPaint(paint17);
        valueMarker1.setValue((double) 10.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        java.awt.Stroke stroke15 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = valueMarker1.getLabelOffset();
        java.awt.Paint paint17 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getPaint();
        java.awt.Stroke stroke23 = valueMarker19.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        java.awt.Paint paint28 = valueMarker25.getOutlinePaint();
        valueMarker19.setLabelPaint(paint28);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker19.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker19.addChangeListener(markerChangeListener31);
        java.awt.Font font33 = valueMarker19.getLabelFont();
        java.lang.Class<?> wildcardClass34 = valueMarker19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray35 = valueMarker1.getListeners((java.lang.Class) wildcardClass34);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(rectangleAnchor30);
        org.junit.Assert.assertNotNull(font33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        java.lang.String str11 = valueMarker1.getLabel();
        float float12 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor13);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        boolean boolean14 = valueMarker1.equals((java.lang.Object) "");
        java.awt.Paint paint15 = valueMarker1.getPaint();
        java.awt.Font font16 = valueMarker1.getLabelFont();
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(textAnchor17);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        valueMarker1.setValue((double) (short) 1);
        org.junit.Assert.assertNotNull(paint2);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.awt.Font font3 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(font3);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType2 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.removeChangeListener(markerChangeListener3);
        org.junit.Assert.assertNotNull(lengthAdjustmentType2);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1.0f);
        valueMarker1.setLabel("hi!");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(font4);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
}

