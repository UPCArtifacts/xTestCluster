import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        java.awt.Paint paint12 = valueMarker1.getPaint();
        valueMarker1.setValue(10.0d);
        double double15 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint10 = valueMarker9.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getPaint();
        java.lang.String str16 = valueMarker12.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker12.getLabelOffsetType();
        valueMarker9.setLabelOffsetType(lengthAdjustmentType17);
        valueMarker1.setLabelOffsetType(lengthAdjustmentType17);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker1.addChangeListener(markerChangeListener20);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker1.addChangeListener(markerChangeListener22);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        java.awt.Font font9 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker11.notifyListeners(markerChangeEvent14);
        valueMarker11.setValue((double) 0.8f);
        boolean boolean18 = valueMarker9.equals((java.lang.Object) valueMarker11);
        java.awt.Stroke stroke19 = valueMarker11.getStroke();
        valueMarker1.setOutlineStroke(stroke19);
        java.awt.Paint paint21 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.removeChangeListener(markerChangeListener3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker1.getLabelOffset();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.lang.Object obj3 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str6 = valueMarker5.getLabel();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        valueMarker1.setLabelPaint(paint7);
        java.awt.Paint paint9 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker10.addChangeListener(markerChangeListener13);
        double double15 = valueMarker10.getValue();
        java.awt.Paint paint16 = valueMarker10.getOutlinePaint();
        java.awt.Paint paint17 = valueMarker10.getLabelPaint();
        valueMarker10.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        valueMarker10.notifyListeners(markerChangeEvent20);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        valueMarker10.notifyListeners(markerChangeEvent22);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker10.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor24);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(stroke2);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.awt.Stroke stroke7 = valueMarker3.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getOutlinePaint();
        valueMarker3.setLabelPaint(paint12);
        float float14 = valueMarker3.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker3.addChangeListener(markerChangeListener15);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker3.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker3.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor18);
        java.awt.Paint paint20 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getOutlinePaint();
        valueMarker7.setLabelPaint(paint16);
        float float18 = valueMarker7.getAlpha();
        valueMarker7.setLabel("");
        valueMarker7.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker7.getLabelTextAnchor();
        java.awt.Paint paint24 = valueMarker7.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker7.getLabelOffsetType();
        java.awt.Paint paint26 = valueMarker7.getOutlinePaint();
        valueMarker1.setPaint(paint26);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(rectangleInsets28);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        java.awt.Paint paint14 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.removeChangeListener(markerChangeListener11);
        java.awt.Paint paint13 = valueMarker1.getOutlinePaint();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint23 = valueMarker22.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker22.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor24);
        java.awt.Paint paint26 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint27 = valueMarker1.getLabelPaint();
        double double28 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        valueMarker1.notifyListeners(markerChangeEvent29);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType31 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType31);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker6.addChangeListener(markerChangeListener9);
        double double11 = valueMarker6.getValue();
        java.awt.Paint paint12 = valueMarker6.getOutlinePaint();
        java.awt.Paint paint13 = valueMarker6.getLabelPaint();
        java.awt.Paint paint14 = valueMarker6.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker16.addChangeListener(markerChangeListener19);
        double double21 = valueMarker16.getValue();
        java.awt.Paint paint22 = valueMarker16.getOutlinePaint();
        java.awt.Paint paint23 = valueMarker16.getLabelPaint();
        java.awt.Paint paint24 = valueMarker16.getPaint();
        valueMarker6.setLabelPaint(paint24);
        java.awt.Paint paint26 = valueMarker6.getOutlinePaint();
        boolean boolean27 = valueMarker1.equals((java.lang.Object) valueMarker6);
        java.awt.Paint paint28 = valueMarker1.getOutlinePaint();
        java.lang.String str29 = valueMarker1.getLabel();
        java.lang.String str30 = valueMarker1.getLabel();
        java.awt.Paint paint31 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.addChangeListener(markerChangeListener11);
        java.lang.Object obj13 = valueMarker1.clone();
        java.awt.Paint paint14 = valueMarker1.getOutlinePaint();
        double double15 = valueMarker1.getValue();
        java.awt.Stroke stroke16 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint17 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        valueMarker1.setValue((-1.0d));
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
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.awt.Stroke stroke7 = valueMarker3.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getOutlinePaint();
        valueMarker3.setLabelPaint(paint12);
        float float14 = valueMarker3.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker3.addChangeListener(markerChangeListener15);
        java.awt.Stroke stroke17 = valueMarker3.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke17);
        java.awt.Stroke stroke19 = valueMarker1.getStroke();
        float float20 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) ' ');
        java.awt.Paint paint23 = valueMarker22.getPaint();
        valueMarker1.setOutlinePaint(paint23);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke18 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint19 = valueMarker1.getLabelPaint();
        java.lang.Class<?> wildcardClass20 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.addChangeListener(markerChangeListener8);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.lang.String str17 = valueMarker13.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker13.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker13.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        valueMarker23.notifyListeners(markerChangeEvent26);
        valueMarker23.setValue((double) 0.8f);
        boolean boolean30 = valueMarker21.equals((java.lang.Object) valueMarker23);
        java.awt.Stroke stroke31 = valueMarker23.getStroke();
        valueMarker13.setOutlineStroke(stroke31);
        valueMarker11.setOutlineStroke(stroke31);
        valueMarker1.setStroke(stroke31);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getPaint();
        java.awt.Stroke stroke10 = valueMarker6.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getOutlinePaint();
        valueMarker6.setLabelPaint(paint15);
        float float17 = valueMarker6.getAlpha();
        valueMarker6.setLabel("");
        java.awt.Paint paint20 = valueMarker6.getOutlinePaint();
        java.awt.Stroke stroke21 = valueMarker6.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke21);
        java.awt.Stroke stroke23 = valueMarker1.getOutlineStroke();
        float float24 = valueMarker1.getAlpha();
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.lang.String str13 = valueMarker9.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getPaint();
        valueMarker9.setLabelPaint(paint18);
        valueMarker1.setOutlinePaint(paint18);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker1.getLabelOffset();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        valueMarker1.notifyListeners(markerChangeEvent24);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker1.addChangeListener(markerChangeListener26);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setAlpha((float) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker10.addChangeListener(markerChangeListener13);
        double double15 = valueMarker10.getValue();
        java.awt.Paint paint16 = valueMarker10.getLabelPaint();
        valueMarker1.setPaint(paint16);
        java.awt.Stroke stroke18 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker1.notifyListeners(markerChangeEvent14);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker1.notifyListeners(markerChangeEvent16);
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint20 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(textAnchor18);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.addChangeListener(markerChangeListener5);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker1.getLabelAnchor();
        valueMarker1.setValue((double) 'a');
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker12.getLabelTextAnchor();
        float float16 = valueMarker12.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker12.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker12.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor18);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(textAnchor18);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setAlpha((float) (short) 0);
        java.lang.Object obj9 = valueMarker1.clone();
        java.awt.Font font10 = valueMarker1.getLabelFont();
        double double11 = valueMarker1.getValue();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor12);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setAlpha((float) (short) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        float float8 = valueMarker1.getAlpha();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        java.awt.Paint paint10 = valueMarker1.getOutlinePaint();
        java.lang.String str11 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        java.awt.Stroke stroke7 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint10 = valueMarker9.getLabelPaint();
        valueMarker1.setOutlinePaint(paint10);
        java.lang.String str12 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(textAnchor14);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setAlpha((float) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Paint paint13 = valueMarker10.getPaint();
        java.lang.String str14 = valueMarker10.getLabel();
        boolean boolean15 = valueMarker1.equals((java.lang.Object) valueMarker10);
        double double16 = valueMarker10.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker10.getLabelAnchor();
        java.lang.Object obj18 = valueMarker10.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Paint paint8 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 1.0f);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getPaint();
        java.awt.Stroke stroke18 = valueMarker14.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        java.awt.Paint paint23 = valueMarker20.getOutlinePaint();
        valueMarker14.setLabelPaint(paint23);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker14.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker14.addChangeListener(markerChangeListener26);
        java.awt.Font font28 = valueMarker14.getLabelFont();
        boolean boolean29 = valueMarker12.equals((java.lang.Object) font28);
        valueMarker1.setLabelFont(font28);
        java.awt.Font font31 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        valueMarker1.notifyListeners(markerChangeEvent32);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleAnchor25);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(font31);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint5 = valueMarker4.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.lang.String str11 = valueMarker7.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker7.getLabelOffsetType();
        valueMarker4.setLabelOffsetType(lengthAdjustmentType12);
        valueMarker1.setLabelOffsetType(lengthAdjustmentType12);
        java.awt.Paint paint15 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        java.lang.Class<?> wildcardClass12 = rectangleAnchor11.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8f + "'", float10 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("hi!");
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        float float11 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        valueMarker8.setLabel("hi!");
        java.awt.Paint paint23 = valueMarker8.getLabelPaint();
        java.awt.Font font24 = valueMarker8.getLabelFont();
        double double25 = valueMarker8.getValue();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.800000011920929d + "'", double25 == 0.800000011920929d);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.lang.String str13 = valueMarker9.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getPaint();
        valueMarker9.setLabelPaint(paint18);
        valueMarker1.setOutlinePaint(paint18);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker1.getLabelOffset();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        valueMarker1.notifyListeners(markerChangeEvent24);
        float float26 = valueMarker1.getAlpha();
        float float27 = valueMarker1.getAlpha();
        java.lang.Object obj28 = null;
        boolean boolean29 = valueMarker1.equals(obj28);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.8f + "'", float27 == 0.8f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Paint paint8 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getPaint();
        java.lang.Object obj16 = valueMarker12.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker12.getLabelOffsetType();
        valueMarker12.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker12.addChangeListener(markerChangeListener20);
        java.lang.String str22 = valueMarker12.getLabel();
        java.awt.Font font23 = valueMarker12.getLabelFont();
        double double24 = valueMarker12.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 1);
        java.awt.Stroke stroke27 = valueMarker26.getOutlineStroke();
        valueMarker12.setStroke(stroke27);
        java.lang.Object obj29 = valueMarker12.clone();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker12.removeChangeListener(markerChangeListener30);
        boolean boolean32 = valueMarker1.equals((java.lang.Object) valueMarker12);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.lang.Object obj2 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker4.addChangeListener(markerChangeListener7);
        double double9 = valueMarker4.getValue();
        java.awt.Paint paint10 = valueMarker4.getOutlinePaint();
        java.awt.Paint paint11 = valueMarker4.getLabelPaint();
        java.awt.Paint paint12 = valueMarker4.getLabelPaint();
        valueMarker1.setLabelPaint(paint12);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Stroke stroke10 = valueMarker7.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke10);
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        java.awt.Paint paint7 = valueMarker4.getPaint();
        java.lang.String str8 = valueMarker4.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker4.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker4.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker4.getLabelTextAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker4.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets12);
        java.awt.Paint paint14 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleAnchor15);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        float float20 = valueMarker1.getAlpha();
        java.awt.Stroke stroke21 = valueMarker1.getOutlineStroke();
        valueMarker1.setValue((-1.0d));
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        java.awt.Font font14 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(rectangleAnchor15);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.addChangeListener(markerChangeListener15);
        valueMarker1.setValue((double) '#');
        boolean boolean20 = valueMarker1.equals((java.lang.Object) ' ');
        float float21 = valueMarker1.getAlpha();
        valueMarker1.setAlpha(0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.8f + "'", float21 == 0.8f);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.awt.Stroke stroke7 = valueMarker3.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getOutlinePaint();
        valueMarker3.setLabelPaint(paint12);
        float float14 = valueMarker3.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker3.addChangeListener(markerChangeListener15);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker3.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker3.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor18);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker22.getLabelTextAnchor();
        java.lang.Class<?> wildcardClass26 = valueMarker22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray27 = valueMarker1.getListeners((java.lang.Class) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(textAnchor25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        java.lang.String str21 = valueMarker8.getLabel();
        valueMarker8.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker8.removeChangeListener(markerChangeListener24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker15.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Font font22 = valueMarker19.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker19.addChangeListener(markerChangeListener23);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker19.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker19.getLabelAnchor();
        valueMarker19.setValue((double) 'a');
        java.lang.Class<?> wildcardClass29 = valueMarker19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray30 = valueMarker1.getListeners((java.lang.Class) wildcardClass29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(rectangleAnchor25);
        org.junit.Assert.assertNotNull(rectangleAnchor26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker1.notifyListeners(markerChangeEvent16);
        float float18 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker1.removeChangeListener(markerChangeListener19);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        java.awt.Paint paint19 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker1.getLabelAnchor();
        java.awt.Font font21 = valueMarker1.getLabelFont();
        valueMarker1.setValue(10.0d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker1.getPaint();
        java.awt.Stroke stroke12 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font2 = valueMarker1.getLabelFont();
        double double3 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font6 = valueMarker5.getLabelFont();
        java.awt.Stroke stroke7 = valueMarker5.getOutlineStroke();
        java.awt.Stroke stroke8 = valueMarker5.getOutlineStroke();
        valueMarker5.setLabel("");
        java.awt.Paint paint11 = valueMarker5.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker13.addChangeListener(markerChangeListener16);
        double double18 = valueMarker13.getValue();
        java.awt.Paint paint19 = valueMarker13.getLabelPaint();
        java.awt.Paint paint20 = valueMarker13.getOutlinePaint();
        java.lang.String str21 = valueMarker13.getLabel();
        java.awt.Paint paint22 = valueMarker13.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker13.getLabelAnchor();
        valueMarker5.setLabelAnchor(rectangleAnchor23);
        valueMarker1.setLabelAnchor(rectangleAnchor23);
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Stroke stroke8 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker10.addChangeListener(markerChangeListener13);
        double double15 = valueMarker10.getValue();
        java.awt.Paint paint16 = valueMarker10.getOutlinePaint();
        java.awt.Paint paint17 = valueMarker10.getLabelPaint();
        java.awt.Paint paint18 = valueMarker10.getLabelPaint();
        valueMarker1.setPaint(paint18);
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 100);
        java.lang.Class<?> wildcardClass22 = valueMarker21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray23 = valueMarker1.getListeners((java.lang.Class) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        java.awt.Stroke stroke32 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener33 = null;
        valueMarker1.addChangeListener(markerChangeListener33);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke32);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj7 = valueMarker1.clone();
        java.lang.Object obj8 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        java.lang.Object obj6 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint10 = valueMarker9.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getPaint();
        java.awt.Stroke stroke16 = valueMarker12.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint10, stroke16);
        valueMarker1.setOutlineStroke(stroke16);
        valueMarker1.setAlpha((float) 0);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker22.notifyListeners(markerChangeEvent25);
        java.awt.Stroke stroke27 = valueMarker22.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker22.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint31 = valueMarker30.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker30.getLabelAnchor();
        valueMarker22.setLabelAnchor(rectangleAnchor32);
        java.lang.Class<?> wildcardClass34 = rectangleAnchor32.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray35 = valueMarker1.getListeners((java.lang.Class) wildcardClass34);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.util.RectangleAnchor; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(rectangleAnchor32);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        float float9 = valueMarker6.getAlpha();
        java.lang.String str10 = valueMarker6.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getPaint();
        java.awt.Stroke stroke16 = valueMarker12.getOutlineStroke();
        valueMarker6.setStroke(stroke16);
        java.awt.Stroke stroke18 = valueMarker6.getStroke();
        valueMarker6.setValue((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker22.getLabelAnchor();
        valueMarker6.setLabelAnchor(rectangleAnchor23);
        valueMarker1.setLabelAnchor(rectangleAnchor23);
        org.jfree.chart.text.TextAnchor textAnchor26 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font27 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
        org.junit.Assert.assertNotNull(textAnchor26);
        org.junit.Assert.assertNotNull(font27);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        valueMarker1.setValue((double) (short) 10);
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        java.awt.Paint paint14 = valueMarker11.getOutlinePaint();
        valueMarker7.setLabelPaint(paint14);
        java.awt.Font font16 = valueMarker7.getLabelFont();
        java.lang.Class<?> wildcardClass17 = font16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray18 = valueMarker1.getListeners((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Font; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        valueMarker4.notifyListeners(markerChangeEvent7);
        java.awt.Stroke stroke9 = valueMarker4.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker4.getLabelOffsetType();
        java.lang.Class<?> wildcardClass11 = lengthAdjustmentType10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray12 = valueMarker1.getListeners((java.lang.Class) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.util.LengthAdjustmentType; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint23 = valueMarker22.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker22.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor24);
        java.awt.Paint paint26 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker1.addChangeListener(markerChangeListener27);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        java.lang.Object obj11 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        java.awt.Font font25 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker27.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        valueMarker27.notifyListeners(markerChangeEvent29);
        java.awt.Paint paint31 = valueMarker27.getPaint();
        java.lang.Object obj32 = valueMarker27.clone();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint36 = valueMarker35.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker38.setLabel("");
        java.awt.Paint paint41 = valueMarker38.getPaint();
        java.awt.Stroke stroke42 = valueMarker38.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint36, stroke42);
        valueMarker27.setOutlineStroke(stroke42);
        boolean boolean45 = valueMarker1.equals((java.lang.Object) valueMarker27);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(rectangleAnchor28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        java.lang.String str11 = valueMarker1.getLabel();
        java.awt.Font font12 = valueMarker1.getLabelFont();
        double double13 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Paint paint8 = valueMarker1.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        java.lang.Object obj10 = valueMarker1.clone();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker1.notifyListeners(markerChangeEvent12);
        java.awt.Paint paint14 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        valueMarker1.setAlpha((float) 1L);
        java.lang.String str10 = valueMarker1.getLabel();
        valueMarker1.setAlpha(1.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getOutlinePaint();
        valueMarker7.setLabelPaint(paint16);
        float float18 = valueMarker7.getAlpha();
        valueMarker7.setLabel("");
        valueMarker7.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker7.getLabelTextAnchor();
        java.awt.Paint paint24 = valueMarker7.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker7.getLabelOffsetType();
        java.awt.Paint paint26 = valueMarker7.getOutlinePaint();
        valueMarker1.setPaint(paint26);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker1.getLabelOffsetType();
        java.awt.Stroke stroke29 = valueMarker1.getOutlineStroke();
        java.awt.Font font30 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNotNull(rectangleInsets31);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        float float5 = valueMarker1.getAlpha();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getPaint();
        java.awt.Stroke stroke10 = valueMarker6.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getOutlinePaint();
        valueMarker6.setLabelPaint(paint15);
        float float17 = valueMarker6.getAlpha();
        valueMarker6.setValue((double) (byte) 0);
        java.lang.String str20 = valueMarker6.getLabel();
        java.awt.Paint paint21 = valueMarker6.getPaint();
        valueMarker1.setOutlinePaint(paint21);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker24.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker24.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor26);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker1.removeChangeListener(markerChangeListener28);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        valueMarker1.notifyListeners(markerChangeEvent30);
        java.awt.Font font32 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(rectangleAnchor26);
        org.junit.Assert.assertNotNull(font32);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        valueMarker1.setValue((double) (short) 100);
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        valueMarker1.notifyListeners(markerChangeEvent11);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        double double30 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        valueMarker1.notifyListeners(markerChangeEvent31);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor33);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor5 = valueMarker2.getLabelTextAnchor();
        float float6 = valueMarker2.getAlpha();
        double double7 = valueMarker2.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker9.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker9.getLabelAnchor();
        valueMarker2.setLabelAnchor(rectangleAnchor13);
        java.awt.Paint paint15 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint19 = valueMarker18.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        java.awt.Paint paint24 = valueMarker21.getPaint();
        java.awt.Stroke stroke25 = valueMarker21.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint19, stroke25);
        float float27 = valueMarker26.getAlpha();
        java.awt.Stroke stroke28 = valueMarker26.getOutlineStroke();
        java.awt.Paint paint29 = null;
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker33.setLabel("");
        java.awt.Paint paint36 = valueMarker33.getPaint();
        java.awt.Stroke stroke37 = valueMarker33.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker39.setLabel("");
        java.awt.Paint paint42 = valueMarker39.getOutlinePaint();
        valueMarker33.setLabelPaint(paint42);
        float float44 = valueMarker33.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener45 = null;
        valueMarker33.addChangeListener(markerChangeListener45);
        java.awt.Stroke stroke47 = valueMarker33.getOutlineStroke();
        valueMarker31.setOutlineStroke(stroke47);
        java.awt.Stroke stroke49 = valueMarker31.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker51 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1, paint15, stroke28, paint29, stroke49, (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textAnchor5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.8f + "'", float44 == 0.8f);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(stroke49);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.removeChangeListener(markerChangeListener11);
        double double13 = valueMarker1.getValue();
        java.awt.Stroke stroke14 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(textAnchor15);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker4.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        valueMarker1.setAlpha((float) (byte) 1);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke8 = valueMarker7.getStroke();
        valueMarker1.setStroke(stroke8);
        valueMarker1.setValue((double) (-1));
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(textAnchor12);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        java.awt.Paint paint9 = valueMarker1.getPaint();
        java.awt.Paint paint10 = valueMarker1.getPaint();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker1.notifyListeners(markerChangeEvent12);
        java.lang.String str14 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Font font8 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke9 = valueMarker1.getStroke();
        valueMarker1.setLabel("");
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        java.lang.Object obj10 = null;
        boolean boolean11 = valueMarker1.equals(obj10);
        valueMarker1.setLabel("hi!");
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getOutlinePaint();
        java.lang.String str9 = valueMarker1.getLabel();
        java.awt.Paint paint10 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.removeChangeListener(markerChangeListener11);
        java.awt.Font font13 = valueMarker1.getLabelFont();
        java.lang.String str14 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker16.addChangeListener(markerChangeListener19);
        double double21 = valueMarker16.getValue();
        java.awt.Paint paint22 = valueMarker16.getOutlinePaint();
        java.awt.Paint paint23 = valueMarker16.getLabelPaint();
        valueMarker16.setLabel("");
        valueMarker16.setAlpha(0.0f);
        java.awt.Paint paint28 = valueMarker16.getLabelPaint();
        valueMarker16.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        valueMarker16.notifyListeners(markerChangeEvent31);
        java.lang.Class<?> wildcardClass33 = valueMarker16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray34 = valueMarker1.getListeners((java.lang.Class) wildcardClass33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = valueMarker1.getLabelOffset();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getOutlinePaint();
        valueMarker1.setLabelPaint(paint8);
        java.awt.Paint paint10 = valueMarker1.getPaint();
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        boolean boolean10 = valueMarker1.equals((java.lang.Object) (short) -1);
        boolean boolean12 = valueMarker1.equals((java.lang.Object) 10);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker14.notifyListeners(markerChangeEvent17);
        java.awt.Stroke stroke19 = valueMarker14.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker14.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        java.awt.Font font10 = valueMarker1.getLabelFont();
        double double11 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker12.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker12.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker12.addChangeListener(markerChangeListener17);
        float float19 = valueMarker12.getAlpha();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker12.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor20);
        java.lang.String str22 = valueMarker1.getLabel();
        java.awt.Paint paint23 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.awt.Stroke stroke13 = valueMarker9.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getOutlinePaint();
        valueMarker9.setLabelPaint(paint18);
        float float20 = valueMarker9.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker9.addChangeListener(markerChangeListener21);
        java.awt.Stroke stroke23 = valueMarker9.getOutlineStroke();
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker9.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker9.removeChangeListener(markerChangeListener25);
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker9.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor27);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker1.removeChangeListener(markerChangeListener29);
        java.awt.Paint paint31 = valueMarker1.getPaint();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(textAnchor24);
        org.junit.Assert.assertNotNull(textAnchor27);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke4 = valueMarker3.getStroke();
        java.lang.Object obj5 = valueMarker3.clone();
        valueMarker3.setValue((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker3.getLabelAnchor();
        java.lang.Class<?> wildcardClass9 = valueMarker3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray10 = valueMarker1.getListeners((java.lang.Class) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Paint paint13 = valueMarker10.getPaint();
        java.lang.String str14 = valueMarker10.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker10.notifyListeners(markerChangeEvent15);
        java.awt.Paint paint17 = valueMarker10.getPaint();
        valueMarker10.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        java.awt.Paint paint24 = valueMarker21.getPaint();
        java.awt.Stroke stroke25 = valueMarker21.getOutlineStroke();
        valueMarker10.setOutlineStroke(stroke25);
        valueMarker1.setOutlineStroke(stroke25);
        java.awt.Font font28 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(font28);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        java.awt.Font font20 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(font20);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str2 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.lang.String str11 = valueMarker7.getLabel();
        java.awt.Paint paint12 = valueMarker7.getLabelPaint();
        java.awt.Paint paint13 = valueMarker7.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker15.addChangeListener(markerChangeListener18);
        double double20 = valueMarker15.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker15.getLabelAnchor();
        valueMarker15.setLabel("hi!");
        java.awt.Stroke stroke24 = valueMarker15.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (short) 0, paint13, stroke24);
        valueMarker1.setLabelPaint(paint13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        valueMarker1.setValue(0.0d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("hi!");
        java.lang.Object obj8 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        java.lang.Class<?> wildcardClass11 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        valueMarker1.setAlpha(0.0f);
        java.awt.Paint paint13 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        java.lang.Class<?> wildcardClass16 = valueMarker1.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        valueMarker1.setStroke(stroke11);
        java.lang.String str13 = valueMarker1.getLabel();
        java.lang.String str14 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker1.getLabelOffsetType();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        java.awt.Stroke stroke16 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker6.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor9);
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker4.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        valueMarker1.setValue((double) (byte) -1);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        java.lang.String str9 = valueMarker1.getLabel();
        float float10 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker14.notifyListeners(markerChangeEvent17);
        valueMarker14.setValue((double) 0.8f);
        boolean boolean21 = valueMarker12.equals((java.lang.Object) valueMarker14);
        java.awt.Stroke stroke22 = valueMarker14.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker14.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets23);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8f + "'", float10 == 0.8f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = valueMarker17.getLabelOffset();
        java.awt.Stroke stroke19 = valueMarker17.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke19);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getPaint();
        java.awt.Stroke stroke26 = valueMarker22.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        java.awt.Paint paint31 = valueMarker28.getOutlinePaint();
        valueMarker22.setLabelPaint(paint31);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker22.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker22.addChangeListener(markerChangeListener34);
        java.awt.Font font36 = valueMarker22.getLabelFont();
        java.lang.Class<?> wildcardClass37 = valueMarker22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray38 = valueMarker1.getListeners((java.lang.Class) wildcardClass37);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(rectangleAnchor33);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getOutlinePaint();
        valueMarker13.setLabelPaint(paint22);
        float float24 = valueMarker13.getAlpha();
        valueMarker13.setLabel("");
        valueMarker13.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker13.getLabelTextAnchor();
        java.awt.Paint paint30 = valueMarker13.getOutlinePaint();
        valueMarker1.setLabelPaint(paint30);
        float float32 = valueMarker1.getAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = valueMarker1.getLabelOffset();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker1.addChangeListener(markerChangeListener34);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.8f + "'", float32 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets33);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        float float12 = valueMarker1.getAlpha();
        boolean boolean14 = valueMarker1.equals((java.lang.Object) 10.0f);
        java.awt.Stroke stroke15 = valueMarker1.getOutlineStroke();
        java.awt.Font font16 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = valueMarker1.getLabelOffset();
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint5 = valueMarker4.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.lang.String str11 = valueMarker7.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker7.getLabelOffsetType();
        valueMarker4.setLabelOffsetType(lengthAdjustmentType12);
        valueMarker1.setLabelOffsetType(lengthAdjustmentType12);
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker1.getLabelTextAnchor();
        float float16 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker1.notifyListeners(markerChangeEvent17);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker1.addChangeListener(markerChangeListener19);
        java.awt.Font font21 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker2.getLabelOffsetType();
        double double6 = valueMarker2.getValue();
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker2.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker9.addChangeListener(markerChangeListener12);
        double double14 = valueMarker9.getValue();
        java.awt.Paint paint15 = valueMarker9.getOutlinePaint();
        java.awt.Paint paint16 = valueMarker9.getLabelPaint();
        java.awt.Paint paint17 = valueMarker9.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker19.addChangeListener(markerChangeListener22);
        double double24 = valueMarker19.getValue();
        java.awt.Paint paint25 = valueMarker19.getOutlinePaint();
        java.awt.Paint paint26 = valueMarker19.getLabelPaint();
        java.awt.Paint paint27 = valueMarker19.getPaint();
        valueMarker9.setLabelPaint(paint27);
        java.awt.Paint paint29 = valueMarker9.getOutlinePaint();
        java.awt.Paint paint30 = valueMarker9.getLabelPaint();
        valueMarker2.setOutlinePaint(paint30);
        java.awt.Stroke stroke32 = null;
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setLabel("");
        java.awt.Paint paint37 = valueMarker34.getPaint();
        java.lang.String str38 = valueMarker34.getLabel();
        java.awt.Paint paint39 = valueMarker34.getLabelPaint();
        java.awt.Paint paint40 = valueMarker34.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker42.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener45 = null;
        valueMarker42.addChangeListener(markerChangeListener45);
        double double47 = valueMarker42.getValue();
        java.awt.Paint paint48 = valueMarker42.getLabelPaint();
        java.awt.Paint paint49 = valueMarker42.getPaint();
        java.awt.Stroke stroke50 = valueMarker42.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f), paint30, stroke32, paint40, stroke50, 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(stroke50);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        valueMarker1.setLabel("");
        java.lang.String str29 = valueMarker1.getLabel();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.lang.String str11 = valueMarker7.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = valueMarker7.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker1.getLabelOffset();
        java.lang.Object obj16 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.addChangeListener(markerChangeListener5);
        double double7 = valueMarker2.getValue();
        java.awt.Paint paint8 = valueMarker2.getLabelPaint();
        java.awt.Paint paint9 = valueMarker2.getOutlinePaint();
        java.awt.Stroke stroke10 = valueMarker2.getOutlineStroke();
        java.awt.Stroke stroke11 = valueMarker2.getOutlineStroke();
        java.awt.Paint paint12 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getPaint();
        java.lang.String str18 = valueMarker14.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        valueMarker14.notifyListeners(markerChangeEvent19);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getPaint();
        java.lang.String str26 = valueMarker22.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        java.awt.Paint paint31 = valueMarker28.getPaint();
        valueMarker22.setLabelPaint(paint31);
        valueMarker14.setOutlinePaint(paint31);
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = valueMarker14.getLabelOffset();
        valueMarker14.setLabel("hi!");
        java.awt.Paint paint37 = valueMarker14.getPaint();
        valueMarker2.setOutlinePaint(paint37);
        java.awt.Paint paint39 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker41.setLabel("");
        java.awt.Paint paint44 = valueMarker41.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener45 = null;
        valueMarker41.removeChangeListener(markerChangeListener45);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener47 = null;
        valueMarker41.addChangeListener(markerChangeListener47);
        java.awt.Paint paint49 = valueMarker41.getPaint();
        java.awt.Stroke stroke50 = valueMarker41.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker52.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor55 = valueMarker52.getLabelTextAnchor();
        float float56 = valueMarker52.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType57 = valueMarker52.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker59 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker59.setLabel("");
        java.awt.Paint paint62 = valueMarker59.getPaint();
        java.lang.String str63 = valueMarker59.getLabel();
        double double64 = valueMarker59.getValue();
        java.awt.Stroke stroke65 = valueMarker59.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker67 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint68 = valueMarker67.getLabelPaint();
        valueMarker59.setOutlinePaint(paint68);
        java.awt.Paint paint70 = valueMarker59.getPaint();
        valueMarker52.setPaint(paint70);
        org.jfree.chart.plot.ValueMarker valueMarker73 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker73.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor76 = valueMarker73.getLabelTextAnchor();
        float float77 = valueMarker73.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker79 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font80 = valueMarker79.getLabelFont();
        valueMarker73.setLabelFont(font80);
        java.awt.Stroke stroke82 = valueMarker73.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker84 = new org.jfree.chart.plot.ValueMarker((-1.0d), paint39, stroke50, paint70, stroke82, (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNotNull(textAnchor55);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 0.8f + "'", float56 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType57);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertNotNull(stroke65);
        org.junit.Assert.assertNotNull(paint68);
        org.junit.Assert.assertNotNull(paint70);
        org.junit.Assert.assertNotNull(textAnchor76);
        org.junit.Assert.assertTrue("'" + float77 + "' != '" + 0.8f + "'", float77 == 0.8f);
        org.junit.Assert.assertNotNull(font80);
        org.junit.Assert.assertNotNull(stroke82);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        valueMarker1.setStroke(stroke11);
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        valueMarker1.setValue((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker17.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor18);
        valueMarker1.setLabel("hi!");
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker1.removeChangeListener(markerChangeListener24);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(rectangleAnchor26);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint23 = valueMarker22.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker22.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor24);
        valueMarker1.setValue((double) 0.0f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.awt.Stroke stroke8 = valueMarker1.getStroke();
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getOutlinePaint();
        valueMarker8.setLabelPaint(paint15);
        java.awt.Stroke stroke17 = valueMarker8.getStroke();
        valueMarker1.setStroke(stroke17);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker1.addChangeListener(markerChangeListener19);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        java.lang.String str22 = valueMarker1.getLabel();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker2.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker5.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker5.getLabelOffsetType();
        valueMarker2.setLabelOffsetType(lengthAdjustmentType9);
        java.awt.Font font11 = valueMarker2.getLabelFont();
        java.awt.Paint paint12 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        float float19 = valueMarker16.getAlpha();
        java.lang.String str20 = valueMarker16.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker16.removeChangeListener(markerChangeListener21);
        valueMarker16.setAlpha((float) 1L);
        java.lang.String str25 = valueMarker16.getLabel();
        java.awt.Stroke stroke26 = valueMarker16.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        valueMarker28.notifyListeners(markerChangeEvent31);
        java.awt.Stroke stroke33 = valueMarker28.getOutlineStroke();
        valueMarker16.setStroke(stroke33);
        valueMarker14.setStroke(stroke33);
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker37.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor40 = valueMarker37.getLabelTextAnchor();
        float float41 = valueMarker37.getAlpha();
        double double42 = valueMarker37.getValue();
        double double43 = valueMarker37.getValue();
        java.lang.Object obj44 = valueMarker37.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = valueMarker37.getLabelOffset();
        java.awt.Paint paint46 = valueMarker37.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker48.setLabel("");
        java.awt.Paint paint51 = valueMarker48.getPaint();
        java.lang.Object obj52 = valueMarker48.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType53 = valueMarker48.getLabelOffsetType();
        valueMarker48.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener56 = null;
        valueMarker48.addChangeListener(markerChangeListener56);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener58 = null;
        valueMarker48.removeChangeListener(markerChangeListener58);
        org.jfree.chart.text.TextAnchor textAnchor60 = valueMarker48.getLabelTextAnchor();
        java.awt.Stroke stroke61 = valueMarker48.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker63 = new org.jfree.chart.plot.ValueMarker((double) ' ', paint12, stroke33, paint46, stroke61, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(textAnchor40);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 0.8f + "'", float41 == 0.8f);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(lengthAdjustmentType53);
        org.junit.Assert.assertNotNull(textAnchor60);
        org.junit.Assert.assertNotNull(stroke61);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.lang.String str13 = valueMarker9.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getPaint();
        valueMarker9.setLabelPaint(paint18);
        valueMarker1.setOutlinePaint(paint18);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker1.removeChangeListener(markerChangeListener21);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker1.getLabelOffset();
        valueMarker1.setAlpha((float) (short) 0);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint10 = valueMarker9.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getPaint();
        java.lang.String str16 = valueMarker12.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker12.getLabelOffsetType();
        valueMarker9.setLabelOffsetType(lengthAdjustmentType17);
        valueMarker1.setLabelOffsetType(lengthAdjustmentType17);
        java.awt.Paint paint20 = valueMarker1.getPaint();
        java.lang.Object obj21 = valueMarker1.clone();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100.0f);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType2 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        java.awt.Font font7 = valueMarker4.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker4.addChangeListener(markerChangeListener8);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker4.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker4.getLabelAnchor();
        valueMarker4.setValue((double) 'a');
        java.lang.Class<?> wildcardClass14 = valueMarker4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray15 = valueMarker1.getListeners((java.lang.Class) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType2);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        double double8 = valueMarker1.getValue();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor9);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType30 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType32 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener37 = null;
        valueMarker34.addChangeListener(markerChangeListener37);
        double double39 = valueMarker34.getValue();
        java.awt.Paint paint40 = valueMarker34.getOutlinePaint();
        java.awt.Paint paint41 = valueMarker34.getLabelPaint();
        valueMarker34.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent44 = null;
        valueMarker34.notifyListeners(markerChangeEvent44);
        java.lang.Object obj46 = valueMarker34.clone();
        java.lang.Class<?> wildcardClass47 = valueMarker34.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray48 = valueMarker1.getListeners((java.lang.Class) wildcardClass47);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(lengthAdjustmentType30);
        org.junit.Assert.assertNotNull(rectangleAnchor31);
        org.junit.Assert.assertNotNull(lengthAdjustmentType32);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.addChangeListener(markerChangeListener15);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = valueMarker1.getLabelOffset();
        double double18 = valueMarker1.getValue();
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 100L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor19);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        java.lang.String str7 = valueMarker1.getLabel();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint14 = valueMarker13.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        java.awt.Paint paint19 = valueMarker16.getPaint();
        java.awt.Stroke stroke20 = valueMarker16.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint14, stroke20);
        valueMarker1.setOutlinePaint(paint14);
        float float23 = valueMarker1.getAlpha();
        java.lang.Class<?> wildcardClass24 = valueMarker1.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.addChangeListener(markerChangeListener5);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getPaint();
        valueMarker1.setOutlinePaint(paint11);
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.removeChangeListener(markerChangeListener14);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker1.addChangeListener(markerChangeListener16);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker1.addChangeListener(markerChangeListener18);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(textAnchor13);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        valueMarker3.setLabel("hi!");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker3.getLabelOffsetType();
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType29 = valueMarker15.getLabelOffsetType();
        valueMarker3.setLabelOffsetType(lengthAdjustmentType29);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType29);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker12.addChangeListener(markerChangeListener15);
        double double17 = valueMarker12.getValue();
        java.awt.Paint paint18 = valueMarker12.getLabelPaint();
        java.awt.Paint paint19 = valueMarker12.getOutlinePaint();
        java.awt.Stroke stroke20 = valueMarker12.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Paint paint23 = valueMarker22.getPaint();
        valueMarker12.setPaint(paint23);
        valueMarker1.setOutlinePaint(paint23);
        float float26 = valueMarker1.getAlpha();
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker1.removeChangeListener(markerChangeListener25);
        java.awt.Paint paint27 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.awt.Stroke stroke7 = valueMarker3.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getOutlinePaint();
        valueMarker3.setLabelPaint(paint12);
        float float14 = valueMarker3.getAlpha();
        valueMarker3.setLabel("");
        valueMarker3.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker3.getLabelTextAnchor();
        java.awt.Paint paint20 = valueMarker3.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType21 = valueMarker3.getLabelOffsetType();
        java.awt.Paint paint22 = valueMarker3.getOutlinePaint();
        valueMarker1.setPaint(paint22);
        valueMarker1.setLabel("hi!");
        java.lang.String str26 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker29.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor30);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(rectangleAnchor27);
        org.junit.Assert.assertNotNull(rectangleAnchor30);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        java.awt.Paint paint19 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(textAnchor18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker23.addChangeListener(markerChangeListener26);
        double double28 = valueMarker23.getValue();
        java.awt.Paint paint29 = valueMarker23.getOutlinePaint();
        java.awt.Paint paint30 = valueMarker23.getLabelPaint();
        valueMarker23.setLabel("");
        valueMarker23.setAlpha(0.0f);
        java.awt.Paint paint35 = valueMarker23.getLabelPaint();
        valueMarker23.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent38 = null;
        valueMarker23.notifyListeners(markerChangeEvent38);
        java.lang.Class<?> wildcardClass40 = valueMarker23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray41 = valueMarker1.getListeners((java.lang.Class) wildcardClass40);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint18 = valueMarker17.getLabelPaint();
        java.awt.Stroke stroke19 = valueMarker17.getStroke();
        valueMarker1.setStroke(stroke19);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        float float9 = valueMarker6.getAlpha();
        java.lang.String str10 = valueMarker6.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getPaint();
        java.awt.Stroke stroke16 = valueMarker12.getOutlineStroke();
        valueMarker6.setStroke(stroke16);
        java.awt.Stroke stroke18 = valueMarker6.getStroke();
        valueMarker6.setValue((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker22.getLabelAnchor();
        valueMarker6.setLabelAnchor(rectangleAnchor23);
        valueMarker1.setLabelAnchor(rectangleAnchor23);
        valueMarker1.setAlpha((float) (short) 1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        java.awt.Paint paint24 = valueMarker21.getOutlinePaint();
        java.awt.Stroke stroke25 = valueMarker21.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = valueMarker27.getLabelOffset();
        valueMarker21.setLabelOffset(rectangleInsets28);
        java.lang.Class<?> wildcardClass30 = rectangleInsets28.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray31 = valueMarker1.getListeners((java.lang.Class) wildcardClass30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.util.RectangleInsets; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        java.lang.Class<?> wildcardClass10 = rectangleInsets9.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        valueMarker1.setValue((double) (short) 100);
        valueMarker1.setAlpha(0.0f);
        java.awt.Font font12 = valueMarker1.getLabelFont();
        java.lang.Class<?> wildcardClass13 = font12.getClass();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) ' ');
        java.awt.Paint paint2 = valueMarker1.getPaint();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("hi!");
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        java.awt.Stroke stroke11 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        float float12 = valueMarker1.getAlpha();
        valueMarker1.setValue((double) (byte) 0);
        java.lang.Object obj15 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker1.removeChangeListener(markerChangeListener16);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        java.awt.Font font3 = valueMarker1.getLabelFont();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        java.awt.Paint paint21 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke24 = valueMarker23.getStroke();
        java.awt.Font font25 = valueMarker23.getLabelFont();
        valueMarker1.setLabelFont(font25);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(font25);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.lang.String str9 = valueMarker5.getLabel();
        double double10 = valueMarker5.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker5.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker5.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor12);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        valueMarker1.setAlpha((float) 1);
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        valueMarker1.setLabel("");
        valueMarker1.setAlpha((float) 0);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.addChangeListener(markerChangeListener5);
        double double7 = valueMarker2.getValue();
        java.awt.Paint paint8 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint9 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 1);
        java.awt.Stroke stroke12 = valueMarker11.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 0, paint9, stroke12);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker13.getLabelOffsetType();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        valueMarker1.notifyListeners(markerChangeEvent7);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint12 = valueMarker11.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getPaint();
        java.awt.Stroke stroke18 = valueMarker14.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint12, stroke18);
        float float20 = valueMarker19.getAlpha();
        valueMarker19.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker19.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets23);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.awt.Stroke stroke6 = valueMarker2.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getOutlinePaint();
        valueMarker2.setLabelPaint(paint11);
        float float13 = valueMarker2.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker2.addChangeListener(markerChangeListener14);
        java.lang.Object obj16 = valueMarker2.clone();
        java.awt.Stroke stroke17 = valueMarker2.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker2.removeChangeListener(markerChangeListener18);
        java.awt.Paint paint20 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint24 = valueMarker23.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker26.setLabel("");
        java.awt.Paint paint29 = valueMarker26.getPaint();
        java.awt.Stroke stroke30 = valueMarker26.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint24, stroke30);
        float float32 = valueMarker31.getAlpha();
        java.awt.Stroke stroke33 = valueMarker31.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker35.setLabel("");
        java.awt.Paint paint38 = valueMarker35.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener39 = null;
        valueMarker35.removeChangeListener(markerChangeListener39);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener41 = null;
        valueMarker35.addChangeListener(markerChangeListener41);
        java.awt.Paint paint43 = valueMarker35.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType44 = valueMarker35.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener45 = null;
        valueMarker35.removeChangeListener(markerChangeListener45);
        java.awt.Paint paint47 = valueMarker35.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker49.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener52 = null;
        valueMarker49.addChangeListener(markerChangeListener52);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener54 = null;
        valueMarker49.removeChangeListener(markerChangeListener54);
        java.awt.Stroke stroke56 = valueMarker49.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker58 = new org.jfree.chart.plot.ValueMarker((double) (short) 0, paint20, stroke33, paint47, stroke56, (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(lengthAdjustmentType44);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(stroke56);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1.0f);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.awt.Stroke stroke7 = valueMarker3.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getOutlinePaint();
        valueMarker3.setLabelPaint(paint12);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker3.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker3.addChangeListener(markerChangeListener15);
        java.awt.Font font17 = valueMarker3.getLabelFont();
        boolean boolean18 = valueMarker1.equals((java.lang.Object) font17);
        java.awt.Paint paint19 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        valueMarker1.setValue((double) (-1.0f));
        double double5 = valueMarker1.getValue();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.removeChangeListener(markerChangeListener9);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.addChangeListener(markerChangeListener5);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke8 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 100.0f);
        java.awt.Font font11 = valueMarker10.getLabelFont();
        valueMarker1.setLabelFont(font11);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(font11);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getOutlinePaint();
        valueMarker7.setLabelPaint(paint16);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker7.getLabelAnchor();
        valueMarker7.setLabel("hi!");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker7.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor21);
        java.awt.Paint paint23 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        boolean boolean3 = valueMarker1.equals((java.lang.Object) 0L);
        valueMarker1.setValue((double) (short) 0);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker9.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets10);
        java.awt.Font font12 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        java.awt.Paint paint19 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker1.getLabelAnchor();
        java.awt.Font font21 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke22 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker24.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        valueMarker24.notifyListeners(markerChangeEvent26);
        float float28 = valueMarker24.getAlpha();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker24.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor29);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(rectangleAnchor25);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.8f + "'", float28 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor29);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        valueMarker1.setStroke(stroke11);
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.addChangeListener(markerChangeListener15);
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("");
        java.awt.Paint paint21 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        boolean boolean15 = valueMarker8.equals((java.lang.Object) 10L);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker17.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker17.removeChangeListener(markerChangeListener19);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker17.getLabelOffset();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker17.removeChangeListener(markerChangeListener22);
        java.awt.Paint paint24 = valueMarker17.getLabelPaint();
        valueMarker8.setPaint(paint24);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.lang.Object obj3 = valueMarker1.clone();
        valueMarker1.setValue((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker8.getLabelOffset();
        java.awt.Stroke stroke10 = valueMarker8.getOutlineStroke();
        valueMarker1.setStroke(stroke10);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker1.getLabelOffset();
        java.awt.Stroke stroke13 = valueMarker1.getOutlineStroke();
        double double14 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        java.lang.String str11 = valueMarker1.getLabel();
        java.awt.Font font12 = valueMarker1.getLabelFont();
        double double13 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 1);
        java.awt.Stroke stroke16 = valueMarker15.getOutlineStroke();
        valueMarker1.setStroke(stroke16);
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint19 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker1.removeChangeListener(markerChangeListener20);
        java.awt.Paint paint22 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(textAnchor18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        java.awt.Paint paint10 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getPaint();
        java.awt.Stroke stroke16 = valueMarker12.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        java.awt.Paint paint21 = valueMarker18.getOutlinePaint();
        valueMarker12.setLabelPaint(paint21);
        float float23 = valueMarker12.getAlpha();
        valueMarker12.setLabel("");
        valueMarker12.setLabel("hi!");
        valueMarker12.setAlpha(1.0f);
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 1);
        valueMarker31.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker31.removeChangeListener(markerChangeListener34);
        java.awt.Font font36 = valueMarker31.getLabelFont();
        valueMarker12.setLabelFont(font36);
        valueMarker1.setLabelFont(font36);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
        org.junit.Assert.assertNotNull(font36);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker1.removeChangeListener(markerChangeListener21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8f + "'", float15 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.lang.String str11 = valueMarker7.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = valueMarker7.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets13);
        java.awt.Font font15 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getPaint();
        java.awt.Stroke stroke10 = valueMarker6.getOutlineStroke();
        java.awt.Font font11 = valueMarker6.getLabelFont();
        valueMarker1.setLabelFont(font11);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker1.getLabelAnchor();
        valueMarker1.setAlpha(1.0f);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.removeChangeListener(markerChangeListener17);
        java.awt.Paint paint19 = valueMarker1.getPaint();
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(textAnchor20);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.awt.Stroke stroke7 = valueMarker3.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getOutlinePaint();
        valueMarker3.setLabelPaint(paint12);
        float float14 = valueMarker3.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker3.addChangeListener(markerChangeListener15);
        java.awt.Stroke stroke17 = valueMarker3.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke17);
        java.awt.Stroke stroke19 = valueMarker1.getStroke();
        java.lang.String str20 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint10 = valueMarker9.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker9.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor11);
        java.lang.Class<?> wildcardClass13 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getOutlinePaint();
        valueMarker13.setLabelPaint(paint22);
        float float24 = valueMarker13.getAlpha();
        valueMarker13.setLabel("");
        valueMarker13.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker13.getLabelTextAnchor();
        java.awt.Paint paint30 = valueMarker13.getOutlinePaint();
        valueMarker1.setLabelPaint(paint30);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker1.removeChangeListener(markerChangeListener32);
        double double34 = valueMarker1.getValue();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) ' ');
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        valueMarker1.setAlpha((float) (short) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleInsets7);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        valueMarker3.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker3.removeChangeListener(markerChangeListener13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker3.getLabelOffset();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        valueMarker1.setAlpha((float) (byte) 1);
        java.awt.Stroke stroke23 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint24 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint12 = valueMarker11.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getPaint();
        java.awt.Stroke stroke18 = valueMarker14.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint12, stroke18);
        float float20 = valueMarker19.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker19.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker19.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor22);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint25 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(rectangleAnchor22);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        java.lang.Object obj10 = null;
        boolean boolean11 = valueMarker1.equals(obj10);
        valueMarker1.setLabel("hi!");
        double double14 = valueMarker1.getValue();
        java.awt.Font font15 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke16 = valueMarker1.getStroke();
        java.lang.String str17 = valueMarker1.getLabel();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.awt.Paint paint8 = valueMarker1.getOutlinePaint();
        valueMarker1.setValue((double) '4');
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        valueMarker1.setAlpha(0.0f);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker19.addChangeListener(markerChangeListener22);
        double double24 = valueMarker19.getValue();
        java.awt.Paint paint25 = valueMarker19.getOutlinePaint();
        java.awt.Paint paint26 = valueMarker19.getLabelPaint();
        java.awt.Paint paint27 = valueMarker19.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker29.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker29.addChangeListener(markerChangeListener32);
        double double34 = valueMarker29.getValue();
        java.awt.Paint paint35 = valueMarker29.getOutlinePaint();
        java.awt.Paint paint36 = valueMarker29.getLabelPaint();
        java.awt.Paint paint37 = valueMarker29.getPaint();
        valueMarker19.setLabelPaint(paint37);
        java.awt.Paint paint39 = valueMarker19.getOutlinePaint();
        boolean boolean40 = valueMarker14.equals((java.lang.Object) valueMarker19);
        java.awt.Paint paint41 = valueMarker14.getOutlinePaint();
        java.lang.String str42 = valueMarker14.getLabel();
        java.lang.String str43 = valueMarker14.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType44 = valueMarker14.getLabelOffsetType();
        java.lang.Class<?> wildcardClass45 = valueMarker14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray46 = valueMarker1.getListeners((java.lang.Class) wildcardClass45);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        valueMarker1.setValue((double) 0.8f);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.awt.Stroke stroke13 = valueMarker9.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getOutlinePaint();
        valueMarker9.setLabelPaint(paint18);
        float float20 = valueMarker9.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker9.addChangeListener(markerChangeListener21);
        java.awt.Stroke stroke23 = valueMarker9.getOutlineStroke();
        valueMarker1.setStroke(stroke23);
        float float25 = valueMarker1.getAlpha();
        float float26 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getPaint();
        java.awt.Stroke stroke10 = valueMarker6.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getOutlinePaint();
        valueMarker6.setLabelPaint(paint15);
        float float17 = valueMarker6.getAlpha();
        valueMarker6.setValue((double) (byte) 0);
        java.lang.String str20 = valueMarker6.getLabel();
        java.awt.Paint paint21 = valueMarker6.getPaint();
        valueMarker1.setOutlinePaint(paint21);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker24.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker24.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor26);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker1.removeChangeListener(markerChangeListener28);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        valueMarker1.notifyListeners(markerChangeEvent30);
        double double32 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(rectangleAnchor26);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        java.lang.Object obj6 = valueMarker1.clone();
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Paint paint13 = valueMarker10.getPaint();
        java.awt.Stroke stroke14 = valueMarker10.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        java.awt.Paint paint19 = valueMarker16.getOutlinePaint();
        valueMarker10.setLabelPaint(paint19);
        float float21 = valueMarker10.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker10.addChangeListener(markerChangeListener22);
        java.lang.Object obj24 = valueMarker10.clone();
        java.awt.Stroke stroke25 = valueMarker10.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker10.removeChangeListener(markerChangeListener26);
        java.awt.Paint paint28 = valueMarker10.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker10.getLabelAnchor();
        java.awt.Font font30 = valueMarker10.getLabelFont();
        java.awt.Stroke stroke31 = valueMarker10.getStroke();
        java.lang.Class<?> wildcardClass32 = valueMarker10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray33 = valueMarker1.getListeners((java.lang.Class) wildcardClass32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.8f + "'", float21 == 0.8f);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(rectangleAnchor29);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.removeChangeListener(markerChangeListener17);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1.0f);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.lang.Object obj7 = valueMarker3.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker3.getLabelOffsetType();
        valueMarker3.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker3.addChangeListener(markerChangeListener11);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker3.removeChangeListener(markerChangeListener13);
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker3.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor15);
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker18.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker18.getLabelAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker18.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets21);
        java.awt.Stroke stroke23 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = valueMarker15.getLabelOffset();
        java.lang.Class<?> wildcardClass17 = valueMarker15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray18 = valueMarker1.getListeners((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.lang.String str13 = valueMarker9.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getPaint();
        valueMarker9.setLabelPaint(paint18);
        valueMarker1.setOutlinePaint(paint18);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker1.getLabelOffset();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        valueMarker1.notifyListeners(markerChangeEvent24);
        float float26 = valueMarker1.getAlpha();
        float float27 = valueMarker1.getAlpha();
        java.awt.Stroke stroke28 = valueMarker1.getOutlineStroke();
        java.lang.Class<?> wildcardClass29 = stroke28.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.8f + "'", float27 == 0.8f);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        valueMarker2.notifyListeners(markerChangeEvent5);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        valueMarker2.notifyListeners(markerChangeEvent7);
        java.awt.Font font9 = valueMarker2.getLabelFont();
        java.awt.Stroke stroke10 = valueMarker2.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker12.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker12.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker12.addChangeListener(markerChangeListener17);
        float float19 = valueMarker12.getAlpha();
        java.awt.Paint paint20 = valueMarker12.getPaint();
        valueMarker2.setLabelPaint(paint20);
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        java.awt.Paint paint26 = valueMarker23.getPaint();
        java.lang.Object obj27 = valueMarker23.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker23.getLabelOffsetType();
        valueMarker23.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker23.addChangeListener(markerChangeListener31);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener33 = null;
        valueMarker23.addChangeListener(markerChangeListener33);
        java.lang.Object obj35 = valueMarker23.clone();
        java.awt.Paint paint36 = valueMarker23.getOutlinePaint();
        double double37 = valueMarker23.getValue();
        java.awt.Stroke stroke38 = valueMarker23.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker40.setLabel("");
        java.awt.Paint paint43 = valueMarker40.getPaint();
        java.awt.Stroke stroke44 = valueMarker40.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker46 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker46.setLabel("");
        java.awt.Paint paint49 = valueMarker46.getOutlinePaint();
        valueMarker40.setLabelPaint(paint49);
        float float51 = valueMarker40.getAlpha();
        valueMarker40.setLabel("");
        java.awt.Paint paint54 = valueMarker40.getOutlinePaint();
        java.awt.Paint paint55 = valueMarker40.getOutlinePaint();
        java.awt.Paint paint56 = valueMarker40.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker58 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke59 = valueMarker58.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener60 = null;
        valueMarker58.addChangeListener(markerChangeListener60);
        java.lang.String str62 = valueMarker58.getLabel();
        java.awt.Stroke stroke63 = valueMarker58.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker65 = new org.jfree.chart.plot.ValueMarker((double) 100.0f, paint20, stroke38, paint56, stroke63, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 0.8f + "'", float51 == 0.8f);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(stroke59);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(stroke63);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        valueMarker1.setAlpha((float) 1L);
        java.awt.Font font22 = valueMarker1.getLabelFont();
        java.awt.Font font23 = valueMarker1.getLabelFont();
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(textAnchor24);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.lang.String str17 = valueMarker13.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getPaint();
        valueMarker13.setLabelPaint(paint22);
        java.lang.String str24 = valueMarker13.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker13.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets25);
        valueMarker1.setValue(0.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(rectangleInsets25);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        double double5 = valueMarker1.getValue();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Stroke stroke8 = valueMarker1.getStroke();
        valueMarker1.setAlpha((float) 1L);
        java.awt.Font font11 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke12 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker11.addChangeListener(markerChangeListener14);
        double double16 = valueMarker11.getValue();
        java.awt.Paint paint17 = valueMarker11.getOutlinePaint();
        java.awt.Paint paint18 = valueMarker11.getLabelPaint();
        java.awt.Paint paint19 = valueMarker11.getPaint();
        valueMarker1.setLabelPaint(paint19);
        java.awt.Paint paint21 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint22 = valueMarker1.getLabelPaint();
        java.awt.Paint paint23 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint24 = null;
        valueMarker1.setOutlinePaint(paint24);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        valueMarker1.setAlpha((float) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker1.getLabelOffset();
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(textAnchor12);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Paint paint8 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint10 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        valueMarker1.setValue((double) 10L);
        java.awt.Paint paint13 = null;
        valueMarker1.setOutlinePaint(paint13);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        java.awt.Paint paint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker10.setLabelPaint(paint16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
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
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        java.lang.Object obj18 = valueMarker1.clone();
        float float19 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        double double9 = valueMarker1.getValue();
        java.awt.Paint paint10 = valueMarker1.getPaint();
        java.awt.Paint paint11 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelPaint(paint11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint6 = valueMarker5.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        valueMarker5.notifyListeners(markerChangeEvent7);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker5.removeChangeListener(markerChangeListener9);
        java.lang.Class<?> wildcardClass11 = valueMarker5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray12 = valueMarker1.getListeners((java.lang.Class) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        java.awt.Stroke stroke11 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        float float16 = valueMarker13.getAlpha();
        java.lang.String str17 = valueMarker13.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke20 = valueMarker19.getStroke();
        valueMarker13.setStroke(stroke20);
        valueMarker1.setOutlineStroke(stroke20);
        valueMarker1.setLabel("");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker3.setLabelPaint(paint10);
        java.awt.Stroke stroke12 = valueMarker3.getStroke();
        java.awt.Paint paint13 = valueMarker3.getLabelPaint();
        valueMarker1.setLabelPaint(paint13);
        java.awt.Stroke stroke15 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        valueMarker3.setLabel("hi!");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker3.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker3.getLabelOffsetType();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        valueMarker1.notifyListeners(markerChangeEvent7);
        double double9 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        valueMarker11.setStroke(stroke17);
        java.awt.Font font19 = valueMarker11.getLabelFont();
        valueMarker1.setLabelFont(font19);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(font19);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker(1.0d);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = valueMarker3.getLabelOffset();
        valueMarker3.setAlpha((float) 1);
        java.awt.Stroke stroke7 = valueMarker3.getStroke();
        valueMarker1.setOutlineStroke(stroke7);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.addChangeListener(markerChangeListener5);
        float float7 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.lang.String str5 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke10 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.lang.String str17 = valueMarker13.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker13.notifyListeners(markerChangeEvent18);
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        java.awt.Paint paint24 = valueMarker21.getPaint();
        java.lang.String str25 = valueMarker21.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        java.awt.Paint paint30 = valueMarker27.getPaint();
        valueMarker21.setLabelPaint(paint30);
        valueMarker13.setOutlinePaint(paint30);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = valueMarker13.getLabelOffset();
        valueMarker13.setLabel("hi!");
        java.awt.Paint paint36 = valueMarker13.getPaint();
        valueMarker1.setOutlinePaint(paint36);
        java.awt.Paint paint38 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener39 = null;
        valueMarker1.removeChangeListener(markerChangeListener39);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint38);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getPaint();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint10 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        valueMarker1.notifyListeners(markerChangeEvent11);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        valueMarker1.setLabelPaint(paint10);
        java.lang.String str12 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = valueMarker1.getLabelOffset();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.removeChangeListener(markerChangeListener14);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        java.awt.Paint paint14 = valueMarker11.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker18.notifyListeners(markerChangeEvent21);
        valueMarker18.setValue((double) 0.8f);
        boolean boolean25 = valueMarker16.equals((java.lang.Object) valueMarker18);
        java.awt.Stroke stroke26 = valueMarker18.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint14, stroke26);
        valueMarker1.setOutlinePaint(paint14);
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = valueMarker30.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker30.getLabelAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = valueMarker30.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets33);
        java.lang.Object obj35 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(rectangleAnchor32);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getPaint();
        java.lang.String str12 = valueMarker8.getLabel();
        double double13 = valueMarker8.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker8.getLabelOffsetType();
        java.awt.Paint paint15 = valueMarker8.getLabelPaint();
        valueMarker1.setPaint(paint15);
        java.awt.Paint paint17 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker1.addChangeListener(markerChangeListener18);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getOutlinePaint();
        valueMarker13.setLabelPaint(paint22);
        float float24 = valueMarker13.getAlpha();
        valueMarker13.setLabel("");
        valueMarker13.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker13.getLabelTextAnchor();
        java.awt.Paint paint30 = valueMarker13.getOutlinePaint();
        valueMarker1.setLabelPaint(paint30);
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor34 = valueMarker33.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        valueMarker33.notifyListeners(markerChangeEvent35);
        java.awt.Paint paint37 = valueMarker33.getPaint();
        valueMarker1.setLabelPaint(paint37);
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(rectangleAnchor34);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(rectangleInsets39);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        java.awt.Stroke stroke32 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke33 = valueMarker1.getStroke();
        float float34 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.8f + "'", float34 == 0.8f);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker1.addChangeListener(markerChangeListener22);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker1.removeChangeListener(markerChangeListener24);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(rectangleInsets26);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getPaint();
        java.awt.Stroke stroke10 = valueMarker6.getOutlineStroke();
        java.awt.Font font11 = valueMarker6.getLabelFont();
        valueMarker1.setLabelFont(font11);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker1.getLabelAnchor();
        double double15 = valueMarker1.getValue();
        java.awt.Font font16 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke17 = valueMarker1.getStroke();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setAlpha((float) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Paint paint13 = valueMarker10.getPaint();
        java.lang.String str14 = valueMarker10.getLabel();
        boolean boolean15 = valueMarker1.equals((java.lang.Object) valueMarker10);
        double double16 = valueMarker10.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker10.getLabelAnchor();
        java.lang.String str18 = valueMarker10.getLabel();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        java.awt.Stroke stroke32 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke33 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker1.addChangeListener(markerChangeListener34);
        java.lang.Object obj36 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint8 = valueMarker7.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker7.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor9);
        java.awt.Paint paint11 = valueMarker1.getPaint();
        java.awt.Paint paint12 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        java.awt.Stroke stroke15 = valueMarker14.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke15);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker1.getLabelOffsetType();
        valueMarker1.setAlpha((float) 0L);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getOutlinePaint();
        java.lang.String str9 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        java.awt.Paint paint14 = valueMarker11.getOutlinePaint();
        java.awt.Stroke stroke15 = valueMarker11.getStroke();
        valueMarker1.setOutlineStroke(stroke15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        java.lang.Object obj15 = valueMarker1.clone();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.addChangeListener(markerChangeListener5);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getPaint();
        valueMarker1.setOutlinePaint(paint11);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Font font11 = valueMarker8.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker8.addChangeListener(markerChangeListener12);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker8.getLabelAnchor();
        java.awt.Stroke stroke15 = valueMarker8.getStroke();
        float float16 = valueMarker8.getAlpha();
        java.awt.Stroke stroke17 = valueMarker8.getStroke();
        valueMarker1.setStroke(stroke17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        valueMarker1.setAlpha(0.0f);
        java.awt.Paint paint13 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        java.awt.Paint paint16 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        double double23 = valueMarker1.getValue();
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor24);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker2.removeChangeListener(markerChangeListener6);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker2.addChangeListener(markerChangeListener8);
        java.awt.Paint paint10 = valueMarker2.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker2.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker2.removeChangeListener(markerChangeListener12);
        java.awt.Paint paint14 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke17 = valueMarker16.getStroke();
        java.awt.Paint paint18 = valueMarker16.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke21 = valueMarker20.getStroke();
        valueMarker16.setStroke(stroke21);
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1, paint14, stroke21);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker23.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker23.notifyListeners(markerChangeEvent25);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker23.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = valueMarker23.getLabelOffset();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
        org.junit.Assert.assertNotNull(rectangleInsets28);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker1.getLabelTextAnchor();
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
        java.awt.Stroke stroke32 = valueMarker31.getOutlineStroke();
        valueMarker1.setStroke(stroke32);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker1.removeChangeListener(markerChangeListener34);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(stroke32);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getOutlinePaint();
        valueMarker13.setLabelPaint(paint22);
        float float24 = valueMarker13.getAlpha();
        valueMarker13.setLabel("");
        valueMarker13.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker13.getLabelTextAnchor();
        java.awt.Paint paint30 = valueMarker13.getOutlinePaint();
        valueMarker1.setLabelPaint(paint30);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker1.removeChangeListener(markerChangeListener32);
        java.awt.Stroke stroke34 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor35 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        valueMarker1.notifyListeners(markerChangeEvent36);
        java.awt.Paint paint38 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener39 = null;
        valueMarker1.addChangeListener(markerChangeListener39);
        java.lang.Object obj41 = valueMarker1.clone();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(textAnchor35);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.lang.String str11 = valueMarker7.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = valueMarker7.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets13);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker1.getLabelOffsetType();
        valueMarker1.setAlpha((float) (byte) 1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getPaint();
        java.awt.Stroke stroke10 = valueMarker6.getOutlineStroke();
        java.awt.Font font11 = valueMarker6.getLabelFont();
        valueMarker1.setLabelFont(font11);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker1.getLabelAnchor();
        valueMarker1.setAlpha(1.0f);
        java.awt.Stroke stroke17 = valueMarker1.getStroke();
        java.awt.Paint paint18 = valueMarker1.getPaint();
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(textAnchor19);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getOutlinePaint();
        valueMarker13.setLabelPaint(paint22);
        float float24 = valueMarker13.getAlpha();
        valueMarker13.setLabel("");
        valueMarker13.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker13.getLabelTextAnchor();
        java.awt.Paint paint30 = valueMarker13.getOutlinePaint();
        valueMarker1.setLabelPaint(paint30);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker1.removeChangeListener(markerChangeListener32);
        java.awt.Paint paint34 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        java.awt.Paint paint20 = valueMarker1.getLabelPaint();
        java.awt.Font font21 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = valueMarker23.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker23.getLabelAnchor();
        boolean boolean26 = valueMarker1.equals((java.lang.Object) valueMarker23);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker1.removeChangeListener(markerChangeListener27);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(rectangleAnchor25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        java.awt.Paint paint15 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint16 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker18.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor19);
        java.awt.Stroke stroke21 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.removeChangeListener(markerChangeListener11);
        java.awt.Stroke stroke13 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint14 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker1.notifyListeners(markerChangeEvent15);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.addChangeListener(markerChangeListener17);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker1.addChangeListener(markerChangeListener19);
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        java.awt.Paint paint26 = valueMarker23.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker30.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent33 = null;
        valueMarker30.notifyListeners(markerChangeEvent33);
        valueMarker30.setValue((double) 0.8f);
        boolean boolean37 = valueMarker28.equals((java.lang.Object) valueMarker30);
        java.awt.Stroke stroke38 = valueMarker30.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint26, stroke38);
        java.awt.Stroke stroke40 = valueMarker39.getOutlineStroke();
        valueMarker1.setStroke(stroke40);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(stroke40);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        valueMarker1.setValue((double) (byte) -1);
        org.junit.Assert.assertNotNull(paint2);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.addChangeListener(markerChangeListener5);
        double double7 = valueMarker2.getValue();
        java.awt.Paint paint8 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint9 = valueMarker2.getLabelPaint();
        java.awt.Paint paint10 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker12.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker12.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker12.addChangeListener(markerChangeListener17);
        float float19 = valueMarker12.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        float float24 = valueMarker21.getAlpha();
        java.lang.String str25 = valueMarker21.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker21.removeChangeListener(markerChangeListener26);
        valueMarker21.setAlpha((float) 1L);
        java.lang.String str30 = valueMarker21.getLabel();
        java.awt.Stroke stroke31 = valueMarker21.getStroke();
        valueMarker12.setStroke(stroke31);
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setLabel("");
        java.awt.Paint paint37 = valueMarker34.getPaint();
        java.awt.Stroke stroke38 = valueMarker34.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker40.setLabel("");
        java.awt.Paint paint43 = valueMarker40.getOutlinePaint();
        valueMarker34.setLabelPaint(paint43);
        float float45 = valueMarker34.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener46 = null;
        valueMarker34.addChangeListener(markerChangeListener46);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType48 = valueMarker34.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker50 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker52.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent55 = null;
        valueMarker52.notifyListeners(markerChangeEvent55);
        valueMarker52.setValue((double) 0.8f);
        boolean boolean59 = valueMarker50.equals((java.lang.Object) valueMarker52);
        java.awt.Stroke stroke60 = valueMarker52.getStroke();
        valueMarker34.setStroke(stroke60);
        java.awt.Stroke stroke62 = valueMarker34.getOutlineStroke();
        float float63 = valueMarker34.getAlpha();
        java.awt.Paint paint64 = valueMarker34.getOutlinePaint();
        java.lang.String str65 = valueMarker34.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent66 = null;
        valueMarker34.notifyListeners(markerChangeEvent66);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener68 = null;
        valueMarker34.removeChangeListener(markerChangeListener68);
        java.awt.Paint paint70 = valueMarker34.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker72 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker72.setLabel("");
        java.awt.Paint paint75 = valueMarker72.getPaint();
        java.awt.Stroke stroke76 = valueMarker72.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker78 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker78.setLabel("");
        java.awt.Paint paint81 = valueMarker78.getOutlinePaint();
        valueMarker72.setLabelPaint(paint81);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor83 = valueMarker72.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener84 = null;
        valueMarker72.addChangeListener(markerChangeListener84);
        org.jfree.chart.text.TextAnchor textAnchor86 = valueMarker72.getLabelTextAnchor();
        java.awt.Paint paint87 = valueMarker72.getOutlinePaint();
        java.awt.Stroke stroke88 = valueMarker72.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker90 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint10, stroke31, paint70, stroke88, (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.8f + "'", float45 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType48);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(stroke60);
        org.junit.Assert.assertNotNull(stroke62);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.8f + "'", float63 == 0.8f);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(paint70);
        org.junit.Assert.assertNotNull(paint75);
        org.junit.Assert.assertNotNull(stroke76);
        org.junit.Assert.assertNotNull(paint81);
        org.junit.Assert.assertNotNull(rectangleAnchor83);
        org.junit.Assert.assertNotNull(textAnchor86);
        org.junit.Assert.assertNotNull(paint87);
        org.junit.Assert.assertNotNull(stroke88);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.awt.Paint paint3 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        valueMarker1.setStroke(stroke11);
        java.lang.String str13 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker1.getLabelOffset();
        valueMarker1.setValue((double) 10L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke18 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint19 = valueMarker1.getLabelPaint();
        java.awt.Stroke stroke20 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.lang.Object obj2 = valueMarker1.clone();
        float float3 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.8f + "'", float3 == 0.8f);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.addChangeListener(markerChangeListener15);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = valueMarker1.getLabelOffset();
        java.awt.Paint paint18 = valueMarker1.getLabelPaint();
        java.awt.Font font19 = valueMarker1.getLabelFont();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(font19);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setAlpha((float) (short) 0);
        java.lang.Object obj9 = valueMarker1.clone();
        java.awt.Font font10 = valueMarker1.getLabelFont();
        double double11 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker13.addChangeListener(markerChangeListener16);
        double double18 = valueMarker13.getValue();
        java.awt.Paint paint19 = valueMarker13.getOutlinePaint();
        java.awt.Paint paint20 = valueMarker13.getLabelPaint();
        java.awt.Paint paint21 = valueMarker13.getPaint();
        valueMarker13.setLabel("hi!");
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
        valueMarker13.setLabelPaint(paint42);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener44 = null;
        valueMarker13.removeChangeListener(markerChangeListener44);
        java.lang.Class<?> wildcardClass46 = valueMarker13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray47 = valueMarker1.getListeners((java.lang.Class) wildcardClass46);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.8f + "'", float36 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.removeChangeListener(markerChangeListener4);
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker7.addChangeListener(markerChangeListener10);
        double double12 = valueMarker7.getValue();
        java.awt.Paint paint13 = valueMarker7.getLabelPaint();
        java.awt.Paint paint14 = valueMarker7.getPaint();
        java.awt.Stroke stroke15 = valueMarker7.getOutlineStroke();
        java.awt.Paint paint16 = valueMarker7.getLabelPaint();
        valueMarker1.setPaint(paint16);
        java.lang.Object obj18 = valueMarker1.clone();
        valueMarker1.setAlpha((float) 1L);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker1.removeChangeListener(markerChangeListener21);
        java.awt.Paint paint23 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.String str7 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint11 = valueMarker10.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint11, stroke17);
        float float19 = valueMarker18.getAlpha();
        java.awt.Stroke stroke20 = valueMarker18.getOutlineStroke();
        java.awt.Paint paint21 = valueMarker18.getLabelPaint();
        valueMarker1.setOutlinePaint(paint21);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        valueMarker1.setStroke(stroke11);
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.addChangeListener(markerChangeListener15);
        java.awt.Paint paint17 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        valueMarker1.notifyListeners(markerChangeEvent7);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        float float7 = valueMarker1.getAlpha();
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Paint paint13 = valueMarker10.getPaint();
        java.lang.String str14 = valueMarker10.getLabel();
        java.awt.Paint paint15 = valueMarker10.getLabelPaint();
        java.lang.Object obj16 = valueMarker10.clone();
        java.awt.Paint paint17 = valueMarker10.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker10.getLabelOffsetType();
        java.lang.Class<?> wildcardClass19 = valueMarker10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray20 = valueMarker1.getListeners((java.lang.Class) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.addChangeListener(markerChangeListener5);
        double double7 = valueMarker2.getValue();
        java.awt.Paint paint8 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint9 = valueMarker2.getLabelPaint();
        valueMarker2.setLabel("");
        java.awt.Stroke stroke12 = valueMarker2.getOutlineStroke();
        java.awt.Paint paint13 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker15.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker15.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker15.addChangeListener(markerChangeListener20);
        valueMarker15.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker15.getLabelTextAnchor();
        java.lang.String str25 = valueMarker15.getLabel();
        java.awt.Paint paint26 = valueMarker15.getOutlinePaint();
        valueMarker2.setOutlinePaint(paint26);
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker30.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setLabel("");
        java.awt.Paint paint37 = valueMarker34.getOutlinePaint();
        valueMarker30.setLabelPaint(paint37);
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke41 = valueMarker40.getStroke();
        java.awt.Paint paint42 = valueMarker40.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke45 = valueMarker44.getStroke();
        valueMarker40.setStroke(stroke45);
        org.jfree.chart.plot.ValueMarker valueMarker47 = new org.jfree.chart.plot.ValueMarker((double) 0.8f, paint37, stroke45);
        org.jfree.chart.plot.ValueMarker valueMarker50 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor51 = valueMarker50.getLabelAnchor();
        java.awt.Paint paint52 = valueMarker50.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker54 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker56 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker56.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent59 = null;
        valueMarker56.notifyListeners(markerChangeEvent59);
        valueMarker56.setValue((double) 0.8f);
        boolean boolean63 = valueMarker54.equals((java.lang.Object) valueMarker56);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor64 = valueMarker56.getLabelAnchor();
        java.awt.Stroke stroke65 = valueMarker56.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker66 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint52, stroke65);
        org.jfree.chart.plot.ValueMarker valueMarker68 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker68.setLabel("");
        java.awt.Paint paint71 = valueMarker68.getPaint();
        java.awt.Stroke stroke72 = valueMarker68.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker74 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker74.setLabel("");
        java.awt.Paint paint77 = valueMarker74.getOutlinePaint();
        valueMarker68.setLabelPaint(paint77);
        float float79 = valueMarker68.getAlpha();
        valueMarker68.setLabel("");
        java.awt.Paint paint82 = valueMarker68.getOutlinePaint();
        java.awt.Paint paint83 = valueMarker68.getOutlinePaint();
        java.awt.Stroke stroke84 = valueMarker68.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker86 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint26, stroke45, paint52, stroke84, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(textAnchor24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(rectangleAnchor51);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor64);
        org.junit.Assert.assertNotNull(stroke65);
        org.junit.Assert.assertNotNull(paint71);
        org.junit.Assert.assertNotNull(stroke72);
        org.junit.Assert.assertNotNull(paint77);
        org.junit.Assert.assertTrue("'" + float79 + "' != '" + 0.8f + "'", float79 == 0.8f);
        org.junit.Assert.assertNotNull(paint82);
        org.junit.Assert.assertNotNull(paint83);
        org.junit.Assert.assertNotNull(stroke84);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        java.awt.Font font6 = valueMarker1.getLabelFont();
        valueMarker1.setAlpha(0.0f);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.removeChangeListener(markerChangeListener9);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(font6);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getOutlinePaint();
        valueMarker13.setLabelPaint(paint22);
        float float24 = valueMarker13.getAlpha();
        valueMarker13.setLabel("");
        valueMarker13.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker13.getLabelTextAnchor();
        java.awt.Paint paint30 = valueMarker13.getOutlinePaint();
        valueMarker1.setLabelPaint(paint30);
        java.lang.String str32 = valueMarker1.getLabel();
        java.awt.Stroke stroke33 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = valueMarker1.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor35 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertNotNull(textAnchor35);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        valueMarker1.setValue((double) 1.0f);
        java.awt.Paint paint10 = valueMarker1.getPaint();
        valueMarker1.setValue(0.0d);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Paint paint12 = valueMarker11.getPaint();
        valueMarker1.setPaint(paint12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker1.notifyListeners(markerChangeEvent14);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getOutlinePaint();
        valueMarker7.setLabelPaint(paint16);
        float float18 = valueMarker7.getAlpha();
        valueMarker7.setLabel("");
        valueMarker7.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker7.getLabelTextAnchor();
        java.awt.Paint paint24 = valueMarker7.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker7.getLabelOffsetType();
        java.awt.Paint paint26 = valueMarker7.getOutlinePaint();
        valueMarker1.setPaint(paint26);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker30.getLabelAnchor();
        valueMarker30.setLabel("");
        java.awt.Paint paint34 = valueMarker30.getOutlinePaint();
        boolean boolean35 = valueMarker1.equals((java.lang.Object) valueMarker30);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertNotNull(rectangleAnchor31);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.addChangeListener(markerChangeListener15);
        valueMarker1.setValue((double) '#');
        boolean boolean20 = valueMarker1.equals((java.lang.Object) ' ');
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker1.addChangeListener(markerChangeListener21);
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.removeChangeListener(markerChangeListener10);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 'a');
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        java.awt.Paint paint14 = valueMarker11.getOutlinePaint();
        valueMarker5.setLabelPaint(paint14);
        float float16 = valueMarker5.getAlpha();
        valueMarker5.setLabel("");
        valueMarker5.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker5.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor21);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        valueMarker1.notifyListeners(markerChangeEvent23);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor21);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker3.setLabelPaint(paint10);
        java.awt.Stroke stroke12 = valueMarker3.getStroke();
        java.awt.Paint paint13 = valueMarker3.getLabelPaint();
        valueMarker1.setLabelPaint(paint13);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getOutlinePaint();
        valueMarker7.setLabelPaint(paint16);
        float float18 = valueMarker7.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker7.addChangeListener(markerChangeListener19);
        java.awt.Stroke stroke21 = valueMarker7.getOutlineStroke();
        valueMarker5.setOutlineStroke(stroke21);
        java.awt.Stroke stroke23 = valueMarker5.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker5.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor24);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker1.addChangeListener(markerChangeListener26);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        valueMarker1.notifyListeners(markerChangeEvent28);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(textAnchor24);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        java.awt.Stroke stroke4 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.awt.Stroke stroke6 = valueMarker2.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getOutlinePaint();
        valueMarker2.setLabelPaint(paint11);
        float float13 = valueMarker2.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker2.addChangeListener(markerChangeListener14);
        java.awt.Stroke stroke16 = valueMarker2.getOutlineStroke();
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker2.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker2.removeChangeListener(markerChangeListener18);
        java.awt.Paint paint20 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker22.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        valueMarker22.notifyListeners(markerChangeEvent24);
        float float26 = valueMarker22.getAlpha();
        java.awt.Stroke stroke27 = valueMarker22.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 1, paint20, stroke27);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(stroke27);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        java.lang.String str12 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        java.awt.Stroke stroke3 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker13.notifyListeners(markerChangeEvent16);
        valueMarker13.setValue((double) 0.8f);
        boolean boolean20 = valueMarker11.equals((java.lang.Object) valueMarker13);
        java.awt.Stroke stroke21 = valueMarker13.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint9, stroke21);
        valueMarker1.setOutlineStroke(stroke21);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(rectangleInsets26);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        valueMarker1.setStroke(stroke11);
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        valueMarker1.setValue((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker17.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor18);
        valueMarker1.setLabel("hi!");
        java.lang.Object obj22 = valueMarker1.clone();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        java.awt.Paint paint14 = valueMarker11.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker18.notifyListeners(markerChangeEvent21);
        valueMarker18.setValue((double) 0.8f);
        boolean boolean25 = valueMarker16.equals((java.lang.Object) valueMarker18);
        java.awt.Stroke stroke26 = valueMarker18.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint14, stroke26);
        valueMarker1.setOutlinePaint(paint14);
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = valueMarker30.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker30.getLabelAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = valueMarker30.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets33);
        java.awt.Paint paint35 = valueMarker1.getPaint();
        java.lang.Object obj36 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(rectangleAnchor32);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        java.awt.Stroke stroke7 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint10 = valueMarker9.getLabelPaint();
        valueMarker1.setOutlinePaint(paint10);
        java.lang.String str12 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.addChangeListener(markerChangeListener14);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker6.addChangeListener(markerChangeListener9);
        double double11 = valueMarker6.getValue();
        java.awt.Paint paint12 = valueMarker6.getOutlinePaint();
        java.awt.Paint paint13 = valueMarker6.getLabelPaint();
        valueMarker6.setLabel("");
        java.awt.Stroke stroke16 = valueMarker6.getStroke();
        valueMarker1.setStroke(stroke16);
        java.awt.Stroke stroke18 = null;
        valueMarker1.setOutlineStroke(stroke18);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        java.lang.Object obj10 = null;
        boolean boolean11 = valueMarker1.equals(obj10);
        java.awt.Paint paint12 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getPaint();
        java.awt.Stroke stroke18 = valueMarker14.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        java.awt.Paint paint23 = valueMarker20.getOutlinePaint();
        valueMarker14.setLabelPaint(paint23);
        float float25 = valueMarker14.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker14.addChangeListener(markerChangeListener26);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker14.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker32.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        valueMarker32.notifyListeners(markerChangeEvent35);
        valueMarker32.setValue((double) 0.8f);
        boolean boolean39 = valueMarker30.equals((java.lang.Object) valueMarker32);
        java.awt.Stroke stroke40 = valueMarker32.getStroke();
        valueMarker14.setStroke(stroke40);
        java.awt.Stroke stroke42 = valueMarker14.getOutlineStroke();
        float float43 = valueMarker14.getAlpha();
        java.awt.Paint paint44 = valueMarker14.getOutlinePaint();
        java.lang.String str45 = valueMarker14.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType46 = valueMarker14.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType46);
        valueMarker1.setValue((double) '4');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.8f + "'", float43 == 0.8f);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType46);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        float float7 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        java.lang.String str10 = valueMarker1.getLabel();
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.addChangeListener(markerChangeListener5);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker8.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker8.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker8.addChangeListener(markerChangeListener13);
        float float15 = valueMarker8.getAlpha();
        java.awt.Paint paint16 = valueMarker8.getPaint();
        valueMarker2.setOutlinePaint(paint16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke20 = valueMarker19.getStroke();
        java.lang.Object obj21 = valueMarker19.clone();
        valueMarker19.setValue((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker19.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = valueMarker26.getLabelOffset();
        java.awt.Stroke stroke28 = valueMarker26.getOutlineStroke();
        valueMarker19.setStroke(stroke28);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = valueMarker19.getLabelOffset();
        java.awt.Stroke stroke31 = valueMarker19.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker33.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        valueMarker33.notifyListeners(markerChangeEvent36);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent38 = null;
        valueMarker33.notifyListeners(markerChangeEvent38);
        java.awt.Stroke stroke40 = valueMarker33.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker42.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener45 = null;
        valueMarker42.addChangeListener(markerChangeListener45);
        double double47 = valueMarker42.getValue();
        java.awt.Paint paint48 = valueMarker42.getLabelPaint();
        valueMarker33.setLabelPaint(paint48);
        org.jfree.chart.plot.ValueMarker valueMarker51 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker51.setLabel("");
        java.awt.Paint paint54 = valueMarker51.getPaint();
        java.awt.Stroke stroke55 = valueMarker51.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker57 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker57.setLabel("");
        java.awt.Paint paint60 = valueMarker57.getOutlinePaint();
        valueMarker51.setLabelPaint(paint60);
        float float62 = valueMarker51.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener63 = null;
        valueMarker51.addChangeListener(markerChangeListener63);
        java.awt.Stroke stroke65 = valueMarker51.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker67 = new org.jfree.chart.plot.ValueMarker((double) 0.8f, paint16, stroke31, paint48, stroke65, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8f + "'", float15 == 0.8f);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNotNull(stroke55);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 0.8f + "'", float62 == 0.8f);
        org.junit.Assert.assertNotNull(stroke65);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker1.removeChangeListener(markerChangeListener22);
        double double24 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.addChangeListener(markerChangeListener12);
        valueMarker1.setValue((double) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        java.awt.Stroke stroke11 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getOutlinePaint();
        valueMarker13.setLabelPaint(paint22);
        float float24 = valueMarker13.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker13.addChangeListener(markerChangeListener25);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker13.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker31.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        valueMarker31.notifyListeners(markerChangeEvent34);
        valueMarker31.setValue((double) 0.8f);
        boolean boolean38 = valueMarker29.equals((java.lang.Object) valueMarker31);
        java.awt.Stroke stroke39 = valueMarker31.getStroke();
        valueMarker13.setStroke(stroke39);
        java.awt.Stroke stroke41 = valueMarker13.getOutlineStroke();
        float float42 = valueMarker13.getAlpha();
        java.awt.Paint paint43 = valueMarker13.getOutlinePaint();
        java.lang.String str44 = valueMarker13.getLabel();
        java.awt.Stroke stroke45 = valueMarker13.getStroke();
        valueMarker1.setStroke(stroke45);
        java.awt.Font font47 = valueMarker1.getLabelFont();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.8f + "'", float42 == 0.8f);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(font47);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType23 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(lengthAdjustmentType23);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setAlpha((float) (short) 0);
        java.lang.Object obj9 = valueMarker1.clone();
        java.awt.Font font10 = valueMarker1.getLabelFont();
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        double double3 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        valueMarker1.setStroke(stroke11);
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        valueMarker1.setValue((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker17.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor18);
        java.awt.Stroke stroke20 = valueMarker1.getStroke();
        double double21 = valueMarker1.getValue();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint6 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint7 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        float float12 = valueMarker9.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getPaint();
        java.awt.Stroke stroke18 = valueMarker14.getOutlineStroke();
        java.awt.Font font19 = valueMarker14.getLabelFont();
        valueMarker9.setLabelFont(font19);
        double double21 = valueMarker9.getValue();
        java.awt.Stroke stroke22 = valueMarker9.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        java.awt.Paint paint31 = valueMarker28.getOutlinePaint();
        valueMarker24.setLabelPaint(paint31);
        java.awt.Paint paint33 = valueMarker24.getPaint();
        java.awt.Paint paint34 = valueMarker24.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker36.setLabel("");
        java.awt.Paint paint39 = valueMarker36.getPaint();
        java.lang.String str40 = valueMarker36.getLabel();
        double double41 = valueMarker36.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker43.setLabel("");
        float float46 = valueMarker43.getAlpha();
        java.awt.Stroke stroke47 = valueMarker43.getOutlineStroke();
        boolean boolean48 = valueMarker36.equals((java.lang.Object) valueMarker43);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener49 = null;
        valueMarker36.removeChangeListener(markerChangeListener49);
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker54 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker54.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent57 = null;
        valueMarker54.notifyListeners(markerChangeEvent57);
        valueMarker54.setValue((double) 0.8f);
        boolean boolean61 = valueMarker52.equals((java.lang.Object) valueMarker54);
        java.awt.Stroke stroke62 = valueMarker54.getStroke();
        valueMarker36.setOutlineStroke(stroke62);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker65 = new org.jfree.chart.plot.ValueMarker((double) (byte) 0, paint7, stroke22, paint34, stroke62, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.8f + "'", float46 == 0.8f);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(stroke62);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker1.getLabelOffset();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker1.notifyListeners(markerChangeEvent15);
        java.awt.Stroke stroke17 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor9);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font2 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke3 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke4 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.addChangeListener(markerChangeListener5);
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(textAnchor7);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke18 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint19 = valueMarker1.getLabelPaint();
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(textAnchor20);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str8 = valueMarker7.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker7.addChangeListener(markerChangeListener9);
        java.awt.Font font11 = valueMarker7.getLabelFont();
        valueMarker1.setLabelFont(font11);
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker15.addChangeListener(markerChangeListener18);
        double double20 = valueMarker15.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker15.getLabelAnchor();
        valueMarker15.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = valueMarker15.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets24);
        float float26 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker32.setLabel("");
        java.awt.Paint paint35 = valueMarker32.getOutlinePaint();
        valueMarker28.setLabelPaint(paint35);
        java.awt.Font font37 = valueMarker28.getLabelFont();
        java.lang.Class<?> wildcardClass38 = font37.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray39 = valueMarker1.getListeners((java.lang.Class) wildcardClass38);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Font; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(font37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint10 = valueMarker9.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker9.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getPaint();
        java.awt.Stroke stroke18 = valueMarker14.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        java.awt.Paint paint23 = valueMarker20.getOutlinePaint();
        valueMarker14.setLabelPaint(paint23);
        float float25 = valueMarker14.getAlpha();
        valueMarker14.setValue((double) (byte) 0);
        java.awt.Font font28 = valueMarker14.getLabelFont();
        valueMarker1.setLabelFont(font28);
        java.awt.Paint paint30 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker1.removeChangeListener(markerChangeListener32);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(rectangleAnchor31);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        java.awt.Font font31 = valueMarker1.getLabelFont();
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker1.removeChangeListener(markerChangeListener34);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(font31);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        java.awt.Font font11 = valueMarker10.getLabelFont();
        java.lang.String str12 = valueMarker10.getLabel();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker10.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker1.removeChangeListener(markerChangeListener23);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 100);
        valueMarker26.setValue((double) (-1L));
        boolean boolean29 = valueMarker1.equals((java.lang.Object) valueMarker26);
        valueMarker1.setValue((double) (short) 10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.removeChangeListener(markerChangeListener3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker1.getLabelOffset();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(font22);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.addChangeListener(markerChangeListener15);
        java.awt.Paint paint17 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        java.awt.Paint paint31 = valueMarker1.getOutlinePaint();
        java.lang.String str32 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent33 = null;
        valueMarker1.notifyListeners(markerChangeEvent33);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker1.removeChangeListener(markerChangeListener35);
        java.awt.Paint paint37 = valueMarker1.getLabelPaint();
        java.lang.String str38 = valueMarker1.getLabel();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        float float11 = valueMarker10.getAlpha();
        java.awt.Stroke stroke12 = valueMarker10.getOutlineStroke();
        java.awt.Paint paint13 = valueMarker10.getLabelPaint();
        java.awt.Paint paint14 = valueMarker10.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.lang.String str13 = valueMarker9.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker9.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker9.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets15);
        java.awt.Paint paint17 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        double double25 = valueMarker1.getValue();
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        java.awt.Paint paint1 = null;
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        java.awt.Paint paint7 = valueMarker4.getPaint();
        java.lang.String str8 = valueMarker4.getLabel();
        java.awt.Paint paint9 = valueMarker4.getLabelPaint();
        java.awt.Paint paint10 = valueMarker4.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker12.addChangeListener(markerChangeListener15);
        double double17 = valueMarker12.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker12.getLabelAnchor();
        valueMarker12.setLabel("hi!");
        java.awt.Stroke stroke21 = valueMarker12.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (short) 0, paint10, stroke21);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        float float27 = valueMarker24.getAlpha();
        java.lang.String str28 = valueMarker24.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker30.setLabel("");
        java.awt.Paint paint33 = valueMarker30.getPaint();
        java.awt.Stroke stroke34 = valueMarker30.getOutlineStroke();
        valueMarker24.setStroke(stroke34);
        float float36 = valueMarker24.getAlpha();
        float float37 = valueMarker24.getAlpha();
        java.awt.Paint paint38 = valueMarker24.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker40.setLabel("");
        java.awt.Paint paint43 = valueMarker40.getPaint();
        java.awt.Stroke stroke44 = valueMarker40.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker46 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker46.setLabel("");
        java.awt.Paint paint49 = valueMarker46.getOutlinePaint();
        valueMarker40.setLabelPaint(paint49);
        float float51 = valueMarker40.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener52 = null;
        valueMarker40.addChangeListener(markerChangeListener52);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType54 = valueMarker40.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker56 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker58 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker58.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent61 = null;
        valueMarker58.notifyListeners(markerChangeEvent61);
        valueMarker58.setValue((double) 0.8f);
        boolean boolean65 = valueMarker56.equals((java.lang.Object) valueMarker58);
        java.awt.Stroke stroke66 = valueMarker58.getStroke();
        valueMarker40.setStroke(stroke66);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker69 = new org.jfree.chart.plot.ValueMarker(0.800000011920929d, paint1, stroke21, paint38, stroke66, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.8f + "'", float27 == 0.8f);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.8f + "'", float36 == 0.8f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.8f + "'", float37 == 0.8f);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 0.8f + "'", float51 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType54);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(stroke66);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        valueMarker1.notifyListeners(markerChangeEvent22);
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
        org.junit.Assert.assertNotNull(rectangleAnchor21);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 1);
        valueMarker7.setValue((double) '#');
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker7.removeChangeListener(markerChangeListener10);
        boolean boolean12 = valueMarker1.equals((java.lang.Object) markerChangeListener10);
        double double13 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Paint paint9 = valueMarker5.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str12 = valueMarker11.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker11.addChangeListener(markerChangeListener13);
        java.awt.Font font15 = valueMarker11.getLabelFont();
        valueMarker5.setLabelFont(font15);
        java.awt.Stroke stroke17 = valueMarker5.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker19.addChangeListener(markerChangeListener22);
        double double24 = valueMarker19.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker19.getLabelAnchor();
        valueMarker19.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = valueMarker19.getLabelOffset();
        valueMarker5.setLabelOffset(rectangleInsets28);
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker31.setLabel("");
        float float34 = valueMarker31.getAlpha();
        java.lang.String str35 = valueMarker31.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener36 = null;
        valueMarker31.removeChangeListener(markerChangeListener36);
        valueMarker31.setAlpha((float) 1L);
        java.lang.String str40 = valueMarker31.getLabel();
        java.awt.Stroke stroke41 = valueMarker31.getStroke();
        valueMarker5.setStroke(stroke41);
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) (short) 10, paint3, stroke41);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent44 = null;
        valueMarker43.notifyListeners(markerChangeEvent44);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor25);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.8f + "'", float34 == 0.8f);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(stroke41);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker12.addChangeListener(markerChangeListener15);
        double double17 = valueMarker12.getValue();
        java.awt.Paint paint18 = valueMarker12.getLabelPaint();
        java.awt.Paint paint19 = valueMarker12.getOutlinePaint();
        java.awt.Stroke stroke20 = valueMarker12.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Paint paint23 = valueMarker22.getPaint();
        valueMarker12.setPaint(paint23);
        valueMarker1.setOutlinePaint(paint23);
        float float26 = valueMarker1.getAlpha();
        java.awt.Font font27 = valueMarker1.getLabelFont();
        valueMarker1.setValue((double) (-1));
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(font27);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker3.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker3.addChangeListener(markerChangeListener12);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker15.addChangeListener(markerChangeListener18);
        double double20 = valueMarker15.getValue();
        java.awt.Paint paint21 = valueMarker15.getOutlinePaint();
        java.awt.Paint paint22 = valueMarker15.getLabelPaint();
        valueMarker15.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker15.notifyListeners(markerChangeEvent25);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        valueMarker15.notifyListeners(markerChangeEvent27);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker15.getLabelAnchor();
        valueMarker3.setLabelAnchor(rectangleAnchor29);
        valueMarker3.setValue((double) '#');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleAnchor29);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        valueMarker1.setValue((double) 100.0f);
        double double9 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Stroke stroke8 = valueMarker1.getStroke();
        valueMarker1.setAlpha((float) 1L);
        double double11 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        double double12 = valueMarker1.getValue();
        valueMarker1.setValue(0.800000011920929d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        java.awt.Stroke stroke32 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke33 = valueMarker1.getStroke();
        java.awt.Stroke stroke34 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(stroke34);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        java.awt.Paint paint7 = valueMarker1.getPaint();
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint14 = valueMarker13.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        java.awt.Paint paint19 = valueMarker16.getPaint();
        java.awt.Stroke stroke20 = valueMarker16.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint14, stroke20);
        valueMarker1.setOutlinePaint(paint14);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker1.removeChangeListener(markerChangeListener23);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker1.removeChangeListener(markerChangeListener25);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        valueMarker1.setAlpha(0.0f);
        java.awt.Paint paint13 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        java.awt.Paint paint19 = valueMarker16.getOutlinePaint();
        java.awt.Stroke stroke20 = valueMarker16.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker22.getLabelOffset();
        valueMarker16.setLabelOffset(rectangleInsets23);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker16.getLabelAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = valueMarker16.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets26);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(rectangleAnchor25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10.0f);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.awt.Stroke stroke7 = valueMarker3.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getOutlinePaint();
        valueMarker3.setLabelPaint(paint12);
        float float14 = valueMarker3.getAlpha();
        valueMarker3.setLabel("");
        valueMarker3.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker3.getLabelTextAnchor();
        java.awt.Paint paint20 = valueMarker3.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType21 = valueMarker3.getLabelOffsetType();
        java.awt.Paint paint22 = valueMarker3.getOutlinePaint();
        valueMarker3.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker3.addChangeListener(markerChangeListener25);
        java.awt.Stroke stroke27 = valueMarker3.getOutlineStroke();
        valueMarker1.setStroke(stroke27);
        java.awt.Paint paint29 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        java.awt.Stroke stroke32 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke33 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(rectangleInsets34);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
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
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) ' ');
        java.awt.Paint paint16 = valueMarker15.getPaint();
        valueMarker10.setOutlinePaint(paint16);
        java.awt.Paint paint18 = valueMarker10.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        valueMarker1.setLabel("hi!");
        java.lang.String str33 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setValue(0.0d);
        java.awt.Stroke stroke10 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        java.lang.Object obj40 = valueMarker1.clone();
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
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker8.notifyListeners(markerChangeEvent15);
        java.awt.Paint paint17 = valueMarker8.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker8.setLabelOffsetType(lengthAdjustmentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'adj' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getPaint();
        java.awt.Stroke stroke16 = valueMarker12.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        java.awt.Paint paint21 = valueMarker18.getOutlinePaint();
        valueMarker12.setLabelPaint(paint21);
        float float23 = valueMarker12.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker12.addChangeListener(markerChangeListener24);
        java.awt.Stroke stroke26 = valueMarker12.getOutlineStroke();
        valueMarker10.setOutlineStroke(stroke26);
        java.awt.Stroke stroke28 = valueMarker10.getStroke();
        valueMarker1.setOutlineStroke(stroke28);
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) ' ');
        java.awt.Paint paint32 = valueMarker31.getPaint();
        java.awt.Paint paint33 = valueMarker31.getLabelPaint();
        valueMarker1.setOutlinePaint(paint33);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        java.lang.String str11 = valueMarker1.getLabel();
        java.awt.Font font12 = valueMarker1.getLabelFont();
        double double13 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 1);
        java.awt.Stroke stroke16 = valueMarker15.getOutlineStroke();
        valueMarker1.setStroke(stroke16);
        java.lang.Object obj18 = valueMarker1.clone();
        java.awt.Stroke stroke19 = valueMarker1.getStroke();
        java.awt.Paint paint20 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        java.awt.Paint paint1 = null;
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.lang.Object obj7 = valueMarker3.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker3.getLabelOffsetType();
        valueMarker3.setValue((double) 0);
        valueMarker3.setLabel("hi!");
        java.awt.Stroke stroke13 = valueMarker3.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker15.addChangeListener(markerChangeListener18);
        double double20 = valueMarker15.getValue();
        java.awt.Paint paint21 = valueMarker15.getOutlinePaint();
        java.awt.Paint paint22 = valueMarker15.getLabelPaint();
        valueMarker15.setLabel("");
        valueMarker15.setAlpha(0.0f);
        java.awt.Paint paint27 = valueMarker15.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker15.getLabelOffsetType();
        java.awt.Paint paint29 = valueMarker15.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker31.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker31.addChangeListener(markerChangeListener34);
        double double36 = valueMarker31.getValue();
        java.awt.Paint paint37 = valueMarker31.getOutlinePaint();
        java.awt.Paint paint38 = valueMarker31.getLabelPaint();
        java.awt.Paint paint39 = valueMarker31.getPaint();
        java.lang.Object obj40 = null;
        boolean boolean41 = valueMarker31.equals(obj40);
        java.awt.Paint paint42 = valueMarker31.getPaint();
        java.awt.Stroke stroke43 = valueMarker31.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener44 = null;
        valueMarker31.addChangeListener(markerChangeListener44);
        java.awt.Paint paint46 = valueMarker31.getLabelPaint();
        java.awt.Stroke stroke47 = valueMarker31.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint1, stroke13, paint29, stroke47, (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(stroke47);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) ' ');
        java.awt.Paint paint3 = valueMarker2.getPaint();
        java.awt.Paint paint4 = valueMarker2.getLabelPaint();
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker(0.0d, paint4, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        valueMarker10.setValue((double) 10);
        java.awt.Stroke stroke13 = valueMarker10.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker10.addChangeListener(markerChangeListener14);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint8 = valueMarker7.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker7.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor9);
        java.awt.Stroke stroke11 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker1.notifyListeners(markerChangeEvent12);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint15 = valueMarker1.getPaint();
        java.awt.Paint paint16 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke19 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(textAnchor18);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        java.awt.Stroke stroke15 = valueMarker1.getOutlineStroke();
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        float float9 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker11.addChangeListener(markerChangeListener14);
        double double16 = valueMarker11.getValue();
        java.awt.Paint paint17 = valueMarker11.getLabelPaint();
        java.awt.Paint paint18 = valueMarker11.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker20.addChangeListener(markerChangeListener23);
        double double25 = valueMarker20.getValue();
        java.awt.Paint paint26 = valueMarker20.getLabelPaint();
        valueMarker11.setOutlinePaint(paint26);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker11.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker11.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker11.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor30);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertNotNull(textAnchor29);
        org.junit.Assert.assertNotNull(rectangleAnchor30);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        valueMarker1.notifyListeners(markerChangeEvent20);
        java.lang.Object obj22 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        java.lang.Object obj6 = valueMarker1.clone();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.lang.String str11 = valueMarker7.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = valueMarker7.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets13);
        java.lang.String str15 = valueMarker1.getLabel();
        java.awt.Paint paint16 = valueMarker1.getLabelPaint();
        java.awt.Paint paint17 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint11 = valueMarker10.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint11, stroke17);
        boolean boolean19 = valueMarker1.equals((java.lang.Object) paint11);
        java.awt.Paint paint20 = valueMarker1.getLabelPaint();
        java.awt.Paint paint21 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets22);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
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
        java.awt.Paint paint31 = valueMarker1.getOutlinePaint();
        java.lang.String str32 = valueMarker1.getLabel();
        java.awt.Stroke stroke33 = valueMarker1.getStroke();
        java.awt.Paint paint34 = valueMarker1.getLabelPaint();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getPaint();
        java.awt.Stroke stroke10 = valueMarker6.getOutlineStroke();
        java.awt.Font font11 = valueMarker6.getLabelFont();
        valueMarker1.setLabelFont(font11);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker1.getLabelAnchor();
        valueMarker1.setAlpha(1.0f);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.removeChangeListener(markerChangeListener17);
        java.awt.Paint paint19 = valueMarker1.getPaint();
        java.awt.Font font20 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke21 = valueMarker1.getStroke();
        java.awt.Paint paint22 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        valueMarker10.setValue((double) 10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        valueMarker10.notifyListeners(markerChangeEvent13);
        valueMarker10.setLabel("");
        float float17 = valueMarker10.getAlpha();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str3 = valueMarker2.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker2.addChangeListener(markerChangeListener4);
        java.awt.Font font6 = valueMarker2.getLabelFont();
        java.awt.Paint paint7 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.lang.String str13 = valueMarker9.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker9.getLabelOffsetType();
        valueMarker9.setAlpha((float) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        java.awt.Paint paint21 = valueMarker18.getPaint();
        java.lang.String str22 = valueMarker18.getLabel();
        boolean boolean23 = valueMarker9.equals((java.lang.Object) valueMarker18);
        java.awt.Font font24 = valueMarker18.getLabelFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker18.notifyListeners(markerChangeEvent25);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        java.awt.Paint paint31 = valueMarker28.getPaint();
        java.lang.String str32 = valueMarker28.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent33 = null;
        valueMarker28.notifyListeners(markerChangeEvent33);
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = valueMarker36.getLabelOffset();
        valueMarker28.setLabelOffset(rectangleInsets37);
        java.awt.Stroke stroke39 = valueMarker28.getStroke();
        valueMarker18.setOutlineStroke(stroke39);
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke43 = valueMarker42.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener44 = null;
        valueMarker42.addChangeListener(markerChangeListener44);
        java.lang.String str46 = valueMarker42.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker48.setLabel("");
        java.awt.Paint paint51 = valueMarker48.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener52 = null;
        valueMarker48.removeChangeListener(markerChangeListener52);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener54 = null;
        valueMarker48.addChangeListener(markerChangeListener54);
        java.awt.Paint paint56 = valueMarker48.getPaint();
        valueMarker42.setOutlinePaint(paint56);
        org.jfree.chart.plot.ValueMarker valueMarker59 = new org.jfree.chart.plot.ValueMarker((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker61 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker61.setLabel("");
        float float64 = valueMarker61.getAlpha();
        java.lang.String str65 = valueMarker61.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener66 = null;
        valueMarker61.removeChangeListener(markerChangeListener66);
        valueMarker61.setAlpha((float) 1L);
        java.lang.String str70 = valueMarker61.getLabel();
        java.awt.Stroke stroke71 = valueMarker61.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker73 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker73.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent76 = null;
        valueMarker73.notifyListeners(markerChangeEvent76);
        java.awt.Stroke stroke78 = valueMarker73.getOutlineStroke();
        valueMarker61.setStroke(stroke78);
        valueMarker59.setStroke(stroke78);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker82 = new org.jfree.chart.plot.ValueMarker((double) 1, paint7, stroke39, paint56, stroke78, (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(rectangleInsets37);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.8f + "'", float64 == 0.8f);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(stroke71);
        org.junit.Assert.assertNotNull(stroke78);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.Class<?> wildcardClass7 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.removeChangeListener(markerChangeListener11);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(textAnchor10);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.lang.Object obj3 = valueMarker1.clone();
        valueMarker1.setValue((double) (short) 10);
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 100);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker9.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType10);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(textAnchor6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker7.addChangeListener(markerChangeListener10);
        double double12 = valueMarker7.getValue();
        java.awt.Paint paint13 = valueMarker7.getOutlinePaint();
        java.awt.Paint paint14 = valueMarker7.getLabelPaint();
        java.awt.Paint paint15 = valueMarker7.getPaint();
        valueMarker7.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getPaint();
        java.awt.Stroke stroke23 = valueMarker19.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        java.awt.Paint paint28 = valueMarker25.getOutlinePaint();
        valueMarker19.setLabelPaint(paint28);
        float float30 = valueMarker19.getAlpha();
        valueMarker19.setLabel("");
        valueMarker19.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor35 = valueMarker19.getLabelTextAnchor();
        java.awt.Paint paint36 = valueMarker19.getOutlinePaint();
        valueMarker7.setLabelPaint(paint36);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener38 = null;
        valueMarker7.removeChangeListener(markerChangeListener38);
        java.lang.Class<?> wildcardClass40 = valueMarker7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray41 = valueMarker1.getListeners((java.lang.Class) wildcardClass40);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.8f + "'", float30 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Stroke stroke4 = valueMarker1.getOutlineStroke();
        java.lang.Object obj5 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.lang.String str11 = valueMarker7.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = valueMarker7.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets13);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker1.getLabelAnchor();
        java.lang.String str16 = valueMarker1.getLabel();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(rectangleAnchor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 'a');
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        java.awt.Paint paint14 = valueMarker11.getOutlinePaint();
        valueMarker5.setLabelPaint(paint14);
        float float16 = valueMarker5.getAlpha();
        valueMarker5.setLabel("");
        valueMarker5.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker5.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor21);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker24.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor25);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(rectangleAnchor25);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.lang.Object obj3 = valueMarker1.clone();
        valueMarker1.setValue((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker8.getLabelOffset();
        java.awt.Stroke stroke10 = valueMarker8.getOutlineStroke();
        valueMarker1.setStroke(stroke10);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker1.getLabelOffset();
        java.awt.Stroke stroke13 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker15.notifyListeners(markerChangeEvent18);
        java.lang.String str20 = valueMarker15.getLabel();
        java.awt.Font font21 = valueMarker15.getLabelFont();
        valueMarker1.setLabelFont(font21);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker1.getLabelTextAnchor();
        java.lang.Object obj17 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint14 = valueMarker13.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        java.awt.Paint paint19 = valueMarker16.getPaint();
        java.awt.Stroke stroke20 = valueMarker16.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint14, stroke20);
        valueMarker21.setValue((double) 10);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        float float28 = valueMarker25.getAlpha();
        java.lang.String str29 = valueMarker25.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker25.removeChangeListener(markerChangeListener30);
        valueMarker25.setAlpha((float) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = valueMarker25.getLabelOffset();
        valueMarker21.setLabelOffset(rectangleInsets34);
        valueMarker1.setLabelOffset(rectangleInsets34);
        java.lang.Object obj37 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.8f + "'", float28 == 0.8f);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.lang.Object obj3 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        java.awt.Stroke stroke10 = valueMarker5.getStroke();
        valueMarker1.setOutlineStroke(stroke10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.addChangeListener(markerChangeListener12);
        float float14 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        float float10 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8f + "'", float10 == 0.8f);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1);
        valueMarker1.setValue((double) '#');
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.removeChangeListener(markerChangeListener4);
        java.awt.Font font6 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(font6);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        java.awt.Stroke stroke20 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker1.removeChangeListener(markerChangeListener21);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.awt.Stroke stroke8 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        java.awt.Stroke stroke11 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        valueMarker1.setAlpha(0.0f);
        java.awt.Paint paint13 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        java.awt.Stroke stroke15 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("hi!");
        java.lang.Object obj8 = valueMarker1.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke11 = valueMarker1.getOutlineStroke();
        java.lang.String str12 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getOutlinePaint();
        java.awt.Stroke stroke18 = valueMarker14.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker20.getLabelOffset();
        valueMarker14.setLabelOffset(rectangleInsets21);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker14.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor23);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.lang.Object obj6 = valueMarker2.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker2.getLabelOffsetType();
        valueMarker2.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker2.addChangeListener(markerChangeListener10);
        java.awt.Paint paint12 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getOutlinePaint();
        java.awt.Stroke stroke18 = valueMarker14.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        java.awt.Paint paint23 = valueMarker20.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker20.removeChangeListener(markerChangeListener24);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker20.addChangeListener(markerChangeListener26);
        java.awt.Paint paint28 = valueMarker20.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType29 = valueMarker20.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker20.removeChangeListener(markerChangeListener30);
        java.awt.Stroke stroke32 = valueMarker20.getOutlineStroke();
        java.awt.Paint paint33 = valueMarker20.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker35.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType38 = valueMarker35.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor39 = valueMarker35.getLabelAnchor();
        valueMarker35.setLabel("hi!");
        java.lang.Object obj42 = valueMarker35.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = valueMarker35.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor44 = valueMarker35.getLabelTextAnchor();
        java.awt.Stroke stroke45 = valueMarker35.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker47 = new org.jfree.chart.plot.ValueMarker((double) ' ', paint12, stroke18, paint33, stroke45, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(lengthAdjustmentType29);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(lengthAdjustmentType38);
        org.junit.Assert.assertNotNull(rectangleAnchor39);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(rectangleInsets43);
        org.junit.Assert.assertNotNull(textAnchor44);
        org.junit.Assert.assertNotNull(stroke45);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        boolean boolean3 = valueMarker1.equals((java.lang.Object) 0L);
        valueMarker1.setValue((double) (short) 0);
        java.lang.Object obj6 = valueMarker1.clone();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(font7);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint6 = valueMarker1.getPaint();
        float float7 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.addChangeListener(markerChangeListener8);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.lang.String str13 = valueMarker9.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getPaint();
        valueMarker9.setLabelPaint(paint18);
        valueMarker1.setOutlinePaint(paint18);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker1.getLabelOffset();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        valueMarker1.notifyListeners(markerChangeEvent24);
        float float26 = valueMarker1.getAlpha();
        float float27 = valueMarker1.getAlpha();
        java.awt.Stroke stroke28 = valueMarker1.getOutlineStroke();
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.8f + "'", float27 == 0.8f);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke8 = valueMarker7.getStroke();
        valueMarker1.setStroke(stroke8);
        valueMarker1.setValue((double) (-1));
        double double12 = valueMarker1.getValue();
        valueMarker1.setLabel("");
        valueMarker1.setValue((double) 100);
        java.awt.Paint paint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelPaint(paint17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        double double9 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Paint paint13 = valueMarker10.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker10.removeChangeListener(markerChangeListener14);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker10.addChangeListener(markerChangeListener16);
        java.awt.Paint paint18 = valueMarker10.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker10.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker10.removeChangeListener(markerChangeListener20);
        java.awt.Paint paint22 = valueMarker10.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke25 = valueMarker24.getStroke();
        java.awt.Paint paint26 = valueMarker24.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke29 = valueMarker28.getStroke();
        valueMarker24.setStroke(stroke29);
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1, paint22, stroke29);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker31.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor32);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(rectangleAnchor32);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str2 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        float float9 = valueMarker6.getAlpha();
        java.lang.String str10 = valueMarker6.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker6.removeChangeListener(markerChangeListener11);
        valueMarker6.setAlpha((float) 1L);
        java.awt.Stroke stroke15 = valueMarker6.getStroke();
        valueMarker1.setStroke(stroke15);
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        java.awt.Paint paint21 = valueMarker18.getPaint();
        java.lang.String str22 = valueMarker18.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType23 = valueMarker18.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = valueMarker18.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker18.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor25);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(textAnchor25);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.removeChangeListener(markerChangeListener17);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker1.getLabelAnchor();
        valueMarker1.setValue((double) 0L);
        java.awt.Stroke stroke19 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker1.addChangeListener(markerChangeListener20);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        java.lang.Object obj10 = null;
        boolean boolean11 = valueMarker1.equals(obj10);
        java.awt.Paint paint12 = valueMarker1.getPaint();
        java.awt.Font font13 = valueMarker1.getLabelFont();
        java.awt.Paint paint14 = valueMarker1.getLabelPaint();
        java.awt.Paint paint15 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.lang.String str9 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker1.notifyListeners(markerChangeEvent10);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.lang.Object obj6 = valueMarker2.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker2.getLabelOffsetType();
        valueMarker2.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker2.addChangeListener(markerChangeListener10);
        java.awt.Paint paint12 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker14.addChangeListener(markerChangeListener17);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker14.addChangeListener(markerChangeListener19);
        java.awt.Paint paint21 = valueMarker14.getOutlinePaint();
        java.awt.Stroke stroke22 = valueMarker14.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        java.awt.Paint paint27 = valueMarker24.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker24.removeChangeListener(markerChangeListener28);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker24.addChangeListener(markerChangeListener30);
        java.awt.Paint paint32 = valueMarker24.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType33 = valueMarker24.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker24.removeChangeListener(markerChangeListener34);
        java.awt.Stroke stroke36 = valueMarker24.getOutlineStroke();
        java.awt.Paint paint37 = valueMarker24.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent38 = null;
        valueMarker24.notifyListeners(markerChangeEvent38);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener40 = null;
        valueMarker24.addChangeListener(markerChangeListener40);
        java.awt.Paint paint42 = valueMarker24.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker44.setLabel("");
        java.awt.Paint paint47 = valueMarker44.getPaint();
        java.awt.Stroke stroke48 = valueMarker44.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker50 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker50.setLabel("");
        java.awt.Paint paint53 = valueMarker50.getOutlinePaint();
        valueMarker44.setLabelPaint(paint53);
        float float55 = valueMarker44.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener56 = null;
        valueMarker44.addChangeListener(markerChangeListener56);
        java.lang.Object obj58 = valueMarker44.clone();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent59 = null;
        valueMarker44.notifyListeners(markerChangeEvent59);
        org.jfree.chart.text.TextAnchor textAnchor61 = valueMarker44.getLabelTextAnchor();
        java.awt.Stroke stroke62 = valueMarker44.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker64 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint12, stroke22, paint42, stroke62, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(lengthAdjustmentType33);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.8f + "'", float55 == 0.8f);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(textAnchor61);
        org.junit.Assert.assertNotNull(stroke62);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker6.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor9);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.removeChangeListener(markerChangeListener11);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.removeChangeListener(markerChangeListener13);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.removeChangeListener(markerChangeListener15);
        java.lang.Class<?> wildcardClass17 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font12 = valueMarker11.getLabelFont();
        java.awt.Stroke stroke13 = valueMarker11.getOutlineStroke();
        java.awt.Paint paint14 = valueMarker11.getOutlinePaint();
        java.awt.Stroke stroke15 = valueMarker11.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) ' ');
        java.awt.Paint paint18 = valueMarker17.getPaint();
        valueMarker11.setPaint(paint18);
        java.awt.Paint paint20 = valueMarker11.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint24 = valueMarker23.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker26.setLabel("");
        java.awt.Paint paint29 = valueMarker26.getPaint();
        java.awt.Paint paint30 = valueMarker26.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str33 = valueMarker32.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker32.addChangeListener(markerChangeListener34);
        java.awt.Font font36 = valueMarker32.getLabelFont();
        valueMarker26.setLabelFont(font36);
        java.awt.Stroke stroke38 = valueMarker26.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker40.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener43 = null;
        valueMarker40.addChangeListener(markerChangeListener43);
        double double45 = valueMarker40.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor46 = valueMarker40.getLabelAnchor();
        valueMarker40.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets49 = valueMarker40.getLabelOffset();
        valueMarker26.setLabelOffset(rectangleInsets49);
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker52.setLabel("");
        float float55 = valueMarker52.getAlpha();
        java.lang.String str56 = valueMarker52.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener57 = null;
        valueMarker52.removeChangeListener(markerChangeListener57);
        valueMarker52.setAlpha((float) 1L);
        java.lang.String str61 = valueMarker52.getLabel();
        java.awt.Stroke stroke62 = valueMarker52.getStroke();
        valueMarker26.setStroke(stroke62);
        org.jfree.chart.plot.ValueMarker valueMarker64 = new org.jfree.chart.plot.ValueMarker((double) (short) 10, paint24, stroke62);
        valueMarker11.setOutlinePaint(paint24);
        valueMarker1.setLabelPaint(paint24);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor46);
        org.junit.Assert.assertNotNull(rectangleInsets49);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.8f + "'", float55 == 0.8f);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(stroke62);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        java.awt.Font font24 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke25 = valueMarker1.getOutlineStroke();
        valueMarker1.setValue((double) 0.8f);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(stroke25);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker2.getLabelAnchor();
        java.awt.Paint paint4 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker6.addChangeListener(markerChangeListener9);
        double double11 = valueMarker6.getValue();
        java.awt.Paint paint12 = valueMarker6.getLabelPaint();
        java.awt.Paint paint13 = valueMarker6.getOutlinePaint();
        java.awt.Stroke stroke14 = valueMarker6.getOutlineStroke();
        float float15 = valueMarker6.getAlpha();
        java.awt.Stroke stroke16 = valueMarker6.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1, paint4, stroke16);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker17.notifyListeners(markerChangeEvent18);
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8f + "'", float15 == 0.8f);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint12 = valueMarker11.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker14.getLabelTextAnchor();
        valueMarker11.setLabelTextAnchor(textAnchor17);
        valueMarker1.setLabelTextAnchor(textAnchor17);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.removeChangeListener(markerChangeListener10);
        java.awt.Stroke stroke12 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font14 = valueMarker13.getLabelFont();
        java.awt.Stroke stroke15 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        java.awt.Paint paint20 = valueMarker17.getPaint();
        java.awt.Stroke stroke21 = valueMarker17.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        java.awt.Paint paint26 = valueMarker23.getOutlinePaint();
        valueMarker17.setLabelPaint(paint26);
        float float28 = valueMarker17.getAlpha();
        valueMarker17.setValue((double) (byte) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker17.removeChangeListener(markerChangeListener31);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker17.getLabelAnchor();
        valueMarker13.setLabelAnchor(rectangleAnchor33);
        valueMarker1.setLabelAnchor(rectangleAnchor33);
        java.awt.Paint paint36 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = valueMarker1.getLabelOffset();
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.8f + "'", float28 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor33);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(rectangleInsets37);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        java.awt.Paint paint20 = valueMarker1.getLabelPaint();
        java.awt.Font font21 = valueMarker1.getLabelFont();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker1.getLabelOffsetType();
        java.awt.Stroke stroke23 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Font font5 = valueMarker2.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker7.getLabelTextAnchor();
        valueMarker2.setLabelTextAnchor(textAnchor10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker2.removeChangeListener(markerChangeListener12);
        java.awt.Paint paint14 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker16.addChangeListener(markerChangeListener19);
        double double21 = valueMarker16.getValue();
        java.awt.Paint paint22 = valueMarker16.getOutlinePaint();
        java.awt.Paint paint23 = valueMarker16.getLabelPaint();
        java.awt.Paint paint24 = valueMarker16.getPaint();
        java.lang.Object obj25 = null;
        boolean boolean26 = valueMarker16.equals(obj25);
        java.awt.Paint paint27 = valueMarker16.getPaint();
        java.awt.Stroke stroke28 = valueMarker16.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker16.removeChangeListener(markerChangeListener29);
        java.awt.Paint paint31 = valueMarker16.getLabelPaint();
        java.awt.Stroke stroke32 = valueMarker16.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType37 = valueMarker34.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor38 = valueMarker34.getLabelAnchor();
        java.awt.Paint paint39 = valueMarker34.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker41.setLabel("");
        java.awt.Paint paint44 = valueMarker41.getOutlinePaint();
        java.awt.Paint paint45 = valueMarker41.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker47 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker47.setLabel("");
        java.awt.Font font50 = valueMarker47.getLabelFont();
        valueMarker41.setLabelFont(font50);
        java.awt.Stroke stroke52 = valueMarker41.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker54 = new org.jfree.chart.plot.ValueMarker((double) (short) 10, paint14, stroke32, paint39, stroke52, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(lengthAdjustmentType37);
        org.junit.Assert.assertNotNull(rectangleAnchor38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(font50);
        org.junit.Assert.assertNotNull(stroke52);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.lang.Object obj2 = valueMarker1.clone();
        valueMarker1.setLabel("");
        java.awt.Font font5 = valueMarker1.getLabelFont();
        java.lang.String str6 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        float float11 = valueMarker8.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        java.awt.Font font18 = valueMarker13.getLabelFont();
        valueMarker8.setLabelFont(font18);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker8.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker8.getLabelAnchor();
        valueMarker8.setAlpha(1.0f);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker8.removeChangeListener(markerChangeListener24);
        java.awt.Paint paint26 = valueMarker8.getPaint();
        valueMarker1.setPaint(paint26);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker1.getLabelOffset();
        java.lang.Object obj12 = valueMarker1.clone();
        java.lang.Class class13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray14 = valueMarker1.getListeners(class13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.removeChangeListener(markerChangeListener11);
        java.awt.Stroke stroke13 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint14 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker1.notifyListeners(markerChangeEvent15);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.addChangeListener(markerChangeListener17);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker1.addChangeListener(markerChangeListener19);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker22.notifyListeners(markerChangeEvent25);
        java.awt.Stroke stroke27 = valueMarker22.getStroke();
        java.lang.Object obj28 = valueMarker22.clone();
        valueMarker22.setValue((double) (short) 100);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType31 = valueMarker22.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker33.setLabel("");
        java.awt.Paint paint36 = valueMarker33.getPaint();
        java.lang.String str37 = valueMarker33.getLabel();
        double double38 = valueMarker33.getValue();
        java.awt.Stroke stroke39 = valueMarker33.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint42 = valueMarker41.getLabelPaint();
        valueMarker33.setOutlinePaint(paint42);
        valueMarker22.setOutlinePaint(paint42);
        valueMarker1.setPaint(paint42);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(lengthAdjustmentType31);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(paint42);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        double double18 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker22.notifyListeners(markerChangeEvent25);
        valueMarker22.setValue((double) 0.8f);
        boolean boolean29 = valueMarker20.equals((java.lang.Object) valueMarker22);
        valueMarker22.setLabel("hi!");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType32 = valueMarker22.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType32);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType32);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.lang.String str13 = valueMarker9.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getPaint();
        valueMarker9.setLabelPaint(paint18);
        valueMarker1.setOutlinePaint(paint18);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker1.removeChangeListener(markerChangeListener21);
        valueMarker1.setValue((double) 100L);
        java.awt.Paint paint25 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelPaint(paint25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(font7);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint8 = valueMarker7.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker7.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor9);
        java.awt.Stroke stroke11 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker1.notifyListeners(markerChangeEvent12);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint15 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        valueMarker1.setAlpha(0.0f);
        java.awt.Paint paint13 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        valueMarker19.notifyListeners(markerChangeEvent22);
        valueMarker19.setValue((double) 0.8f);
        boolean boolean26 = valueMarker17.equals((java.lang.Object) valueMarker19);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker19.getLabelOffsetType();
        java.awt.Font font28 = valueMarker19.getLabelFont();
        valueMarker1.setLabelFont(font28);
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker31.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker31.addChangeListener(markerChangeListener34);
        double double36 = valueMarker31.getValue();
        java.awt.Paint paint37 = valueMarker31.getOutlinePaint();
        java.awt.Paint paint38 = valueMarker31.getLabelPaint();
        java.awt.Paint paint39 = valueMarker31.getPaint();
        java.lang.Object obj40 = null;
        boolean boolean41 = valueMarker31.equals(obj40);
        valueMarker31.setLabel("hi!");
        double double44 = valueMarker31.getValue();
        java.awt.Font font45 = valueMarker31.getLabelFont();
        boolean boolean46 = valueMarker1.equals((java.lang.Object) font45);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertNotNull(font45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font5 = valueMarker4.getLabelFont();
        java.awt.Stroke stroke6 = valueMarker4.getOutlineStroke();
        java.awt.Stroke stroke7 = valueMarker4.getOutlineStroke();
        valueMarker4.setLabel("");
        java.awt.Paint paint10 = valueMarker4.getPaint();
        double double11 = valueMarker4.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.lang.String str17 = valueMarker13.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker13.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker13.getLabelOffset();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker13.addChangeListener(markerChangeListener20);
        java.awt.Paint paint22 = valueMarker13.getLabelPaint();
        valueMarker4.setOutlinePaint(paint22);
        valueMarker1.setOutlinePaint(paint22);
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.awt.Stroke stroke7 = valueMarker3.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getOutlinePaint();
        valueMarker3.setLabelPaint(paint12);
        float float14 = valueMarker3.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker3.addChangeListener(markerChangeListener15);
        java.awt.Stroke stroke17 = valueMarker3.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke17);
        java.awt.Stroke stroke19 = valueMarker1.getStroke();
        float float20 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType21 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint22 = valueMarker1.getLabelPaint();
        valueMarker1.setValue((double) (short) 100);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getLabelPaint();
        java.awt.Paint paint10 = valueMarker1.getLabelPaint();
        float float11 = valueMarker1.getAlpha();
        java.awt.Paint paint12 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        double double12 = valueMarker1.getValue();
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setLabel("hi!");
        java.awt.Paint paint16 = valueMarker1.getLabelPaint();
        java.lang.String str17 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        double double6 = valueMarker1.getValue();
        double double7 = valueMarker1.getValue();
        java.lang.Object obj8 = valueMarker1.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.removeChangeListener(markerChangeListener10);
        java.awt.Stroke stroke12 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker1.addChangeListener(markerChangeListener18);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        float float11 = valueMarker3.getAlpha();
        java.awt.Paint paint12 = valueMarker3.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getPaint();
        java.awt.Stroke stroke18 = valueMarker14.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        java.awt.Paint paint23 = valueMarker20.getOutlinePaint();
        valueMarker14.setLabelPaint(paint23);
        float float25 = valueMarker14.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker14.addChangeListener(markerChangeListener26);
        java.awt.Stroke stroke28 = valueMarker14.getOutlineStroke();
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker14.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker14.removeChangeListener(markerChangeListener30);
        java.awt.Paint paint32 = valueMarker14.getLabelPaint();
        valueMarker3.setLabelPaint(paint32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(textAnchor29);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        java.awt.Font font11 = valueMarker10.getLabelFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker10.notifyListeners(markerChangeEvent12);
        java.awt.Stroke stroke14 = valueMarker10.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker10.removeChangeListener(markerChangeListener15);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getOutlinePaint();
        valueMarker8.setLabelPaint(paint15);
        java.awt.Stroke stroke17 = valueMarker8.getStroke();
        valueMarker1.setStroke(stroke17);
        java.awt.Paint paint19 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint21 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker1.removeChangeListener(markerChangeListener22);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        float float19 = valueMarker18.getAlpha();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        float float7 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker1.getLabelOffsetType();
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker14.notifyListeners(markerChangeEvent17);
        valueMarker14.setValue((double) 0.8f);
        boolean boolean21 = valueMarker12.equals((java.lang.Object) valueMarker14);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker14.getLabelOffsetType();
        java.lang.Class<?> wildcardClass23 = valueMarker14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray24 = valueMarker1.getListeners((java.lang.Class) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker3.addChangeListener(markerChangeListener11);
        java.awt.Paint paint13 = valueMarker3.getOutlinePaint();
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker3.getLabelTextAnchor();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(textAnchor14);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 'a');
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        java.awt.Paint paint14 = valueMarker11.getOutlinePaint();
        valueMarker5.setLabelPaint(paint14);
        float float16 = valueMarker5.getAlpha();
        valueMarker5.setLabel("");
        valueMarker5.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker5.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor21);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        java.awt.Paint paint15 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke16 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(rectangleAnchor17);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getOutlinePaint();
        valueMarker4.setLabelPaint(paint11);
        java.awt.Font font13 = valueMarker4.getLabelFont();
        java.lang.Class<?> wildcardClass14 = font13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray15 = valueMarker1.getListeners((java.lang.Class) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Font; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.lang.Object obj8 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.removeChangeListener(markerChangeListener9);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        valueMarker1.setValue((double) (byte) 10);
        java.lang.String str8 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker10.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker10.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker10.addChangeListener(markerChangeListener15);
        valueMarker10.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker10.addChangeListener(markerChangeListener19);
        valueMarker10.setValue((double) (-1L));
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        java.awt.Paint paint27 = valueMarker24.getPaint();
        java.lang.String str28 = valueMarker24.getLabel();
        double double29 = valueMarker24.getValue();
        org.jfree.chart.text.TextAnchor textAnchor30 = valueMarker24.getLabelTextAnchor();
        valueMarker10.setLabelTextAnchor(textAnchor30);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType32 = valueMarker10.getLabelOffsetType();
        valueMarker10.setValue((double) 1);
        java.lang.Class<?> wildcardClass35 = valueMarker10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray36 = valueMarker1.getListeners((java.lang.Class) wildcardClass35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor30);
        org.junit.Assert.assertNotNull(lengthAdjustmentType32);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType2 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue(10.0d);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        valueMarker1.notifyListeners(markerChangeEvent5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType2);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        java.lang.Object obj7 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getOutlinePaint();
        valueMarker13.setLabelPaint(paint22);
        float float24 = valueMarker13.getAlpha();
        valueMarker13.setLabel("");
        valueMarker13.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker13.getLabelTextAnchor();
        java.awt.Paint paint30 = valueMarker13.getOutlinePaint();
        valueMarker1.setLabelPaint(paint30);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker1.removeChangeListener(markerChangeListener32);
        java.awt.Stroke stroke34 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor35 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        valueMarker1.notifyListeners(markerChangeEvent36);
        java.awt.Paint paint38 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener39 = null;
        valueMarker1.addChangeListener(markerChangeListener39);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener41 = null;
        valueMarker1.removeChangeListener(markerChangeListener41);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(textAnchor35);
        org.junit.Assert.assertNotNull(paint38);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        boolean boolean3 = valueMarker1.equals((java.lang.Object) 0L);
        valueMarker1.setValue((double) (short) 0);
        java.lang.Object obj6 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getPaint();
        java.lang.String str12 = valueMarker8.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        valueMarker8.notifyListeners(markerChangeEvent13);
        java.awt.Paint paint15 = valueMarker8.getPaint();
        valueMarker8.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker8.addChangeListener(markerChangeListener18);
        java.awt.Paint paint20 = valueMarker8.getLabelPaint();
        valueMarker1.setLabelPaint(paint20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1.0f);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.lang.Object obj7 = valueMarker3.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker3.getLabelOffsetType();
        valueMarker3.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker3.addChangeListener(markerChangeListener11);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker3.removeChangeListener(markerChangeListener13);
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker3.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor15);
        float float17 = valueMarker1.getAlpha();
        java.awt.Font font18 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertNotNull(font18);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker11.addChangeListener(markerChangeListener14);
        double double16 = valueMarker11.getValue();
        java.awt.Paint paint17 = valueMarker11.getOutlinePaint();
        java.awt.Paint paint18 = valueMarker11.getLabelPaint();
        java.awt.Paint paint19 = valueMarker11.getPaint();
        valueMarker1.setLabelPaint(paint19);
        java.awt.Paint paint21 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint22 = valueMarker1.getLabelPaint();
        java.awt.Paint paint23 = valueMarker1.getOutlinePaint();
        java.lang.String str24 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(rectangleAnchor25);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        java.awt.Stroke stroke11 = valueMarker3.getStroke();
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
        valueMarker14.setLabel("");
        java.awt.Paint paint30 = valueMarker14.getOutlinePaint();
        valueMarker3.setPaint(paint30);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint8 = valueMarker7.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker7.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor9);
        java.awt.Paint paint11 = valueMarker1.getPaint();
        java.awt.Paint paint12 = valueMarker1.getPaint();
        java.lang.Object obj13 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        double double12 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.addChangeListener(markerChangeListener13);
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor15);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.awt.Stroke stroke7 = valueMarker3.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getOutlinePaint();
        valueMarker3.setLabelPaint(paint12);
        float float14 = valueMarker3.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker3.addChangeListener(markerChangeListener15);
        java.awt.Stroke stroke17 = valueMarker3.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke17);
        java.awt.Stroke stroke19 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        valueMarker1.notifyListeners(markerChangeEvent20);
        java.awt.Paint paint22 = valueMarker1.getPaint();
        float float23 = valueMarker1.getAlpha();
        java.awt.Stroke stroke24 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker1.getLabelOffset();
        java.lang.Object obj26 = valueMarker1.clone();
        java.awt.Font font27 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(font27);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 'a');
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        java.awt.Font font9 = valueMarker1.getLabelFont();
        valueMarker1.setAlpha((float) 0);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.removeChangeListener(markerChangeListener12);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.addChangeListener(markerChangeListener14);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint19 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str8 = valueMarker7.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker7.addChangeListener(markerChangeListener9);
        java.awt.Font font11 = valueMarker7.getLabelFont();
        valueMarker1.setLabelFont(font11);
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker15.addChangeListener(markerChangeListener18);
        double double20 = valueMarker15.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker15.getLabelAnchor();
        valueMarker15.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = valueMarker15.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets24);
        float float26 = valueMarker1.getAlpha();
        valueMarker1.setValue((double) (byte) -1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        java.lang.String str11 = valueMarker1.getLabel();
        java.awt.Font font12 = valueMarker1.getLabelFont();
        double double13 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 1);
        java.awt.Stroke stroke16 = valueMarker15.getOutlineStroke();
        valueMarker1.setStroke(stroke16);
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker1.getLabelTextAnchor();
        java.lang.Object obj19 = valueMarker1.clone();
        java.lang.Object obj20 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(textAnchor18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str2 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        float float9 = valueMarker6.getAlpha();
        java.lang.String str10 = valueMarker6.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker6.removeChangeListener(markerChangeListener11);
        valueMarker6.setAlpha((float) 1L);
        java.awt.Stroke stroke15 = valueMarker6.getStroke();
        valueMarker1.setStroke(stroke15);
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType21 = valueMarker18.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        valueMarker25.notifyListeners(markerChangeEvent28);
        valueMarker25.setValue((double) 0.8f);
        boolean boolean32 = valueMarker23.equals((java.lang.Object) valueMarker25);
        valueMarker25.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker25.removeChangeListener(markerChangeListener35);
        boolean boolean37 = valueMarker18.equals((java.lang.Object) valueMarker25);
        valueMarker25.setLabel("hi!");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor40 = valueMarker25.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor40);
        java.awt.Stroke stroke42 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor40);
        org.junit.Assert.assertNotNull(stroke42);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.addChangeListener(markerChangeListener8);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getOutlinePaint();
        valueMarker13.setLabelPaint(paint22);
        float float24 = valueMarker13.getAlpha();
        valueMarker13.setLabel("");
        valueMarker13.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker13.getLabelTextAnchor();
        java.awt.Paint paint30 = valueMarker13.getOutlinePaint();
        valueMarker1.setLabelPaint(paint30);
        java.lang.String str32 = valueMarker1.getLabel();
        double double33 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker1.addChangeListener(markerChangeListener34);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Paint paint9 = valueMarker5.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str12 = valueMarker11.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker11.addChangeListener(markerChangeListener13);
        java.awt.Font font15 = valueMarker11.getLabelFont();
        valueMarker5.setLabelFont(font15);
        java.awt.Stroke stroke17 = valueMarker5.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker19.addChangeListener(markerChangeListener22);
        double double24 = valueMarker19.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker19.getLabelAnchor();
        valueMarker19.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = valueMarker19.getLabelOffset();
        valueMarker5.setLabelOffset(rectangleInsets28);
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker31.setLabel("");
        float float34 = valueMarker31.getAlpha();
        java.lang.String str35 = valueMarker31.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener36 = null;
        valueMarker31.removeChangeListener(markerChangeListener36);
        valueMarker31.setAlpha((float) 1L);
        java.lang.String str40 = valueMarker31.getLabel();
        java.awt.Stroke stroke41 = valueMarker31.getStroke();
        valueMarker5.setStroke(stroke41);
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) (short) 10, paint3, stroke41);
        java.awt.Stroke stroke44 = valueMarker43.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker46 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker48.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker52.setLabel("");
        java.awt.Paint paint55 = valueMarker52.getOutlinePaint();
        valueMarker48.setLabelPaint(paint55);
        java.awt.Stroke stroke57 = valueMarker48.getStroke();
        java.awt.Paint paint58 = valueMarker48.getLabelPaint();
        valueMarker46.setLabelPaint(paint58);
        java.lang.Class<?> wildcardClass60 = paint58.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray61 = valueMarker43.getListeners((java.lang.Class) wildcardClass60);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Color; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor25);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.8f + "'", float34 == 0.8f);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(stroke57);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Paint paint6 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getPaint();
        java.awt.Stroke stroke12 = valueMarker8.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getOutlinePaint();
        valueMarker8.setLabelPaint(paint17);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker8.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker8.addChangeListener(markerChangeListener20);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker8.removeChangeListener(markerChangeListener22);
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker8.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor24);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertNotNull(textAnchor24);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker3.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker3.addChangeListener(markerChangeListener12);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker15.notifyListeners(markerChangeEvent18);
        java.awt.Stroke stroke20 = valueMarker15.getStroke();
        java.lang.Object obj21 = valueMarker15.clone();
        valueMarker15.setValue((double) (short) 100);
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker15.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker15.notifyListeners(markerChangeEvent25);
        boolean boolean27 = valueMarker3.equals((java.lang.Object) markerChangeEvent25);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker3.getLabelOffsetType();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(textAnchor24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.addChangeListener(markerChangeListener15);
        valueMarker1.setValue((double) '#');
        boolean boolean20 = valueMarker1.equals((java.lang.Object) ' ');
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 1);
        valueMarker24.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker24.removeChangeListener(markerChangeListener27);
        java.awt.Font font29 = valueMarker24.getLabelFont();
        valueMarker1.setLabelFont(font29);
        java.lang.String str31 = valueMarker1.getLabel();
        double double32 = valueMarker1.getValue();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 35.0d + "'", double32 == 35.0d);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = valueMarker1.getLabelOffset();
        java.lang.String str18 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font2 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke3 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        java.awt.Paint paint14 = valueMarker11.getOutlinePaint();
        valueMarker5.setLabelPaint(paint14);
        float float16 = valueMarker5.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker5.addChangeListener(markerChangeListener17);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker5.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        valueMarker23.notifyListeners(markerChangeEvent26);
        valueMarker23.setValue((double) 0.8f);
        boolean boolean30 = valueMarker21.equals((java.lang.Object) valueMarker23);
        java.awt.Stroke stroke31 = valueMarker23.getStroke();
        valueMarker5.setStroke(stroke31);
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) (short) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = valueMarker34.getLabelOffset();
        valueMarker5.setLabelOffset(rectangleInsets35);
        boolean boolean37 = valueMarker1.equals((java.lang.Object) rectangleInsets35);
        java.lang.String str38 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(rectangleInsets35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        java.awt.Stroke stroke18 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke19 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker10.addChangeListener(markerChangeListener13);
        double double15 = valueMarker10.getValue();
        java.awt.Paint paint16 = valueMarker10.getLabelPaint();
        valueMarker1.setOutlinePaint(paint16);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker1.getLabelTextAnchor();
        java.lang.Object obj20 = valueMarker1.clone();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(textAnchor19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.awt.Stroke stroke7 = valueMarker3.getOutlineStroke();
        valueMarker1.setStroke(stroke7);
        java.awt.Font font9 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.removeChangeListener(markerChangeListener10);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        java.awt.Paint paint14 = valueMarker11.getOutlinePaint();
        valueMarker5.setLabelPaint(paint14);
        float float16 = valueMarker5.getAlpha();
        valueMarker5.setLabel("");
        java.awt.Paint paint19 = valueMarker5.getOutlinePaint();
        java.awt.Paint paint20 = valueMarker5.getOutlinePaint();
        valueMarker1.setPaint(paint20);
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        float float8 = valueMarker1.getAlpha();
        float float9 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Font font8 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        java.lang.String str10 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke6 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setStroke(stroke6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint6 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint7 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.lang.String str13 = valueMarker9.getLabel();
        double double14 = valueMarker9.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker9.getLabelOffsetType();
        java.awt.Paint paint16 = valueMarker9.getLabelPaint();
        valueMarker2.setPaint(paint16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        valueMarker21.notifyListeners(markerChangeEvent24);
        valueMarker21.setValue((double) 0.8f);
        boolean boolean28 = valueMarker19.equals((java.lang.Object) valueMarker21);
        java.awt.Stroke stroke29 = valueMarker21.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (-1L), paint16, stroke29);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        valueMarker3.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 1.0f);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        java.awt.Paint paint19 = valueMarker16.getPaint();
        java.awt.Stroke stroke20 = valueMarker16.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getOutlinePaint();
        valueMarker16.setLabelPaint(paint25);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = valueMarker16.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker16.addChangeListener(markerChangeListener28);
        java.awt.Font font30 = valueMarker16.getLabelFont();
        boolean boolean31 = valueMarker14.equals((java.lang.Object) font30);
        java.awt.Paint paint32 = valueMarker14.getOutlinePaint();
        valueMarker3.setOutlinePaint(paint32);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker3.removeChangeListener(markerChangeListener34);
        valueMarker3.setValue((double) (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(rectangleAnchor27);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        java.awt.Paint paint31 = valueMarker1.getOutlinePaint();
        java.lang.String str32 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType33 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = valueMarker1.getLabelOffset();
        java.awt.Font font35 = valueMarker1.getLabelFont();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType33);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertNotNull(font35);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        java.lang.Object obj10 = null;
        boolean boolean11 = valueMarker1.equals(obj10);
        java.awt.Paint paint12 = valueMarker1.getPaint();
        java.awt.Font font13 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker1.getLabelOffset();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Paint paint8 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker12.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker12.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor16);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        valueMarker1.notifyListeners(markerChangeEvent20);
        double double22 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        java.awt.Stroke stroke27 = valueMarker1.getStroke();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertNotNull(textAnchor25);
        org.junit.Assert.assertNotNull(stroke27);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Stroke stroke8 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker3.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker3.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker3.getLabelAnchor();
        java.awt.Stroke stroke14 = valueMarker3.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        java.awt.Paint paint19 = valueMarker16.getPaint();
        java.awt.Stroke stroke20 = valueMarker16.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getOutlinePaint();
        valueMarker16.setLabelPaint(paint25);
        float float27 = valueMarker16.getAlpha();
        valueMarker16.setLabel("");
        valueMarker16.setLabel("hi!");
        valueMarker16.setAlpha(1.0f);
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 1);
        valueMarker35.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener38 = null;
        valueMarker35.removeChangeListener(markerChangeListener38);
        java.awt.Font font40 = valueMarker35.getLabelFont();
        valueMarker16.setLabelFont(font40);
        valueMarker3.setLabelFont(font40);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.8f + "'", float27 == 0.8f);
        org.junit.Assert.assertNotNull(font40);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        valueMarker1.setAlpha(0.8f);
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint21 = valueMarker20.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker20.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke25 = valueMarker24.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint28 = valueMarker27.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker30.setLabel("");
        java.awt.Paint paint33 = valueMarker30.getPaint();
        java.lang.String str34 = valueMarker30.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType35 = valueMarker30.getLabelOffsetType();
        valueMarker27.setLabelOffsetType(lengthAdjustmentType35);
        valueMarker24.setLabelOffsetType(lengthAdjustmentType35);
        valueMarker20.setLabelOffsetType(lengthAdjustmentType35);
        java.lang.Class<?> wildcardClass39 = valueMarker20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray40 = valueMarker1.getListeners((java.lang.Class) wildcardClass39);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleAnchor22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType35);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font2 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke3 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke4 = valueMarker1.getOutlineStroke();
        valueMarker1.setLabel("");
        java.awt.Paint paint7 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.lang.String str13 = valueMarker9.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint16 = valueMarker15.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker15.getLabelAnchor();
        valueMarker9.setLabelAnchor(rectangleAnchor17);
        java.awt.Stroke stroke19 = valueMarker9.getStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        valueMarker9.notifyListeners(markerChangeEvent20);
        java.awt.Font font22 = valueMarker9.getLabelFont();
        valueMarker1.setLabelFont(font22);
        java.awt.Paint paint24 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint25 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleAnchor17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        double double6 = valueMarker1.getValue();
        double double7 = valueMarker1.getValue();
        java.lang.Object obj8 = valueMarker1.clone();
        java.awt.Paint paint9 = valueMarker1.getOutlinePaint();
        valueMarker1.setValue((double) 10.0f);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.addChangeListener(markerChangeListener12);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        valueMarker12.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker12.notifyListeners(markerChangeEvent15);
        java.awt.Stroke stroke17 = valueMarker12.getOutlineStroke();
        java.awt.Stroke stroke18 = valueMarker12.getOutlineStroke();
        valueMarker1.setStroke(stroke18);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100);
        valueMarker1.setLabel("hi!");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str8 = valueMarker7.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker7.addChangeListener(markerChangeListener9);
        java.awt.Font font11 = valueMarker7.getLabelFont();
        valueMarker1.setLabelFont(font11);
        java.awt.Paint paint13 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100L);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType2 = valueMarker1.getLabelOffsetType();
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
        java.awt.Paint paint18 = valueMarker4.getOutlinePaint();
        java.awt.Paint paint19 = valueMarker4.getOutlinePaint();
        java.awt.Paint paint20 = valueMarker4.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker22.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker22.getLabelAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker22.getLabelOffset();
        java.awt.Paint paint26 = valueMarker22.getPaint();
        valueMarker4.setLabelPaint(paint26);
        valueMarker1.setOutlinePaint(paint26);
        valueMarker1.setValue(0.800000011920929d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8f + "'", float15 == 0.8f);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 1.0f);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        java.awt.Paint paint27 = valueMarker24.getPaint();
        java.awt.Stroke stroke28 = valueMarker24.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker30.setLabel("");
        java.awt.Paint paint33 = valueMarker30.getOutlinePaint();
        valueMarker24.setLabelPaint(paint33);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = valueMarker24.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener36 = null;
        valueMarker24.addChangeListener(markerChangeListener36);
        java.awt.Font font38 = valueMarker24.getLabelFont();
        boolean boolean39 = valueMarker22.equals((java.lang.Object) font38);
        java.awt.Paint paint40 = valueMarker22.getOutlinePaint();
        valueMarker1.setLabelPaint(paint40);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8f + "'", float15 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(rectangleAnchor35);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker2.removeChangeListener(markerChangeListener6);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker2.addChangeListener(markerChangeListener8);
        java.awt.Paint paint10 = valueMarker2.getPaint();
        java.awt.Paint paint11 = valueMarker2.getLabelPaint();
        java.awt.Stroke stroke12 = null;
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        java.awt.Paint paint15 = valueMarker14.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker17.addChangeListener(markerChangeListener20);
        double double22 = valueMarker17.getValue();
        java.awt.Paint paint23 = valueMarker17.getOutlinePaint();
        java.awt.Paint paint24 = valueMarker17.getLabelPaint();
        java.awt.Paint paint25 = valueMarker17.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker27.addChangeListener(markerChangeListener30);
        double double32 = valueMarker27.getValue();
        java.awt.Paint paint33 = valueMarker27.getOutlinePaint();
        java.awt.Paint paint34 = valueMarker27.getLabelPaint();
        java.awt.Paint paint35 = valueMarker27.getPaint();
        valueMarker17.setLabelPaint(paint35);
        java.awt.Paint paint37 = valueMarker17.getOutlinePaint();
        java.awt.Paint paint38 = valueMarker17.getLabelPaint();
        valueMarker14.setOutlinePaint(paint38);
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = valueMarker41.getLabelOffset();
        valueMarker41.setAlpha((float) 1);
        java.awt.Stroke stroke45 = valueMarker41.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker47 = new org.jfree.chart.plot.ValueMarker((double) 0, paint11, stroke12, paint38, stroke45, (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(rectangleInsets42);
        org.junit.Assert.assertNotNull(stroke45);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker7.addChangeListener(markerChangeListener10);
        double double12 = valueMarker7.getValue();
        java.awt.Paint paint13 = valueMarker7.getOutlinePaint();
        java.awt.Paint paint14 = valueMarker7.getLabelPaint();
        java.awt.Paint paint15 = valueMarker7.getPaint();
        valueMarker7.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getPaint();
        java.awt.Stroke stroke23 = valueMarker19.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        java.awt.Paint paint28 = valueMarker25.getOutlinePaint();
        valueMarker19.setLabelPaint(paint28);
        java.awt.Paint paint30 = valueMarker19.getPaint();
        valueMarker7.setPaint(paint30);
        valueMarker1.setOutlinePaint(paint30);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke10 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker13.notifyListeners(markerChangeEvent16);
        valueMarker13.setValue((double) 0.8f);
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        java.awt.Paint paint24 = valueMarker21.getPaint();
        java.lang.String str25 = valueMarker21.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType26 = valueMarker21.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = valueMarker21.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker31.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        valueMarker31.notifyListeners(markerChangeEvent34);
        valueMarker31.setValue((double) 0.8f);
        boolean boolean38 = valueMarker29.equals((java.lang.Object) valueMarker31);
        java.awt.Stroke stroke39 = valueMarker31.getStroke();
        valueMarker21.setOutlineStroke(stroke39);
        valueMarker13.setOutlineStroke(stroke39);
        java.awt.Stroke stroke42 = valueMarker13.getStroke();
        double double43 = valueMarker13.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent44 = null;
        valueMarker13.notifyListeners(markerChangeEvent44);
        double double46 = valueMarker13.getValue();
        boolean boolean47 = valueMarker1.equals((java.lang.Object) valueMarker13);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType26);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.800000011920929d + "'", double43 == 0.800000011920929d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.800000011920929d + "'", double46 == 0.800000011920929d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        double double6 = valueMarker1.getValue();
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
        java.lang.Object obj22 = valueMarker8.clone();
        java.awt.Stroke stroke23 = valueMarker8.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker8.removeChangeListener(markerChangeListener24);
        java.awt.Paint paint26 = valueMarker8.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = valueMarker8.getLabelAnchor();
        java.awt.Font font28 = valueMarker8.getLabelFont();
        java.awt.Stroke stroke29 = valueMarker8.getStroke();
        java.lang.Class<?> wildcardClass30 = valueMarker8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray31 = valueMarker1.getListeners((java.lang.Class) wildcardClass30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(rectangleAnchor27);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        java.awt.Font font29 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        valueMarker1.notifyListeners(markerChangeEvent31);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(rectangleAnchor30);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        float float7 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.addChangeListener(markerChangeListener10);
        java.awt.Stroke stroke12 = valueMarker1.getOutlineStroke();
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker1.getLabelTextAnchor();
        float float14 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke3 = valueMarker2.getStroke();
        java.awt.Paint paint4 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        float float9 = valueMarker6.getAlpha();
        java.awt.Stroke stroke10 = valueMarker6.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10.0f, paint4, stroke10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker11.addChangeListener(markerChangeListener12);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker15.notifyListeners(markerChangeEvent16);
        java.awt.Stroke stroke18 = valueMarker15.getStroke();
        valueMarker11.setOutlineStroke(stroke18);
        java.awt.Stroke stroke20 = valueMarker11.getOutlineStroke();
        java.awt.Paint paint21 = valueMarker11.getOutlinePaint();
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getOutlinePaint();
        valueMarker13.setLabelPaint(paint22);
        float float24 = valueMarker13.getAlpha();
        valueMarker13.setLabel("");
        valueMarker13.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker13.getLabelTextAnchor();
        java.awt.Paint paint30 = valueMarker13.getOutlinePaint();
        valueMarker1.setLabelPaint(paint30);
        java.lang.String str32 = valueMarker1.getLabel();
        java.awt.Stroke stroke33 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor36 = valueMarker35.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent37 = null;
        valueMarker35.notifyListeners(markerChangeEvent37);
        java.awt.Paint paint39 = valueMarker35.getLabelPaint();
        valueMarker1.setLabelPaint(paint39);
        org.jfree.chart.text.TextAnchor textAnchor41 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(rectangleAnchor36);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(textAnchor41);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        java.lang.Object obj32 = valueMarker1.clone();
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
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        java.awt.Paint paint10 = valueMarker1.getOutlinePaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 'a');
        valueMarker14.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = valueMarker14.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker14.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.lang.String str13 = valueMarker9.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getPaint();
        valueMarker9.setLabelPaint(paint18);
        valueMarker1.setOutlinePaint(paint18);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker1.getLabelOffset();
        valueMarker1.setLabel("hi!");
        java.awt.Paint paint24 = valueMarker1.getPaint();
        float float25 = valueMarker1.getAlpha();
        java.awt.Paint paint26 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setAlpha((float) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Paint paint13 = valueMarker10.getPaint();
        java.lang.String str14 = valueMarker10.getLabel();
        boolean boolean15 = valueMarker1.equals((java.lang.Object) valueMarker10);
        double double16 = valueMarker10.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker10.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint20 = valueMarker19.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker19.getLabelAnchor();
        double double22 = valueMarker19.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 100.0f);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker24.getLabelOffsetType();
        valueMarker19.setLabelOffsetType(lengthAdjustmentType25);
        valueMarker10.setLabelOffsetType(lengthAdjustmentType25);
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 1);
        valueMarker29.setLabel("");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker29.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setLabel("");
        float float37 = valueMarker34.getAlpha();
        java.lang.String str38 = valueMarker34.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker40.setLabel("");
        java.awt.Paint paint43 = valueMarker40.getPaint();
        java.awt.Stroke stroke44 = valueMarker40.getOutlineStroke();
        valueMarker34.setStroke(stroke44);
        java.awt.Stroke stroke46 = valueMarker34.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType47 = valueMarker34.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener48 = null;
        valueMarker34.addChangeListener(markerChangeListener48);
        org.jfree.chart.text.TextAnchor textAnchor50 = valueMarker34.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor51 = valueMarker34.getLabelAnchor();
        java.awt.Stroke stroke52 = null;
        valueMarker34.setOutlineStroke(stroke52);
        org.jfree.chart.text.TextAnchor textAnchor54 = valueMarker34.getLabelTextAnchor();
        valueMarker29.setLabelTextAnchor(textAnchor54);
        valueMarker10.setLabelTextAnchor(textAnchor54);
        float float57 = valueMarker10.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertNotNull(rectangleAnchor32);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.8f + "'", float37 == 0.8f);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(lengthAdjustmentType47);
        org.junit.Assert.assertNotNull(textAnchor50);
        org.junit.Assert.assertNotNull(rectangleAnchor51);
        org.junit.Assert.assertNotNull(textAnchor54);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 0.8f + "'", float57 == 0.8f);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        double double7 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.removeChangeListener(markerChangeListener11);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        valueMarker1.notifyListeners(markerChangeEvent13);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        valueMarker1.setAlpha((float) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker1.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font12 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker14.notifyListeners(markerChangeEvent17);
        java.awt.Stroke stroke19 = valueMarker14.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker14.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getPaint();
        java.awt.Stroke stroke26 = valueMarker22.getOutlineStroke();
        java.awt.Stroke stroke27 = valueMarker22.getStroke();
        valueMarker14.setStroke(stroke27);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        valueMarker14.notifyListeners(markerChangeEvent29);
        valueMarker14.setValue((double) 0);
        java.awt.Paint paint33 = valueMarker14.getOutlinePaint();
        boolean boolean34 = valueMarker1.equals((java.lang.Object) valueMarker14);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint14 = valueMarker13.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        java.awt.Paint paint19 = valueMarker16.getPaint();
        java.awt.Stroke stroke20 = valueMarker16.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint14, stroke20);
        valueMarker1.setOutlinePaint(paint14);
        java.lang.Object obj23 = valueMarker1.clone();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        float float14 = valueMarker10.getAlpha();
        java.lang.String str15 = valueMarker10.getLabel();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.String str7 = valueMarker1.getLabel();
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        valueMarker1.setStroke(stroke11);
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint16 = valueMarker15.getPaint();
        valueMarker1.setPaint(paint16);
        java.awt.Font font18 = valueMarker1.getLabelFont();
        java.awt.Paint paint19 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker21.addChangeListener(markerChangeListener24);
        double double26 = valueMarker21.getValue();
        java.awt.Paint paint27 = valueMarker21.getOutlinePaint();
        java.awt.Paint paint28 = valueMarker21.getLabelPaint();
        valueMarker21.setLabel("");
        java.awt.Stroke stroke31 = valueMarker21.getOutlineStroke();
        java.awt.Paint paint32 = valueMarker21.getPaint();
        java.lang.Class<?> wildcardClass33 = paint32.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray34 = valueMarker1.getListeners((java.lang.Class) wildcardClass33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Color; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setAlpha((float) (short) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        java.awt.Paint paint11 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker1.removeChangeListener(markerChangeListener31);
        double double33 = valueMarker1.getValue();
        float float34 = valueMarker1.getAlpha();
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.8f + "'", float34 == 0.8f);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font10 = valueMarker9.getLabelFont();
        java.awt.Stroke stroke11 = valueMarker9.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke11);
        java.awt.Stroke stroke13 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker15.addChangeListener(markerChangeListener18);
        double double20 = valueMarker15.getValue();
        java.awt.Paint paint21 = valueMarker15.getOutlinePaint();
        java.awt.Paint paint22 = valueMarker15.getLabelPaint();
        valueMarker15.setLabel("");
        java.awt.Paint paint25 = valueMarker15.getOutlinePaint();
        valueMarker15.setAlpha(0.0f);
        java.awt.Paint paint28 = valueMarker15.getPaint();
        valueMarker1.setLabelPaint(paint28);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        java.lang.Object obj24 = valueMarker1.clone();
        java.lang.Object obj25 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.addChangeListener(markerChangeListener10);
        java.awt.Font font12 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker14.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker14.getLabelAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = valueMarker14.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets17);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        java.awt.Paint paint23 = valueMarker20.getPaint();
        java.awt.Stroke stroke24 = valueMarker20.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker26.setLabel("");
        java.awt.Paint paint29 = valueMarker26.getOutlinePaint();
        valueMarker20.setLabelPaint(paint29);
        float float31 = valueMarker20.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker20.addChangeListener(markerChangeListener32);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType34 = valueMarker20.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker38.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent41 = null;
        valueMarker38.notifyListeners(markerChangeEvent41);
        valueMarker38.setValue((double) 0.8f);
        boolean boolean45 = valueMarker36.equals((java.lang.Object) valueMarker38);
        java.awt.Stroke stroke46 = valueMarker38.getStroke();
        valueMarker20.setStroke(stroke46);
        java.awt.Stroke stroke48 = valueMarker20.getOutlineStroke();
        float float49 = valueMarker20.getAlpha();
        java.awt.Paint paint50 = valueMarker20.getOutlinePaint();
        valueMarker1.setPaint(paint50);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.8f + "'", float31 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType34);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.8f + "'", float49 == 0.8f);
        org.junit.Assert.assertNotNull(paint50);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker11.notifyListeners(markerChangeEvent14);
        valueMarker11.setValue((double) 0.8f);
        boolean boolean18 = valueMarker9.equals((java.lang.Object) valueMarker11);
        java.awt.Stroke stroke19 = valueMarker11.getStroke();
        valueMarker1.setOutlineStroke(stroke19);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker22.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor23);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        double double12 = valueMarker1.getValue();
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setLabel("hi!");
        valueMarker1.setAlpha(0.0f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor13);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener37 = null;
        valueMarker34.addChangeListener(markerChangeListener37);
        double double39 = valueMarker34.getValue();
        java.awt.Paint paint40 = valueMarker34.getOutlinePaint();
        java.awt.Paint paint41 = valueMarker34.getLabelPaint();
        valueMarker34.setLabel("");
        valueMarker34.setValue((double) 10L);
        valueMarker34.setValue((double) (-1L));
        boolean boolean48 = valueMarker1.equals((java.lang.Object) valueMarker34);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        java.awt.Paint paint33 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.addChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker2.removeChangeListener(markerChangeListener7);
        java.awt.Stroke stroke9 = valueMarker2.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker2.removeChangeListener(markerChangeListener10);
        java.awt.Paint paint12 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke15 = valueMarker14.getStroke();
        java.lang.Object obj16 = valueMarker14.clone();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker14.addChangeListener(markerChangeListener17);
        java.awt.Paint paint19 = valueMarker14.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        java.awt.Paint paint24 = valueMarker21.getPaint();
        java.awt.Stroke stroke25 = valueMarker21.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        java.awt.Paint paint30 = valueMarker27.getOutlinePaint();
        valueMarker21.setLabelPaint(paint30);
        float float32 = valueMarker21.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener33 = null;
        valueMarker21.addChangeListener(markerChangeListener33);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType35 = valueMarker21.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker39.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent42 = null;
        valueMarker39.notifyListeners(markerChangeEvent42);
        valueMarker39.setValue((double) 0.8f);
        boolean boolean46 = valueMarker37.equals((java.lang.Object) valueMarker39);
        java.awt.Stroke stroke47 = valueMarker39.getStroke();
        valueMarker21.setStroke(stroke47);
        java.awt.Stroke stroke49 = valueMarker21.getOutlineStroke();
        valueMarker14.setStroke(stroke49);
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker52.setLabel("");
        float float55 = valueMarker52.getAlpha();
        java.awt.Stroke stroke56 = valueMarker52.getOutlineStroke();
        java.awt.Paint paint57 = valueMarker52.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker60 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker60.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener63 = null;
        valueMarker60.addChangeListener(markerChangeListener63);
        double double65 = valueMarker60.getValue();
        java.awt.Paint paint66 = valueMarker60.getOutlinePaint();
        java.awt.Paint paint67 = valueMarker60.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker69 = new org.jfree.chart.plot.ValueMarker((double) 1);
        java.awt.Stroke stroke70 = valueMarker69.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker71 = new org.jfree.chart.plot.ValueMarker((double) 0, paint67, stroke70);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker73 = new org.jfree.chart.plot.ValueMarker((double) (short) 1, paint12, stroke49, paint57, stroke70, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.8f + "'", float32 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType35);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.8f + "'", float55 == 0.8f);
        org.junit.Assert.assertNotNull(stroke56);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertNotNull(paint67);
        org.junit.Assert.assertNotNull(stroke70);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        java.awt.Stroke stroke32 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke33 = valueMarker1.getStroke();
        valueMarker1.setAlpha((float) 1L);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(stroke33);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.awt.Stroke stroke7 = valueMarker3.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getOutlinePaint();
        valueMarker3.setLabelPaint(paint12);
        float float14 = valueMarker3.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker3.addChangeListener(markerChangeListener15);
        java.awt.Stroke stroke17 = valueMarker3.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke17);
        java.awt.Stroke stroke19 = valueMarker1.getStroke();
        float float20 = valueMarker1.getAlpha();
        valueMarker1.setValue((double) 1);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        java.lang.Object obj14 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        java.lang.Object obj6 = valueMarker1.clone();
        java.awt.Paint paint7 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker9.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker9.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker9.addChangeListener(markerChangeListener14);
        java.awt.Paint paint16 = valueMarker9.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker9.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker9.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor18);
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(textAnchor18);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = valueMarker7.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets8);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.addChangeListener(markerChangeListener10);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets8);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        java.awt.Paint paint36 = valueMarker1.getLabelPaint();
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
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        float float13 = valueMarker1.getAlpha();
        java.awt.Stroke stroke14 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.addChangeListener(markerChangeListener15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker1.getLabelOffset();
        float float16 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1);
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getPaint();
        java.lang.String str10 = valueMarker6.getLabel();
        java.awt.Paint paint11 = valueMarker6.getLabelPaint();
        java.awt.Paint paint12 = valueMarker6.getLabelPaint();
        valueMarker1.setLabelPaint(paint12);
        java.lang.String str14 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(rectangleAnchor4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.awt.Stroke stroke7 = valueMarker3.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getOutlinePaint();
        valueMarker3.setLabelPaint(paint12);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker3.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker3.addChangeListener(markerChangeListener15);
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker3.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor17);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke21 = valueMarker20.getStroke();
        java.lang.Object obj22 = valueMarker20.clone();
        valueMarker20.setValue((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker20.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = valueMarker27.getLabelOffset();
        java.awt.Stroke stroke29 = valueMarker27.getOutlineStroke();
        valueMarker20.setStroke(stroke29);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = valueMarker20.getLabelOffset();
        boolean boolean32 = valueMarker1.equals((java.lang.Object) valueMarker20);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(rectangleAnchor25);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker3.setLabelPaint(paint10);
        java.awt.Stroke stroke12 = valueMarker3.getStroke();
        java.awt.Paint paint13 = valueMarker3.getLabelPaint();
        valueMarker1.setLabelPaint(paint13);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.addChangeListener(markerChangeListener15);
        double double17 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.removeChangeListener(markerChangeListener11);
        java.awt.Paint paint13 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke14 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker1.removeChangeListener(markerChangeListener23);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 100);
        valueMarker26.setValue((double) (-1L));
        boolean boolean29 = valueMarker1.equals((java.lang.Object) valueMarker26);
        float float30 = valueMarker26.getAlpha();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.8f + "'", float30 == 0.8f);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        java.lang.Object obj9 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker36.setLabel("");
        java.awt.Paint paint39 = valueMarker36.getPaint();
        java.lang.String str40 = valueMarker36.getLabel();
        double double41 = valueMarker36.getValue();
        java.awt.Stroke stroke42 = valueMarker36.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint45 = valueMarker44.getLabelPaint();
        valueMarker36.setOutlinePaint(paint45);
        java.awt.Paint paint47 = valueMarker36.getPaint();
        valueMarker1.setPaint(paint47);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor49 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelAnchor(rectangleAnchor49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(paint47);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        boolean boolean10 = valueMarker1.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        float float12 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        double double6 = valueMarker1.getValue();
        valueMarker1.setAlpha(1.0f);
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker12.getLabelAnchor();
        valueMarker12.setLabel("");
        java.awt.Paint paint16 = valueMarker12.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker18.addChangeListener(markerChangeListener21);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker18.removeChangeListener(markerChangeListener23);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font27 = valueMarker26.getLabelFont();
        java.awt.Stroke stroke28 = valueMarker26.getOutlineStroke();
        valueMarker18.setOutlineStroke(stroke28);
        java.awt.Stroke stroke30 = valueMarker18.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (short) -1, paint16, stroke30);
        valueMarker1.setLabelPaint(paint16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        valueMarker1.setLabelPaint(paint10);
        java.awt.Font font12 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        valueMarker1.notifyListeners(markerChangeEvent13);
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(font12);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker11.notifyListeners(markerChangeEvent14);
        valueMarker11.setValue((double) 0.8f);
        boolean boolean18 = valueMarker9.equals((java.lang.Object) valueMarker11);
        java.awt.Stroke stroke19 = valueMarker11.getStroke();
        valueMarker1.setOutlineStroke(stroke19);
        valueMarker1.setAlpha((float) 0);
        java.awt.Font font23 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(font23);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        double double15 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font10 = valueMarker9.getLabelFont();
        java.awt.Stroke stroke11 = valueMarker9.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke11);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.addChangeListener(markerChangeListener13);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        java.awt.Paint paint19 = valueMarker16.getPaint();
        java.lang.String str20 = valueMarker16.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker16.notifyListeners(markerChangeEvent21);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker24.getLabelOffset();
        valueMarker16.setLabelOffset(rectangleInsets25);
        java.awt.Font font27 = valueMarker16.getLabelFont();
        valueMarker1.setLabelFont(font27);
        java.awt.Paint paint29 = valueMarker1.getOutlinePaint();
        java.lang.Object obj30 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        java.awt.Paint paint7 = valueMarker4.getPaint();
        java.lang.String str8 = valueMarker4.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker4.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType9);
        float float11 = valueMarker1.getAlpha();
        double double12 = valueMarker1.getValue();
        float float13 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.removeChangeListener(markerChangeListener14);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker2.getLabelAnchor();
        java.awt.Paint paint4 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        valueMarker8.notifyListeners(markerChangeEvent11);
        valueMarker8.setValue((double) 0.8f);
        boolean boolean15 = valueMarker6.equals((java.lang.Object) valueMarker8);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker8.getLabelAnchor();
        java.awt.Stroke stroke17 = valueMarker8.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint4, stroke17);
        java.lang.Class<?> wildcardClass19 = valueMarker18.getClass();
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.addChangeListener(markerChangeListener5);
        double double7 = valueMarker2.getValue();
        java.awt.Paint paint8 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint9 = valueMarker2.getLabelPaint();
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker2.notifyListeners(markerChangeEvent12);
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker2.getLabelTextAnchor();
        valueMarker2.setValue((double) '#');
        java.awt.Paint paint17 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint18 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        java.awt.Paint paint23 = valueMarker20.getPaint();
        java.lang.String str24 = valueMarker20.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker20.notifyListeners(markerChangeEvent25);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        java.awt.Paint paint31 = valueMarker28.getPaint();
        java.lang.String str32 = valueMarker28.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setLabel("");
        java.awt.Paint paint37 = valueMarker34.getPaint();
        valueMarker28.setLabelPaint(paint37);
        valueMarker20.setOutlinePaint(paint37);
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = valueMarker20.getLabelOffset();
        valueMarker20.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent43 = null;
        valueMarker20.notifyListeners(markerChangeEvent43);
        float float45 = valueMarker20.getAlpha();
        float float46 = valueMarker20.getAlpha();
        java.awt.Stroke stroke47 = valueMarker20.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint18, stroke47);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.8f + "'", float45 == 0.8f);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.8f + "'", float46 == 0.8f);
        org.junit.Assert.assertNotNull(stroke47);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker12.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker12.getLabelOffsetType();
        java.awt.Paint paint15 = valueMarker12.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint15);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        boolean boolean10 = valueMarker1.equals((java.lang.Object) (short) -1);
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker1.addChangeListener(markerChangeListener22);
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
        valueMarker25.setLabel("");
        java.awt.Paint paint41 = valueMarker25.getLabelPaint();
        valueMarker1.setLabelPaint(paint41);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener43 = null;
        valueMarker1.removeChangeListener(markerChangeListener43);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.8f + "'", float36 == 0.8f);
        org.junit.Assert.assertNotNull(paint41);
    }
}

